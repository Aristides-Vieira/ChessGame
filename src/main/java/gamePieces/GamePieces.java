package gamePieces;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public interface GamePieces {

     void showPossibleMoves();

     void move(double targetCol, double targetRow);

     void eat(double col, double row);

     void beEaten();

     double getCol ();

     double getRow();

}
