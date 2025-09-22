interface Vehicle {
    void move();
}

class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car move");
    }
}

class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike move");
    }
}

public class Store {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();

        Vehicle bike = new Bike();
        bike.move();
    }
}
