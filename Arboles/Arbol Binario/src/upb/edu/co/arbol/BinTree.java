package upb.edu.co.arbol;

import javax.print.DocFlavor;

public class BinTree {

    public Node root;

    public BinTree() {
        this.root = null;
    }

    public BinTree(Object object) {
        this.root = subBinTree(null, object, null);
    }

    public Node subBinTree(Node left, Object object, Node right) {
        return new Node(left, object, right);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean root(Object object) {
        try {
            root = subBinTree(null, object, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertleft(Object object) {
        try {
            if (!isEmpty()) {
                root.left = subBinTree(null, object, null);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertRight(Object object) {
        try {
            if (!isEmpty()) {
                root.right = subBinTree(null, object, null);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String preOrder(Node root) {
        String obj = "";
        obj = (root.object instanceof Node) ? ((Node) root.object).object.toString(): root.object.toString();
        obj = obj + ((root.left != null) ? preOrder(root.left) : "");
        obj = obj + ((root.right!=null) ?preOrder(root.right): "");
        return obj;
    }

    public String inOrder(Node root) {
        String obj = "";
        obj = obj + ((root.left != null) ? inOrder(root.left) : "");
        obj = (root.object instanceof Node) ? ((Node) root.object).object.toString(): root.object.toString();
        obj = obj + ((root.right!=null) ?inOrder(root.right): "");
        return obj;
    }

    public String posOrder(Node root) {

        String obj = "";
        obj = obj + ((root.left != null) ? posOrder(root.left) : "");
        obj = obj + ((root.right!=null) ?posOrder(root.right): "");
        obj = (root.object instanceof Node) ? ((Node) root.object).object.toString(): root.object.toString();
        return obj;
    }

    @Override
    public String toString() {
        return "BinTree{" +
                "root=" + root +
                '}';
    }
}
