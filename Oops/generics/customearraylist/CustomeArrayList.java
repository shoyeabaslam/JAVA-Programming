package Oops.generics.customearraylist;

public class CustomeArrayList {
    private static final int DEFAULT_CAPACITY = 5;
    private static final Exception Exception = null;
    private int[] arr;
    private int size;

    CustomeArrayList() {
        this.arr = new int[DEFAULT_CAPACITY];
    }

    public void add(int val) {
        if (size == arr.length) {
            // double the size of the array
            grow();
        }
        arr[size++] = val;
    }

    private void grow() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public int get(int index) {
        if (index >= arr.length) {
            throw new IndexOutOfBoundsException(index);
        }
        return arr[index];
    }

    public int delete() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return arr[--size];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append(arr[i]);
            } else {
                sb.append(", " + arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}