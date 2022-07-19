package main.java;

import java.util.Scanner;

/*
There are n  number of girls and they roll a dice one after another.

If the number on the dice is 6, then the dice will be rolled again until the number shown on the dice is other than 6.

Given the sequence of numbers on the dice when rolled each time, find the total number of girls or if the sequence is invalid.

Input

an array of numbers, representing a sequence of the numbers shown on the dice

Output

If the sequence is valid print the number of girls
If the sequence is invalid print -1
Example

numbers = {4, 5, 6, 6, 1, 6, 6, 1}  --> output: 4
numbers = {1, 2, 6, 6} --> output: -1
 */

public class RollTheDice {
    public static void main(String[] args) {
//        int totalThrows[] = {4,5,6,6,1,6,6};
        Scanner in = new Scanner(System.in);
        int count= 1;
        System.out.println("Enter nuber of throws:");
        int numberOfThrows= in.nextInt();
        int totalThrows[] = new int[numberOfThrows];
        for (int i=1;i<numberOfThrows;i++){
            System.out.println("Throw the dice:");
            totalThrows[i] = in.nextInt();
        }

        System.out.println("Array size:"+totalThrows.length);
        for(int i=0; i<totalThrows.length-1;i++){
            if(totalThrows[i]!=6){
                count++;
            }
        }
        if(totalThrows[totalThrows.length-1]==6){
            System.out.println("Invalid sequence:"+-1);
        }else System.out.println("Number of girls:"+count);
    }
}
