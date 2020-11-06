package BattleCore;

import main.model.Card;

import java.util.List;

public class Player {
    private String name;

    private Card card;

    private int dicePool;

    private List<Dice> diceList;

    private int health;

    public Player(int dicePool){
        this.dicePool = dicePool;
    }

    public void addDice(Dice dice){
        diceList.add(dice);
    }

    public int getDicesSum(){
        return diceList.stream().mapToInt(Dice::getType).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getDicePool() {
        return dicePool;
    }

    public void setDicePool(int dicePool) {
        this.dicePool = dicePool;
    }

    public List<Dice> getDiceList() {
        return diceList;
    }

    public void setDiceList(List<Dice> diceList) {
        this.diceList = diceList;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void giveDamage(int dmg){
        health -= dmg;
    }
}
