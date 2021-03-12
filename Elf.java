package pieces;

public class Elf extends Figure{

     public Elf(int row, int col) {

         super(row, col);
         this.attack    = 5;
         this.armor     = 1;
         this.health    = 10;
         this.attackBox = 3;
         this.speed     = 3;
     }


}
