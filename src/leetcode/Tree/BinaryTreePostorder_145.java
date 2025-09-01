package leetcode.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorder_145 {
    public static List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root!=null) st.push(root);
        while(!st.isEmpty()){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);

        a.left = b ; a.right = c;
        b.left = d ; b.right = e;
        c.left = f ; c.right = g;
        e.right = h;

        System.out.println(postorderTraversal(a));
    }
}
