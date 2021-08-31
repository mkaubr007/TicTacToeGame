package com.biz.tictactoe.game;

public class TicTacToe {
    static int[][] BOARD = new int[3][3];
    static boolean isEmpty=true;
    static void initBoard() {
        System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD[i].length; j++) {
                BOARD[i][j] = -10;
            }
        }
        System.out.println("Board is this :");
        dispBoard();
    }
    static void dispBoard() {
        int count = 0;
        for (int i = 0; i < BOARD.length; i++) {
            System.out.println("---------------");
            System.out.print("||");
            for (int j = 0; j < BOARD[i].length; j++) {
                if (BOARD[i][j] == 0) {
                    count++;
                    System.out.print(" o |");
                } else if (BOARD[i][j] == 1) {
                    count++;
                    System.out.print(" x |");
                } else
                    System.out.print("   |");
            }
            System.out.println("|");
        }
        if (count == 9) {
            isEmpty = false;
        }
        System.out.println("---------------");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe game");
        initBoard();
    }
}
