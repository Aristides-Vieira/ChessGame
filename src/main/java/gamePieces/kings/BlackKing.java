package gamePieces.kings;

import gamePieces.GamePieces;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BlackKing implements GamePieces {

    private final double cellSize = 90;
    private final double center = 15;
    private final String location = "src/main/resources/BlackKing.png";
    private double row;
    private double col;
    private Picture blackKing;

    public BlackKing (double col, double row){
        Picture blackKing = new Picture(col* cellSize + center, row * cellSize + center, location);
        blackKing.draw();
        this.row = row;
        this.col = col;
        this.blackKing = blackKing;
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
        blackKing.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(double col, double row) {

    }

    @Override
    public void beEaten() {
        blackKing.delete();
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
