package Decorator;

public class SideBorder extends Border{

    private char borderChar;
    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }


    @Override
    public int getColumns() {
        return 2 + display.getColumns();
    }

    @Override
    public int getRows() {
        return  display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
