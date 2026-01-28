package Recursion;
public class Lexicographical {
    // n: current number we are building
    // limit: the maximum value allowed (e.g., 13)
    static void lex(int n, int limit) {
        // Base Case: If current number exceeds limit, stop this branch
        if (n > limit) return;
        System.out.print(n + " ");
        // Try appending digits 0-9 to the current number
        for (int i = 0; i <= 9; i++) {
            lex(n * 10 + i, limit);
        }
    }
    public static void main(String[] args) {
        int limit = 13;
        // Start the recursion with 1-9 to avoid leading zeros
        for (int i = 1; i <= 9; i++) {
            lex(i, limit);
        }
    }
}