package gamePieces.pawns;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BlackPawn extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/BlackPawn.png";
    private int col;
    private int row;
    private Picture blackPawn;

    public BlackPawn(int col, int row) {
        Picture blackPawn = new Picture(col * cellSize + center, row * cellSize + center, location);
        blackPawn.draw();
        this.col = col;
        this.row = row;
        this.blackPawn = blackPawn;
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
        blackPawn.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        blackPawn.delete();
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
