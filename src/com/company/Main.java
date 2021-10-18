package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    static String[][] board = new String[10][8];

    public static void board() {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "[ ]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        board[random.nextInt(10)][random.nextInt(8)] = "[X]";
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int userCoinTotal = 0;
        boolean again = true;
        while (again = true) {
            int coinPrize = random.nextInt(2001);
            board();

            //check board
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println("");
            }
            String hit = "false";

            System.out.println("What are your X and Y coordinates in that order :");
            while (hit.contains("false")) {
                int userX = input.nextInt();
                int userY = input.nextInt();


                if (board[userY-1][userX-1].contains("X")) {
                    System.out.println("good job you hit the spot");
                    userCoinTotal = coinPrize + userCoinTotal;
                    System.out.println("your coin balance is now: "+userCoinTotal);
                    System.out.println("this is your board");
                    System.out.println("");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print(board[i][j]);
                        }
                        System.out.println("");
                    }

                    hit = "true";

                } else {
                    System.out.println("you missed ");
                    board[userX][userY] = "[0]";
                    System.out.println("enter your next x and y coordinates");
                }
            }
            System.out.println("do you want to play again? y/n");
            String Again = input.next();
            if (Again.contains("y")){

            }else{
                break;
            }
        }


    }
}





