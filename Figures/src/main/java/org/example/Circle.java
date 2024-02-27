package org.example;

class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
        this.radius = radius;
    }

    @Override
    String getType() {
        return "Circle";
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    double getRadius() {
        return radius;
    }

    double getDiameter() {
        return 2 * radius;
    }

    @Override
    String getDetails() {
        return String.format("Radius: %.2f, Diameter: %.2f", getRadius(), getDiameter());
    }

    @Override
    public void print() {
        System.out.println("Printing Circle: ⭕");
        System.out.println("   *****");
        System.out.println(" *       *");
        System.out.println("*         *");
        System.out.println("*         *");
        System.out.println(" *       *");
        System.out.println("   *****");
    }
}