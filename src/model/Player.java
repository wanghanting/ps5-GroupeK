package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import poker.Card;

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
	public List<Integer> compteur = new ArrayList<Integer>();
	public List<Integer> compteur1 = new ArrayList<Integer>();
	String myRank[]= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

	int point = 0;
	String result = null;
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
	}

	public void addCard(Card card) {
		handcard.add(card);
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
		System.out.println("Name: " + getName());
		showAllCard();
	}

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
			value.add(handcard1.get(i).getRank().shortValue());
		}
		SortDecreasing(value);
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

	public int point_leplushaute(List<Card> handlist) {
		for (Card find :handlist)
			point += find.getRank().longValue();
		return point;
	}
	
	public int point_pair(List<Card> handlist) {
		if (havePair(handlist)) {
			int svalue = (int) (Math.log(compteur.get(0)) / Math.log(2)) + 2;
			point = PAIREPOINT + svalue * SBASEVALUE;
			if (point == 0)
				return point;
			for (Card find : handlist)
				if (find.getRank().longValue() != compteur.get(0))
					point += find.getRank().longValue();
				else
					result = "paire de " + find.getRank();
		}
		return point;
	}

	public int point_doublepaire(List<Card> handlist) {
		if (haveDoublePair(handlist)) {
			point = PAIRE2POINT + (compteur.get(0) + compteur.get(1)) * LBASEVALUE;
			if (point == 0)
				return point;
			for (Card find : handlist)
				if (find.getRank().longValue() != compteur.get(0) && find.getRank().longValue() != compteur.get(1))
					point += find.getRank().shortValue();
				else
					result = "deux Paire : " + myRank[(int) (Math.log(compteur.get(0)) / Math.log(2))-2] + " et "
					+ myRank[(int) (Math.log(compteur.get(1)) / Math.log(2))-2];
		}
		return point;
	}

	public int point_brelan(List<Card> handlist) {
		if (haveBrelan(handlist)) {
			int svalue = (int) (Math.log(compteur.get(0)) / Math.log(2)) + 2;
			point = BRELANPOINT + svalue * SBASEVALUE;
			if (point == 0)
				return point;
			for (Card find : handlist)
				if (find.getRank().longValue() != compteur.get(0))
					point += find.getRank().longValue();
				else
					result = "brelan de " + find.getRank();
		}
		return point;
	}

	public int point_carre(List<Card> handlist) {
		if (haveCarre(handlist)) {
			int svalue = (int) (Math.log(compteur.get(0)) / Math.log(2)) + 2;
			point = CARREPOINT + svalue * SBASEVALUE;
			if (point == 0)
				return point;
			for (Card find : handlist)
				if (find.getRank().shortValue() != svalue)
					point += find.getRank().longValue();
				else
					result = "carre de " + find.getRank().shortValue();
		}
		return point;
	}

	public int point_full(List<Card> handlist) {
		if (haveFull(handlist)) {
			for (int i = 0; i < compteur.size(); i++) {
				for (int j = i + 1; j < compteur.size(); j++) {
					if (compteur.get(i).shortValue() == compteur.get(j).shortValue()) {
						compteur1.add((int) compteur.get(i).shortValue());
						
					}
					int svalue = (int) (Math.log(compteur.get(0)) / Math.log(2)) + 2;
					point = svalue * SBASEVALUE;
					
				}
			}
			for (int find: compteur)
				if (find != compteur1.get(0).shortValue()) {
					find = (int) (Math.log(find) / Math.log(2)) + 2;
					point += find;
				}
				else	
					result = "full : " + myRank[(int) (Math.log(compteur.get(0)) / Math.log(2)) + 2] + " sur " + myRank[(int) (Math.log(find) / Math.log(2)) + 2];
			point += FULLPOINT;
		}
		return point;
	}

	public int point_samecolor(List<Card> handlist) {
		if (haveSameColor(handlist)) {
			for(int i = 0; i<handlist.size();i++) {
			point += handlist.get(i).getRank().longValue();
			}
			result = "Couleur";
			point +=COULEURPOINT;
		}
		return point;
	}

	public int point_suite(List<Card> handlist) {
		if (haveSuit(handlist)) {
			point = SUITEPOINT + max(handlist).getRank().shortValue();
		}
		result = "suit de " + max(handlist).getRank().shortValue();
		return point;
	}

	public int point_quinteFlush(List<Card> handlist) {
		if (point_samecolor(handlist) * point_suite(handlist) != 0) {
			point = QFPOINT + point_suite(handlist);
		}
		result = "Quinte Flush de " + max(handlist).getRank().shortValue();
		return point;
	}

	
	public int pointPlayer(List<Card> handCard) {
		if (haveQuinteFlush(handCard)) {
			point = point_quinteFlush(handCard);
		}
		else if (haveCarre(handCard)) {
			point = point_carre(handCard);
		}
		else if (haveFull(handCard)) {
			point = point_full(handCard);
		}
		else if (haveSameColor(handCard)) {
			point = point_samecolor(handCard);
		}
		else if (haveSuit(handCard)) {
			point = point_suite(handCard);
		}
		else if (haveBrelan(handCard)) {
			point = point_brelan(handCard);
		}
		else if (haveDoublePair(handCard)) {
			point = point_doublepaire(handCard);
		}
		else if (havePair(handCard)) {
			point = point_pair(handCard);
		}
		else {
			
		}
		return point;
	}
}
