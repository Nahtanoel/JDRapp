package model;
import java.util.Random;
public class dice {
    private int sides;
    private Random random;
    public dice(int sides){
        this.sides = sides;
        this.random = new Random();
    }
    public int roll(){
        return this.random.nextInt(sides) + 1;
    }
}
