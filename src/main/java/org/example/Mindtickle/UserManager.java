package org.example.Mindtickle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
    private Map<Player, Card> playerCardMap;
    private CardType trumpCardType;
    private Card firstPlayerCard;
    public UserManager(CardType trumpCardType, Card firstPlayerCard){
        this.playerCardMap = new HashMap<>();
        this.trumpCardType = trumpCardType;
        this.firstPlayerCard = firstPlayerCard;
    }



    public void addPlayerCard(Player player, Card card){
        if(isLegalMove(player, card)){
            playerCardMap.put(player, card);
            List<Card> cardList =  player.getCardList();
            cardList.remove(card);
        }else{
            System.out.println("Illegal move from Player " + player.getName());
        }

    }

    private boolean isLegalMove(Player player, Card card) {
        if(playerCardMap.size()==0){
            return true;
        }else{
            if(firstPlayerCard.getCardType().equals(card.getCardType())){
                return true;
            }else{
                if(sameKindCardDoesntExist(player, firstPlayerCard)){
                    return playerDoesNotHasTrumpCard(player);
                }
            }
        }
        return false;
    }

    private boolean playerDoesNotHasTrumpCard(Player player) {
        List<Card> cardList = player.getCardList();
        for (Card card : cardList) {
            if (card.getCardType().equals(trumpCardType)) {
                return false;
            }
        }
        return true;
    }

    private boolean sameKindCardDoesntExist(Player player, Card card) {
        List<Card> cardList = player.getCardList();
        for(Card card1 : cardList){
            if(card1.getCardType().equals(card.getCardType()))
            {
                return false;
            }
        }
        return true;
    }

    public void removePlayerCards(){
        playerCardMap.clear();
    }

    public Player findWinner(int playersSize){
        Player winnerPlayer =  null;
        Card winnerCard = null;
        if(playersSize == playerCardMap.size()){
            for(Map.Entry<Player, Card> entry : playerCardMap.entrySet()){
                if(winnerPlayer==null){
                    winnerPlayer = entry.getKey();
                    winnerCard = entry.getValue();
                    System.out.println(" Current Player is " + winnerPlayer.getName() + " with card " + winnerCard.getCardNumber());
                }else{
                    Map<Player, Card> winnerMap = getWinnerAmongTwo(entry, winnerPlayer, winnerCard);
                    System.out.println("Winner Player is : " + winnerPlayer.getName() + " with card " + winnerCard.getCardNumber());
                }
            }
        }else{
            System.out.println("Not enough players to find winner");
        }
        return winnerPlayer;
    }

    private Map<Player, Card> getWinnerAmongTwo(Map.Entry<Player, Card> currentPlayerMap, Player winnerPlayer, Card winnerCard) {
        Map<Player, Card> winnerMap = new HashMap<>();
        if(winnerCard.getCardType().equals(currentPlayerMap.getValue().getCardType())){
            Integer firstPlayerCardValue = winnerCard.getCardNumber();
            Integer secondPlayerCardValue = currentPlayerMap.getValue().getCardNumber();
            if(secondPlayerCardValue > firstPlayerCardValue){
                winnerPlayer = currentPlayerMap.getKey();
                winnerCard = currentPlayerMap.getValue();
                System.out.println("Current Player is Winner " + winnerPlayer.getName() + " with card " + winnerCard.getCardNumber());
            }
            System.out.println("Fine working");
        }else{
            CardType currentCardType = currentPlayerMap.getValue().getCardType();
            if(currentCardType.equals(trumpCardType)){
                winnerPlayer = currentPlayerMap.getKey();
                winnerCard = currentPlayerMap.getValue();
                System.out.println("Trump card found " + currentPlayerMap.getValue());
            }
            System.out.println("My TrumpCard is : " + trumpCardType.name());
        }
        winnerMap.put(winnerPlayer, winnerCard);
        return winnerMap;
    }

    public Map<Player, Card> getPlayerCardMap() {
        return playerCardMap;
    }

    public void setPlayerCardMap(Map<Player, Card> playerCardMap) {
        this.playerCardMap = playerCardMap;
    }

    public CardType getTrumpCardType() {
        return trumpCardType;
    }

    public void setTrumpCardType(CardType trumpCardType) {
        this.trumpCardType = trumpCardType;
    }
}
