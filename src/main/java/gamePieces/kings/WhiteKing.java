package gamePieces.kings;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WhiteKing extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/WhiteKing.png";
    private int col;
    private int row;
    private Picture whiteKing;

    public WhiteKing (int col, int row) {
        Picture whiteKing = new Picture(col* cellSize + center, row * cellSize + center, location);
        whiteKing.draw();
        this.col= col;
        this.row = row;
        this.whiteKing = whiteKing;
    }

    @Override
    public void showPossibleMoves() {

    }

    @Override
    public void move(int targetCol, int targetRow) {
        int moveToCol;
        int moveToRow;

        if(this.col > targetCol) {
            moveToCol = targetCol *(-1);
        } else {
            moveToCol = targetCol;
        }
        if (this.row > targetRow) {
            moveToRow = targetRow *(- 1);
        } else {
            moveToRow = targetRow;
        }
        whiteKing.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        whiteKing.delete();
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public int getRow() {
        return row;
    }
}
