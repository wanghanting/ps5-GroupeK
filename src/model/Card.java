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
    Color color;
    
    public Card(Rank rank) {
        this.rank = rank;
    }

    public Card(Rank rank, Color color) {
        this.rank = rank;
        this.color = color;
    }

    @Override
    public String toString() {
        return rank.getName()
//                + color.getName()
        ;
    }

    public int getValue() {
        return rank.getValue();
    }

    public String getName() {
        return rank.getName();
    }

    public String getColor(){
        return color.getName();
    }

	public Rank getRank() {
		return this.rank;
	}
}
