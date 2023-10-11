public class AVL {
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            node.left = insert(node.left, value);
        }
        return node;
    }

    public int height() {
        return height(root, 0);
    }

    private int height(Node node, int h) {
        if (node == null) {
            return h - 1;
        }
        int left = height(node.left, h + 1);
        int right = height(node.right, h + 1);
        return Math.max(left, right);
    }

    public void display() {
        display(root, "root--> ");
    }

    private void display(Node node, String str) {
        if (node == null) {
            return;
        }
        System.out.println(str + node.value);
        display(node.left, node.value + " left--> ");
        display(node.right, node.value + " right--> ");
    }
}
