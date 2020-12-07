package gameManagers;

import mouse.Mousex;
import players.Player;

public class PlayGame {

    private Player player1;
    private Player player2;
    private Mousex mousex;
    private double col;
    private double row;

    public PlayGame (Player player1, Player player2, Mousex mousex) {
        this.player1 = player1;
        this.player2 = player2;
        this.mousex = mousex;
        mousex.setUsed(true);
    }

    public void playTheGame() {
        if (player1.hasPieces() && player2.hasPieces()) {
            if (!mousex.getUsed()) {
                player1.play(mousex.getCol(), mousex.getRow());
                mousex.setUsed(true);
            }
        }
        if (player1.hasPieces() && player2.hasPieces()) {
            if (!mousex.getUsed()) {
                player2.play(mousex.getCol(), mousex.getRow());
                mousex.setUsed(true);
            }
        }

    }
}
