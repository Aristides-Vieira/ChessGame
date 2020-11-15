package gamePieces;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public interface GamePieces {

     void showPossibleMoves();

     void move(int targetCol, int targetRow);

     void eat(int col, int row);

     void beEaten();

     int getCol ();

     int getRow();

}
