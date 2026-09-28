package lw02.unguided;
import java.util.*;



public class Mainn {
    public static void main(String[] args){
        LinkedList<String[]> member = new LinkedList<>();
    LinkedList<String[]> borrowing = new LinkedList<>();
    LinkedList<String[]> book = new LinkedList<>();

    Queue<String[]> q = new LinkedList<>();
    Stack<String[]> failed = new Stack<>();

        Scanner sc = new Scanner(Mainn.class.getResourceAsStream("borrowing.txt"));

        while (sc.hasNext()){
            String [] req = new String [2];
            req [0] = sc.next();
            req [1] = sc.next();
            borrowing.add(req);

        }
        sc.close();


        q.addAll(borrowing);

        String [] listBook = new String [2];
        book.add(listBook);

        while (!q.isEmpty()){
            String [] request = q.poll();
            String name = request[0];
            String  books = request[1];
            int stat = 0;
            
            String [] members = null;

            for (String  [] philo : member){
                if (philo[0].equals(name)); {
                    members = philo;
                    break;
                }
            }
            if (members == null){
                members = new String[] {name, books};
                member.add(members);

            }

            if(stat < 2){
            } else {
                failed.push(request);

            }
        }

        System.out.println("=== Successfully Processed Requests ===");
            for(String[] meow : member){
                System.out.println(meow[0] + " " + meow[1]);
            }

        System.out.println("");

        System.out.println("=== Remaining Book Stock ===");
            for(String[] hi : book){
                System.out.println(hi[0] + " : " + hi[1]);
            }
         System.out.println("=== Failed Requests ===");
            for(String [] hy : borrowing){
                System.out.println(hy[0] + " : " + hy[1]);


            }
    }
}




