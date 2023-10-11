package PracticeRecursion;

public class Power {
    public static int power(int n, int p) {
        if (p < 1) {
            return 1;
        }
        return n * power(n, p - 1);
    }

    public static int power1(int n, int p) {
        if (p < 1) {
            return 1;
        }
        if (p % 2 == 0) {
            return power1(n, p / 2) * power1(n, p / 2);
        } else {
            return n * power1(n, p / 2) * power1(n, p / 2);
        }
    }

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.println("O(n) => " + power(2, 20));
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        begin = System.currentTimeMillis();
        System.out.println("O(log(n)) => " + power1(2, 20));
        end = System.currentTimeMillis();
        System.out.println(end - begin);

    }
}
