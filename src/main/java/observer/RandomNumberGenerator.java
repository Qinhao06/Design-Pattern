package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{

    Random random = new Random();
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        number = random.nextInt(50);
        notifyObservers();
    }
}
