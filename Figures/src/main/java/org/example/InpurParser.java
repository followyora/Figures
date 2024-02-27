package org.example;

class InputParser {
    static Figure parseInput(String input) {
        String[] parts = input.split("\\s+");

        if (parts.length < 2) {
            return null;
        }

        String figureType = parts[0].toLowerCase();

        try {
            switch (figureType) {
                case "circle":
                    double radius = Double.parseDouble(parts[1]);
                    return new Circle(radius);
                case "rectangle":
                    double length = Double.parseDouble(parts[1]);
                    double width = Double.parseDouble(parts[2]);
                    return new Rectangle(length, width);
                case "triangle":
                    double side1 = Double.parseDouble(parts[1]);
                    double side2 = Double.parseDouble(parts[2]);
                    double side3 = Double.parseDouble(parts[3]);
                    return new Triangle(side1, side2, side3);
                case "hexagon":
                    double[] hexagonSides = new double[6];
                    for (int i = 0; i < 6; i++) {
                        hexagonSides[i] = Double.parseDouble(parts[i + 1]);
                    }
                    return new Hexagon(hexagonSides);
                default:
                    return null;
            }
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}