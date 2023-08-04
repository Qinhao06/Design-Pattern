package templateMethod;

public abstract  class Template {
    public abstract void print();

    public static void main(String[] args) {
        Template template = new StringTemplate();
        template.print();
    }
}
