package com.company;

import java.util.Scanner;
/*6. Write a program to print the circumference and area of a
circle of radius entered by user by defining you own method.
 */
public class Circle {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int r = in.nextInt();
        double c = circum(r);
        double a = area(r);
        System.out.println("Circumference = " + c);
        System.out.println("Area = " + a);
    }
    static public double circum(int a){
        return 2*3.14*a;
    }
    static public double area(int b){
        return 3.14*b*b;
    }
}
