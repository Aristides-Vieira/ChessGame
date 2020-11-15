package gamePieces.blacks;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class BlackKing {

    private final int cellSize = 90;
    private final int center = 15;


    private final String location = "/home/aristides/Documents/Academia/ChessGame/src/main/resources/king.png";

    public void drawKing (int col, int row){

        Picture king = new Picture(col* cellSize + center, row * cellSize + center, location);

        king.draw();


    }
}
