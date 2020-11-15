package grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private final int col;
    private final int row;
    private final int cellSize = 90;

    public Cell (int col, int row, Color color) {
        this.col = col;
        this.row = row;
        int PADDING = 10;
        Rectangle cellRectangle = new Rectangle(col + PADDING, row + PADDING, cellSize, cellSize);
        cellRectangle.setColor(color);
        cellRectangle.fill();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getCellSize() {
        return cellSize;
    }
}
