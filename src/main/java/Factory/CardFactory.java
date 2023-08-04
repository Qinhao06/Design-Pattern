package Factory;

public class CardFactory extends Factory {
    @Override
    public Product create() {
        return new Card();
    }

    public static void main(String[] args) {
        Factory factory = new CardFactory();
        factory.create().use();
    }
}
