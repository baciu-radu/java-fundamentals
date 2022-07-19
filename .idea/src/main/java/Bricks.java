package main.java;

import java.util.Scanner;

/*
Patlu and Motu want to build a house. They have to put a number of n bricks  from one place to another.

They decided that the one who puts the last brick would win a dinner.

They have to follow a simple rule: in the i'th round, Patlu puts i bricks whereas Motu puts i x 2 bricks.

There are only n bricks. Who put the last brick?

Input:

n - the number of bricks

Output:

Patlu - if Patlu puts the last bricks

OR

Motu - otherwise.
 */
public class Bricks {
    public static void main(String[] args) {
        int patlu = 0;
        int motu = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of bricks:");
        int numberOfBricks = in.nextInt();
        int bricksUsed = 0;
        int i = 1;
        String winner = null;
        while (bricksUsed < numberOfBricks) {
            patlu += + i;
            bricksUsed += patlu;
            if (bricksUsed >= numberOfBricks) {
                winner = "Patlu is the winner";
            }
            motu += i * 2;
            bricksUsed += motu;
            if ((bricksUsed >= numberOfBricks) && (winner != "Patlu is the winner")) {
                winner = "Motu is the winner";
            }

            i++;

        }
        System.out.println(winner);
    }
}


