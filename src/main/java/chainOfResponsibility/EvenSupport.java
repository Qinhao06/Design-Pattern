package chainOfResponsibility;

public class EvenSupport extends Support{
    public EvenSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 0;
    }


    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support diana = new EvenSupport("Diana");
        Support elmo = new LimitSupport("Elmo", 200);
        Support fred = new OddSupport("Fred");
        alice.setNext(bob).setNext(diana).setNext(elmo).setNext(fred);
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }

    }
}
