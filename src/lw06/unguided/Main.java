package lw06.unguided;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner read = new Scanner(Main.class.getResourceAsStream("treenumbers.txt"));

    String num = read.nextLine();
        Scanner sc = new Scanner(num);

        BinarySearchTree bs = new BinarySearchTree();

        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            bs.insert(data);
        }
        sc.close();

        int target = read.nextInt();
        read.close();

        System.out.print("Preorder   : ");
        bs.preOrder();
        System.out.print("Inorder    : ");
        bs.inOrder();
        System.out.print("Postorder  : ");
        bs.postOrder();


        System.out.println("Search " + target + "  : " + bs.search(target));

        System.out.println("Minimum : " + bs.findMin());
        System.out.println("Maximum : " + bs.findMax());
    }

}