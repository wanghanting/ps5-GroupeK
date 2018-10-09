package model;

import java.util.ArrayList;
import java.util.List;

import poker.Hand;

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
    
//    public int compare(List<Card> handCard1, List<Card> handCard2) {
//        if (player1.compteur.size() != 0 && player2.compteur.size() != 0) {
//            if (player1.compteur.size() > player2.compteur.size()) {
//                return 1;
//            } else if (player1.compteur.size() < player2.compteur.size()) {
//                return 2;
//            } else {
//                for (int i = 0; i < handCard1.size(); i++) {
//                    value1.add(handCard1.get(i).getValue());
//                    value2.add(handCard2.get(i).getValue());
//                }
//                player1.SortDecreasing(value1);
//                player2.SortDecreasing(value2);
////                System.out.println(value1);
////                System.out.println(value2);
//                for (int i = 0; i < value1.size(); i++) {
//                    if (value1.get(i) > value2.get(i)) {
//                        return 1;
//                    } else if (handCard1.get(i).getValue() < handCard2.get(i).getValue()) {
//                        return 2;
//                    } else {
//                        return 0;
//                    }
//                }
//            }
//        }
//        System.out.println("!!!");
//        return 0;
//    }



    /*
     * pour comparer l'锟絞alit锟� des cartes dans les deux mains
     */

    // 0 = equal ; 1 = p1 win ; 2 = p2 win
    /*
     * public int compareHighCard(List<Card> handCard1, List<Card> handCard2) { if
     * (player1.max(handCard1).getValue() > player2.max(handCard2).getValue()) {
     * System.out.println("player1 gagne avec la plus haute carte " +
     * player1.max(handCard1).getValue()); return 1; } else if
     * (player1.max(handCard1).getValue() < player2.max(handCard2).getValue()) {
     * System.out.println("player2 gagne avec la plus haute carte " +
     * player2.max(handCard2).getValue()); return 2; } else {
     * System.out.println("Egalit锟�"); return 0; } }
     */

    //	 0 = equal ; 1 = p1 win ; 2 = p2 win
//	public int comparePair(List<Card> handCard1, List<Card> handCard2) {
//		if (player1.havePair(handCard1) > 0 && player2.havePair(handCard2) == 0) {
//			System.out.println("player 1 gagne avec une pair de "+ player1.havePair(handCard1));
//			return 1;
//		} else if (player2.havePair(handCard2) > 0 && player1.havePair(handCard1) == 0) {
//			System.out.println("player 2 gagne avec une pair de "+ player2.havePair(handCard2));
//			return 2;
//		} else if (player2.havePair(handCard2) > 0 && player1.havePair(handCard1) > 0) {
//			if (player1.havePair(handCard1) > player2.havePair(handCard2)) {
//				System.out.println("player 1 gagne avec un pair de "+ player1.havePair(handCard1));
//				return 1;
//			} else if (player1.havePair(handCard1) < player2.havePair(handCard2)) {
//				System.out.println("player 2 gagne avec un pair de "+ player2.havePair(handCard2));
//				return 2;
//			} else {
//				return compareHighCard(handCard1, handCard2);
//			}
//		} else {
//			return compareHighCard(handCard1, handCard2);
//		}
//	}
//
//	public int compareBrelan(List<Card> handCard1, List<Card> handCard2) {
//		if (player1.haveBrelan(handCard1) != 0 && player2.haveBrelan(handCard2) == 0) {
//			System.out.println("player1 gagne avec un brelan de "+ player1.haveBrelan(handCard1));
//			return 1;
//		} else if (player2.haveBrelan(handCard2) != 0 && player1.haveBrelan(handCard1) == 0) {
//			System.out.println("player2 gagne avec un brelan de "+ player2.haveBrelan(handCard2));
//			return 2;
//		} else {
//			return comparePair(handCard1, handCard2);
//		}
//	}
//
//	public void compare() {
//		List<Card> handCard1 = player1.getHandcard();
//		List<Card> handCard2 = player2.getHandcard();
//		compareBrelan(handCard1, handCard2);
//		if(equals(handCard1, handCard2)) {
//			System.out.println("Egalit锟�");
//		}
//	}
    public boolean equals(List<Card> handCard1, List<Card> handCard2) { //Fonction qui v�rifie les �galit�s
        List<String> name1 = new ArrayList<>();
        List<String> name2 = new ArrayList<>(); //par soucis de r�f�rences on les place dans une nouvelle liste
        for (int i = 0; i < handCard1.size(); i++) {
            name1.add(handCard1.get(i).getName());
        }
        for (int i = 0; i < handCard2.size(); i++) {
            name2.add(handCard2.get(i).getName());
        }
        return name1.containsAll(name2) && name2.containsAll(name1);
    }
    
  

//    public String compare(List<Card> handCard1, List<Card> handCard2) { //comparaison en fonction des points attribu�s � chaque main
//    	if (player1.pointPlayer(handCard1) == player2.pointPlayer(handCard2)){
//    		String hhh = "Egalit�";
//    		return hhh;
//    		if (player1.pointPlayer(handCard1) > player2.pointPlayer(handCard2)){
//    			return "player1 gagne";
//    			
//    		}
//    		if (player1.pointPlayer(handCard1) < player2.pointPlayer(handCard2)){
//    			return "player2 gagne";
//    			
//    		}
//    	}

//    public int compare(List<Card> handCard1, List<Card> handCard2) {
//    	if (player1.pointPlayer(handCard1) == player2.pointPlayer(handCard2)){
//    		return 0;
//
//    	}
//    	else if (player1.pointPlayer(handCard1) < player2.pointPlayer(handCard2)) {
//    		return 2;
//    	}
//    	else {
//    		 return 1;
//   
//    	}
//    }
}
