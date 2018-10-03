package model;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public enum Rank {

    ACE("14",14), TWO("2",2), THREE("3",3),
    FOUR("4",4), FIVE("5",5), SIX("6",6),
    SEVEN("7",7), EIGHT("8",8), NINE("9",9),
    TEN("10",10), JACK("11",11),
    QUEEN("12",12), KING("13",13);

    private int value;
    private String name;

    Rank(String name,int value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int a){
        this.value = a;
    }

    public static Rank getRank(int value){
        for (Rank name : Rank.values()){
            if (name.getValue() == value){
                return name;
            }
        }
        return null;
    }

    public static Rank getRankS(String name){
        for (Rank rank : Rank.values()){
            if (rank.getName() == name){
                return rank;
            }
        }
        return null;
    }

}
