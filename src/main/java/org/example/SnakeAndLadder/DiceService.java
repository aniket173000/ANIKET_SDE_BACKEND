package org.example.SnakeAndLadder;

import java.util.Random;

public class DiceService {

    public static Integer rollDice(){
        return new Random().nextInt(6) + 1;
    }
}
