package Decorator;

public class FullBorder extends Border{
    public FullBorder(Display display) {
        super(display);
    }


    @Override
    public int getColumns() {
        return 2 + display.getColumns();
    }

    @Override
    public int getRows() {
        return 2 + display.getRows();
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
        return "|" + display.getRowText(row - 1) + "|";
    }

    private String makeLine(char c, int columns) {
        StringBuffer sb = new StringBuffer();
        sb.append(String.valueOf(c).repeat(Math.max(0, columns)));
        return sb.toString();
    }

    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("こんにちち")),
                                                '*'))),
                        '/');

        b4.show();

    }
}
