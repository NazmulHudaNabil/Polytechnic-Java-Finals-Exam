interface Vehicle {

    interface Engine {
        void start();
    }
}

class Car implements Vehicle.Engine {
    public void start() {
        System.out.println("Car engine started");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}
