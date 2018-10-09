package model;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public enum Rank {
	//Syntaxe des valeurs des cartes 
	TWO("2", 1), THREE("3", 2), FOUR("4", 4), FIVE("5", 8), SIX("6", 16),
	SEVEN("7", 32), EIGHT("8", 64), NINE("9",128), TEN("10", 256), 
	JACK("V", 512), QUEEN("D", 1024), KING("R", 2048), ACE("A", 4096);

    private int value;
    private String name;

    Rank(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public static Rank getRank(String n) {
        for (Rank rank : Rank.values()) {
            if (rank.getName().equals(n)) {
                return rank;
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
