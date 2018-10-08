package model;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public enum Rank {

	TWO("2", 1), THREE("3", 2), FOUR("4", 4), FIVE("5", 8), SIX("6", 16), 
	SEVEN("7", 32), EIGHT("8", 64), NINE("9",128), TEN("10", 256), 
	JACK("J", 512), QUEEN("Q", 1024), KING("K", 2048), ACE("A", 4096);

    private int value;
    private String name;

    Rank(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int a) {
        this.value = a;
    }

    public static Rank getRank(String value) {
        for (Rank name : Rank.values()) {
            if (name.getName() == value) {
                return name;
            }
        }
        return null;
    }

	int longValue() {
		return this.value;
	}
	
	int shortValue() {
		return this.ordinal()+2;
	}
}
