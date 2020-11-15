package gamePieces;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public interface GamePieces {

     default void draw(int col, int row, String location){
          Picture pieceName = new Picture(col, row, location);
     }

     void showPossibleMoves();

     void move(int col, int row);

     void eat(int col, int row);

     void beEaten();
}
