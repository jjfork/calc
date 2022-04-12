package pl.julianoo;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double area() {
        return PI * pow(radius, 2);
    }

    public double circumference() {
        return 2 * PI * radius;
    }
}
