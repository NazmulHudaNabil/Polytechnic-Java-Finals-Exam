// Single Inheritance example: A subclass inherits from a single superclass

class Add {
    public void addition(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
}
class Sub extends Add {
    public void subtraction(int a, int b) {
        System.out.println("Difference of two integers: " + (a - b));
    }
    public void call() {
        addition(10, 5);
        subtraction(10, 5);
    }
    public static void main(String[] args) {
        Sub s = new Sub();
        s.call();
    }
}


