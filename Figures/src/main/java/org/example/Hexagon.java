package org.example;

class Hexagon extends Figure {
    private double[] sides;

    Hexagon(double[] sides) {
        if (sides.length != 6) {
            throw new IllegalArgumentException("Hexagon must have 6 sides.");
        }
        for (double side : sides) {
            if (side <= 0) {
                throw new IllegalArgumentException("All sides must be positive numbers.");
            }
        }
        this.sides = sides;
    }

    @Override
    String getType() {
        return "Hexagon";
    }

    @Override
    double calculateArea() {
        return 0.0; // Placeholder, additional formulas needed for actual calculation
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    @Override
    String getDetails() {
        StringBuilder details = new StringBuilder("Sides: ");
        for (double side : sides) {
            details.append(String.format("%.2f, ", side));
        }
        return details.toString();
    }

    @Override
    public void print() {
        System.out.println("Printing Hexagon: ");
        System.out.println("   _______");
        System.out.println(" /         \\");
        System.out.println("/           \\");
        System.out.println("\\           /");
        System.out.println(" \\_________/");
    }
}