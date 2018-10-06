package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Player {
	String name;
	List<Card> handcard = new ArrayList<>();
	Player player1;
	Player player2;
	Scanner in = new Scanner(System.in);
	public List<Integer> compteur = new ArrayList<Integer>();
	int point = 0;
	public static final int PAIREPOINT = 1000000;
	public static final int PAIRE2POINT = 2000000;
	public static final int BRELANPOINT = 3000000;
	public static final int SUITEPOINT = 4000000;
	public static final int COULEURPOINT = 5000000;
	public static final int FULLPOINT = 6000000;
	public static final int CARREPOINT = 7000000;
	public static final int QFPOINT = 4000000;

	public static final int SBASEVALUE = 10000; // base for short value
	public static final int LBASEVALUE = 100; // base for long value

	public Player(String name) {
		this.name = name;
		handcard = new ArrayList<>();
	}

	public void addCard(Card card) {
		this.handcard.add(card);
	}

	public void showAllCard() {
		for (Card card : handcard) {
			System.out.println(card);
		}
	}

	public int getNumberofCard() {
		return handcard.size();
	}

	public String getName() {
		return name;
	}

	public List<Card> getHandcard() {
		return handcard;
	}

	public void show() {
		System.out.println("Name: " + player1.getName());
		player1.showAllCard();
		System.out.println(" ");
		System.out.println("Name: " + player2.getName());
		player2.showAllCard();
		System.out.println(" ");
	}

//    public void playerOneAddCard() {
//        int sc = in.nextInt();
//        if (sc == 1) {
//            sc += 13;
//        }
//        Card c1 = new Card(Rank.getRank(sc));
//        player1.addCard(c1);
//    }
//
//    public void playerTwoAddCard() {
//        int sc1 = in.nextInt();
//        if (sc1 == 1) {
//            sc1 += 13;
//        }
//        Card c2 = new Card(Rank.getRank(sc1));
//        player2.addCard(c2);
//    }

	public Card max(List<Card> handcard) {
		Card cardMax = handcard.get(0);
		for (int i = 0; i < handcard.size(); i++) {
			if (cardMax.getValue() <= handcard.get(i).getValue()) {
				cardMax = handcard.get(i);
			}
		}
		return cardMax;
	}

	public int Compteur(List<Card> handCard1) {
		for (int i = 0; i < handCard1.size(); i++) {
			for (int j = i + 1; j < handCard1.size(); j++) {
				if (handCard1.get(i).getValue() == handCard1.get(j).getValue()) {
					compteur.add(handCard1.get(i).getValue());
				}
			}
		}
		return compteur.size();
	}

	public boolean havePair(List<Card> handCard1) {
		Compteur(handCard1);
		if (compteur.size() == 1) {
			System.out.println(compteur.size());
			return true;
		}
		return false;
	}

	public boolean haveDoublePair(List<Card> handCard1) {
		Compteur(handCard1);
		if (compteur.size() == 2) {
			System.out.println(compteur.size());
			return true;
		}
		return false;
	}

	public boolean haveBrelan(List<Card> handCard1) {
		Compteur(handCard1);
		if (compteur.size() == 3) {
			System.out.println(compteur.size());
			return true;
		}
		return false;
	}

	public boolean haveFull(List<Card> handCard1) {
		Compteur(handCard1);
		if (compteur.size() == 4) {
			System.out.println(compteur.size());
			return true;
		}
		return false;
	}

	public boolean haveCarre(List<Card> handCard1) {
		Compteur(handCard1);
		if (compteur.size() == 6) {
			System.out.println(compteur.size());
			return true;
		}
		return false;

	}

	public List<Integer> SortDecreasing(List<Integer> handCard) {
		Collections.sort(handCard);
		Collections.reverse(handCard);
		return handCard;
	}

	public boolean haveSameColor(List<Card> handcard1) {
		for (int i = 0; i < handcard1.size() - 1; i++) {
			if (handcard1.get(i).getColor() == handcard1.get(i + 1).getColor()) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public boolean haveSuit(List<Card> handcard1) {
		List<Integer> value = new ArrayList<>();
		for (int i = 0; i < handcard1.size(); i++) {
			value.add(handcard1.get(i).getValue());
		}
		Collections.sort(value);
		Collections.reverse(value);
		if (value.get(0) == value.get(1) + 1 && value.get(1) == value.get(2) + 1 && value.get(2) == value.get(3) + 1
				&& value.get(3) == value.get(4) + 1) {
			return true;
		}
		return false;
	}

	public boolean haveQuinteFlush(List<Card> handcard1) {
		if (haveSameColor(handcard1) && haveSuit(handcard1)) {
			return true;
		} else {
			return false;
		}
	}

	public int point(List<Card> handlist) {
		if (havePair(handlist)) {
			int svalue = (int) (Math.log(compteur.get(0))/Math.log(2))+2;
			point = PAIREPOINT + svalue * SBASEVALUE;
			if (point == 0)
				return point;
				for (Card find : handlist)
					if (find.getRank().longValue() != compteur.get(0))
						point += find.getRank().longValue();
		}
		return point;
	}
}