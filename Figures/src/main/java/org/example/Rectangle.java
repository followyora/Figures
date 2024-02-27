package org.example;

class Rectangle extends Figure {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be positive numbers.");
        }
        this.length = length;
        this.width = width;
    }

    @Override
    String getType() {
        return "Rectangle";
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    double getLength() {
        return length;
    }

    double getWidth() {
        return width;
    }

    @Override
    String getDetails() {
        return String.format("Length: %.2f, Width: %.2f", getLength(), getWidth());
    }

    @Override
    public void print() {
        System.out.println("Printing Rectangle: ⧠");
        System.out.println(" _______");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|_______|");
    }
}