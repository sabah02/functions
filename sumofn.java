package com.company;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int sum = sum(n);
        System.out.println(sum);

    }
    public static int sum(int n)
    {
        int sum=0;
        for(int i = 1 ; i<=n ; i++)
        {
            sum+=i;
        }
        return sum;
    }
}
