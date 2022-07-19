package main.java;

import java.util.Scanner;

/*
Given a character representing the basic operations (+, -, *, /, %) write a program that displays the value of the operation between x and y.

Input:

x,y - the numbers to operate on

 char c - the operation

Output:

depending on the operation selected, the result of the operation between x and y

Example:

x = 4, y = 3, c ='+' --> output: 7

x = 4, y = 3, c ='-' --> output: 1
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number x:");
        int x = in.nextInt();
        System.out.println("Enter second number y:");
        int y = in.nextInt();
        System.out.println("Enter operation:");
        String c = in.next();

        switch (c) {
            case "+":
                System.out.println("Result is " + (x + y));
                break;
            case "-":
                System.out.println("Result is " + (x - y));
                break;
            case "*":
                System.out.println("Result is " + (x * y));
                break;
            case "/":
                if(y==0) {
                    System.out.println("Cannot divide by 0");
                }else System.out.println("Result is " + (x / y));
                break;
            case "%":
                System.out.println("Result is " + (x % y));
                break;
        }
    }

}
