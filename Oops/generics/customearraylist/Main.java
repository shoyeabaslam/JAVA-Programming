package Oops.generics.customearraylist;

public class Main {
    public static void main(String[] args) {
        CustomeArrayList list = new CustomeArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.delete());
        System.out.println(list.size());
    }
}
