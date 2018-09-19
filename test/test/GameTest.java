package test;


import control.Game;
import model.Card;
import model.Rank;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class GameTest {
    static Game game;

    @BeforeAll
    static void setUp() {
        game = new Game();
    }

    @Test
    void testCompareHighCard() {
        Card card1 = new Card(Rank.TWO);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.THREE);
        Card card4 = new Card(Rank.THREE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist2.add(card3);
        cardlist2.add(card4);
        int actual = game.compareHighCard(cardlist1, cardlist2);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void testCompareHighCard1() {
        Card card1 = new Card(Rank.FIVE);
        Card card2 = new Card(Rank.FOUR);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.EIGHT);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist2.add(card3);
        cardlist2.add(card4);
        int actual = game.compareHighCard(cardlist1, cardlist2);
        int expected = 2;
        assertEquals(actual, expected);
    }
    
    @Test
    void testPair() {
    	Card card1 = new Card(Rank.FIVE);
        Card card2 = new Card(Rank.FOUR);
        List<Card> cardlist1 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        boolean actual = game.havePair(cardlist1);
        boolean expected = false;
        assertEquals(actual, expected);
        
    }
    
    @Test
    void testHavePair() {
    	Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.EIGHT);
        List<Card> cardlist1 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        boolean actual = game.havePair(cardlist1);
        boolean expected = true;
        assertEquals(actual, expected);
        
    }
    
    @Test
    void testMax() {
    	Card card1 = new Card(Rank.JACK);
        Card card2 = new Card(Rank.EIGHT);
        List<Card> cardlist1 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        Card actual = game.max(cardlist1);
        Card expected = card1;
        assertEquals(actual, expected);
    }
    
    @Test
    void testMax1() {
    	Card card1 = new Card(Rank.SEVEN);
        Card card2 = new Card(Rank.ACE);
        List<Card> cardlist1 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        Card actual = game.max(cardlist1);
        Card expected = card2;
        assertEquals(actual, expected);
    }

    @Test
    void testPair1() {
        Card card1 = new Card(Rank.SEVEN);
        Card card2 = new Card(Rank.SEVEN);
        List<Card> cardlist1 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        Card actual = game.pair(cardlist1);
        Card expected = card2;
        assertEquals(actual, expected);
    }

    @Test
    void testComparePair() {
    	Card card1 = new Card(Rank.FIVE);
        Card card2 = new Card(Rank.FOUR);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.EIGHT);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist2.add(card3);
        cardlist2.add(card4);
        int actual = game.comparePair(cardlist1, cardlist2);
        int expected = 2;
        assertEquals(actual, expected);
    }
    
    @Test
    void testComparePair1() {
    	Card card1 = new Card(Rank.FIVE);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.EIGHT);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist2.add(card3);
        cardlist2.add(card4);
        int actual = game.comparePair(cardlist1, cardlist2);
        int expected = 1;
        assertEquals(actual, expected);
    }
    
    @Test
    void testComparePair2() {
    	Card card1 = new Card(Rank.FIVE);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.TWO);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist2.add(card3);
        cardlist2.add(card4);
        int actual = game.comparePair(cardlist1, cardlist2);
        int expected = 1;
        assertEquals(actual, expected);
    }
    
    @Test
    void testHaveBrelan() {
    	Card card1 = new Card(Rank.FOUR);
    	Card card2 = new Card(Rank.FOUR);
    	Card card3 = new Card(Rank.FOUR);
    	List<Card> cardlist1 = new ArrayList<Card>();
    	cardlist1.add(card1);
    	cardlist1.add(card2);
    	cardlist1.add(card3);
    	boolean actual = game.haveBrelan(cardlist1);
    	boolean expected = true;
    	assertEquals(actual, expected);
    }

}


