package players;

import gameManagers.Game;
import gamePieces.GamePieces;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList <GamePieces> pieces;


    public Player (String name, ArrayList<GamePieces> pieces) {
        this.name = name;
        this.pieces = pieces;
    }


    public boolean hasPieces(){
        if(!pieces.isEmpty()){
            return true;
        } else {
            return false;
        }
    }



    public void play(double col,double row) {
        GamePieces selectedPiece = null;
        selectedPiece = selectGamePiece(col, row);
        checkPieceNotNull(selectedPiece, col, row);
        moveToCell(selectedPiece, col, row);
    }

    public GamePieces selectGamePiece(double col, double row) {

        GamePieces selected = null;

        for (GamePieces piece: pieces) {
            if(piece.getCol() == col && piece.getRow() ==row );
            selected = piece;
        }
        return selected;
    }

    public void checkPieceNotNull(GamePieces gamePiece, double col, double row) {
        if(gamePiece == null) {
            play(col, row);
        }
    }

    public void moveToCell(GamePieces gamePiece, double col, double row){
        gamePiece.move(col, row);
    }

}
