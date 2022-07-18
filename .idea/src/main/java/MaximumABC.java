package main.java;

import java.util.Scanner;

public class MaximumABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("a=");
        a = in.nextInt();
        System.out.println("b=");
        b = in.nextInt();
        System.out.println("c=");
        c = in.nextInt();
        int max = a;
        if ((a>b)&&(a>c)){
            max = a;
        } else if ((b>a)&&(b>c)){
            max = b;
        } else max = c;
        System.out.println("the max number is"+ max);
    }
}
