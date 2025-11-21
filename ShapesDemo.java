import java.util.*;

abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int l, int w) { a = l; b = w; }
    void printArea() { System.out.println("Area of Rectangle = " + (a * b)); }
}

class Triangle extends Shape {
    Triangle(int base, int height) { a = base; b = height; }
    void printArea() { System.out.println("Area of Triangle = " + (0.5 * a * b)); }
}

class Circle extends Shape {
    Circle(int r) { a = r; }
    void printArea() { System.out.println("Area of Circle = " + (Math.PI * a * a)); }
}

public class ShapesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length & width of Rectangle: ");
        Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());

        System.out.print("Enter base & height of Triangle: ");
        Triangle t = new Triangle(sc.nextInt(), sc.nextInt());

        System.out.print("Enter radius of Circle: ");
        Circle c = new Circle(sc.nextInt());

        System.out.println("\n--- AREA OF SHAPES ---");
        r.printArea();
        t.printArea();
        c.printArea();
    }
}
