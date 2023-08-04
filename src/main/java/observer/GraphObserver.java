package observer;

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer observer = new GraphObserver();
        Observer  observer2 = new DigitObserver();
        numberGenerator.addObserver(observer2);
        numberGenerator.addObserver(observer);
        for (int i  = 0; i < 10; i++) {
            numberGenerator.execute();
            System.out.println();
        }

    }
}
