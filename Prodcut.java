package com.company;

import java.util.Scanner;

public class Prodcut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 #s: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int product = product(n1, n2);
        System.out.println("Product = " + product);
    }
    static public int product(int a , int b){
        return a*b;
    }
}
