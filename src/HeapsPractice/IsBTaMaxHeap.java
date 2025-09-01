package HeapsPractice;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){ this.val = val;}
}
public class IsBTaMaxHeap {
    public static boolean isMaxheap(Node root){
        int size = sizeoftree(root);
        return isheap(root) && isCBT(root,0, size);
    }

    private static boolean isCBT(Node root ,int i, int size) {
        if(root == null) return true;
        if(i>=size) return false;

        return isCBT(root.left,2*i+1,size) && isCBT(root.right,2*i-1,size);
    }

    private static int sizeoftree(Node root) {
        if(root == null) return 0;
        return 1+sizeoftree(root.left)+sizeoftree(root.right);
    }

    private static boolean isheap(Node root) {
        if(root == null) return true;
        if(root.left!=null){
            if(root.val < root.left.val) return false;
        }
        if(root.right!=null){
            if(root.val<root.right.val) return false;
        }

        return isheap(root.left) && isheap(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(2);
        Node e = new Node(6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;

        System.out.println(isMaxheap(a));
    }
}
