package PracticeRecursion;

public class Palindrome {
    public static boolean isPalindrome(int start, int end, String s) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return isPalindrome(start + 1, end - 1, s);
    }

    public static void main(String[] args) {
        String s = "MADDAM";
        System.out.println(isPalindrome(0, s.length() - 1, s));
    }
}
