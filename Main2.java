// Custom Exception
class SpeedLimitException extends Exception {
    public SpeedLimitException(String message) {
        super(message);
    }
}

// Base Class: Vehicle
class Vehicle {
    int maxSpeed;

    Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle max speed: " + maxSpeed + " km/h");
    }
}

// Derived Class: Bike
class Bike extends Vehicle {
    
    Bike(int maxSpeed, int bikeSpeed) throws SpeedLimitException {
        super(maxSpeed);

        if (bikeSpeed > maxSpeed) {
            throw new SpeedLimitException(
                "Bike speed " + bikeSpeed + " exceeds max speed " + maxSpeed
            );
        }

        System.out.println("Bike speed: " + bikeSpeed + " km/h");
    }
}

// Main Class
public class Main2 {
    public static void main(String[] args) {
        try {
            Bike b1 = new Bike(100, 80);  // valid
            System.out.println("Bike object created successfully.\n");

            Bike b2 = new Bike(100, 120); // exceeds limit -> exception
        }
        catch (SpeedLimitException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
