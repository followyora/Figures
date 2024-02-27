package org.example;

abstract class Figure implements IPrintable {
    abstract String getType();

    abstract double calculateArea();

    abstract double calculatePerimeter();

    abstract String getDetails();
}