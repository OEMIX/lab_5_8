package com.company;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a %10;
        int c =(a %100- b)/10;
        a = (a - b - c *10)/100;
        if ((b > a) & (b > c)) {
            System.out.println(b);
        }else if (c > a){
            System.out.println(c);
        }else System.out.println(a);
    }
}