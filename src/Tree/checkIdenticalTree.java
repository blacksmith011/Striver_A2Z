package Tree;

import java.util.LinkedList;
import java.util.Queue;


public class checkIdenticalTree {
    public static boolean isIdentical(TreeNode root1, TreeNode root2) {
        // Base Case
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(root1);
        q2.add(root2);

        while (!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode node1 = q1.poll();
            TreeNode node2 = q2.poll();


            if (node1.val != node2.val) return false;


            if (node1.left != null && node2.left != null) {
                q1.add(node1.left);
                q2.add(node2.left);
            } else if (node1.left != null || node2.left != null) {
                return false;
            }

            if (node1.right != null && node2.right != null) {
                q1.add(node1.right);
                q2.add(node2.right);
            } else if (node1.right != null || node2.right != null) {
                return false;
            }
        }

        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);

        TreeNode b = new TreeNode(1);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);

        System.out.println(isIdentical(a, b)); // Output: true
    }
}
