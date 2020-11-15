import gamePieces.blacks.BlackKing;
import grid.Grid;

public class Main {

    public static void main(String[] args) {

        Grid gamingBoard = new Grid();

        gamingBoard.drawBoard();

        BlackKing blackKing = new BlackKing();

        blackKing.drawKing(3,7);

    }

}
