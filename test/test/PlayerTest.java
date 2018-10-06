package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Card;
import model.Color;
import model.Player;
import model.Rank;

class PlayerTest {
	Player p1 = new Player("p1");
	Player p2 = new Player("p2");
	
	 @Test
	    void testHaveCarre() {
	    	 Card card1 = new Card(Rank.TWO);
	         Card card2 = new Card(Rank.TWO);
	         Card card3 = new Card(Rank.TWO);
	         Card card4 = new Card(Rank.TWO);
	         Card card5 = new Card(Rank.THREE);
	         List<Card> cardlist1 = new ArrayList<Card>();
	         cardlist1.add(card1);
	         cardlist1.add(card2);
	         cardlist1.add(card3);
	         cardlist1.add(card4);
	         cardlist1.add(card5);
	         assertTrue(p1.haveCarre(cardlist1));
	    	
	    }
	    
	    @Test
	    void testNotHaveCarre() {
	    	 Card card1 = new Card(Rank.ACE);
	         Card card2 = new Card(Rank.TWO);
	         Card card3 = new Card(Rank.TWO);
	         Card card4 = new Card(Rank.TWO);
	         Card card5 = new Card(Rank.THREE);
	         List<Card> cardlist1 = new ArrayList<Card>();
	         cardlist1.add(card1);
	         cardlist1.add(card2);
	         cardlist1.add(card3);
	         cardlist1.add(card4);
	         cardlist1.add(card5);
	         assertTrue(!p1.haveCarre(cardlist1));
	    	
	    }
	    
	    @Test
	    void testHaveBrelan() {
	    	 Card card1 = new Card(Rank.THREE);
	         Card card2 = new Card(Rank.TWO);
	         Card card3 = new Card(Rank.TWO);
	         Card card4 = new Card(Rank.TWO);
	         Card card5 = new Card(Rank.ACE);
	         List<Card> cardlist1 = new ArrayList<Card>();
	         cardlist1.add(card1);
	         cardlist1.add(card2);
	         cardlist1.add(card3);
	         cardlist1.add(card4);
	         cardlist1.add(card5);
	         assertTrue(p1.haveBrelan(cardlist1));
	    	
	    }
	    
	    @Test
	    void testNotHaveBrelan() {
	    	 Card card1 = new Card(Rank.THREE);
	         Card card2 = new Card(Rank.FOUR);
	         Card card3 = new Card(Rank.TWO);
	         Card card4 = new Card(Rank.TWO);
	         Card card5 = new Card(Rank.ACE);
	         List<Card> cardlist1 = new ArrayList<Card>();
	         cardlist1.add(card1);
	         cardlist1.add(card2);
	         cardlist1.add(card3);
	         cardlist1.add(card4);
	         cardlist1.add(card5);
	         assertTrue(!p1.haveBrelan(cardlist1));
	    	
	    }
	  
	    @Test
	    void testNotHavePaire() {
	        Card card1 = new Card(Rank.EIGHT);
	        Card card2 = new Card(Rank.NINE);
	        Card card3 = new Card(Rank.TWO);
	        Card card4 = new Card(Rank.THREE);
	        Card card5 = new Card(Rank.ACE);
	        List<Card> cardlist1 = new ArrayList<>();
	        cardlist1.add(card1);
	        cardlist1.add(card2);
	        cardlist1.add(card3);
	        cardlist1.add(card4);
	        cardlist1.add(card5);
	        boolean actual = p1.havePair(cardlist1);
	        boolean expected = false;
	        assertEquals(actual, expected);
	    }
	    
	    @Test
	    void testHavePaire() {
	        Card card1 = new Card(Rank.EIGHT);
	        Card card2 = new Card(Rank.TWO);
	        Card card3 = new Card(Rank.TWO);
	        Card card4 = new Card(Rank.THREE);
	        Card card5 = new Card(Rank.ACE);
	        List<Card> cardlist1 = new ArrayList<>();
	        cardlist1.add(card1);
	        cardlist1.add(card2);
	        cardlist1.add(card3);
	        cardlist1.add(card4);
	        cardlist1.add(card5);
	        boolean actual = p1.havePair(cardlist1);
	        boolean expected = true;
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
	    void testNotHaveSameColor(){
	        Card card1 = new Card(Rank.EIGHT, Color.Pique);
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
	        assertTrue(!p1.haveSameColor(Co));
	    }

	    @Test
	    void testHaveSuite() {
	        Card card1 = new Card(Rank.SIX);
	        Card card2 = new Card(Rank.FIVE);
	        Card card3 = new Card(Rank.TWO);
	        Card card4 = new Card(Rank.THREE);
	        Card card5 = new Card(Rank.FOUR);
	        List<Card> cardlist1 = new ArrayList<>();
	        cardlist1.add(card1);
	        cardlist1.add(card2);
	        cardlist1.add(card3);
	        cardlist1.add(card4);
	        cardlist1.add(card5);
	        assertTrue(p1.haveSuit(cardlist1));
	    }
	        
	      @Test
	      void testHaveDoublePair() {
	          Card card1 = new Card(Rank.FOUR);
	          Card card2 = new Card(Rank.NINE);
	          Card card3 = new Card(Rank.FOUR);
	          Card card4 = new Card(Rank.NINE);
	          Card card5 = new Card(Rank.ACE);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertTrue(p1.haveDoublePair(cardlist1));
	    }

	    @Test
	      void testHaveDoublePairButFull() {
	          Card card1 = new Card(Rank.FOUR);
	          Card card2 = new Card(Rank.NINE);
	          Card card3 = new Card(Rank.FOUR);
	          Card card4 = new Card(Rank.NINE);
	          Card card5 = new Card(Rank.FOUR);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertTrue(!p1.haveDoublePair(cardlist1));
	    }

	    @Test
	      void testNotHaveDoublePairButOnePair() {
	          Card card1 = new Card(Rank.FOUR);
	          Card card2 = new Card(Rank.NINE);
	          Card card3 = new Card(Rank.FOUR);
	          Card card4 = new Card(Rank.QUEEN);
	          Card card5 = new Card(Rank.KING);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertFalse(p1.haveDoublePair(cardlist1));
	      }

	      @Test
	      void testHaveFull() {
	          Card card1 = new Card(Rank.FOUR);
	          Card card2 = new Card(Rank.NINE);
	          Card card3 = new Card(Rank.FOUR);
	          Card card4 = new Card(Rank.NINE);
	          Card card5 = new Card(Rank.FOUR);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertTrue(p1.haveFull(cardlist1));
	      }

	      @Test
	      void testNotHaveFullButBrelan() {
	          Card card1 = new Card(Rank.FOUR);
	          Card card2 = new Card(Rank.NINE);
	          Card card3 = new Card(Rank.FOUR);
	          Card card4 = new Card(Rank.THREE);
	          Card card5 = new Card(Rank.FOUR);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertFalse(p1.haveFull(cardlist1));
	      }

	      @Test
	      void testNotHaveFullButAllSameCard() {
	          Card card1 = new Card(Rank.FOUR);
	          Card card2 = new Card(Rank.FOUR);
	          Card card3 = new Card(Rank.FOUR);
	          Card card4 = new Card(Rank.FOUR);
	          Card card5 = new Card(Rank.FOUR);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertFalse(p1.haveFull(cardlist1));

	      }

	      @Test
	      void testHaveQuinteFlush() {
	          Card card1 = new Card(Rank.EIGHT, Color.Coeur);
	          Card card2 = new Card(Rank.SEVEN, Color.Coeur);
	          Card card3 = new Card(Rank.SIX, Color.Coeur);
	          Card card4 = new Card(Rank.FIVE, Color.Coeur);
	          Card card5 = new Card(Rank.FOUR, Color.Coeur);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
		assertTrue(p1.haveQuinteFlush(cardlist1));
	      }

	      @Test
	      void testNotHaveQuinteFlushButSuite() {
	          Card card1 = new Card(Rank.EIGHT, Color.Pique);
	          Card card2 = new Card(Rank.SEVEN, Color.Coeur);
	          Card card3 = new Card(Rank.SIX, Color.Coeur);
	          Card card4 = new Card(Rank.FIVE, Color.Coeur);
	          Card card5 = new Card(Rank.FOUR, Color.Coeur);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertFalse(p1.haveQuinteFlush(cardlist1));
	      }

	      @Test
	      void testNotHaveQuinteFlushButSameColor() {
	          Card card1 = new Card(Rank.TEN, Color.Coeur);
	          Card card2 = new Card(Rank.SEVEN, Color.Coeur);
	          Card card3 = new Card(Rank.SIX, Color.Coeur);
	          Card card4 = new Card(Rank.FIVE, Color.Coeur);
	          Card card5 = new Card(Rank.FOUR, Color.Coeur);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertFalse(p1.haveQuinteFlush(cardlist1));
	      }

	      @Test
	      void testNotHaveQuinteFlush() {
	          Card card1 = new Card(Rank.TEN, Color.Pique);
	          Card card2 = new Card(Rank.SEVEN, Color.Coeur);
	          Card card3 = new Card(Rank.SIX, Color.Coeur);
	          Card card4 = new Card(Rank.FIVE, Color.Coeur);
	          Card card5 = new Card(Rank.FOUR, Color.Coeur);
	          List<Card> cardlist1 = new ArrayList<Card>();
	          cardlist1.add(card1);
	          cardlist1.add(card2);
	          cardlist1.add(card3);
	          cardlist1.add(card4);
	          cardlist1.add(card5);
	          assertFalse(p1.haveQuinteFlush(cardlist1));
	      }


	@Test
	void testPoint_pair() {
		Card card1 = new Card(Rank.TEN, Color.Pique);
		Card card2 = new Card(Rank.TEN, Color.Coeur);
		Card card3 = new Card(Rank.SIX, Color.Coeur);
		Card card4 = new Card(Rank.FIVE, Color.Coeur);
		Card card5 = new Card(Rank.FOUR, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 1100028;
		int actuel = p1.point_pair(cardlist1);
		assertEquals(expected, actuel);
	}

	@Test
	void testPoint_pair2() {
		Card card1 = new Card(Rank.TEN, Color.Pique);
		Card card2 = new Card(Rank.TEN, Color.Coeur);
		Card card3 = new Card(Rank.EIGHT, Color.Coeur);
		Card card4 = new Card(Rank.TWO, Color.Coeur);
		Card card5 = new Card(Rank.THREE, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 1100067;
		int actuel = p1.point_pair(cardlist1);
		assertEquals(expected, actuel);
	}
	
	@Test
	void testPoint_brelan() {
		Card card1 = new Card(Rank.THREE, Color.Pique);
		Card card2 = new Card(Rank.THREE, Color.Coeur);
		Card card3 = new Card(Rank.EIGHT, Color.Coeur);
		Card card4 = new Card(Rank.TWO, Color.Coeur);
		Card card5 = new Card(Rank.THREE, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 3030065;
		int actuel = p1.point_brelan(cardlist1);
		assertEquals(expected, actuel);
	}
	
	@Test
	void testPoint_autrebrelan() {
		Card card1 = new Card(Rank.ACE, Color.Pique);
		Card card2 = new Card(Rank.ACE, Color.Coeur);
		Card card3 = new Card(Rank.ACE, Color.Coeur);
		Card card4 = new Card(Rank.FOUR, Color.Coeur);
		Card card5 = new Card(Rank.QUEEN, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 3141028;
		int actuel = p1.point_brelan(cardlist1);
		assertEquals(expected, actuel);
	}
	
	@Test
	void testPoint_encorebrelan() {
		Card card1 = new Card(Rank.NINE, Color.Pique);
		Card card2 = new Card(Rank.NINE, Color.Coeur);
		Card card3 = new Card(Rank.NINE, Color.Coeur);
		Card card4 = new Card(Rank.ACE, Color.Coeur);
		Card card5 = new Card(Rank.KING, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 3096144;
		int actuel = p1.point_brelan(cardlist1);
		assertEquals(expected, actuel);
	}
	

}
