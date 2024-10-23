package MethodOverloadinginJavawithDifferentObjectTypes;

class Shapes {
    public void area(Circle circle) {
        double circleArea = Math.PI * circle.radius * circle.radius;
        System.out.println("Area of Circle: " + circleArea);
    }

    public void area(Rectangle rectangle) {
        int rectangleArea = rectangle.breadth * rectangle.length;
        System.out.println("Area of Rectangle: " + rectangleArea);
    }

    public void area(Square square) {
        int squareArea = square.side * square.side;
        System.out.println("Area of Square: " + squareArea);
    }
}
