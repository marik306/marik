package com.company;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
int a, b, result, result1;

        System.out.print("a = ");
        a = num.nextInt();
        System.out.print("b = ");
        b = num.nextInt();
        result = a + b;
        result1 = a * b;
        System.out.println("a + b = " + result);
        System.out.println("a * b = " + result1);
    }
}
