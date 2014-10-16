package geometry.shapes;

import geometry.interfaces.AreaMeasurable;
import geometry.interfaces.VolumeMeasurable;
import geometry.vertices.Vertex3D;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(Vertex3D[] vertices) {
        this.setVertices(vertices);
    }

    public abstract double getArea();

    public abstract double getVolume();
}
