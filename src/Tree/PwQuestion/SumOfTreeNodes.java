package Tree.PwQuestion;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class SumOfTreeNodes {
    public static int Sum(Node root){
        if(root == null) return 0;
        return root.val+Sum(root.left)+Sum(root.right);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = g ; c.right = f;
        e.right = h;

        int sum = Sum(a);
        System.out.println(sum);
    }
}
