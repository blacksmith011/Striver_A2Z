package Tree.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SameTree {
    public static void inorder(TreeNode root,List<Integer> ans){
        if(root == null) return;

        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while (curr!=null || !st.isEmpty()){
            while (curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
    }
    public static List<Integer> treeintolist(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
    public static boolean isSameTree(TreeNode p, TreeNode q){

        List<Integer> l1 = treeintolist(p);
        List<Integer> l2 = treeintolist(q);

        int i = 0;
        int n = l1.size(), m = l2.size();
        if(n!=m) return false;
        while (n>0){
            if(l1.get(i) != l2.get(i)) return false;
            i++;
            n--;
        }
        return true;

    }
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p,q));
    }
}
