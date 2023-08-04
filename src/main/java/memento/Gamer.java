package memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();

    private Random random;

    private static final String[] fruitsname = {
            "apple","orange","banana","grape"
    };

    public Gamer(int money) {
        this.money = money;
        random = new Random();
    }

    public int getMoney() {
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        if(dice == 1){
            money += 100;
            System.out.println("money increase");
        }
        else if(dice == 2){
            money /= 2;
            System.out.println("money decrease");
        }
        else if(dice == 6){
            String f = fruitsname[random.nextInt(fruitsname.length - 1) ];
            System.out.println("get " + f);
            fruits.add(f);
        }
        else{
            System.out.println("nothing");
        }

    }


    public Memento createMemento(){
        Memento m = new Memento(money);
        m.setFruits(fruits);
        return m;
    }

    public void restoreMemento(Memento memento){
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    private String getFruits() {
        return fruits.toString();
    }


    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("++++++" + i);
            System.out.println("state:" + gamer.getMoney() + "   " + gamer.getFruits());
            gamer.bet();
            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("money is increased");
                memento = gamer.createMemento();
            }
            else if(gamer.getMoney() < memento.getMoney() / 2){
                System.out.println("money is decreased");
                System.out.println("money is  restored");
                gamer.restoreMemento(memento);
            }

        }
    }



}
