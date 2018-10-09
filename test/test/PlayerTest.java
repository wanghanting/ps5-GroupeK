package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import model.*;
import org.junit.jupiter.api.Test;

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
	        List<Card> handcard = new ArrayList<>();
	        handcard.add(card1);
	        handcard.add(card2);
	        handcard.add(card3);
	        handcard.add(card4);
	        handcard.add(card5);
	        assertTrue(p1.haveSuit(handcard));
	    }
	    
	    @Test
	    void testNoHaveSuite() {
	        Card card1 = new Card(Rank.TEN);
	        Card card2 = new Card(Rank.FIVE);
	        Card card3 = new Card(Rank.TWO);
	        Card card4 = new Card(Rank.THREE);
	        Card card5 = new Card(Rank.FOUR);
	        List<Card> handcard = new ArrayList<>();
	        handcard.add(card1);
	        handcard.add(card2);
	        handcard.add(card3);
	        handcard.add(card4);
	        handcard.add(card5);
	        assertFalse(p1.haveSuit(handcard));
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
	  	//OK!
	  	void testPoint_leplushaute() {
	  		Card card1 = new Card(Rank.NINE, Color.Coeur);
	  		Card card2 = new Card(Rank.TEN, Color.Coeur);
	  		Card card3 = new Card(Rank.SIX, Color.Coeur);
	  		Card card4 = new Card(Rank.KING, Color.Coeur);
	  		Card card5 = new Card(Rank.ACE, Color.Coeur);
	  		List<Card> cardlist1 = new ArrayList<Card>();
	  		cardlist1.add(card1);
	  		cardlist1.add(card2);
	  		cardlist1.add(card3);
	  		cardlist1.add(card4);
	  		cardlist1.add(card5);
	  		int expected = 6544;
	  		int actuel = p1.point_leplushaute(cardlist1);
	  		assertEquals(expected, actuel);
	  	}
	      @Test
	      void testpoint_leplushaute() {
	    	Card card1 = new Card(Rank.NINE, Color.Coeur);
	  		Card card2 = new Card(Rank.TEN, Color.Coeur);
	  		Card card3 = new Card(Rank.SIX, Color.Coeur);
	  		Card card4 = new Card(Rank.KING, Color.Coeur);
	  		Card card5 = new Card(Rank.ACE, Color.Pique);
	  		Card card6 = new Card(Rank.TWO, Color.Coeur);
			Card card7 = new Card(Rank.THREE, Color.Coeur);
			Card card8 = new Card(Rank.FOUR, Color.Coeur);
			Card card9 = new Card(Rank.FIVE, Color.Coeur);
			Card card10 = new Card(Rank.ACE, Color.Carreau);
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
	        assertTrue(p1.point(cardlist1)>p2.point(cardlist2));
	      }
			

	

	@Test
	//OK!
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
	//ok！
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
	
	@Test
	//OK!
	void testPoint_doublePair() {
		Card card1 = new Card(Rank.NINE, Color.Pique);
		Card card2 = new Card(Rank.NINE, Color.Coeur);
		Card card3 = new Card(Rank.ACE, Color.Coeur);
		Card card4 = new Card(Rank.ACE, Color.Coeur);
		Card card5 = new Card(Rank.KING, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 2422413;
		int actuel = p1.point_doublepaire(cardlist1);
		assertEquals(expected, actuel);
	}
	

	@Test
	//OK!
	void testPoint_carre() {
		Card card1 = new Card(Rank.NINE, Color.Pique);
		Card card2 = new Card(Rank.NINE, Color.Coeur);
		Card card3 = new Card(Rank.NINE, Color.Coeur);
		Card card4 = new Card(Rank.NINE, Color.Coeur);
		Card card5 = new Card(Rank.KING, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 7092048;
		int actuel = p1.point_carre(cardlist1);
		assertEquals(expected, actuel);
	}

	@Test
	//OK!
	void testPoint_samecolor() {
		Card card1 = new Card(Rank.NINE, Color.Coeur);
		Card card2 = new Card(Rank.NINE, Color.Coeur);
		Card card3 = new Card(Rank.NINE, Color.Coeur);
		Card card4 = new Card(Rank.NINE, Color.Coeur);
		Card card5 = new Card(Rank.KING, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 5002560;
		int actuel = p1.point_samecolor(cardlist1);
		assertEquals(expected, actuel);
	}
	
	@Test
	//OK!
	void testPoint_full() {
		Card card1 = new Card(Rank.NINE, Color.Coeur);
		Card card2 = new Card(Rank.NINE, Color.Coeur);
		Card card3 = new Card(Rank.NINE, Color.Coeur);
		Card card4 = new Card(Rank.KING, Color.Coeur);
		Card card5 = new Card(Rank.KING, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 6090013;
		int actuel = p1.point_full(cardlist1);
		assertEquals(expected, actuel);
	}
	
	@Test
	//OK!
	void testPoint_suit() {
		Card card1 = new Card(Rank.SEVEN, Color.Pique);
		Card card2 = new Card(Rank.EIGHT, Color.Coeur);
		Card card3 = new Card(Rank.SIX, Color.Coeur);
		Card card4 = new Card(Rank.FIVE, Color.Coeur);
		Card card5 = new Card(Rank.FOUR, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 4000008;
		int actuel = p1.point_suite(cardlist1);
		assertEquals(expected, actuel);
	}

	@Test
	//OK!
	void testPoint_quinteFlush() {
		Card card1 = new Card(Rank.SEVEN, Color.Coeur);
		Card card2 = new Card(Rank.EIGHT, Color.Coeur);
		Card card3 = new Card(Rank.SIX, Color.Coeur);
		Card card4 = new Card(Rank.FIVE, Color.Coeur);
		Card card5 = new Card(Rank.FOUR, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 8000008;
		int actuel = p1.point_quinteFlush(cardlist1);
		assertEquals(expected, actuel);
	}
	
	@Test
	//OK!
	void testPoint_autrequinteFlush() {
		Card card1 = new Card(Rank.SEVEN, Color.Coeur);
		Card card2 = new Card(Rank.EIGHT, Color.Coeur);
		Card card3 = new Card(Rank.SIX, Color.Coeur);
		Card card4 = new Card(Rank.FIVE, Color.Coeur);
		Card card5 = new Card(Rank.NINE, Color.Coeur);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 8000009;
		int actuel = p1.point_quinteFlush(cardlist1);
		assertEquals(expected, actuel);
	}
	
	@Test
	//OK!
	void testPoint_leplushaute1() {
		Card card1 = new Card(Rank.TWO, Color.Coeur);
		Card card2 = new Card(Rank.THREE, Color.Coeur);
		Card card3 = new Card(Rank.FOUR, Color.Coeur);
		Card card4 = new Card(Rank.FIVE, Color.Coeur);
		Card card5 = new Card(Rank.ACE, Color.Carreau);
		List<Card> cardlist1 = new ArrayList<Card>();
		cardlist1.add(card1);
		cardlist1.add(card2);
		cardlist1.add(card3);
		cardlist1.add(card4);
		cardlist1.add(card5);
		int expected = 4111;
		int actuel = p1.point_leplushaute(cardlist1);
		assertEquals(expected, actuel);
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
	        assertTrue(p1.point(cardlist1)==p2.point(cardlist2));

//	        String actual = p1.compare(cardlist1, cardlist2);
//	        String expected = "Egalit�";
//	        assertEquals(actual, expected);
	  }

//	    void testCompareCinqCartesleplushaute() {
//	        Card card1 = new Card(Rank.EIGHT);
//	        Card card2 = new Card(Rank.FIVE);
//	        Card card3 = new Card(Rank.TWO);
//	        Card card4 = new Card(Rank.KING);
//	        Card card5 = new Card(Rank.THREE);
//	        Card card6 = new Card(Rank.EIGHT);
//	        Card card7 = new Card(Rank.FIVE);
//	        Card card8 = new Card(Rank.ACE);
//	        Card card9 = new Card(Rank.TWO);
//	        Card card10 = new Card(Rank.THREE);
//
//	        List<Card> cardlist1 = new ArrayList<Card>();
//	        List<Card> cardlist2 = new ArrayList<Card>();
//	        cardlist1.add(card1);
//	        cardlist1.add(card2);
//	        cardlist1.add(card3);
//	        cardlist1.add(card4);
//	        cardlist1.add(card5);
//	        cardlist2.add(card6);
//	        cardlist2.add(card7);
//	        cardlist2.add(card8);
//	        cardlist2.add(card9);
//	        cardlist2.add(card10);
//
//	        String actual = p1.compare(cardlist1, cardlist2);
//	        String expected = "Egalit�";
//	        assertEquals(actual, expected);
//	    }
	    
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
	        assertTrue(p1.point_brelan(cardlist1)<p2.point_brelan(cardlist2));


	    }


	
	
}
