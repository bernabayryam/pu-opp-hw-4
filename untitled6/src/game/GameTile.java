package game;

import java.awt.*;

public class GameTile {

    private int row = 0;

    private int col = 0;

    private Object color = null;

    public GameTile(int row, int col, Object tileColor) {
        this.row = row;
        this.col = col;
    }

    public void render(Graphics g) {
    }
//Метод за визуализиране на цвета във всяка кутия.
    public void boxColor(Graphics g, int row, int col) {

        if (start(row, col)) {
            
            g.setColor(Color.ORANGE);

        } else if (gps(row, col)) {

            g.setColor(Color.GREEN);
        }
            else if (impassable(row, col)) {

                g.setColor(Color.BLUE);
        } else if (unexplored(row, col)) {
            
            g.setColor(Color.PINK);

        }

    }

    private boolean unexplored(int row, int col) {
        return false;
    }

    private boolean gps(int row, int col) {
        return false;
    }

    private boolean impassable(int row, int col) {
        return false;
    }

    private boolean start(int row, int col) {

        return false;
    }
}
