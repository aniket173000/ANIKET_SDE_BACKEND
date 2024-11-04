package org.example.Mindtickle;


import java.util.List;

public class Player {

    private String name;
    private List<Card> cardList;

    public Player(String name, List<Card> cardList) {
        this.name = name;
        this.cardList = cardList;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
