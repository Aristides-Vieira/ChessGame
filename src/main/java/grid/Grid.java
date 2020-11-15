package grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Grid {


    private Cell cell;
    private Cell[][] cellArray;
    private final int cellSize = 90;

    public void drawBoard () {
        int rows = 8;
        int cols = 8;

        cellArray = new Cell[rows][cols];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cellArray[i][j] = new Cell(i*cellSize, j*cellSize, cellColor(i, j));
            }
        }
    }

    public Color cellColor (int i, int j) {
        if( (i+j) % 2 != 0){
            return Color.GRAY;
        } else {
            return  Color.LIGHT_GRAY;
        }
    }
}
