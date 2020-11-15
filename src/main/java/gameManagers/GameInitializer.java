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

import java.util.ArrayList;

public class GameInitializer {

    ArrayList <GamePieces> piecesArrayList = new ArrayList<>();

        private Grid gameBoard;
        private GamePieces gamePieces;

        public GameInitializer () {
            gameBoard = new Grid();
            gameBoard.drawBoard();
            initializeBlacks();
            initializeWhites();
        }


        public void initializeBlacks () {
            piecesArrayList.add(new BlackTower(0,7));
            piecesArrayList.add(new BlackTower(7,7));
            piecesArrayList.add(new BlackHorse(1,7));
            piecesArrayList.add(new BlackHorse(6,7));
            piecesArrayList.add(new BlackBishop(2,7));
            piecesArrayList.add(new BlackBishop(5,7));
            piecesArrayList.add(new BlackQueen(4,7));
            piecesArrayList.add(new BlackKing(3,7));

            piecesArrayList.add(new BlackPawn(0,6));
            piecesArrayList.add(new BlackPawn(1,6));
            piecesArrayList.add(new BlackPawn(2,6));
            piecesArrayList.add(new BlackPawn(3,6));
            piecesArrayList.add(new BlackPawn(4,6));
            piecesArrayList.add(new BlackPawn(5,6));
            piecesArrayList.add(new BlackPawn(6,6));
            piecesArrayList.add(new BlackPawn(7,6));
        }

        public void initializeWhites () {
            piecesArrayList.add(new WhiteTower(0,0));
            piecesArrayList.add(new WhiteTower(7,0));
            piecesArrayList.add(new WhiteHorse(1,0));
            piecesArrayList.add(new WhiteHorse(6,0));
            piecesArrayList.add(new WhiteBishop(2,0));
            piecesArrayList.add(new WhiteBishop(5,0));
            piecesArrayList.add(new WhiteQueen(4,0));
            piecesArrayList.add(new WhiteKing(3,0));

            piecesArrayList.add(new WhitePawn(0,1));
            piecesArrayList.add(new WhitePawn(1,1));
            piecesArrayList.add(new WhitePawn(2,1));
            piecesArrayList.add(new WhitePawn(3,1));
            piecesArrayList.add(new WhitePawn(4,1));
            piecesArrayList.add(new WhitePawn(5,1));
            piecesArrayList.add(new WhitePawn(6,1));
            piecesArrayList.add(new WhitePawn(7,1));
        }


    public ArrayList<GamePieces> getPiecesArrayList() {
        return piecesArrayList;
    }
}
