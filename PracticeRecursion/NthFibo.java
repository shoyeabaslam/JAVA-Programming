package PracticeRecursion;

import java.util.*;

public class NthFibo {
    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fiboUsingDP(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        } else {
            dp[n] = fiboUsingDP(n - 1, dp) + fiboUsingDP(n - 2, dp);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibo(n));
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Fibo using DP " + fiboUsingDP(n, dp));
    }
}
