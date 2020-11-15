package gamePieces.quens;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WhiteQueen extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/WhiteQueen.png";
    private int col;
    private int row;
    private Picture whiteQueen;

    public WhiteQueen(int col, int row) {
        Picture whiteQueen = new Picture(col * cellSize + center, row * cellSize + center, location);
        whiteQueen.draw();
        this.row = row;
        this.col = col;
        this.whiteQueen = whiteQueen;
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
        whiteQueen.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        whiteQueen.delete();
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
