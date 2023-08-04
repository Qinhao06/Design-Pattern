package prototype;



import java.util.HashMap;

public class Manager {

    private final HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createClone();
    }


    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("messagebox",  new MessageBox());
        manager.register("underline", new UnderlinePen());
        Product p1 = manager.create("messagebox");
        Product p2 = manager.create("underline");
        p1.use("hello");
        p2.use("hello");

    }
}
