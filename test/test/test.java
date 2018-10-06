package test;

import model.*;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
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

    @Test
    void testEqualsTroisCartesMainsIdentiques() {
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
        assertTrue(!comparison.equals(cardlist1, cardlist2));
    }

    @Test
    void testEqualsQuatreCartesMainsIdentiques() {
        Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.ACE);
        Card card5 = new Card(Rank.TWO);
        Card card6 = new Card(Rank.EIGHT);
        Card card7 = new Card(Rank.FIVE);
        Card card8 = new Card(Rank.ACE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist1.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        cardlist2.add(card7);
        cardlist1.add(card8);
        assertTrue(!comparison.equals(cardlist1, cardlist2));
    }

    @Test
    void testEqualsQuatreCartesMainsDifférentes() {
        Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.JACK);
        Card card5 = new Card(Rank.QUEEN);
        Card card6 = new Card(Rank.TWO);
        Card card7 = new Card(Rank.THREE);
        Card card8 = new Card(Rank.ACE);
        List<Card> cardlist1 = new ArrayList<Card>();
        List<Card> cardlist2 = new ArrayList<Card>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist1.add(card4);
        cardlist2.add(card5);
        cardlist2.add(card6);
        cardlist2.add(card7);
        cardlist1.add(card8);
        assertTrue(!comparison.equals(cardlist1, cardlist2));
    }
    @Test
    void testCompare() {
    	Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.EIGHT);
        Card card3 = new Card(Rank.EIGHT);
        Card card4 = new Card(Rank.TWO);
        Card card5 = new Card(Rank.TWO);
        Card card6 = new Card(Rank.TWO);
        Card card7 = new Card(Rank.TWO);
        Card card8 = new Card(Rank.THREE);
        List<Card> handCard1 = new ArrayList<Card>();
        List<Card> handCard2 = new ArrayList<Card>();
        handCard1.add(card1);
        handCard1.add(card2);
        handCard1.add(card3);
        handCard1.add(card4);
        handCard2.add(card5);
        handCard2.add(card6);
        handCard2.add(card7);
        handCard2.add(card8);
        int expected = 1;
        assertEquals(expected,comparison.compare(handCard1, handCard2));
    	
    }
    
    @Test
    void testCompare1() {
    	Card card1 = new Card(Rank.NINE);
        Card card2 = new Card(Rank.TWO);
        Card card3 = new Card(Rank.THREE);
        Card card4 = new Card(Rank.EIGHT);
        Card card5 = new Card(Rank.NINE);
        Card card6 = new Card(Rank.NINE);
        Card card7 = new Card(Rank.TWO);
        Card card8 = new Card(Rank.THREE);
        List<Card> handCard1 = new ArrayList<Card>();
        List<Card> handCard2 = new ArrayList<Card>();
        handCard1.add(card1);
        handCard1.add(card2);
        handCard1.add(card3);
        handCard1.add(card4);
        handCard2.add(card5);
        handCard2.add(card6);
        handCard2.add(card7);
        handCard2.add(card8);
        int expected = 0;
        assertEquals(expected,comparison.compare(handCard1, handCard2));
    	
    }

    @Test
    void testHaveCarre() {
    	 Card card1 = new Card(Rank.TWO);
         Card card2 = new Card(Rank.TWO);
         Card card3 = new Card(Rank.TWO);
         Card card4 = new Card(Rank.TWO);
         List<Card> cardlist1 = new ArrayList<Card>();
         cardlist1.add(card1);
         cardlist1.add(card2);
         cardlist1.add(card3);
         cardlist1.add(card4);
         assertTrue(p1.haveCarre(cardlist1));
    	
    }
    
    @Test
    void testHaveBerlan() {
    	 Card card1 = new Card(Rank.THREE);
         Card card2 = new Card(Rank.TWO);
         Card card3 = new Card(Rank.TWO);
         Card card4 = new Card(Rank.TWO);
         List<Card> cardlist1 = new ArrayList<Card>();
         cardlist1.add(card1);
         cardlist1.add(card2);
         cardlist1.add(card3);
         cardlist1.add(card4);
         assertTrue(p1.haveBrelan(cardlist1));
    	
    }
   /* @Test
    void testCompareHighCardMainUneGagne() {
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
        int actual = comparison.compareHighCard(cardlist1, cardlist2);
        int expected = 1;
        assertEquals(actual, expected);
    }*/

   /* @Test
    void testCompareHighCardMainDeuxGagne() {
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
        int actual = comparison.compareHighCard(cardlist1, cardlist2);
        int expected = 2;
        assertEquals(actual, expected);
    }*/

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
    @Test
    void testHavePair() {
        Card card1 = new Card(Rank.EIGHT);
        Card card2 = new Card(Rank.NINE);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.THREE);
        List<Card> cardlist1 = new ArrayList<>();
        cardlist1.add(card1);
        cardlist1.add(card2);
        cardlist1.add(card3);
        cardlist1.add(card4);
        boolean actual = p1.havePair(cardlist1);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void testHaveSameColor(){
        Card card1 = new Card(Rank.EIGHT, Color.Coeur);
        Card card2 = new Card(Rank.NINE, Color.Coeur);
        Card card3 = new Card(Rank.TWO, Color.Coeur);
        Card card4 = new Card(Rank.THREE, Color.Coeur);
        Card card5= new Card(Rank.KING, Color.Coeur);
        List<Card> Co = new ArrayList<>();
        Co.add(card1);
        Co.add(card2);
        Co.add(card3);
        Co.add(card4);
        Co.add(card5);
        assertTrue(p1.haveSameColor(Co));
    }

    @Test
    void testHaveSuit() {
        Player player = new Player("player");
        Card card1 = new Card(Rank.SIX);
        Card card2 = new Card(Rank.FIVE);
        Card card3 = new Card(Rank.TWO);
        Card card4 = new Card(Rank.THREE);
        Card card5 = new Card(Rank.FOUR);
        player.addCard(card1);
        player.addCard(card2);
        player.addCard(card3);
        player.addCard(card4);
        player.addCard(card5);
//        player.Compteur(player.getHandcard());
//        System.out.println(p1.);
//        player.paixu(player.compteur);
//        assertTrue(player.haveSuit());
//    }
        //
//      @Test
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
}
