package control;

import model.Card;
import model.Player;
import model.Rank;

import java.util.List;

/**
 * @Project: Dojo
 * @Author: WANG Hanting
 * @Version: 1.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Game {
    private Player player1;
    private Player player2;

    public Game() {
        player1 = new Player("player1");
        player2 = new Player("player2");
        player1.addCard(new Card(Rank.TWO));
        player2.addCard(new Card(Rank.THREE));
    }

    public void show() {
        System.out.println("Name: " + player1.getName());
        player1.showAllCard();
        System.out.println("Name: " + player2.getName());
        player2.showAllCard();
    }

    // 0 = equal ; 1 = p1 win ; 2 = p2 win
    public int compareHighCard(List<Card> handCard1, List<Card> handCard2) {
        Card card1 = handCard1.get(0);
        Card card2 = handCard2.get(0);
        if (card1.getValue() > card2.getValue()) {
            return 1;
        } else if (card1.getValue() < card2.getValue()) {
            return 2;
        } else {
            return 0;
        }
    }

    public void compare() {
        List<Card> handCard1 = player1.getHandcard();
        List<Card> handCard2 = player2.getHandcard();
        int result;
        result = compareHighCard(handCard1, handCard2);
        switch (result) {
            case 1:
                System.out.println("player1 win!");
                break;
            case 2:
                System.out.println("player2 win!");
                break;
            default:
                System.out.println("no one win!");
                break;
        }
    }
}
