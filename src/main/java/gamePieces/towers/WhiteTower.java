package gamePieces.towers;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WhiteTower extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/WhiteTower.png";
    private double col;
    private double row;
    private Picture whiteTower;

    public WhiteTower(double col, double row) {
        Picture whiteTower = new Picture(col * cellSize + center, row * cellSize + center, location);
        whiteTower.draw();
        this.col = col;
        this.row = row;
        this.whiteTower = whiteTower;
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
        whiteTower.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(double col, double row) {

    }

    @Override
    public void beEaten() {
        whiteTower.delete();
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
