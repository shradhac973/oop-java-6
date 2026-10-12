package lab_sheet_6.Q02;

class Vehicle {
    void drive() {
        System.out.println("The vehicle is being driven.");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class CarMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();
    }
}