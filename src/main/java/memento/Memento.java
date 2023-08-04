package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    int money;
    List<String> fruits = new ArrayList<>();

    public int getMoney() {
        return money;
    }


    Memento(int money) {
        this.money = money;

    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return  new ArrayList<>(fruits);
    }


    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }
}
