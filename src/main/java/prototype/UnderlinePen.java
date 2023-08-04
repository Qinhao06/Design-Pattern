package prototype;

public class UnderlinePen implements Product{
    @Override
    public void use(String s) {
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("/");
        }
        System.out.println();
        System.out.println("/" + s + "/");
        for (int i = 0; i < s.length() + 4; i++) {
            System.out.print("/");
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
