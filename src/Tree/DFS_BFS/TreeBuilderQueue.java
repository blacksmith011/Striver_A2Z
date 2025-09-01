package Tree.DFS_BFS;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class TreeBuilderQueue {
    public static TreeNode buildTree(int[] arr) {
        if (arr.length == 0) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode curr = queue.poll();

            // Left child
            if (arr[i] != -1) {
                curr.left = new TreeNode(arr[i]);
                queue.add(curr.left);
            }
            i++;
            if (i >= arr.length) break;

            // Right child
            if (arr[i] != -1) {
                curr.right = new TreeNode(arr[i]);
                queue.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 4, 5, -1}; // -1 = null
        TreeNode root = buildTree(arr);
        inorder(root);
    }
}