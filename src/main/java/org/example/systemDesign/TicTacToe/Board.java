package org.example.systemDesign.TicTacToe;

import java.util.Objects;

public class Board {
    private Integer[][] board;

    public Board(Integer size) {
        board = new Integer[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 0;
            }
        }
    }

    public Integer[][] getBoard() {
        return board;
    }

    public void setBoard(Integer[][] board) {
        this.board = board;
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
    }

    public boolean checkIfWon(Integer player){
        boolean won = false;
        for (Integer[] value : board) { // vertical
            int count = 0;
            for (int j = 0; j < board.length; j++) {
                if (Objects.equals(value[j], player)) {
                    count++;
                }
            }
            if (count == board.length) {
                return true;
            }
        }
        for(int i = 0; i < board.length; i++) { // horizontal
            int count = 0;
            for (Integer[] integers : board) {
                if (Objects.equals(integers[i], player)) {
                    count++;
                }
            }
            if(count==board.length){
                return true;
            }
        }

        int i = 0, j=0;
        int count = 0;
        while(i< board.length && j< board.length){  // diagonal from left to right
            if(Objects.equals(board[i][j], player)){
                count++;
                i++;
                j++;
            }else{
                break;
            }
        }
        if(count==board.length){
            return true;
        }

        i = 0;
        j=board.length-1;
        count = 0;
        while(i< board.length && j>=0){
            if(Objects.equals(board[i][j], player)){
                count++;
            i++;
            j--;
        }else{
            break;
        }
    }
        if(count==board.length)
            return true;// diagonal from right to left


        return won;
    }
}
