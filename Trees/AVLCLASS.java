public class AVLCLASS {
    public static void main(String[] args) {
        AVL avl = new AVL();
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(5);
        avl.display();
        int height = avl.height();
        System.out.println(height);
    }
}
