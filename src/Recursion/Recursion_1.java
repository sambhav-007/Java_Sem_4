package Recursion;//SEM 4

//Recursion

import java.util.Scanner;

public class Recursion_1 {
    public static int factorial(int a){
        if(a==1)return 1;
        else{
            a=a*factorial(a-1);
        }
        return a;

    }
    public static int son(int a){
        if(a==1)return 1;
        else{
            return a+son(a-1);
        }
    }
    public static int pon(int a,int b){
        if(b==0)return 1;
        return a*pon(a,b-1);
    }
    public static void main(String[] args) {
        Factorial();
        Sumofnumbers();
        Powerofn();
    }
    static void Factorial(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Factorial \n Enter Value :");
        int a=sc.nextInt();
        System.out.println(factorial(a));
    }

    static void Sumofnumbers() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Sum Of Digit\nEnter Value :");
        int a=sc.nextInt();
        System.out.println(son(a));
    }

    static void Powerofn(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Power of n\nEnter Value of base & exponent:");
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println(pon(a,b));
    }

}