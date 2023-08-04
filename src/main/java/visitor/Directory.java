package visitor;

import java.util.ArrayList;

public class Directory extends Entry {

    private String name;

    private final ArrayList<Entry> directory = new ArrayList<Entry>();


    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        directory.add(entry);
        return this;
    }

    public ArrayList<Entry> getDirectory() {
        return directory;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }


    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}


