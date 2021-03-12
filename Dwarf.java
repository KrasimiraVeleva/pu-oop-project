package pieces;

import java.awt.*;
import java.util.Random;

public class Dwarf extends Figure{

    public Dwarf(int row, int col) {

        super(row, col);
        this.attack    = 6;
        this.armor     = 2;
        this.health    = 12;
        this.attackBox = 2;
        this.speed     = 2;
    }

    
}
