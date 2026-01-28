package Recursion;

import java.util.Scanner;

public class SubSequence {

    static void subseq(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char c=str.charAt(0);
        String rest =str.substring(1);
        subseq(rest,ans);
        subseq(rest,ans+c);
    }



    public static void main(String[] args) {
        System.out.println("Enter String: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        subseq(s,"");
    }
}
