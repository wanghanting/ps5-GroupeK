package control;

/**
 * @Project: Dojo
 * @Author: PS5-Groupe K
 * @Version: 2.0
 * @Copyright: Copyright (c) 2018
 * @University: Polytech Nice-Sophia
 */
public class Operation {
    public static void main(String[] args) {
        Game game = new Game();

        System.out.print("Main 1: ");
        game.playerOneAddCard();
        game.playerOneAddCard();
        game.playerOneAddCard();
        System.out.print("Main 2: ");
        game.playerTwoAddCard();
        game.playerTwoAddCard();
        game.playerTwoAddCard();

//        game.show();
        game.compare();
    }
}
