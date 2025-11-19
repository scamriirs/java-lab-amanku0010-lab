abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape t = new Triangle(10, 5);
        Shape r = new Rectangle(6, 4);
        Shape c = new Circle(3);

        System.out.println("Area of Triangle: " + t.area());
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Circle: " + c.area());
    }
}
