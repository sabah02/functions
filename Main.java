package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
/* Define two methods to print the maximum and the minimum number respectively
among threw numbers entered by the user*/
    public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
        System.out.print("Enter 3 #: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = max(a,b,c);
        System.out.println(max);
        int min = min(a,b,c);
        System.out.print(min);
    }
    static public int min(int a , int b , int c)
    {
        int min = a;
        if(b<min)
        {
            min=b;
        }
        if(c<min)
        {
            min=c;
        }
        return min;
    }
    static public int max(int a , int b , int c){
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
}
