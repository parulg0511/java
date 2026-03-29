package Java_Core;

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    double area() {
        return 0;
    }

    double perimeter() {
        return 0;
    }

    void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println("-------------------");
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    
}
    
    class Rectangle extends Shape {
        double width, height;

        Rectangle(String color, double width, double height) {
            super(color);
            this.width = width;
            this.height = height;
        }
        
        @Override
        double area() {
            return width * height;
        }

        @Override
        double perimeter() {
            return 2 * (width + height);
        }
        
    }
        class Triangle extends Shape {
        double base, height, side1, side2, side3;
        Triangle(String color, double base, double height,double side1, double side2, double side3)
        {
        super(color);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
           }

           @Override
           double area() {
               return 0.5 * base * height;
           }

           @Override
           double perimeter() {
               return side1 + side2 + side3;
           }
       }
        
        class Square extends Rectangle {

            Square(String color, double side) {
                super(color, side, side); // width = height = side
            }
        
        }
        

public class polymorphism_ShapeHierarchy {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];

        shapes[0] = new Circle("Red", 5);
        shapes[1] = new Rectangle("Blue", 4, 6);
        shapes[2] = new Triangle("Green", 3, 4, 3, 4, 5);
        shapes[3] = new Square("Yellow", 4);

        for (Shape s : shapes) {
            s.displayInfo(); // polymorphism happens here
        }
	}

}
	


