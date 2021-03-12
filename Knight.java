package pieces;

import java.awt.*;
import java.util.Random;

public class Knight extends Figure {

    public Knight(int row, int col) {

        super(row, col);
        this.attack    = 8;
        this.armor     = 3;
        this.health    = 15;
        this.attackBox = 1;
        this.speed     = 1;
    }

    public void render(Graphics g) {

        int knight1 = random();
        int knight2 = random();
        int knight3 = random();
        int knight4 = random();

        g.setColor(Color.ORANGE);
        g.fillOval((knight1*100) + 15, 15,  70, 70);
        g.fillOval((knight2*100) + 15, 115, 70, 70);

        g.setColor(Color.ORANGE);
        g.fillOval((knight3*100) + 15, 515,  70, 70);
        g.fillOval((knight4*100) + 15, 615,  70, 70);

    }

    private int random() {
        Random random = new Random();
        int rand = random.nextInt(5);
        while (rand == 2) {
            rand = random.nextInt(5);
        }
        return rand;
    }
}
