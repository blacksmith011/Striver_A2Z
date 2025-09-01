package Tree.PwQuestion;

public class productOfNonZeroNode {
    public static int product(Node root){
        if(root == null) return 1;
        int leftproduct = product(root.left);
        int rightproduct = product(root.right);

        return (root.val == 0 ? 1 : root.val)*leftproduct*rightproduct;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(0);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(0);
        Node h = new Node(20);

        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = g ; c.right = f;
        e.right = h;

        System.out.println(product(a));
    }
}
