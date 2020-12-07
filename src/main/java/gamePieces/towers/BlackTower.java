package gamePieces.towers;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BlackTower extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/BlackTower.png";
    private double col;
    private double row;
    private Picture blackTower;

    public BlackTower(double col, double row) {
        Picture blackTower = new Picture(col * cellSize + center, row * cellSize + center, location);
        blackTower.draw();
        this.col = col;
        this.row = row;
        this.blackTower = blackTower;

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
        blackTower.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(double col, double row) {

    }

    @Override
    public void beEaten() {
        blackTower.delete();
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
