class First {
    public void method1() {
        System.out.println("My Child");
    }
}

class Second extends First {
    public void method2() {
        System.out.println("Name is");
    }
}

class Third extends Second {
    public void method3() {
        System.out.println("Jack");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Third obj = new Third();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}