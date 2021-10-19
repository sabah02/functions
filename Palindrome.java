package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter # : ");
        int n = in.nextInt();
        palindrome(n);
    }
    public static void palindrome(int a)
    {
        int oa = a;
        int sum = 0;
        while(oa>0)
        {
            int r = oa%10;
            sum = sum*10 + r;
            oa/=10;
        }
        if(sum==a)
        {
            System.out.println(sum + " Palindrome");
        }
        else
        {
            System.out.println(sum+" Not Palindrome");
        }
    }
}
