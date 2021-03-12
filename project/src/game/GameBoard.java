package game;

import pieces.Dwarf;
import pieces.Elf;
import pieces.Knight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameBoard extends JFrame {

    private ArrayList<Object> pieces;

    public GameBoard() {

        this.setVisible(true);
        this.setSize(900, 700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * @author Красимира Велева
     * Метод изобразяващ игралната дъска, рицарите, елфите и джуджетата
     * @param g Graphics object
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 7; col++) {


                GameCell cell = new GameCell(row, col);
                cell.render(g);

                Knight k = new Knight(row, col);
                k.render(g);

                Elf e = new Elf(row, col);
                e.render(g);

                Dwarf d = new Dwarf(row, col);
                d.render(g);
            }
        }
    }
}