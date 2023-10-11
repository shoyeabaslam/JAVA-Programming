package PracticeRecursion;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextInt();
        }
        scanner.close();
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (gcd(sequence[i], sequence[j]) == 1 &&
                            gcd(sequence[j], sequence[k]) == 1 &&
                            gcd(sequence[i], sequence[k]) == 1) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
