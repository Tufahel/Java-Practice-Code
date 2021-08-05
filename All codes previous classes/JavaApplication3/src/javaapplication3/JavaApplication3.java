package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {

        A aa = new A();
        B bb = new B();
        aa.info();
        bb.doJob(aa);
        aa.info();
        bb.doJob1(aa.v);
        aa.info();
    }

}

class A {

    int v = 0;

    void info() {
        System.out.println(v);
    }
}

class B {

    int v = 2;

    void doJob(A a) {
        a.v = 1;
    }

    void doJob1(int a) {
        a = 5;
    }
}
