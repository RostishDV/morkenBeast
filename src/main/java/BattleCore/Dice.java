package BattleCore;

import java.util.Random;

public abstract class Dice {
    private int type;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public int throwDice(){
        return new Random().nextInt(type) + 1;
    }
}
