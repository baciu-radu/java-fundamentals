package main.java;

import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
//        int array[]= {6,8,4,3,7,5,4,7,8,3,7,6,1,9};
        Scanner in = new Scanner(System.in);
        int n, i;
        Integer[] array = new Integer[5];
        System.out.println("n= ");
        n = in.nextInt();

        //read array from console
        for( i = 0; i < n ; i++){
            System.out.println("array["+ i +"]=");
            array[i]= in.nextInt();
        }

        //display array
        System.out.println("Display Array:");
        for( i = 0; i < n ; i++){
            System.out.println("array["+ i +"]="+array[i]);
        }

        //display max and min
        System.out.println("Display Array:");
        int min= array[0];
        int max= array[0];
        for( i = 0; i < n ; i++){
            if (min > array[i]){
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Min is:"+min);
        System.out.println("Max is:"+max);
    }
}
