package model;


import java.util.List;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Comparison {
	Player player1;
	Player player2;


	public Comparison() {
		player1 = new Player("player1");
		player2 = new Player("player2");
	}

	/*
	 * pour comparer l'�galit� des cartes dans les deux mains
	 */

	public boolean equals(List<Card> handCard1, List<Card> handCard2) {
		return handCard1.containsAll(handCard2) && handCard2.containsAll(handCard1);
	}

	// 0 = equal ; 1 = p1 win ; 2 = p2 win
	public int compareHighCard(List<Card> handCard1, List<Card> handCard2) {
		if (player1.max(handCard1).getValue() > player2.max(handCard2).getValue()) {
			System.out.println("player1 gagne avec la plus haute carte " + player1.max(handCard1).getValue());
			return 1;
		} else if (player1.max(handCard1).getValue() < player2.max(handCard2).getValue()) {
			System.out.println("player2 gagne avec la plus haute carte " + player2.max(handCard2).getValue());
			return 2;
		} else {
			System.out.println("Egalit�");
			return 0;
		}
	}

	// 0 = equal ; 1 = p1 win ; 2 = p2 win
//	public int comparePair(List<Card> handCard1, List<Card> handCard2) {
//		if (player1.havePair(handCard1) > 0 && player2.havePair(handCard2) == 0) {
//			System.out.println("player 1 gagne avec une pair de "+ player1.havePair(handCard1));
//			return 1;
//		} else if (player2.havePair(handCard2) > 0 && player1.havePair(handCard1) == 0) {
//			System.out.println("player 2 gagne avec une pair de "+ player2.havePair(handCard2));
//			return 2;
//		} else if (player2.havePair(handCard2) > 0 && player1.havePair(handCard1) > 0) {
//			if (player1.havePair(handCard1) > player2.havePair(handCard2)) {
//				System.out.println("player 1 gagne avec un pair de "+ player1.havePair(handCard1));
//				return 1;
//			} else if (player1.havePair(handCard1) < player2.havePair(handCard2)) {
//				System.out.println("player 2 gagne avec un pair de "+ player2.havePair(handCard2));
//				return 2;
//			} else {
//				return compareHighCard(handCard1, handCard2);
//			}
//		} else {
//			return compareHighCard(handCard1, handCard2);
//		}
//	}

//	public int compareBrelan(List<Card> handCard1, List<Card> handCard2) {
//		if (player1.haveBrelan(handCard1) != 0 && player2.haveBrelan(handCard2) == 0) {
//			System.out.println("player1 gagne avec un brelan de "+ player1.haveBrelan(handCard1));
//			return 1;
//		} else if (player2.haveBrelan(handCard2) != 0 && player1.haveBrelan(handCard1) == 0) {
//			System.out.println("player2 gagne avec un brelan de "+ player2.haveBrelan(handCard2));
//			return 2;
//		} else {
//			return comparePair(handCard1, handCard2);
//		}
//	}

//	public void compare() {
//		List<Card> handCard1 = player1.getHandcard();
//		List<Card> handCard2 = player2.getHandcard();
//		compareBrelan(handCard1, handCard2);
//		if(equals(handCard1, handCard2)) {
//			System.out.println("Egalit�");
//		}
//	}

}
