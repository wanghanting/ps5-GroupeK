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
    List<Card> handcard;
    Player player1;
    Player player2;
    Scanner in = new Scanner(System.in);


    public Player(String name) {
        this.name = name;
        handcard = new ArrayList<Card>();
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


}
