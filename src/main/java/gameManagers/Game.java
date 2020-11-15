package gameManagers;

public class Game {

    GameInitializer gameInitializer;
    GameHandler gameHandler;


    public Game (){
        gameInitializer = new GameInitializer();
        gameHandler = new GameHandler(gameInitializer.getPiecesArrayList());
    }

}
