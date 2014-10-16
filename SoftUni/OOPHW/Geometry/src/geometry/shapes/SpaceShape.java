package geometry.shapes;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.VolumeMeasurable;
import geometry.vertices.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D[] vertices) {
        this.setVertices(vertices);
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract double getVolume();

    @Override
    public String toString() {
        return super.toString() + String.format("Volume: %.2f, Area: %.2f", this.getVolume(), this.getArea());
    }
}
