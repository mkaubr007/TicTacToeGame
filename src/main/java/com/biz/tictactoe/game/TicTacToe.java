package com.biz.tictactoe.game;

public class TicTacToe {
    static int[][] BOARD = new int[3][3];

    static void initBoard() {
        System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD[i].length; j++) {
                BOARD[i][j] = -10;
            }
        }
        System.out.println("Board is this :");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe game");
        initBoard();
    }
}
