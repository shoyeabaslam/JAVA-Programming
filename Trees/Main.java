
public class Main {
    public static void main(String[] args) {
        // BinaryTree tree = new BinaryTree(); // creating object of a class
        // tree.populate(new Scanner(System.in)); // inserting the element into the tree
        // tree.prettyDisplay(); // displaying the tree in a better way.
        BinarySearchTree bst = new BinarySearchTree();
        // bst.insert(20);
        // bst.insert(30);
        // bst.insert(5);
        int[] values = { 8, 5, 3, 6, 7, 10 };
        bst.insert(values);
        // bst.display();
        int maxHeight = bst.maxHeight();
        System.out.println(maxHeight);
        bst.individualHeight();
    }
}
