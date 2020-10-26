package upb.edu.co.list;

import java.util.Arrays;
import java.util.Iterator;

public class List implements ListInterface, Iterable<ListNode> {

    public ListNode head;
    public ListNode tail;
    private ListNode ni;
    private ListNode inode;
    private int size;

    public List() {
        head = null;
        tail = null;
        size = 0;
    }

    public List(Object object) {
        add(object);
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public Object getHead() {
        return head;
    }

    @Override
    public Object getTail() {
        return tail;
    }

    @Override
    public Object get(ListNode node) {
        return node.getObject();
    }

    @Override
    public ListNode search(Object object) {

        ListNode nodo = null;
        for (ListNode buscar = head; buscar != null; buscar = buscar.next) {
            if (buscar.getObject().equals(object)) {
                nodo = buscar;
                break;
            }
        }
        return nodo;
    }

    public boolean add(Object object) {
        try {
            if (isEmpty()) {
                head = new ListNode(object);
                tail = head;
            } else {
                tail.next = new ListNode(object);
                tail = tail.next;
            }
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insert(ListNode node, Object object) {
        if (node != null) {
            ListNode inode = this.search(node);
            if (inode.next == null) {
                add(object);
            } else {
                ListNode newNode = new ListNode(object);
                newNode.next = inode.next;
                inode.next = newNode;
            }
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean insert(Object ob, Object object) {
        try {//Insertar entre un objeto y otro objeto
            if (ob != null) {
                ListNode inode = this.search(ob);
                if (inode.next == null) {
                    add(object);
                } else {
                    ListNode newNode = new ListNode(object);
                    newNode.next = inode.next;
                    inode.next = newNode;
                }
                size++;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertHead(Object object) {
        try {
            ListNode newNode = new ListNode(object);
            newNode.next = head;
            head = newNode;
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean insertTail(Object object) {
        add(object);
        return true;
    }

    @Override
    public boolean set(ListNode node, Object object) {
        try {
            for (ListNode buscar = head; buscar != null; buscar = buscar.next) {
                if (node.equals(buscar)) {
                    node.setObject(object);
                    return true;
                }

            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean remove(ListNode node) {

        ListNode anterior = null;
        for (ListNode buscar = head; buscar != null; buscar = buscar.next) {

            if (buscar.equals(node)) {
                if (!node.equals(head)) {
                    anterior.next = node.next;
                    node = null;
                } else {
                    head = head.next;
                }
                size--;
                return true;
            } else {
                anterior = buscar;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object object) {
        try {
            for (ListNode buscar = head; buscar != null; buscar = buscar.next) {
                if (buscar.getObject().equals(object)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Object[] toArray() {

        Object[] arr = new Object[size];

        ListNode buscar = head;
        for (int i = 0; i < size; i++) {
            arr[i] = buscar.getObject();
            buscar = buscar.next;
        }


        return arr;
    }

    @Override
    public Object[] toArray(Object[] object) {

        for (ListNode buscar = head; buscar != null; buscar = buscar.next) {
            for (int i = 0; i < size; i++) {
                object[i] = buscar;
            }

        }
        return object;
    }

    @Override
    public Object getBeforeTo() { //Obtener nodo anterior al de la cola
        ListNode anterior = null;
        for (ListNode buscar = head; buscar != null; buscar = buscar.next) {
            if (buscar.equals(tail)) {
                return anterior;
            } else {
                anterior = buscar;
            }
        }
        return null;
    }

    @Override
    public Object getBeforeTo(ListNode node) {
        ListNode anterior = null;
        for (ListNode buscar = head; buscar != null; buscar = buscar.next) {
            if (buscar.equals(node)) {
                return anterior;
            } else {
                anterior = buscar;
            }
        }
        return null;
    }

    @Override
    public Object getNextTo() {//Obtener nodo despues de la cabeza

        return head.next;
    }

    @Override
    public Object getNextTo(ListNode node) {
        ListNode despues = head;
        for (ListNode buscar = head; buscar != null; buscar = buscar.next) {
            despues = buscar;
            if (buscar.equals(node)) {
                despues = node.next;
            }
            return despues;

        }
        return null;
    }

    @Override
    public List subList(ListNode from, ListNode to) {
        List rango = new List();
        for (ListNode buscar = from; buscar != null; buscar = buscar.next) {
            if (buscar.toString().equals(to.toString())) {
                rango.add(buscar.getObject());
                break;
            } else {
                rango.add(buscar.getObject());
            }

        }
        return rango;
    }

    @Override
    public List sortList() {

        ListNode[] array = new ListNode[0];


        return null;
    }

    public void rec(ListNode node) {
        if (node.next == null) {
            System.out.println(node.toString());
        } else {
            System.out.println(node.toString());
            rec(node.next);
        }
    }

    @Override
    public Iterator<ListNode> iterator() {
        ni = head;
        Iterator<ListNode> i = new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return ni.next != null ? true : false;
            }

            @Override
            public ListNode next() {
                if (hasNext()) {
                    ListNode ntmp = ni;
                    ni = ni.next;
                    return ntmp;
                } else {

                    return null;
                }
            }
        };
        return i;
    }
}
