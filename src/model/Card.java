package model;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Card {
    Rank rank;

    public Card(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card: " + rank;
    }

    public int getValue() {
        return rank.getValue();
    }
}
