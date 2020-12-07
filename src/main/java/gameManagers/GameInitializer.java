package gameManagers;

import gamePieces.GamePieces;
import gamePieces.bishops.BlackBishop;
import gamePieces.bishops.WhiteBishop;
import gamePieces.horses.BlackHorse;
import gamePieces.horses.WhiteHorse;
import gamePieces.kings.BlackKing;
import gamePieces.kings.WhiteKing;
import gamePieces.pawns.BlackPawn;
import gamePieces.pawns.WhitePawn;
import gamePieces.quens.BlackQueen;
import gamePieces.quens.WhiteQueen;
import gamePieces.towers.BlackTower;
import gamePieces.towers.WhiteTower;
import grid.Grid;
import mouse.Mousex;
import players.Player;

import java.util.ArrayList;

public class GameInitializer {

    ArrayList <GamePieces> blackPieces = new ArrayList<>();
    ArrayList <GamePieces> whitePieces = new ArrayList<>();
    ArrayList <GamePieces> deadPieces = new ArrayList<>();

        private Grid gameBoard;
        private PlayGame playGame;
        private Mousex mousex;


    public GameInitializer () {

            gameBoard = new Grid();
            gameBoard.drawBoard();
            initializeBlacks();
            initializeWhites();
            initializeMouse();
            initializePlayers();
            playGame.playTheGame();

        }

        public void initializeMouse() {
            mousex = new Mousex();
        }

        public void initializePlayers() {
            Player player1 = new Player("player1", whitePieces);
            Player player2 = new Player("player2", blackPieces);
            playGame = new PlayGame(player1, player2, mousex);
        }


        public void initializeBlacks () {
            blackPieces.add(new BlackTower(0,7));
            blackPieces.add(new BlackTower(7,7));
            blackPieces.add(new BlackHorse(1,7));
            blackPieces.add(new BlackHorse(6,7));
            blackPieces.add(new BlackBishop(2,7));
            blackPieces.add(new BlackBishop(5,7));
            blackPieces.add(new BlackQueen(4,7));
            blackPieces.add(new BlackKing(3,7));

            blackPieces.add(new BlackPawn(0,6));
            blackPieces.add(new BlackPawn(1,6));
            blackPieces.add(new BlackPawn(2,6));
            blackPieces.add(new BlackPawn(3,6));
            blackPieces.add(new BlackPawn(4,6));
            blackPieces.add(new BlackPawn(5,6));
            blackPieces.add(new BlackPawn(6,6));
            blackPieces.add(new BlackPawn(7,6));
        }

        public void initializeWhites () {
            whitePieces.add(new WhiteTower(0,0));
            whitePieces.add(new WhiteTower(7,0));
            whitePieces.add(new WhiteHorse(1,0));
            whitePieces.add(new WhiteHorse(6,0));
            whitePieces.add(new WhiteBishop(2,0));
            whitePieces.add(new WhiteBishop(5,0));
            whitePieces.add(new WhiteQueen(4,0));
            whitePieces.add(new WhiteKing(3,0));

            whitePieces.add(new WhitePawn(0,1));
            whitePieces.add(new WhitePawn(1,1));
            whitePieces.add(new WhitePawn(2,1));
            whitePieces.add(new WhitePawn(3,1));
            whitePieces.add(new WhitePawn(4,1));
            whitePieces.add(new WhitePawn(5,1));
            whitePieces.add(new WhitePawn(6,1));
            whitePieces.add(new WhitePawn(7,1));
        }

    public ArrayList<GamePieces> getBlackPieces() {
        return blackPieces;
    }

    public ArrayList<GamePieces> getWhitePieces() {
        return whitePieces;
    }

    public ArrayList<GamePieces> getDeadPieces() {
        return deadPieces;
    }
}
