package geometry.shapes;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.PerimeterMeasurable;
import geometry.vertices.Vertex2D;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {

    public PlaneShape(Vertex2D[] vertices) {
        this.setVertices(vertices);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return super.toString() + String.format("Perimeter: %.2f, Area: %.2f", this.getPerimeter(), this.getArea());
    }
}
