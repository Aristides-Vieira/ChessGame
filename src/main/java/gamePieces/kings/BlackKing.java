package gamePieces.kings;

import gamePieces.GamePieces;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BlackKing implements GamePieces {

    private final int cellSize = 90;
    private final int center = 15;
    private final String location = "src/main/resources/BlackKing.png";
    private int row;
    private int col;
    private Picture blackKing;

    public BlackKing (int col, int row){
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
        blackKing.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        blackKing.delete();
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
