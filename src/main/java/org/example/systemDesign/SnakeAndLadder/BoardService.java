package org.example.systemDesign.SnakeAndLadder;

import java.util.*;

public class BoardService {

    private Board board;
    private Integer totalPlayers;
    private boolean isGameOver;

    private Queue<Players> players;
    private Integer noOfDices = 1;
    public BoardService(Board board, Integer totalPlayers) {
        this.board = board;
        this.totalPlayers = totalPlayers;
        this.isGameOver = false;
        this.players = new LinkedList<Players>();
    }


   public void setPlayersPosition(List<Players> playersList) {
        this.players = new LinkedList<>();
        this.totalPlayers = playersList.size();
        Map<String, Integer> playerPositionMap = board.getPlayersPosition();
        for (Players player : playersList) {
            this.players.add(player);
            playerPositionMap.put(player.getName(), 0);
        }
        board.setPlayersPosition(playerPositionMap);
   }

   public void setSnakes(List<Snake> snakes) {
        board.setSnakes(snakes);
   }
   public void setLadders(List<Ladder> ladders) {
        board.setLadders(ladders);
   }
   public Integer getNewPosition(Integer currentPosition, Integer diceRoll) {
        Integer newPosition =  currentPosition + diceRoll;
        if(newPosition > 100){
            return currentPosition;
        }else{
            do{
                for(Snake snake : board.getSnakes()){
                    if(newPosition.equals(snake.getStart())){
                        newPosition = snake.getEnd();
                    }
                }

                for(Ladder ladder : board.getLadders()){
                    if(newPosition.equals(ladder.getStart())){
                        newPosition = ladder.getEnd();
                }
                }
            }while(Objects.equals(newPosition, currentPosition));
         return newPosition;
        }
   }

   public void playGame(){
        while(!isGameOver() && players.size() > 0){
            Integer rollDice = DiceService.rollDice();
            Players player = players.poll();
            Integer currentPosition = board.getPlayersPosition().get(player.getName());
            Integer newPosition = getNewPosition(currentPosition, rollDice);
            if(newPosition==100){
                System.out.println(player.getName() + " Won the game");
            }else{
                Map<String, Integer> playerPositionMap = board.getPlayersPosition();
                System.out.println("Player " + player.getName() + " moved from " + currentPosition + " to " + newPosition);
                playerPositionMap.put(player.getName(), newPosition);
                players.add(player);
            }

        }
   }

    public Integer getTotalPlayers() {
        return totalPlayers;
    }

    public void setTotalPlayers(Integer totalPlayers) {
        this.totalPlayers = totalPlayers;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.isGameOver = gameOver;
    }

    public Queue<Players> getPlayers() {
        return players;
    }

    public void setPlayers(Queue<Players> players) {
        this.players = players;
    }

    public Integer getNoOfDices() {
        return noOfDices;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
