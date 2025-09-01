package Tree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;

    }
}
public class ImplementationOfTree {

    public static void display(TreeNode root){
        if(root==null) return; //  base case
        System.out.print(root.val+" ");
        display(root.left);      //left subtree
        display(root.right);     // right subtree
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);  // a is the root
        TreeNode b =new TreeNode(4);
        TreeNode c =new TreeNode(3);
        TreeNode d =new TreeNode(2);
        TreeNode e =new TreeNode(6);
        TreeNode f =new TreeNode(5);

        a.left = b; a.right = c;

        b.left = d; b.right = e;

        c.right = f;

        TreeNode g = new TreeNode(10);
        TreeNode h = new TreeNode(20);

        c.left = g; e.right = h;

//        a.left = null;

        display(a);

    }
}
