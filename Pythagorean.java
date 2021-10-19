package com.company;

import java.util.Scanner;
/*
Write a function to check if a given triplet is a Pythagorean triplet or not.*/
public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = in.nextInt();
        System.out.println("Enter value of b:");
        int b = in.nextInt();
        System.out.println("Enter value of c (always greater than and b:");
        int c = in.nextInt();
        square(a,b,c);
    }
    public static void square(int x, int y, int z ){
        int X = x*x;
        int Y = y*y;
        int Z = z*z;
        int sum = X+Y;
        if(sum==Z)
        {
            System.out.println(X+" + "+Y+" = " +sum + " = " + Z + "\nThey are pythagorean triplet ");
        }
        else
        {
            System.out.println(X+" + "+Y+" = " +sum + " != " + Z + "\nThey are not pythagorean triplet ");
        }
    }
}
