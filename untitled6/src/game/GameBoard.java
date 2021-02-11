package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JFrame implements MouseListener {
    private static boolean isGameOver = false;
    private Object e;

    public GameBoard() {

        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addMouseListener(this);

    }
//Метод с който рисуваме полето.

    public void paint(Graphics g) {

        for (int row = 0; row < 8; row++) {

            for (int col = 0; col < 8; col++) {

                Object tileColor = null;
                GameTile  tile = new GameTile(row, col, null);
                tile.render(g);

            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}


