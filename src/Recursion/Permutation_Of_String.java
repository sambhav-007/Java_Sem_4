package Recursion;

import java.util.Scanner;
public class Permutation_Of_String {
    static int count = 0;
    static void perm(String str, String res) {
        if (str.isEmpty()) {
            System.out.println(res);
            count++;
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            perm(rem, ch + res);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        perm(str, "");
        System.out.println("Total permutations: " + count);
        sc.close();
    }
}