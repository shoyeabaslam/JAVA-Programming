package LinkedList;

public class Main {
    

    public static void main(String[] args) {
        LL ll = new LL();
        ll.insert(10);
        ll.insert(20);
        ll.insert(40);
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);

        ll.display();
        ll.reverse();

    }
}
