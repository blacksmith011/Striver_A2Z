package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class lecture {
    public static TreeNode insertAlevel(TreeNode root,int val){
        TreeNode p = new TreeNode(val);
        if(root==null) return p;

        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        while (!que.isEmpty()) {
            TreeNode temp = que.poll();

            if (temp.left == null) {
                temp.left = p;
                return root;
            } else {
                que.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = p;
                return root;
            } else {
                que.add(temp.right);
            }
        }
        return root;
    }
    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = null;
        int[] values = {10, 20, 30, 40, 50, 60};

        for (int val : values) {
            root = insertAlevel(root, val);
        }

//        System.out.print("Inorder Traversal: ")
        inorder(root);
    }
}
