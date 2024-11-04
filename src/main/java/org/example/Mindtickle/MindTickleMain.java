package org.example.Mindtickle;

import java.util.ArrayList;
import java.util.List;

public class MindTickleMain {
    public static void main(String[] args){
        System.out.println("Hey we are testing Mindtickle interview");
        List<Card> cardList = new ArrayList<>();
        for(int i=1;i<14;i++){
            Card card = null;
            if(i<=4){
                card = new Card(i, CardType.DIAMOND);
            }
            else if(i<=8){
                card = new Card(i, CardType.HEART);
            }else if(i<=12){
                card = new Card(i, CardType.SPADE);
            } else {
                card = new Card(i, CardType.CLUB);
            }
            cardList.add(card);
        }

        Player player1 = new Player("Player1", cardList);
        cardList.clear();
        for(int i=1;i<14;i++){
            Card card = null;
            if(i<=4){
                card = new Card(i, CardType.CLUB);
            }
            else if(i<=8){
                card = new Card(i, CardType.HEART);
            }else if(i<=12){
                card = new Card(i, CardType.SPADE);
            } else {
                card = new Card(i, CardType.DIAMOND);
            }
            cardList.add(card);
        }

        Player player2 = new Player("Player2", cardList);
        cardList.clear();

        for(int i=1;i<14;i++){
            Card card = null;
            if(i<=4){
                card = new Card(i, CardType.CLUB);
            }
            else if(i<=8){
                card = new Card(i, CardType.DIAMOND);
            }else if(i<=12){
                card = new Card(i, CardType.SPADE);
            } else {
                card = new Card(i, CardType.HEART);
            }
            cardList.add(card);
        }

        Player player3 = new Player("Player3", cardList);
        cardList.clear();

        for(int i=1;i<14;i++){
            Card card = null;
            if(i<=4){
                card = new Card(i, CardType.CLUB);
            }
            else if(i<=8){
                card = new Card(i, CardType.DIAMOND);
            }else if(i<=12){
                card = new Card(i, CardType.HEART);
            } else {
                card = new Card(i, CardType.SPADE);
            }
            cardList.add(card);
        }

        Player player4 = new Player("Player4", cardList);
        cardList.clear();
        Card currentCard = new Card(1, CardType.DIAMOND);
        UserManager userManager = new UserManager(CardType.HEART, currentCard);
        userManager.addPlayerCard(player1, player1.getCardList().get(0));
        System.out.println("Player1 Card is " + player1.getCardList().get(0).getCardType() + " " + player1.getCardList().get(0).getCardNumber());
        userManager.addPlayerCard(player2, player2.getCardList().get(0));
        System.out.println("Player2 Card is " + player2.getCardList().get(0).getCardType() + " " + player2.getCardList().get(0).getCardNumber());
        userManager.addPlayerCard(player3, player3.getCardList().get(0));
        System.out.println("Player3 Card is " + player3.getCardList().get(0).getCardType() + " " + player3.getCardList().get(0).getCardNumber());
        userManager.addPlayerCard(player4, player4.getCardList().get(0));
        System.out.println("Player4 Card is " + player4.getCardList().get(0).getCardType() + " " + player4.getCardList().get(0).getCardNumber());

        Player player = userManager.findWinner(4);
        System.out.println("Winner is " + player.getName());

         userManager.removePlayerCards();

    }
}
/**
 *
 Design a card game with 4 players.
 Each player will have 13 random cards from the deck - 52 - 4
 Each player  will try to win a hand
 Each player will discard a higher ranking card if he has a card of that suit, if he does not have that suit he can discard trump card, if he does not have either he can discard any random card
 Trump card is decided at the start of the game randomly
 Write a code to simulate this.

 */