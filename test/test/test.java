package test;

import model.Card;

import model.Comparison;
import model.Player;
import model.Rank;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;


/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
class test {
    Comparison comparison = new Comparison();
    Player p1 = new Player("p1");
    Player p2 = new Player("p2");

    @Test
    void testAddCard(){
        int sc1 = 14;
        p1.addCard(new Card(Rank.getRank(sc1)));
        p1.showAllCard();
        int sc2 = 2;
        p2.addCard(new Card(Rank.getRank(sc2)));
        p2.showAllCard();
    }
   @Test
   void testEqualsDeuxCartesMainsIdentiques() {
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
      assertTrue(!comparison.equals(cardlist1, cardlist2));
  }
    	@org.junit.jupiter.api.Test
      void testEqualsTroisCartesMainsDifférentes() {
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
          cardlist2.add(card5);
          cardlist2.add(card6);
          assertTrue(!comparison.equals(cardlist1, cardlist2));
      }
  //
//      @org.junit.jupiter.api.Test
//      void testEquals2() {
//          Card card1 = new Card(Rank.EIGHT);
//          Card card2 = new Card(Rank.FIVE);
//          Card card3 = new Card(Rank.TWO);
//          Card card4 = new Card(Rank.TWO);
//          Card card5 = new Card(Rank.EIGHT);
//          Card card6 = new Card(Rank.FIVE);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card3);
//          cardlist2.add(card4);
//          cardlist2.add(card5);
//          cardlist2.add(card6);
//          assertTrue(!comparison.equals(cardlist1, cardlist2));
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testCompareHighCard() {
//          Card card1 = new Card(Rank.TWO);
//          Card card2 = new Card(Rank.FIVE);
//          Card card3 = new Card(Rank.THREE);
//          Card card4 = new Card(Rank.THREE);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist2.add(card3);
//          cardlist2.add(card4);
//          int actual = comparison.compareHighCard(cardlist1, cardlist2);
//          int expected = 1;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testCompareHighCard1() {
//          Card card1 = new Card(Rank.FIVE);
//          Card card2 = new Card(Rank.FOUR);
//          Card card5 = new Card(Rank.EIGHT);
//          Card card3 = new Card(Rank.NINE);
//          Card card4 = new Card(Rank.EIGHT);
//          Card card6 = new Card(Rank.FIVE);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card5);
//          cardlist2.add(card3);
//          cardlist2.add(card4);
//          cardlist2.add(card6);
//          int actual = comparison.compareHighCard(cardlist1, cardlist2);
//          int expected = 2;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testPair() {
//       Card card1 = new Card(Rank.FIVE);
//          Card card2 = new Card(Rank.FOUR);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          int actual = comparison.havePair(cardlist1);
//          int expected = 0;
//          assertEquals(actual, expected);
  //
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testHavePair() {
//       Card card1 = new Card(Rank.EIGHT);
//          Card card2 = new Card(Rank.EIGHT);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          int actual = comparison.havePair(cardlist1);
//          int expected = Rank.EIGHT.getValue();
//          assertEquals(actual, expected);
  //
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testMax() {
//       Card card1 = new Card(Rank.JACK);
//          Card card2 = new Card(Rank.EIGHT);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          Card actual = comparison.max(cardlist1);
//          Card expected = card1;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testMax1() {
//       Card card1 = new Card(Rank.SEVEN);
//          Card card2 = new Card(Rank.ACE);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          Card actual = comparison.max(cardlist1);
//          Card expected = card2;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testComparePair() {
//       Card card1 = new Card(Rank.FIVE);
//          Card card2 = new Card(Rank.FOUR);
//          Card card3 = new Card(Rank.FOUR);
//          Card card4 = new Card(Rank.TWO);
//          Card card5 = new Card(Rank.EIGHT);
//          Card card6 = new Card(Rank.TWO);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card3);
//          cardlist2.add(card4);
//          cardlist2.add(card5);
//          cardlist2.add(card6);
//          int actual = comparison.comparePair(cardlist1, cardlist2);
//          int expected = 1;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testComparePair1() {
//       Card card1 = new Card(Rank.TWO);
//          Card card2 = new Card(Rank.FOUR);
//          Card card3 = new Card(Rank.TWO);
//          Card card4 = new Card(Rank.EIGHT);
//          Card card5 = new Card(Rank.TWO);
//          Card card6 = new Card(Rank.TWO);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card3);
//          cardlist2.add(card4);
//          cardlist2.add(card5);
//          cardlist2.add(card6);
//          int actual = comparison.comparePair(cardlist1, cardlist2);
//          int expected = 2;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testComparePair2() {
//       Card card1 = new Card(Rank.FIVE);
//          Card card2 = new Card(Rank.FIVE);
//          Card card3 = new Card(Rank.TWO);
//          Card card4 = new Card(Rank.TWO);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist2.add(card3);
//          cardlist2.add(card4);
//          int actual = comparison.comparePair(cardlist1, cardlist2);
//          int expected = 1;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testHaveBrelan() {
//       Card card1 = new Card(Rank.FOUR);
//       Card card2 = new Card(Rank.FOUR);
//       Card card3 = new Card(Rank.FOUR);
//       List<Card> cardlist1 = new ArrayList<Card>();
//       cardlist1.add(card1);
//       cardlist1.add(card2);
//       cardlist1.add(card3);
//       int actual = comparison.haveBrelan(cardlist1);
//       int expected = card1.getValue();
//       assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testHaveBrelan1() {
//       Card card1 = new Card(Rank.FOUR);
//       Card card2 = new Card(Rank.THREE);
//       Card card3 = new Card(Rank.FOUR);
//       List<Card> cardlist1 = new ArrayList<Card>();
//       cardlist1.add(card1);
//       cardlist1.add(card2);
//       cardlist1.add(card3);
//       int actual = comparison.haveBrelan(cardlist1);
//       int expected = 0;
//       assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testComparebrelan() {
//       Card card1 = new Card(Rank.EIGHT);
//          Card card2 = new Card(Rank.EIGHT);
//          Card card3 = new Card(Rank.EIGHT);
//          Card card4 = new Card(Rank.TWO);
//          Card card5 = new Card(Rank.TWO);
//          Card card6 = new Card(Rank.TWO);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card3);
//          cardlist1.add(card4);
//          cardlist2.add(card5);
//          cardlist2.add(card6);
//          int actual = comparison.compareBrelan(cardlist1, cardlist2);
//          int expected = 1;
//          assertEquals(actual, expected);
//      }
  //
  //
//      @org.junit.jupiter.api.Test
//      void testComparebrelan1() {
//       Card card1 = new Card(Rank.EIGHT);
//          Card card2 = new Card(Rank.NINE);
//          Card card3 = new Card(Rank.EIGHT);
//          Card card4 = new Card(Rank.FOUR);
//          Card card5 = new Card(Rank.FOUR);
//          Card card6 = new Card(Rank.FOUR);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card3);
//          cardlist2.add(card4);
//          cardlist2.add(card5);
//          cardlist2.add(card6);
//          int actual = comparison.compareBrelan(cardlist1, cardlist2);
//          int expected = 2;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testComparebrelan2() {
//       Card card1 = new Card(Rank.FOUR);
//          Card card2 = new Card(Rank.NINE);
//          Card card3 = new Card(Rank.FOUR);
//          Card card4 = new Card(Rank.FOUR);
//          Card card5 = new Card(Rank.TWO);
//          Card card6 = new Card(Rank.FOUR);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          List<Card> cardlist2 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card3);
//          cardlist2.add(card4);
//          cardlist2.add(card5);
//          cardlist2.add(card6);
//          int actual = comparison.compareBrelan(cardlist1, cardlist2);
//          int expected = 1;
//          assertEquals(actual, expected);
//      }
  //
//      @org.junit.jupiter.api.Test
//      void testHaveDoublePair() {
//       Card card1 = new Card(Rank.FOUR);
//          Card card2 = new Card(Rank.NINE);
//          Card card3 = new Card(Rank.FOUR);
//          Card card4 = new Card(Rank.NINE);
//          List<Card> cardlist1 = new ArrayList<Card>();
//          cardlist1.add(card1);
//          cardlist1.add(card2);
//          cardlist1.add(card3);
//          cardlist1.add(card4);
//          assertTrue(comparison.haveDoublePair(cardlist1));
//      }
  //}



    
}
