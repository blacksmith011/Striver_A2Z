package Tree.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
     int val;
     TreeNode left;
     TreeNode right;

     TreeNode(int val){
         this.val = val;
         this.left = null;
         this.right = null;
     }
 }
public class InorderTraversal {
    /*public static List<Integer> inorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

        while (curr!=null || !st.isEmpty()){
            while (curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            result.add(curr.val);
            curr = curr.right;
        }

        return result;
    }*/
    public static void helper(TreeNode root, List<Integer> ans){
        if(root==null) return;
        helper(root.left,ans);
        ans.add(root.val);
        helper(root.right,ans);
    }
    public static List<Integer> inorder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        helper(root,ans);
        return  ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(9);

        List<Integer> ans = inorder(root);

    }
}
