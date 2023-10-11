import java.util.Scanner;

class BinaryTree {
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Inserting Elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node Value");
        int value = scanner.nextInt();
        root = new Node(value); // adding the root node first
        populate(scanner, root); // calling for the rest of the element to add

    }

    private void populate(Scanner scanner, Node node) {
        // checking if you want to add elements to the left of a tree
        System.out.println("Left of value T/F: " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter Left Value of--> " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value); // creating object and linking to the left part of the node
            populate(scanner, node.left);
        }

        // checking if you want to add elements to the right of a tree
        System.out.println("Right of value T/F: " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter Right Value of---> " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value); // creating object and linking to the right part of the node
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "Root-->");
    }

    private void display(Node node, String str) {
        if (node == null) {
            return;
        }
        System.out.println(str + node.value);
        display(node.left, "left-->");
        display(node.right, "right-->");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        // calling right most part of the tree
        prettyDisplay(node.right, level + 1);
        // if level == 0 then it mean we are at the root node right! if not then print
        // the node.
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|----->" + node.value);
        } else {
            System.out.println(node.value);
        }
        // calling the left part of the tree
        prettyDisplay(node.left, level + 1);
    }
}