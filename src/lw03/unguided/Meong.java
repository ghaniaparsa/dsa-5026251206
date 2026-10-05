package lw03.unguided;
import java.util.*;

public class Meong {
    public static void main (String[]args){

        Scanner sc = new Scanner(Meong.class.getResourceAsStream("enrollment.txt"));
        Map<String, Integer> courses = new LinkedHashMap<>();
        List<String> checks = new ArrayList<>();

        int rejected = 0;

        while (sc.hasNextLine()){

            String l = sc.nextLine();
            String [] p = l.split(" ");
            String stat = p[0];
            String code = p[1];

            if (stat.equals("REGISTER") ){
                int count = Integer.parseInt(p[2]);
                if (count <= 0){
                    rejected++;

                }else{

                } if (courses.containsKey(code)){
                    int current = courses.get(code);
                    courses.put(code, current + count);

                }else{
                   courses.put(code, count);

                }

        } else if (stat.equals("WITHDRAW")) {
        int count = Integer.parseInt(p[2]);

        if (count <= 0) {
                    rejected++;
                 } else {
                  if (courses.containsKey(code) && courses.get(code) >= count) {
                 int current = courses.get(code);
                courses.put(code, current - count);
                    } else {
                          rejected++;
                    }
                }
           } else if (stat.equals("CHECK")) {
             if (courses.containsKey(code)) {
            checks.add(code + ": " + courses.get(code) + " students");
            } else {
                checks.add(code + ": Not found");

        }
            
        }
    }

    System.out.println("===== Enrollment Checks =====");
        for (String philo : checks) {
            System.out.println(philo);
    
     }
    System.out.println("===== Final Enrollment =====");
        for (String philo : courses.keySet()) {
            System.out.println(philo + ": " + courses.get(philo) + " students");
    }
   System.out.println("Rejected operations: " + rejected); 
}
}



