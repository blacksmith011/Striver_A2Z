package Tree.PwQuestion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class elementOfNthLevel {
    static int n;
    public static int level(Node root){
        if(root == null) return 0;

        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void levelOrder(Node root , int level){
        if(root == null) return;
        levelOrder(root.left,level+1);
        levelOrder(root.right,level+1);
        if(level == n) System.out.print(root.val+"->");
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = g ; c.right = f;
        e.right = h;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        levelOrder(a,0);

//        int nolevel = level(a);
//
//        for(int i=nolevel-1;i>=0;i-- ){
//            n = i;
//            levelOrder(a,0);
//            System.out.println();
//        }
    }
}
