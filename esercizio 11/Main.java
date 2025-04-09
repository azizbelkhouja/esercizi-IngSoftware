// Interfacce
interface Int1 {
    void method1(int n);
}

interface Int2 {
    void method2(int n);
}

// ClassA
class ClassA {
    private ClassB[] bInstances;
    private ClassC[] cInstances;

    public ClassA(int n, int m) {
        bInstances = new ClassB[m];
        cInstances = new ClassC[n];

        for (int i = 0; i < m; i++) {
            bInstances[i] = new ClassB(new Int2() {
                public void method2(int n) {
                    System.out.println("method2 eseguito con n = " + n);
                }
            });
        }

        for (int i = 0; i < n; i++) {
            cInstances[i] = new ClassC(new Int1() {
                public void method1(int n) {
                    System.out.println("method1 eseguito con n = " + n);
                }
            });
        }
    }

    public void methodA() {
        for (int i = 0; i < bInstances.length; i++) {
            bInstances[i].methodB();
        }
        for (int i = 0; i < cInstances.length; i++) {
            cInstances[i].methodC();
        }
    }
}

// ClassB
class ClassB {
    private Int2 i2;

    public ClassB(Int2 i2) {
        this.i2 = i2;
    }

    public void methodB() {
        i2.method2(2);
    }
}

// ClassC
class ClassC {
    private Int1 i1;

    public ClassC(Int1 i1) {
        this.i1 = i1;
    }

    public void methodC() {
        i1.method1(1);
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA(6, 10);
        a.methodA();
    }
}
