// Overloading example with two add methods

public class Overloading {
public int add(int a, int b) {
    return a + b;
}
public int add(int x, int y, int z) {
    return x + y + z;
}
public static void main(String[] args) {
    Overloading obj = new Overloading();
    System.out.println("Sum of 2 numbers: " + obj.add(5, 10));
    System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15));
}
}
