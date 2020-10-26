package upb.edu.co;

public class Node {

    public int peso;
    public Node left;
    public Node right;
    public int object;

    public Node(int object) {
        this.left = null;
        this.right = null;
        this.object = object;
    }

    public Node(Node left, int object, Node right) {
        this.left = left;
        this.right = right;
        this.object = object;
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", object=" + object +
                '}';
    }

    public Object getObject() {
        return object;
    }

    public void setObject(int object) {
        this.object = object;
    }
}
