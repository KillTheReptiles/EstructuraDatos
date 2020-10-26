package upb.edu.co.stack;

public class StackNode {

    private Object object;
    public StackNode next;

    public StackNode() {
        this.object = null;
        this.next = null;
    }

    public StackNode(Object object) {
        this.object = object;
        this.next = null;
    }

    public Object isEquals() {
        return object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ListStack{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }
}


