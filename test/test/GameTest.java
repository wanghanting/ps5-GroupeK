package test;


import control.Game;
import model.Card;
import model.Rank;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void testEquals() {
    	Card card1 = new Card(Rank.TWO);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.FIVE);
        Card card4 = new Card(Rank.TWO);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist2.add(card3);
        cardlist2.add(card4);
        assertTrue(!game.equals(cardlist1, cardlist2));
    }
    
    @Test
    void testEquals1() {
    	Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.FIVE);
        Card card4 = new Card(Rank.TWO);
        Card card5 = new Card(Rank.EIGHT);
        Card card6 = new Card(Rank.THREE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist2.add(card4);
        cardlist2.add(card6);
        cardlist2.add(card5);
        cardlist2.add(card6);
        assertTrue(!game.equals(cardlist1, cardlist2));
    }
    
    @Test
    void testEquals2() {
    	Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.TWO);
        Card card5 = new Card(Rank.EIGHT);
        Card card6 = new Card(Rank.FIVE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist2.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        assertTrue(!game.equals(cardlist1, cardlist2));
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
        Card card5 = new Card(Rank.EIGHT);
        Card card3 = new Card(Rank.NINE);
        Card card4 = new Card(Rank.EIGHT);
        Card card6 = new Card(Rank.FIVE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card5);
        cardlist2.add(card3);
        cardlist2.add(card4);
        cardlist2.add(card6);
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
        int actual = game.havePair(cardlist1);
        int expected = 0;
        assertEquals(actual, expected);
        
    }
    
    @Test
    void testHavePair() {
    	Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.EIGHT);
        List<Card> cardlist1 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        int actual = game.havePair(cardlist1);
        int expected = Rank.EIGHT.getValue();
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
    void testComparePair() {
    	Card card1 = new Card(Rank.FIVE);
        Card card2 = new Card(Rank.FOUR);
        Card card3 = new Card(Rank.FOUR);
        Card card4 = new Card(Rank.TWO);
        Card card5 = new Card(Rank.EIGHT);
        Card card6 = new Card(Rank.TWO);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist2.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        int actual = game.comparePair(cardlist1, cardlist2);
        int expected = 1;
        assertEquals(actual, expected);
    }
    
    @Test
    void testComparePair1() {
    	Card card1 = new Card(Rank.TWO);
        Card card2 = new Card(Rank.FOUR);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.EIGHT);
        Card card5 = new Card(Rank.TWO);
        Card card6 = new Card(Rank.TWO);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist2.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        int actual = game.comparePair(cardlist1, cardlist2);
        int expected = 2;
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
    	int actual = game.haveBrelan(cardlist1);
    	int expected = card1.getValue();
    	assertEquals(actual, expected);
    }
    
    @Test
    void testHaveBrelan1() {
    	Card card1 = new Card(Rank.FOUR);
    	Card card2 = new Card(Rank.THREE);
    	Card card3 = new Card(Rank.FOUR);
    	List<Card> cardlist1 = new ArrayList<Card>();
    	cardlist1.add(card1);
    	cardlist1.add(card2);
    	cardlist1.add(card3);
    	int actual = game.haveBrelan(cardlist1);
    	int expected = 0;
    	assertEquals(actual, expected);
    }
    
    @Test
    void testComparebrelan() {
    	Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.EIGHT);
        Card card3 = new Card(Rank.EIGHT);
        Card card4 = new Card(Rank.TWO);
        Card card5 = new Card(Rank.TWO);
        Card card6 = new Card(Rank.TWO);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist1.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        int actual = game.compareBrelan(cardlist1, cardlist2);
        int expected = 1;
        assertEquals(actual, expected);
    }
    

    @Test
    void testComparebrelan1() {
    	Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.NINE);
        Card card3 = new Card(Rank.EIGHT);
        Card card4 = new Card(Rank.FOUR);
        Card card5 = new Card(Rank.FOUR);
        Card card6 = new Card(Rank.FOUR);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist2.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        int actual = game.compareBrelan(cardlist1, cardlist2);
        int expected = 2;
        assertEquals(actual, expected);
    }
    
    @Test
    void testComparebrelan2() {
    	Card card1 = new Card(Rank.FOUR);
        Card card2 = new Card(Rank.NINE);
        Card card3 = new Card(Rank.FOUR);
        Card card4 = new Card(Rank.FOUR);
        Card card5 = new Card(Rank.TWO);
        Card card6 = new Card(Rank.FOUR);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist2.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        int actual = game.compareBrelan(cardlist1, cardlist2);
        int expected = 1;
        assertEquals(actual, expected);
    }
    
    @Test
    void testHaveDoublePair() {
    	Card card1 = new Card(Rank.FOUR);
        Card card2 = new Card(Rank.NINE);
        Card card3 = new Card(Rank.FOUR);
        Card card4 = new Card(Rank.NINE);
        List<Card> cardlist1 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist1.add(card4);
        assertTrue(game.haveDoublePair(cardlist1));
    }
}


