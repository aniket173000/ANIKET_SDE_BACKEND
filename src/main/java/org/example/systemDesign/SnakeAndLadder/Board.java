package org.example.systemDesign.SnakeAndLadder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Integer maxSize;

    private Map<String, Integer> playersPosition;

    public Board(Integer maxSize) {
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
        this.maxSize = maxSize;
        this.playersPosition = new HashMap<>();
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public Map<String, Integer> getPlayersPosition() {
        return playersPosition;
    }

    public void setPlayersPosition(Map<String, Integer> playersPosition) {
        this.playersPosition = playersPosition;
    }
}
