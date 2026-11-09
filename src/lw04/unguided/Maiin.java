package lw04.unguided;
import java.util.*;

public class Maiin {
    public static void sortCards(int[] val, int pass) {
        for (int i = 0; i < pass; i++) {
            int low = i;
            for (int j = i + 1; j < val.length; j++) {
                if (val[j] < val[low]) {
                    low = j;
                }
            }
            int temp = val[i];
            val[i] = val[low];
            val[low] = temp;
        }
    }

    public static int findCard(int[] val, int target) {
        for (int i = 0; i < val.length; i++) {
            if (val[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(Maiin.class.getResourceAsStream("card.txt"));

        int size = sc.nextInt();
        int[] val = new int[size];
        for (int i = 0; i < size; i++) {
            val[i] = sc.nextInt();
        }

        int targetSize = sc.nextInt();
        int[] target = new int[targetSize];
        for (int i = 0; i < targetSize; i++) {
            target[i] = sc.nextInt();
        }

        sortCards(val, 2);

        for (int i = 0; i < size; i++) {
            System.out.print(val[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int t : target) {
            int index = findCard(val, t);
            if (index != -1) {
                System.out.println(t + ": FOUND at index " + index);
            } else {
                System.out.println(t + ": NOT FOUND");
            }
        }
    }
}
