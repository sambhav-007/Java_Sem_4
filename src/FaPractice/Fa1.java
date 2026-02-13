package FaPractice;

public class Fa1 {
    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 18;
        System.out.println(isPowerOfTwo(n1)); // true
        System.out.println(isPowerOfTwo(n2)); // false
    }
}
