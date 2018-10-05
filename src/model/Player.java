package model;

import java.util.ArrayList;
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
    private ArrayList<Card> listePair = new ArrayList<>();

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

//    public void show() {
//        System.out.println("Name: " + player1.getName());
//        player1.showAllCard();
//        System.out.println(" ");
//        System.out.println("Name: " + player2.getName());
//        player2.showAllCard();
//        System.out.println(" ");
//    }

    public void playerOneAddCard() {
        int sc = in.nextInt();
        if(sc == 1) {
            sc += 13;
        }
        Card c1 = new Card(Rank.getRank(sc));
        player1.addCard(c1);
    }

    public void playerTwoAddCard() {
        int sc1 = in.nextInt();
        if(sc1 == 1) {
            sc1 += 13;
        }
        Card c2 = new Card(Rank.getRank(sc1));
        player2.addCard(c2);
    }
    /*
     * pour obtenir la carte la plus grande dans une main
     */
    public Card max(List<Card> handcard) {
        Card cardMax = handcard.get(0);
        for (int i = 0; i < handcard.size(); i++) {
            if (cardMax.getValue() <= handcard.get(i).getValue()) {
                cardMax = handcard.get(i);
            }
        }
        return cardMax;
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
