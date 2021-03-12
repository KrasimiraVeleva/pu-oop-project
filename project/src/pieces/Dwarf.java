package pieces;

import java.awt.*;
import java.util.Random;

public class Dwarf extends Figure {

    public Dwarf(int row, int col) {

        super(row, col);
        this.attack    = 6;
        this.armor     = 2;
        this.health    = 12;
        this.attackBox = 2;
        this.speed     = 2;
    }

    /**
     * Метод изобразяващ джуджетата на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        int dwarf1 = random();
        int dwarf2 = random();
        int dwarf3 = random();
        int dwarf4 = random();

        g.setColor(Color.GREEN);
        g.fillOval((dwarf1*100) + 15, 15,  70, 70);
        g.fillOval((dwarf2*100) + 15, 115, 70, 70);

        g.setColor(Color.GREEN);
        g.fillOval((dwarf3*100) + 15, 515, 70, 70);
        g.fillOval((dwarf4*100) + 15, 615, 70, 70);
    }

    /**
     * Метод изобразяващ фигурите на случаен принцип
     * @return
     */
    private int random() {
        Random random = new Random();
        int rand = random.nextInt(5);
        while (rand == 2) {
            rand = random.nextInt(5);
        }
        return rand;
    }
}