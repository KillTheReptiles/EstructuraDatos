package upb.edu.co.queue;

public class QueueNode {

    private Object object;
    public QueueNode next;

    public QueueNode() {
        this.object = null;
        this.next = null;
    }

    public QueueNode(Object object) {
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


