package singleton;

public class Singleton {

    private Singleton(){
        System.out.println("singleton");
    }


    private static final Singleton instance = new Singleton();


    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
