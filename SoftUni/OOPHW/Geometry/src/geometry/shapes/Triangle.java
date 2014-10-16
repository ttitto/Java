package geometry.shapes;

import geometry.vertices.Vertex2D;
import java.security.InvalidParameterException;

public class Triangle extends PlaneShape {

    public Triangle(Vertex2D[] vertices) {
        super(vertices);

        if (vertices.length != 3) {
            throw new InvalidParameterException("A triangle can hold only three Vertices!");
        }

        double a = vertices[0].getDistanceTo(vertices[1]);
        double b = vertices[1].getDistanceTo(vertices[2]);
        double c = vertices[2].getDistanceTo(vertices[0]);

        if ((a + b) <= c || (a + c) <= b || (c + b) <= a) {
            throw new IllegalArgumentException("The passed vertices can not build a valid triangle!");
        }
    }

    @Override
    public double getArea() {
        double semiperimeter = this.getPerimeter() / 2;
        double a = this.getVertices()[0].getDistanceTo(this.getVertices()[1]);
        double b = this.getVertices()[1].getDistanceTo(this.getVertices()[2]);
        double c = this.getVertices()[2].getDistanceTo(this.getVertices()[0]);

        double area = Math.sqrt(semiperimeter * (semiperimeter - a)
                * (semiperimeter - b) * (semiperimeter - c));

        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = this.getVertices()[0].getDistanceTo(this.getVertices()[1])
                + this.getVertices()[1].getDistanceTo(this.getVertices()[2])
                + this.getVertices()[2].getDistanceTo(this.getVertices()[0]);

        return perimeter;
    }
}
