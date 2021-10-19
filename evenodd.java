package com.company;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter # to check: ");
        int n = in.nextInt();
        check(n);
    }
    static public void check(int n)
    {
        if(n%2==0){
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
