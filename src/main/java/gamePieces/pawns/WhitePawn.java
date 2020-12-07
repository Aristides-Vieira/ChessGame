package gamePieces.pawns;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WhitePawn extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/WhitePawn.png";
    private double col;
    private double row;
    private Picture whitePawn;

    public WhitePawn(double col, double row) {
        Picture whitePawn = new Picture(col * cellSize + center, row * cellSize + center, location);
        whitePawn.draw();
        this.col = col;
        this.row = row;
        this.whitePawn = whitePawn;
    }


    @Override
    public void showPossibleMoves() {

    }

    @Override
    public void move(double targetCol, double targetRow) {
        double moveToCol;
        double moveToRow;

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
        whitePawn.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(double col, double row) {

    }

    @Override
    public void beEaten() {
        whitePawn.delete();
    }

    @Override
    public double getCol() {
        return col;
    }

    @Override
    public double getRow() {
        return row;
    }
}
