package leetcode.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder_94 {
    public static List<Integer> InorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode temp = root;
        while (true){
            if(temp!=null) {
                st.push(temp);
                temp = temp.left;
            } else {
                if(st.isEmpty()) break;
                TreeNode top = st.pop();
                ans.add(top.val);
                temp = top.right;
            }
        }
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

        System.out.println(InorderTraversal(a));
    }
}
