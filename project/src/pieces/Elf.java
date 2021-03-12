package pieces;

import java.awt.*;
import java.util.Random;

public class Elf extends Figure {

     public Elf(int row, int col) {

         super(row, col);
         this.attack    = 5;
         this.armor     = 1;
         this.health    = 10;
         this.attackBox = 3;
         this.speed     = 3;
     }

    /**
     * Метод изобразяващ елфите на игралната дъска
     * @param g Graphics object
     */
    public void render(Graphics g) {

        int elf1 = random();
        int elf2 = random();
        int elf3 = random();
        int elf4 = random();

        g.setColor(Color.RED);
        g.fillOval((elf1*100) + 15, 15,  70, 70);
        g.fillOval((elf2*100) + 15, 115, 70, 70);

        g.setColor(Color.RED);
        g.fillOval((elf3*100) + 15, 515,  70, 70);
        g.fillOval((elf4*100) + 15, 615,  70, 70);
    }

    /**
     * Метод изобразяващ фигурите на случаен принцип
     * @return rand
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