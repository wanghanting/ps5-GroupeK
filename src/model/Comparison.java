package model;

import java.util.ArrayList;
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
    List<Integer> value1 = new ArrayList<Integer>();
    List<Integer> value2 = new ArrayList<Integer>();

    public Comparison() {
        player1 = new Player("player1");
        player2 = new Player("player2");
    }
    

    public boolean equals(List<Card> handCard1, List<Card> handCard2) { //Fonction qui verifie les egalites
        List<String> name1 = new ArrayList<>();
        List<String> name2 = new ArrayList<>(); //par soucis de references on les place dans une nouvelle liste
        for (int i = 0; i < handCard1.size(); i++) {
            name1.add(handCard1.get(i).getName());
        }
        for (int i = 0; i < handCard2.size(); i++) {
            name2.add(handCard2.get(i).getName());
        }
        return name1.containsAll(name2) && name2.containsAll(name1);
    }
    
    public String compare(List<Card> handCard1, List<Card> handCard2) { //comparaison en fonction des points attribues de chaque main
    	if (player1.pointPlayer(handCard1) == player2.pointPlayer(handCard2)){
    		String hhh = "Egalité";
    		System.out.println(hhh);
    		return hhh;
    	}
    	else if (player1.pointPlayer(handCard1) > player2.pointPlayer(handCard2)) {
    		String hhh = "La main 1 gagne : "+player1.result;
    		System.out.println(hhh);
    		return hhh;
    	}
    	else {
    		 return "La main 2 gagne : "+player2.result;
   
    	}
    }
}
