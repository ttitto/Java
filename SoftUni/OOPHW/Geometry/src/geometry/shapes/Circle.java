package geometry.shapes;

import geometry.vertices.Vertex2D;
import java.security.InvalidParameterException;

public class Circle extends PlaneShape {

    private double radius;

    public Circle(Vertex2D center, double radius) {
        super(new Vertex2D[]{center});
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new InvalidParameterException("Circle radius can not be negative!");
        }

        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * this.getRadius() * this.getRadius();
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = Math.PI * 2 * this.getRadius();
        return perimeter;
    }

}
