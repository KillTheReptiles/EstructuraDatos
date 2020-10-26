package upb.edu.co.stack;

import java.util.Arrays;

public class ArrayStack implements StackInterface {

    private int size;
    private Object[] array;
    private int top;

    public ArrayStack(int size) {
        this.size = size;
        this.array = new Object[(size > 0) ? size : 1];
        this.top = -1;
        clear();
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return array[0] == null;
    }

    @Override
    public Object peek() {
        return (!isEmpty()) ? array[top] : null;
    }

    @Override
    public Object pop() {
        if (!isEmpty()) {
            Object object = array[top];
            array[top--] = null;
            return object;
        } else {
            return null;
        }
    }

    @Override
    public boolean push(Object object) {
        if (top + 1 < size) {
            try {
                array[++top] = object;
                return true;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean search(Object object) {
        return false;
    }

    @Override
    public void sort() {

    }

    @Override
    public void reverse() {

    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                ", top=" + top +
                '}';
    }
}
