package gamePieces.bishops;
import gamePieces.GamePieces;
import gamePieces.GamePiecesAbs;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class WhiteBishop extends GamePiecesAbs implements GamePieces {


    private final String location = "src/main/resources/WhiteBishop.png";
    private int col;
    private int row;
    private Picture whiteBishop;

    public WhiteBishop(int col, int row) {
        Picture whiteBishop = new Picture(col * cellSize + center, row * cellSize + center, location);
        whiteBishop.draw();
        this.col = col;
        this.row = row;
        this.whiteBishop = whiteBishop;
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
        whiteBishop.translate(moveToCol*cellSize, moveToRow*cellSize);

        col = targetCol;
        row = targetRow;
    }

    @Override
    public void eat(int col, int row) {

    }

    @Override
    public void beEaten() {
        whiteBishop.delete();
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
