package PracticeRecursion;

public class ReverseString {
    public static String reverse(int count, String str, String newStr) {
        if (count < 0) {
            return newStr;
        }
        newStr += str.charAt(count);
        return reverse(count - 1, str, newStr);
    }

    public static String reverseUsingSingleInput(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        return reverseUsingSingleInput(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        // String str = "MOTU PATLU";
        // String newStr = reverse(str.length() - 1, str, "");
        // System.out.println(newStr);
        String s = "Hello WOrld";
        System.out.println(reverseUsingSingleInput(s));

    }
}
