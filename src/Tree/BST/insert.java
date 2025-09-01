package Tree.BST;
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class insert {
    public static boolean search(Node root,int k){
        if(root == null) return false;
        if(root.val == k) return true;

        return k<root.val ? search(root.left,k) : search(root.right,k);
    }
    public static Node min(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static Node max(Node root){
        while (root.right!=null){
            root = root.right;
        }
        return root;
    }
    public static Node insertNode(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;

        // Insert nodes
        root = insertNode(root, 50);
        root = insertNode(root, 30);
        root = insertNode(root, 70);
        root = insertNode(root, 20);
        root = insertNode(root, 40);
        root = insertNode(root, 60);
        root = insertNode(root, 80);

        System.out.println("Inorder traversal:");
        inorder(root);
    }
}

