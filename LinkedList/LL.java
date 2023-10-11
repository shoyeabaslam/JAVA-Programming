package LinkedList;

public class LL {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;

    public void reverse() {
        head = reverse(head);
    }

    public Node reverse(Node node) {
        Node prev = null;
        Node curr = node;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        display(prev);
        return curr;
    }

    public void insert(int val) {
        head = insert(head, val);
    }

    public void insert(int val, int index) {
        head = insert(head, val, index, 1);
    }

    public Node insert(Node node, int val, int index, int count) {
        if (index == 0) {
            Node newNode = new Node(val);
            newNode.next = node;
            return newNode;
        }
        if (index >= count) {
            if (node == null) {
                System.out.println("index out of bound");
                return node;
            } else {
                if (index == count) {
                    Node newNode = new Node(val);
                    Node temp = node.next;
                    node.next = newNode;
                    newNode.next = temp;

                }
            }
        }
        if (node != null) {
            insert(node.next, val, index, count + 1);
        }
        return node;
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        node.next = insert(node.next, val);

        return node;
    }

    public void display() {
        display(head);
    }

    private void display(Node node) {
        while (node != null) {
            System.out.print(node.val + "-->");
            node = node.next;
        }
        System.out.print("null\n");
    }

    public int display(int index) {
        return display(head, index);
    }

    private int display(Node node, int index) {
        if (node == null) {
            return -1;
        }
        if (index == 0) {
            return node.val;
        }
        return display(node.next, index - 1);
    }

}
