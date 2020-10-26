package upb.edu.co.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListQueue implements QueueInterface {
    public QueueNode head;
    public QueueNode tail;
    private int size;


    public ListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }


    @Override
    public Object extract() {
        if (isEmpty()) {
            return null;
        } else {
            QueueNode temp = head.next;
            head = null;
            head = temp;
            size--;
            return true;
        }
    }

    @Override
    public boolean insert(Object object) {
        try {
            if (isEmpty()) {
                head = new QueueNode(object);
                tail = head;
            } else {
                tail.next = new QueueNode(object);
                tail = tail.next;
            }
            size++;
            return true;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al querer apilar");
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        for (QueueNode node = head; node != null; node = node.next) {
            if (node.getObject() == object) {
                return true;
            }
        }
        return false;
    }

    public QueueNode searchNodo(Object object) {
        for (QueueNode node = head; node != null; node = node.next) {
            if (node.getObject() == object) {
                return node;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        Object[] array = new Object[size];
        for (QueueNode node = head; node != null; node = node.next) {
            for (int i = 0; i < size; i++) {
                array[i] = node.getObject();
            }
        }
        Arrays.sort(array);
        ListQueue queueOrdenado = new ListQueue();
        for (int i = 0; i < size; i++) {
            queueOrdenado.insert(array[i]);
        }

    }

    @Override
    public void reverse() {
        ListQueue queueList = new ListQueue();
        Collections.reverse((List) queueList);
    }
}

