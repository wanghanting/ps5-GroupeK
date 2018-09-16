package control;

import model.Card;
import java.util.*;
import model.Player;
import model.Rank;

import java.util.Collections;
import java.util.List;

/**
 * @Project: Dojo
 * @Author: WU Kejia
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
        player1.addCard(new Card(Rank.FOUR));
        player1.addCard(new Card(Rank.FOUR));
        player2.addCard(new Card(Rank.FIVE));
        player2.addCard(new Card(Rank.FIVE));
    }

    public void show() {
        System.out.println("Name: " + player1.getName());
        player1.showAllCard();
        System.out.println("Name: " + player2.getName());
        player2.showAllCard();
    }
    /*
     * pour obtenir la card le plus grande dans une main
     */
    public Card max(List<Card> handCard1) {
    	Card cardMax = handCard1.get(0);
    	for(int i = 0;i<handCard1.size();i++) {
    		if(cardMax.getValue() <= handCard1.get(i).getValue()) {
    			cardMax = handCard1.get(i);
    		}
    	}return cardMax;
    }
    
    // 0 = equal ; 1 = p1 win ; 2 = p2 win
    public int compareHighCard(List<Card> handCard1, List<Card> handCard2) {
       // Card card1 = handCard1.get(0);
       //Card card2 = handCard1.get(1);
       // Card card3 = handCard2.get(0);
       // Card card4 = handCard2.get(1);
        
        if (max(handCard1).getValue()>max(handCard2).getValue()) {
            return 1;
        } else if (max(handCard1).getValue() < max(handCard2).getValue()) {
            return 2;
        } else {
            return 0;
        }
    }
    
    public int comparePair(List<Card> handCard1, List<Card> handCard2) {
    	if(pair(handCard1) == true&&pair(handCard2) == false) {
        	return 1;
        }else if(pair(handCard2) == true&&pair(handCard1) == false) {
        	return 2;
        }else {
        	return compareHighCard(handCard1, handCard2);
        }
    }
    /*
     * pour tester est ce qu'il y a une pair
     */
    public boolean pair(List<Card> handCard1) {
    	Card card1 = handCard1.get(0);
    	Card card2 = handCard1.get(1);
    	if(card1.getValue()==card2.getValue()) {
    		return true;
    	}else 
    		return false;
    }

    public void compare() {
        List<Card> handCard1 = player1.getHandcard();
        List<Card> handCard2 = player2.getHandcard();
        int result = comparePair(handCard1,handCard2);
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
