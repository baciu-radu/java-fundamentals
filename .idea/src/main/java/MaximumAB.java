package main.java;

import java.util.Scanner;

public class MaximumAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        System.out.println("a=");
        a = in.nextInt();
        System.out.println("b=");
        b = in.nextInt();
        if (a>b){
            System.out.println("a is the max number");
        }else System.out.println("b is the max number");
    }
}

