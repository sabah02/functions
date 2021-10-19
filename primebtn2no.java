package com.company;

import java.util.Scanner;
/*Write a function that returns all prime numbers between two numbers.*/
public class primebtn2no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two #s: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        check(n1,n2);
    }
    public static void check(int a , int b)
    {
        a = a+1;
        int j;
        for(int i = a ; i<b ; i++)
        {
            for(j = 2 ; j*j<=i ; j++)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(j*j>i)
            {
                System.out.println(i);
            }
        }
    }
}
