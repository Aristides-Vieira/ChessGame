package mouse;

import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Mousex implements MouseHandler {

    Mouse mouse = new Mouse(this);
    private boolean used;
    private double row;
    private double col;


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        translateCol(mouseEvent.getX());
        translateRow(mouseEvent.getY());

        System.out.println("cliked");
        System.out.println(col);
        System.out.println(row);
        System.out.println("\n\n\n");
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    public double getCol() {
        return col;
    }

    public double getRow() {
        return row;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public boolean getUsed() {
        return used;
    }

    public void translateCol(double mouseX) {
        if (mouseX <= 100) {
            col = 0;
        } else if (mouseX > 100 && mouseX < 190) {
            col = 1;
        } else if (mouseX > 190 && mouseX < 280) {
            col = 2;
        } else if (mouseX > 280 && mouseX < 370) {
            col = 3;
        } else if (mouseX > 370 && mouseX < 460) {
            col = 4;
        } else if (mouseX > 460 && mouseX < 550) {
            col = 5;
        } else if (mouseX > 550 && mouseX < 640) {
            col = 6;
        } else if (mouseX > 640 && mouseX < 730) {
            col = 7;
        }
    }


    public void translateRow(double mousey) {
        if (mousey <= 140) {
            row = 0;
        } else if (mousey > 140 && mousey < 230) {
            row = 1;
        } else if (mousey > 230 && mousey < 320) {
            row = 2;
        } else if (mousey > 320 && mousey < 410) {
            row = 3;
        } else if (mousey > 410 && mousey < 500) {
            row = 4;
        } else if (mousey > 500 && mousey < 590) {
            row = 5;
        } else if (mousey > 590 && mousey < 680) {
            row = 6;
        } else if (mousey > 680 && mousey < 770) {
            row = 7;
        }
    }

}
