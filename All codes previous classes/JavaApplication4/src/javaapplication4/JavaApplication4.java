package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        CSE cs = new CSE();
        ENG en = new ENG();
        cs.info();
        cs.doGraduationCSE();
        cs.doProgramming();
        System.out.println("");
        en.info();
        en.doGraduationENG();
        en.doLiterature();
    }

}

class CSE {

    public String name = "Tufahel Ahmed.";
    public String reg = "170103020018";

    public void doGraduationCSE() {
        System.out.println("NAME: " + name);
        System.out.println("ID: " + reg);
        System.out.println("Graduated in CSE.");
    }

    public void doProgramming() {
        System.out.println("Programming.");
    }

    public void info() {
        System.out.println("I am a student.");
    }
}

class ENG {

    public String name = "Labib Ahmed.";
    public String reg = "1601030200130";

    public void doGraduationENG() {
        System.out.println("NAME: " + name);
        System.out.println("ID: " + reg);
        System.out.println("Graduated in literature.");
    }

    public void doLiterature() {
        System.out.println("Literature.");
    }

    public void info() {
        System.out.println("I am a student.");
    }
}
