public class BinarySearchTree {
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int[] values) {
        for (int value : values) {
            root = insert(root, value);
        }
    }

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

    public void display() {
        display(root, "Root--> ");
    }

    private void display(Node node, String path) {
        if (node == null) {
            return;
        }
        System.out.println(path + node.value);
        display(node.left, node.value + " Left-->");
        display(node.right, node.value + " Right-->");

    }

    public int maxHeight() {
        return maxHeight(root, 0);
    }

    private int maxHeight(Node node, int level) {
        if (node == null) {
            return level - 1;
        }
        int left = maxHeight(node.left, level + 1);
        int right = maxHeight(node.right, level + 1);
        return Math.max(left, right);
    }

    public void individualHeight() {
        individualHeight(root);
    }

    private void individualHeight(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " Height -> " + maxHeight(node, 0));
        individualHeight(node.left);
        individualHeight(node.right);
    }
}
