package model;

import java.util.Scanner;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Comparison comparison = new Comparison();

        System.out.print("Main 1: ");
        
        for ( int i=0; i<5;i++) { //Séparation des cartes de la main 1
        	String ri = in.next();
        	comparison.player1.addCard(new Card(Rank.getRank(ri.substring(0,ri.length()-2)), Color.getColor(ri.substring(ri.length() - 2))));
        }
        System.out.print("Main 2: ");
        
        for ( int i=5; i<10;i++) { //Séparation des cartes de la main 2
        	String ri = in.next();
        	comparison.player2.addCard(new Card(Rank.getRank(ri.substring(0,ri.length()-2)), Color.getColor(ri.substring(ri.length() - 2))));
        }


        in.close();
        System.out.println(comparison.player1.handcard);
        System.out.println(comparison.player2.handcard);
        System.out.println(comparison.compare(comparison.player1.handcard, comparison.player2.handcard));
    }
}
