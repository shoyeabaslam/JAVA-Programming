package Oops.generics.customegerericsarraylist;

public class CustomeArrayList<T> {
    // object is the main class where all classes gets inherited
    // therefore if T is a anydata type it refers to object class;
    // by the way defaulty_capacity for actual array lis is 10;
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] data;

    CustomeArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    private int size = 0;

    public void add(T val) {
        if (size == data.length) {
            expand();
        }
        data[size++] = val;
    }

    private void expand() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                sb.append(data[i]);
            } else {
                sb.append(", " + data[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        return size;
    }
}
