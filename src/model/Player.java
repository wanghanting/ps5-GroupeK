package model;

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

    public Player(String name) {
        this.name = name;
        this.handcard = new ArrayList<>();
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

    public void playerOneAddCard() {
        int sc = in.nextInt();
        if (sc == 1) {
            sc += 13;
        }
        Card c1 = new Card(Rank.getRank(sc));
        player1.addCard(c1);
    }

    public void playerTwoAddCard() {
        int sc1 = in.nextInt();
        if (sc1 == 1) {
            sc1 += 13;
        }
        Card c2 = new Card(Rank.getRank(sc1));
        player2.addCard(c2);
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

    public boolean HaveFive(List<Card> handCard1) {
        Compteur(handCard1);
        if (compteur.size() == 10) {
            System.out.println(compteur.size());
            return true;
        }
        return false;

    }

    public List<Integer> paixu(List<Integer> handCard) {
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

    public boolean haveSuit() {
        if (compteur.get(0) == compteur.get(1) + 1
                && compteur.get(1) == compteur.get(2) + 1
                && compteur.get(2) == compteur.get(3) + 1
                && compteur.get(3) == compteur.get(4) + 1) {
            return true;
        }
        return false;
    }
}
