package gamePieces.horses;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WhiteHorse extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/WhiteHorse.png";
    private int col;
    private int row;
    private Picture whiteHorse;

    public WhiteHorse(int col, int row) {
        Picture whiteHorse = new Picture(col * cellSize + center, row * cellSize + center, location);
        whiteHorse.draw();
        this.col = col;
        this.row = row;
        this.whiteHorse = whiteHorse;

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
        whiteHorse.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        whiteHorse.delete();
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
