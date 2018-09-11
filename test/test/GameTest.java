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
 * @Author: WANG Hanting
 * @Version: 1.0
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
        Card card2 = new Card(Rank.THREE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist2.add(card2);
        int actual = game.compareHighCard(cardlist1, cardlist2);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    void testCompareHighCard1() {
        Card card1 = new Card(Rank.FIVE);
        Card card2 = new Card(Rank.FIVE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist2.add(card2);
        int actual = game.compareHighCard(cardlist1, cardlist2);
        int expected = 0;
        assertEquals(actual, expected);
    }
}


