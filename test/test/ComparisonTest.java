package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Card;
import model.Color;
import model.Comparison;
import model.Rank;

class ComparisonTest extends Comparison {

	Comparison comparison = new Comparison();

	@Test
	void testEqualsDeuxCartesMainsIdentiques() {
		Card card1 = new Card(Rank.TWO);
		Card card2 = new Card(Rank.FIVE);
		Card card3 = new Card(Rank.TWO);
		Card card4 = new Card(Rank.FIVE);
		List<Card> cardlist1 = new ArrayList<Card>();
		List<Card> cardlist2 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist2.add(card3);
		cardlist2.add(card4);
		assertTrue(comparison.equals(cardlist1, cardlist2));
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
	        assertTrue(comparison.equals(cardlist1, cardlist2));
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
	        cardlist2.add(card8);
	        assertTrue(comparison.equals(cardlist1, cardlist2));
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
	        cardlist2.add(card8);
	        assertTrue(!comparison.equals(cardlist1, cardlist2));
	    }
	    
	    @Test
	    void testEqualForCompare() {
	        Card card1 = new Card(Rank.THREE, Color.Trefle);
	        Card card2 = new Card(Rank.FIVE, Color.Pique);
	        Card card3 = new Card(Rank.TWO, Color.Pique);
	        Card card4 = new Card(Rank.FOUR, Color.Pique);
	        Card card5 = new Card(Rank.ACE, Color.Pique);
	        Card card6 = new Card(Rank.TWO, Color.Pique);
	        Card card7 = new Card(Rank.THREE, Color.Pique);
	        Card card8 = new Card(Rank.FOUR, Color.Coeur);
	        Card card9 = new Card(Rank.ACE, Color.Coeur);
	        Card card10 = new Card(Rank.FIVE, Color.Pique);
	        List<Card> cardlist1 = new ArrayList<Card>();
	        List<Card> cardlist2 = new ArrayList<Card>();
	        cardlist1.add(card1);
	        cardlist1.add(card2);
	        cardlist1.add(card3);
	        cardlist1.add(card4);
	        cardlist1.add(card5);
	        cardlist2.add(card6);
	        cardlist2.add(card7);
	        cardlist2.add(card8);
	        cardlist2.add(card9);
	        cardlist2.add(card10);
	        String actual = comparison.compare(cardlist1, cardlist2);
	        String expected = "Egalité";
	        assertEquals(actual, expected);
	    }
	    
	    @Test
	    void testMain1GagneForCompare() {
	        Card card1 = new Card(Rank.THREE, Color.Pique);
	        Card card2 = new Card(Rank.FIVE, Color.Pique);
	        Card card3 = new Card(Rank.TWO, Color.Pique);
	        Card card4 = new Card(Rank.FOUR, Color.Pique);
	        Card card5 = new Card(Rank.ACE, Color.Pique);
	        Card card6 = new Card(Rank.TWO, Color.Pique);
	        Card card7 = new Card(Rank.THREE, Color.Pique);
	        Card card8 = new Card(Rank.FOUR, Color.Coeur);
	        Card card9 = new Card(Rank.ACE, Color.Coeur);
	        Card card10 = new Card(Rank.FIVE, Color.Pique);
	        List<Card> cardlist1 = new ArrayList<Card>();
	        List<Card> cardlist2 = new ArrayList<Card>();
	        cardlist1.add(card1);
	        cardlist1.add(card2);
	        cardlist1.add(card3);
	        cardlist1.add(card4);
	        cardlist1.add(card5);
	        cardlist2.add(card6);
	        cardlist2.add(card7);
	        cardlist2.add(card8);
	        cardlist2.add(card9);
	        cardlist2.add(card10);
	        String actual = comparison.compare(cardlist1, cardlist2);
	        String expected = "La main 1 gagne : Couleur";
	        assertEquals(actual, expected);
	    }
	    
	    @Test
	    void testMain2GagneForCompare() {
	        Card card1 = new Card(Rank.THREE, Color.Coeur);
	        Card card2 = new Card(Rank.TWO, Color.Coeur);
	        Card card3 = new Card(Rank.TWO, Color.Pique);
	        Card card4 = new Card(Rank.TWO, Color.Carreau);
	        Card card5 = new Card(Rank.ACE, Color.Pique);
	        Card card6 = new Card(Rank.FOUR, Color.Pique);
	        Card card7 = new Card(Rank.THREE, Color.Pique);
	        Card card8 = new Card(Rank.FOUR, Color.Coeur);
	        Card card9 = new Card(Rank.FOUR, Color.Carreau);
	        Card card10 = new Card(Rank.FIVE, Color.Pique);
	        List<Card> cardlist1 = new ArrayList<Card>();
	        List<Card> cardlist2 = new ArrayList<Card>();
	        cardlist1.add(card1);
	        cardlist1.add(card2);
	        cardlist1.add(card3);
	        cardlist1.add(card4);
	        cardlist1.add(card5);
	        cardlist2.add(card6);
	        cardlist2.add(card7);
	        cardlist2.add(card8);
	        cardlist2.add(card9);
	        cardlist2.add(card10);
	        String actual = comparison.compare(cardlist1, cardlist2);
	        String expected = "La main 2 gagne : brelan de 4";
	        assertEquals(actual, expected);
	    }
}
