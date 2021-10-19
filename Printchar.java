package com.company;

import java.util.Scanner;

public class Printchar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two characters: ");
        char a = in.next().charAt(0);
        char b = in.next().charAt(0);
        display(a,b);
    }
    public static void display(char a , char b)
    {
        for(char i = a ; i<b ; i++)
        {
            System.out.println(i);
        }
    }
}
