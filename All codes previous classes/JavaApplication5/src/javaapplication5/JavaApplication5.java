package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
        CSE cs = new CSE();
        ENG en = new ENG();

        cs.name = "Tufahel Ahmed.";
        cs.reg = "170103020018";
        en.name = "Labib Ahmed.";
        en.reg = "120103020023";
        cs.info();
        cs.doGraduationCSE();
        cs.doProgramming();
        System.out.println("");
        en.info();
        en.doGraduationENG();
        en.doLiterature();
        NotOk o=new NotOk();
        o.hi();
    }

}

class GeneralStudent {

    String name;
    String reg;

    public void info() {
        System.out.println("I am a student.");
    }
}

class CSE extends GeneralStudent {

    public void doGraduationCSE() {
        System.out.println("NAME: " + name);
        System.out.println("ID: " + reg);
        System.out.println("Graduated in CSE.");
    }

    public void doProgramming() {
        System.out.println("Programming.");
    }

}

class ENG extends GeneralStudent {

    public void doGraduationENG() {
        System.out.println("NAME: " + name);
        System.out.println("ID: " + reg);
        System.out.println("Graduated in literature.");
    }

    public void doLiterature() {
        System.out.println("Literature.");
    }
}

abstract class Ok {

    abstract void hi();
}
class NotOk extends Ok{
    public void hi(){
        System.out.println("Lol!!!");
    }
}