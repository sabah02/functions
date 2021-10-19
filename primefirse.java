package com.company;

import java.util.Scanner;

public class primefirse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();
        int i;
        for( i = 2 ; i*i<=n ; i++)
        {
            if(n%i==0)
            {
                System.out.println("Not prime");
                break;
            }
        }
        if(i*i>n)
        {
            System.out.println("prime");
        }
    }


}
