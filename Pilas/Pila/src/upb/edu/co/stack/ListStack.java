package upb.edu.co.stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListStack implements StackInterface {
    public StackNode head;
    public StackNode cima;
    private int size;


    public ListStack() {
        head = null;
        cima = null;
        size = 0;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Object peek() {
        return cima;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            Object object = cima.getObject();
            StackNode anterior = null;
            if (size == 1) {
                head = null;
            }
            for (StackNode node = head; node != null; node = node.next) {
                if (node == cima) {
                    cima = anterior;
                }
                anterior = node;
            }
            size--;
            return object;
        }
    }

    @Override
    public boolean push(Object object) {
        try {
            if (isEmpty()) {
                head = new StackNode(object);
                cima = head;
            } else {
                cima.next = new StackNode(object);
                cima = cima.next;
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
        for (StackNode node = head; node != null; node = node.next) {
            if (node.getObject() == object) {
                return true;
            }
        }
        return false;
    }

    public StackNode searchNodo(Object object) {
        for (StackNode node = head; node != null; node = node.next) {
            if (node.getObject() == object) {
                return node;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        Object[] array = new Object[size];
        for (StackNode node = head; node != null; node = node.next) {
            for (int i = 0; i < size; i++) {
                array[i] = node.getObject();
            }
        }
        Arrays.sort(array);
        ListStack stackOrdenado = new ListStack();
        for (int i = 0; i < size; i++) {
            stackOrdenado.push(array[i]);
        }

    }

    @Override
    public void reverse() {
        ListStack stackList = new ListStack();
        Collections.reverse((List) stackList);
    }
}

