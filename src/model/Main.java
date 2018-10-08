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
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");

        System.out.print("Main 1: ");

        String r1 = in.next();
        p1.addCard(new Card(Rank.getRank(r1.substring(0,r1.length()-2)), Color.getColor(r1.substring(r1.length() - 2))));
        String r2 = in.next();
        p1.addCard(new Card(Rank.getRank(r2.substring(0,r2.length()-2)),Color.getColor(r2.substring(r2.length() - 2))));
        String r3 = in.next();
        p1.addCard(new Card(Rank.getRank(r3.substring(0,r3.length()-2)),Color.getColor(r3.substring(r3.length() - 2))));
        String r4 = in.next();
        p1.addCard(new Card(Rank.getRank(r4.substring(0,r4.length()-2)),Color.getColor(r4.substring(r4.length() - 2))));
        String r5 = in.next();
        p1.addCard(new Card(Rank.getRank(r5.substring(0,r5.length()-2)),Color.getColor(r5.substring(r5.length() - 2))));

        System.out.print("Main 2: ");

        String r6 = in.next();
        p2.addCard(new Card(Rank.getRank(r6.substring(0,r6.length()-2)), Color.getColor(r6.substring(r6.length() - 2))));
        String r7 = in.next();
        p2.addCard(new Card(Rank.getRank(r7.substring(0,r7.length()-2)),Color.getColor(r7.substring(r7.length() - 2))));
        String r8 = in.next();
        p2.addCard(new Card(Rank.getRank(r8.substring(0,r8.length()-2)),Color.getColor(r8.substring(r8.length() - 2))));
        String r9 = in.next();
        p2.addCard(new Card(Rank.getRank(r9.substring(0,r9.length()-2)),Color.getColor(r9.substring(r9.length() - 2))));
        String r10 = in.next();
        p2.addCard(new Card(Rank.getRank(r10.substring(0,r10.length()-2)),Color.getColor(r10.substring(r10.length() - 2))));

        in.close();
        System.out.println(p1.handcard);
        System.out.println(p2.handcard);
//        System.out.println(comparison.compare(p1.handcard, p2.handcard));
    }
}
