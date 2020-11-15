package gamePieces.horses;

import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BlackHorse extends GamePiecesAbs implements GamePieces {

    private final String location = "src/main/resources/BlackHorse.png";
    private int col;
    private int row;
    private Picture blackHorse;


    public BlackHorse(int col, int row) {
        Picture blackHorse = new Picture(col * cellSize + center, row * cellSize + center, location);
        blackHorse.draw();
        this.col = col;
        this.row = row;
        this.blackHorse = blackHorse;
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
        blackHorse.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        blackHorse.delete();
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
