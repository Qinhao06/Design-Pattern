package adapter;

public class PrintBanner extends Banner implements Print
{
    public PrintBanner(String string)
    {
        super(string);
    }


    @Override
    public void PrintWeak() {
        showWithAster();
    }

    @Override
    public void PrintStrong() {
        showWithParen();
    }


    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.PrintWeak();
        print.PrintStrong();
    }
}
