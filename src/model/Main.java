package model;

import java.util.ArrayList;
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
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");

        System.out.print("Main 1: ");
        String r1 = in.next();
        p1.addCard(new Card(Rank.getRank(r1)));
        String r2 = in.next();
        p1.addCard(new Card(Rank.getRank(r2)));
        String r3 = in.next();
        p1.addCard(new Card(Rank.getRank(r3)));
        String r4 = in.next();
        p1.addCard(new Card(Rank.getRank(r4)));
//        System.out.print("Main 2: ");
//        int sc5 = in.nextInt();
//        p2.addCard(new Card(Rank.getRank(sc5)));
//        int sc6 = in.nextInt();
//        p2.addCard(new Card(Rank.getRank(sc6)));
//        int sc7 = in.nextInt();
//        p2.addCard(new Card(Rank.getRank(sc7)));
//        int sc8 = in.nextInt();
//        p2.addCard(new Card(Rank.getRank(sc8)));
        in.close();
        System.out.println(p1.getHandcard());
//        System.out.println(p2.handcard);
//        System.out.println(comparison.compare(p1.handcard, p2.handcard));
    }
}
