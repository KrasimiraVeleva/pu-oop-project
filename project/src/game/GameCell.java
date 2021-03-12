package game;

import java.awt.*;

public class GameCell {

    public static final int CELL_SIZE = 100;
    private int row;
    private int col;

    public GameCell(int row, int col) {

        this.row = row;
        this.col = col;
    }

    void render(Graphics g) {
        blackCell(g);
        grayCell(g);
        boardGrid(g);

    }

    /**
     * Метод изобразяващ черните плочки на дъската
     * @param g Graphics object
     */
    public void blackCell(Graphics g) {

        g.setColor(Color.black);

        g.fillRect(0  ,100,100,100);
        g.fillRect(100,25, 100, 75);
        g.fillRect(200,100,100,100);
        g.fillRect(300,25, 100,75);
        g.fillRect(400,100,100,100);
        g.fillRect(500,25, 100,75);
        g.fillRect(600,100,100,100);
        g.fillRect(700,25, 100,75);
        g.fillRect(800,100,100,100);

        g.fillRect(0  ,600,100,100);
        g.fillRect(100,500,100,100);
        g.fillRect(200,600,100,100);
        g.fillRect(300,500,100,100);
        g.fillRect(400,600,100,100);
        g.fillRect(500,500,100,100);
        g.fillRect(600,600,100,100);
        g.fillRect(700,500,100,100);
        g.fillRect(800,600,100,100);
    }

    /**
     * Метод изобразяващ сивите плочки на дъската
     * @param g Graphics object
     */
    public void grayCell(Graphics g) {

        g.setColor(Color.gray);

        g.fillRect(0  ,25, 100,75);
        g.fillRect(100,100,100,100);
        g.fillRect(200,25, 100,75);
        g.fillRect(300,100,100,100);
        g.fillRect(400,25, 100,75);
        g.fillRect(500,100,100,100);
        g.fillRect(600,25, 100,75);
        g.fillRect(700,100,100,100);
        g.fillRect(800,25, 100,75);

        g.fillRect(0  ,500,100,100);
        g.fillRect(100,600,100,100);
        g.fillRect(200,500,100,100);
        g.fillRect(300,600,100,100);
        g.fillRect(400,500,100,100);
        g.fillRect(600,500,100,100);
        g.fillRect(500,600,100,100);
        g.fillRect(700,600,100,100);
        g.fillRect(800,500,100,100);
    }

    /**
     * Метод изобразяващ огражденията около плочките на дъската
     * @param g Graphics object
     */
    public void boardGrid(Graphics g) {
        g.setColor(Color.black);

        for (int i = 0; i <= 900; i += 100) {
            for (int k = 0; k <= 700; k +=  100) {
                g.drawRect(i, k, 100, 100);
            }
        }
    }
}
