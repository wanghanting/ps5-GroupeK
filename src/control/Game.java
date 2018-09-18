package control;

import model.Card;

import model.Player;
import model.Rank;

import java.util.List;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new Player("player1");
        player2 = new Player("player2");
        player1.addCard(new Card(Rank.FIVE));
        player1.addCard(new Card(Rank.FOUR));
        player2.addCard(new Card(Rank.THREE));
        player2.addCard(new Card(Rank.THREE));
    }

    public void show() {
        System.out.println("Name: " + player1.getName());
        player1.showAllCard();
        System.out.println(" ");
        System.out.println("Name: " + player2.getName());
        player2.showAllCard();
        System.out.println(" ");
    }

    /*
     * pour obtenir la card le plus grande dans une main
     */
    public Card max(List<Card> handCard1) {
        Card cardMax = handCard1.get(0);
        for (int i = 0; i < handCard1.size(); i++) {
            if (cardMax.getValue() <= handCard1.get(i).getValue()) {
                cardMax = handCard1.get(i);
            }
        }
        return cardMax;
    }

    /*
     * pour obtenir la pair dans une main
     */
    public Card pair(List<Card> handCard1) {
        Card cardPair = handCard1.get(0);
        for (int i = 1; i < handCard1.size(); i++) {
            if (cardPair.getValue() == handCard1.get(i).getValue()) {
                cardPair = handCard1.get(i);
            }
        }
        return cardPair;
    }

    // 0 = equal ; 1 = p1 win ; 2 = p2 win
    public int compareHighCard(List<Card> handCard1, List<Card> handCard2) {
        if (max(handCard1).getValue() > max(handCard2).getValue()) {
            return 1;
        } else if (max(handCard1).getValue() < max(handCard2).getValue()) {
            return 2;
        } else {
            return 0;
        }
    }

    // 0 = equal ; 1 = p1 win ; 2 = p2 win
    public int comparePair(List<Card> handCard1, List<Card> handCard2) {
        if (havePair(handCard1) && !havePair(handCard2)) {
            return 1;
        } else if (havePair(handCard2) && !havePair(handCard1)) {
            return 2;
        } else {
            return compareHighCard(handCard1, handCard2);
        }
    }

    /*
     * pour tester est ce qu'il y a une pair
     */
    public boolean havePair(List<Card> handCard1) {
        Card card1 = handCard1.get(0);
        Card card2 = handCard1.get(1);
        if (card1.getValue() == card2.getValue()) {
            return true;
        } else
            return false;
    }

    public void compare() {
        List<Card> handCard1 = player1.getHandcard();
        List<Card> handCard2 = player2.getHandcard();
        int result = comparePair(handCard1, handCard2);
        switch (result) {
            case 1:
                System.out.println("player1 win!");
                break;
            case 2:
                System.out.println("player2 win!");
                break;
            default:
                System.out.println("no one win!");
                break;
        }
    }
    //System.out.println(max(handCard1).getValue());
    //System.out.println(max(handCard2).getValue());
}
