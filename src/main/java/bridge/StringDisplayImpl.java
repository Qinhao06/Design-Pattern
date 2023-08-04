package bridge;

public class StringDisplayImpl extends DisplayImpl{

    String displayString;

    int width;


    public StringDisplayImpl(String displayString) {
        this.displayString = displayString;
        this.width = displayString.getBytes().length;
    }

    @Override
    public void rawOpen() {
        for (int i = 0; i < width + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public void rawClose() {
        for (int i = 0; i < width + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + displayString + "|");
    }

    public static void main(String[] args) {
        Display display1 = new Display(new StringDisplayImpl("Hello, Japan."));
        CountDisplay display2 = new CountDisplay(new StringDisplayImpl("hah"));

        display1.display();
        display2.display();
        display2.multiDisplay(10);
    }
}
