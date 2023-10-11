package Oops.AbstractClasses;

public class Demo extends AbstractClass {
    public void isOdd(int num) {
        System.out.println((num & 1) == 1);
    }

    public void greet(String s) {
        System.out.println("Hi " + s);
    }

}
