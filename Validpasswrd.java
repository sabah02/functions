package com.company;

import java.util.Scanner;

public class Validpasswrd {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        String name = "Sabah Shaikh";
        String gmail = "sabayshaikh44@gmail.com";
        System.out.println("""
                Password rules:
                \t• A password must have at least ten characters.
                \t• A password consists of only letters and digits.
                A password must contain at least two digits.""");
        String password = "*@PasswordPW_)1";
        check(name,gmail,password);
    }
    public static void check(String name , String gmail ,String password)
    {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter your name");
        String naam = in.nextLine();
        System.out.println("Enter your gmail");
        String address = in.nextLine();
        System.out.println("Enter your Password");
        String again = in.nextLine();
        if((name).equals(naam))
        {
            System.out.println("The name is correct is correct ^_^ Logged in");
        }
        else
        {
            System.out.println("The name is wrong  ((*)(*)) Cannot Log you in");
        }
        if((gmail).equals(address))
        {
            System.out.println("The gmail is correct is correct ^_^ Logged in");
        }
        else
        {
            System.out.println("The gmail is wrong  ((*)(*)) Cannot Log you in");
        }
        if((password).equals(again))
        {
            System.out.println("The password is correct is correct ^_^ Logged in");
        }
        else
        {
            System.out.println("The password is wrong  ((*)(*)) Cannot Log you in");
        }



    }

}
