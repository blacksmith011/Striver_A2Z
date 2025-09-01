package Tree.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    /*public static List<Integer> preorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode curr = st.pop();
            result.add(curr.val);

            if(curr.right!=null) st.push(curr.right);

            if(curr.left!=null) st.push(curr.left);
        }
    }*/
    public static void helper(TreeNode root,List<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public static List<Integer> preorder(TreeNode root){
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

        List<Integer> ans = preorder(root);

        System.out.println(ans);
    }
}
