package pieces;

public class Figure {

    protected int row;
    protected int col;
    protected int attack;
    protected int armor;
    protected int health;
    protected int attackBox;
    protected int speed;

    public Figure(int row, int col) {

        this.row = row;
        this.col = col;
    }

    public void move(int row, int col) {

        this.row = row;
        this.col = col;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackBox() {
        return attackBox;
    }

    public int getSpeed() {
        return speed;
    }
}
