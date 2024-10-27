package org.example.systemDesign.TicTacToe;

import java.util.Scanner;

public class TicTacToeService {
    private Integer moves = 0;
   TicTacToeService(Integer moves) {
       this.moves = moves;
   }

    public Integer getMoves() {
        return moves;
    }
    public void setMoves(Integer moves) {
        this.moves = moves;
    }

    public void playGame(Board board){
        Scanner s = new Scanner(System.in);
        Integer size = board.getBoard().length;
        boolean firstPlayer = false;
        boolean secondPlayer = false;
        board.printBoard();
        boolean isDraw = true;
        while(this.moves<size*size){
            do{
                firstPlayer = false;
                System.out.println("Enter your move Player 1: ");
                int row = s.nextInt();
                int col = s.nextInt();
                if(board.getBoard()[row][col]==0){
                    board.getBoard()[row][col]=1;
                    board.setBoard(board.getBoard());
                    this.moves++;
                    firstPlayer = true;
                } else {
                    System.out.println("Invalid move");
                }
            }while(!firstPlayer);
            board.printBoard();
            if(board.checkIfWon(1))
            {
                System.out.println("Player 1 won");
                isDraw = false;
                break;
            }
            if(this.moves>=size*size){
                break;
            }

            do{
                secondPlayer = false;
                System.out.println("Enter your move Player 2: ");
                int row = s.nextInt();
                int col = s.nextInt();
                if(row>=board.getBoard().length || col>=board.getBoard().length){
                    System.out.println("Invalid move");
                    continue;
                }
                if(board.getBoard()[row][col]==0){
                    board.getBoard()[row][col]=2;
                    board.setBoard(board.getBoard());
                    this.moves++;
                    secondPlayer = true;
                } else {
                    System.out.println("Invalid move");
                }
            }while(!secondPlayer);
            board.printBoard();
            if(board.checkIfWon(2))
            {
                System.out.println("Player 2 won");
                isDraw = false;
                break;
            }

        }
        if(isDraw)
        {
            System.out.println("Game is draw");
        }
        s.close();
    }
}
