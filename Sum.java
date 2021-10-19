package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two #s: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int sum = sum(n1,n2);
        System.out.println("SUM = "+sum);
    }
    static public int sum(int a, int b){
        return a + b;
    }
}
