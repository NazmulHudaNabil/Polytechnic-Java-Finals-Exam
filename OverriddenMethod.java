// Overridden Method example with eat() method

class Man {
    public void eat() {             // Overridden Method
        System.out.println("Man is eating");
    }
}

class Boy extends Man {
    public void eat() {             // Overriding Method
        System.out.println("Boy is eating");
    }
}

public class OverriddenMethod {
    public static void main(String[] args) {
        Boy obj = new Boy();
        obj.eat();
    }
}