package TheoryPractice;

class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}
}

class Rectangle {
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}

class Square {
	int side;

	public Square(int side) {
		this.side = side;
	}
}

class Shapes {
	public void area(Circle circle) {
		double circleArea = Math.PI * circle.radius * circle.radius;
		System.out.println("Area of Circle: " + circleArea);
	}

	public void area(Rectangle rectangle) {
		int rectangleArea = rectangle.length * rectangle.breadth;
		System.out.println("Area of Rectangle: " + rectangleArea);
	}

	public void area(Square square) {
		int squareArea = square.side * square.side;
		System.out.println("Area of Square: " + squareArea);
	}
}

public class staticPolymorphismFunOverloadingOnClass {
	public static void main(String[] args) {
		Shapes shapes = new Shapes();

		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4, 6);
		Square square = new Square(3);

		shapes.area(circle); // Calculate and print the area of the circle
		shapes.area(rectangle); // Calculate and print the area of the rectangle
		shapes.area(square); // Calculate and print the area of the square
	}
}
