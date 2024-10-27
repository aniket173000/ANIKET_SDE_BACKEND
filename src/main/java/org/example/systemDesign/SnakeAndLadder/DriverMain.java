package org.example.systemDesign.SnakeAndLadder;

import java.util.*;

public class DriverMain {
    public static void main(String[] args) {
        System.out.println("Lets Play Snake and Ladder");
        Players players = new Players("aniket");
        Players players1 = new Players("mohit");
        Map<String, Integer> playersMap = new HashMap<>();
        playersMap.put(players.getName(), 0);
        playersMap.put(players1.getName(), 0);
        Board board = new Board(100);
        Snake snake = new Snake(9,3);
        Snake snake1 = new Snake(99,10);
        Snake snake2 = new Snake(93,19);
        Snake snake3 = new Snake(95,29);
        List<Snake> snakes = new ArrayList<>();
        snakes.add(snake);
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        board.setSnakes(snakes);
      board.setPlayersPosition(playersMap);
        Ladder ladder = new Ladder(2,10);
        Ladder ladder1 = new Ladder(4,20);
        Ladder ladder2 = new Ladder(6,30);
        Ladder ladder3 = new Ladder(8,40);
        List<Ladder> ladders = new ArrayList<>();
        ladders.add(ladder);
        ladders.add(ladder1);
        ladders.add(ladder2);
            ladders.add(ladder3);
            board.setLadders(ladders);

            board.setLadders(ladders);
            board.setSnakes(snakes);
            board.setPlayersPosition(playersMap);
            Queue<Players> queue = new LinkedList<>();
            queue.add(players);
            queue.add(players1);
            BoardService  boardService = new BoardService(board, 2);
            boardService.setPlayers(queue);

            boardService.playGame();
    }
}
