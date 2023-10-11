package Oops.AbstractClasses;

abstract class AbstractClass {
    /*
     * 1.Class must declare abstract if any of the class method is declare abstract;
     * 2.When we extends the abstract class all the methods in the abstract class
     * must has to overridden
     * 3.You cannot create objects for the abstract class;
     * 4.We cannot create constructor for the abstract class;
     * 5.You cannot create static abstract methods because static methods cannot be
     * overridden but abstract methods has to overridden
     */
    abstract void isOdd(int num);

    abstract void greet(String name);
}
