// Copy Constructor example in Java

class Rectangle {
    int length;
    int width;

    // Parameterized constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Copy constructor
    Rectangle(Rectangle obj) {
        length = obj.length;
        width = obj.width;
    }

    int area() {
        return length * width;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        Rectangle rect2 = new Rectangle(rect1); // Using copy constructor
        System.out.println("Area of rect1: " + rect1.area());
        System.out.println("Area of rect2 (copied from rect1): " + rect2.area());
    }
}