// Constructor Method example

class Cons {
    int roll, mark;
    String name;
    public Cons() {
        roll = 101;
        mark = 95;
        name = "Alice";
    }
}

public class ConstructorMethod {
    public static void main(String[] args) {
        Cons obj = new Cons();
        System.out.println("Roll: " + obj.roll);
        System.out.println("Mark: " + obj.mark);
        System.out.println("Name: " + obj.name);
    }
}