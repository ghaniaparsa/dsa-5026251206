package lw04.prelab;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(Main.class.getResourceAsStream("branches.txt"));

        int size = sc.nextInt();
        int val[] = new int[size];
                for(int i = 0; i < size; i++){
                val[i] = sc.nextInt();
 }



        for(int i = 1; i < 4; i++){
            int q = val[i];
            int g = i-1;


                while (g >= 0 && val[g] < q){
                val[g+1] = val[g];
                g = g-1;
            }
            val[g+1] = q;
        }
        for(int vall : val){
        
            
            System.out.print(vall + " ");
        }
             System.out.println();

        int targetSize = sc.nextInt();
        int target[] = new int[targetSize];

        for(int i = 0; i < targetSize; i++){
            target[i] = sc.nextInt();
 }

        for(int i = 0; i < targetSize; i++){
            int h = target[i];
            int index = -1;
            for(int g = 0; g < size; g++){
                if(val[g] == h){
             index = g;
                }

            }
            if(index != -1){
      System.out.println(h + ": FOUND at index " + index);
           
         } else {
            System.out.println(h + ": NOT FOUND");
            }
        }
        
    }
}