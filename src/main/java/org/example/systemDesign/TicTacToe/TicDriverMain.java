package org.example.systemDesign.TicTacToe;

public class TicDriverMain {
    public static void main(String[] args) {
        System.out.println("Hey we are testing tic tac toe");
        Board board = new Board(3);
        TicTacToeService ticTacToe = new TicTacToeService(0);
        ticTacToe.playGame(board);
    }
}
