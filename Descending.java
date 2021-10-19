package com.company;
import java.util.Scanner;
public class Descending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = in.nextInt();
        remainder(n);
    }
    public static void remainder(int n) {
        int rn = n;
        int sn = n;
        int r = n%10;
        int max =r;
        n=n/10;
        for(int i = 1 ; n>0 ; i++) {
            r = n % 10;
            if (r < max) {
                int temp = r;
                r = max;
                max = temp;
            }
            n = n / 10;
        }
        int sum = 0;
        sum = sum*10 + max;
        System.out.println(sum);
        }
}
