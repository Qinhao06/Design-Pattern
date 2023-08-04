package visitor;


import junit.framework.Test;

public class ListVisitor extends Visitor {

    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String saveDir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        for (Entry entry : directory.getDirectory()) {
            entry.accept(this);
        }
        currentdir = saveDir;
    }

    public static void main(String[] args) throws FileTreatmentException {
        System.out.println("root");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");
        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi", 10000));
        binDir.add(new File("latex", 20000));
        rootDir.accept(new ListVisitor());
        System.out.println("");
        System.out.println("usr");
        usrDir.add(new File("b.txt", 100));
        usrDir.add(new File("c.txt", 200));
        usrDir.add(new File("d.txt", 300));
        usrDir.accept(new ListVisitor());
        System.out.println("");
        System.out.println("tmp");
        tmpDir.add(new File("a.txt", 100));
        tmpDir.accept(new ListVisitor());

        System.out.println();
        System.out.println("root - 遍历");
        rootDir.accept(new ListVisitor());
    }



}
