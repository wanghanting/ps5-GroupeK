package test;

import model.Card;
import model.Comparison;
import model.Player;
import model.Rank;
import org.junit.jupiter.api.Test;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
class test {
    Comparison comparison = new Comparison();
    Player p1 = new Player("p1");
    Player p2 = new Player("p2");

    @Test
    void testAddCard(){
        int sc1 = 14;
        p1.addCard(new Card(Rank.getRank(sc1)));
        p1.showAllCard();
        int sc2 = 2;
        p2.addCard(new Card(Rank.getRank(sc2)));
        p2.showAllCard();
    }
}
