package com.company;

import java.util.Scanner;
/*Define a method to find out if a number is prime or not*/
public class Prime {
    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        System.out.println("Enter #: ");
        int n = on.nextInt();
        prime(n);
    }
    static public void prime(int a)
    {
        int i;
        for( i = 2 ; i*i<=a ; i++){
            if(a%i==0)
            {
                System.out.println("Not prime");
                return;
            }
        }
        if(i*i>=a)
        {
            System.out.println("Prime");
        }
    }
}
