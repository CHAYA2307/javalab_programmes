// Custom Exception
class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

// Base Class: Employee
class Employee {
    int empAge;

    Employee(int age) throws WrongAgeException {
        if (age < 18) {
            throw new WrongAgeException("Employee age must be at least 18!");
        }
        empAge = age;
        System.out.println("Employee age: " + empAge);
    }
}

// Derived Class: Manager
class Manager extends Employee {
    int managerAge;

    Manager(int empAge, int managerAge) throws WrongAgeException {
        super(empAge);

        if (managerAge <= empAge) {
            throw new WrongAgeException(
                "Manager age must be greater than Employee age!"
            );
        }

        this.managerAge = managerAge;
        System.out.println("Manager age: " + managerAge);
    }
}

// Main Class
public class Main1 {
    public static void main(String[] args) {
        try {
            Manager m1 = new Manager(25, 40);  // valid
            System.out.println("Manager object created successfully.\n");

            Manager m2 = new Manager(30, 25);  // invalid
        }
        catch (WrongAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
