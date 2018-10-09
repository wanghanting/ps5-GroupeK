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
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Comparison comparison = new Comparison();
        List<String> cs = new ArrayList<>();

        System.out.print("Main 1: ");
        
        for ( int i = 0; i < 5; i++) {
        	cs.add(in.next());
        	comparison.player1.addCard(new Card(Rank.getRank(cs.get(i).substring(0,cs.get(i).length()-2)), Color.getColor(cs.get(i).substring(cs.get(i).length() - 2))));
        }

        System.out.print("Main 2: ");

        for ( int i = 5; i < 10; i++) {
        	cs.add(in.next());
        	comparison.player2.addCard(new Card(Rank.getRank(cs.get(i).substring(0,cs.get(i).length()-2)), Color.getColor(cs.get(i).substring(cs.get(i).length() - 2))));
        }

        in.close();

        System.out.println(comparison.player1.handcard);
        System.out.println(comparison.player2.handcard);
        System.out.println(comparison.compare(comparison.player1.handcard, comparison.player2.handcard));
    }
}
