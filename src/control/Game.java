package control;

import model.Card;
import model.Player;
import model.Rank;

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
public class Game {
	Player player1;
	Player player2;
	Scanner in = new Scanner(System.in);
	List<Card> listePair = new ArrayList<Card>();

	public Game() {
		player1 = new Player("player1");
		player2 = new Player("player2");
	}

	public void show() {
		System.out.println("Name: " + player1.getName());
		player1.showAllCard();
		System.out.println(" ");
		System.out.println("Name: " + player2.getName());
		player2.showAllCard();
		System.out.println(" ");
	}

	public void playerOneAddCard() {
		int sc = in.nextInt();
		if(sc == 1) {
			sc += 13;
		}
		player1.addCard(new Card(Rank.getRank(sc)));
		// System.out.println(Rank.getRank(sc));
	}

	public void playerTwoAddCard() {
		int sc1 = in.nextInt();
		if(sc1 == 1) {
			sc1 += 13;
		}
		player2.addCard(new Card(Rank.getRank(sc1)));
		// System.out.println(Rank.getRank(sc1));
	}

	/*
	 * pour obtenir la carte la plus grande dans une main
	 */
	public Card max(List<Card> handCard1) {
		Card cardMax = handCard1.get(0);
		for (int i = 0; i < handCard1.size(); i++) {
			if (cardMax.getValue() <= handCard1.get(i).getValue()) {
				cardMax = handCard1.get(i);
			}
		}
		return cardMax;
	}

	/*
	 * pour comparer l'égalité des cartes dans les deux mains 
	 */

	public boolean equals(List<Card> handCard1, List<Card> handCard2) {
		return handCard1.containsAll(handCard2) && handCard2.containsAll(handCard1);

	}

	// 0 = equal ; 1 = p1 win ; 2 = p2 win
	public int compareHighCard(List<Card> handCard1, List<Card> handCard2) {
		if (max(handCard1).getValue() > max(handCard2).getValue()) {
			System.out.println("player1 gagne avec la plus haute carte " + max(handCard1).getValue());
			return 1;
		} else if (max(handCard1).getValue() < max(handCard2).getValue()) {
			System.out.println("player2 gagne avec la plus haute carte " + max(handCard2).getValue());
			return 2;
		} else {
			System.out.println("Egalité");
			return 0;
		}
	}

	// 0 = equal ; 1 = p1 win ; 2 = p2 win
	public int comparePair(List<Card> handCard1, List<Card> handCard2) {
		if (havePair(handCard1) > 0 && havePair(handCard2) == 0) {
			System.out.println("player 1 gagne avec une pair de "+ havePair(handCard1));
			return 1;
		} else if (havePair(handCard2) > 0 && havePair(handCard1) == 0) {
			System.out.println("player 2 gagne avec une pair de "+ havePair(handCard2));
			return 2;
		} else if (havePair(handCard2) > 0 && havePair(handCard1) > 0) {
			if (havePair(handCard1) > havePair(handCard2)) {
				System.out.println("player 1 gagne avec un pair de "+ havePair(handCard1));
				return 1;
			} else if (havePair(handCard1) < havePair(handCard2)) {
				System.out.println("player 2 gagne avec un pair de "+ havePair(handCard2));
				return 2;
			} else {
				return compareHighCard(handCard1, handCard2);
			}
		} else {
			return compareHighCard(handCard1, handCard2);
		}
	}

	/*
	 * pour tester est ce qu'il y a une pair
	 */
	public int havePair(List<Card> handCard1) {
		for (int i = 0; i < handCard1.size(); i++) {
			for (int j = i + 1; j < handCard1.size(); j++) {
				if (handCard1.get(i).getValue() == handCard1.get(j).getValue()) {
					listePair(handCard1.get(i));
					return handCard1.get(i).getValue();
				}
			}
		}
		return 0;
	}

	/*
	 * Pour tester la présence d'un brelan
	 */

	public int haveBrelan(List<Card> handCard1) {
		for (int i = 0; i < handCard1.size(); i++) {
			for (int j = i + 1; j < handCard1.size(); j++) {
				if (handCard1.get(i).getValue() == handCard1.get(j).getValue()) {
					for (int k = j + 1; k < handCard1.size(); k++) {
						if (handCard1.get(k).getValue() == handCard1.get(j).getValue()) {
							return handCard1.get(i).getValue();
						}
					}

				}
			}
		}
		return 0;
	}

	public int compareBrelan(List<Card> handCard1, List<Card> handCard2) {
		if (haveBrelan(handCard1) != 0 && haveBrelan(handCard2) == 0) {
			System.out.println("player1 gagne avec un brelan de "+ haveBrelan(handCard1));
			return 1;
		} else if (haveBrelan(handCard2) != 0 && haveBrelan(handCard1) == 0) {
			System.out.println("player2 gagne avec un brelan de "+ haveBrelan(handCard2));
			return 2;
		} else {
			return comparePair(handCard1, handCard2);

		}
	}

	public void compare() {
		List<Card> handCard1 = player1.getHandcard();
		List<Card> handCard2 = player2.getHandcard();
		compareBrelan(handCard1, handCard2);
		if(equals(handCard1, handCard2)==true) {
			System.out.println("Egalité");
		}
	}

  	 public List<Card> listePair(Card carte){
  		 listePair.add(carte);
  		 return listePair;
    }

    public boolean haveDoublePair(List<Card> handCard1) {
		if (listePair.size()==2) {
			System.out.println(listePair.size());
			return true;
		}
		return false;
	}

}
