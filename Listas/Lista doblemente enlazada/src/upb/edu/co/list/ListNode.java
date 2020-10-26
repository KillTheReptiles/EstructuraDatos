package upb.edu.co.list;

public class ListNode implements Comparable<ListNode> {

    private Object object;
    public ListNode next;
    public ListNode preview;

    public ListNode() {
        this.object = null;
        this.next = null;
        this.preview = null;
    }

    public ListNode(Object object) {
        this.object = object;
        this.next = null;
        this.preview = null;
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
        return "ListNode{" +
                "object=" + object +
                ", next=" + next +
                '}';
    }


    @Override
    public int compareTo(ListNode o) {
        return (getObject().toString()).compareTo(o.getObject().toString());
    }
}

