package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter #: ");
        int n = in.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
    static public int factorial(int a)
    {
        int fact = 1;
        for(int i = 1 ; i <= a ; i++)
        {
            fact*=i;
        }
        return fact;
    }
}
