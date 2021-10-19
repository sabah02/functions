package com.company;

import java.util.Scanner;

public class Vote {
    /*3. A person is eligible to vote if his/her age is greater
     than or equal to 18 . Define a method to find out if he/she is eligible to vote */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        check(age);
    }
    static public void check(int a)
    {
        if(a>=18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Sorry, not Eligible");
        }
    }
}
