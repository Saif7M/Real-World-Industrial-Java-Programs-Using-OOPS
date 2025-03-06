// File: Vehicle.java (inside src/rental/)
package rental;

abstract class Vehicle {
    abstract void start();
}

// File: Car.java
package rental;

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a push button.");
    }
}

public class RentalSystem {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
    }
}

