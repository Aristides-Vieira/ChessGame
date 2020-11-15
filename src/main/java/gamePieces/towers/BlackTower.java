package gamePieces.towers;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BlackTower extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/BlackTower.png";
    private int col;
    private int row;
    private Picture blackTower;

    public BlackTower(int col, int row) {
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
        blackTower.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        blackTower.delete();
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
