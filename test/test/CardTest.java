package test;

import model.Card;
import model.Color;
import model.Rank;
import org.junit.jupiter.api.Test;

/**
 * @Project: ps5-GroupeK
 * @Author: WANG Hanting
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class CardTest {
    @Test
    void testString(){
        Card card = new Card(Rank.SIX, Color.Coeur);
        System.out.println(card);
    }
}
