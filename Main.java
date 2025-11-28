// Custom Exception Cla
import java.util.*;
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

// Father Class
class Father {
    int fatherAge;

    // Father constructor
    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative!");
        }
        fatherAge = age;
        System.out.println("Father age set to: " + fatherAge);
    }
}

// Son Class
class Son extends Father {
    int sonAge;

    // Son constructor
    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); // Call Father constructor first

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age must be less than Father's age!");
        }
        this.sonAge = sonAge;
        System.out.println("Son age set to: " + sonAge);
    }
}


// Main Class to Test
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try {System.out.println("enter father age");      
        int f=sc.nextInt();
        System.out.println("enter son age"); 
        int s=sc.nextInt();
           Son sge=new Son(f,s);
            System.out.println("\nObject created successfully!");

            // Test invalid case:
            Son s2 = new Son(40, 50);  // should throw exception
        }
        catch (WrongAge e) {
            System.out.println("\nException caught: " + e.getMessage());
        }
    }
}
