package Tree.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversal {
    /*public static List<Integer> postorder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();

        st1.push(root);
        while (!st1.isEmpty()){
            TreeNode curr = st1.pop();
            st2.push(curr);

            if(curr.left!=null) st1.push(curr.left);
            if(curr.right!=null) st1.push(curr.right);
        }
        while (!st2.isEmpty()){
            ans.add(st2.pop().val);
        }
        return ans;
    }*/
    public static void helper(TreeNode root,List<Integer> ans){
        if(root == null) return;
        helper(root.left,ans);
        helper(root.right,ans);
        ans.add(root.val);
    }
    public static List<Integer> postorder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        List<Integer> ans = postorder(root);
        System.out.println(ans);
    }
}
