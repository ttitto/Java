package geometry;

import geometry.interfaces.VolumeMeasurable;
import geometry.shapes.Circle;
import geometry.shapes.Cuboid;
import geometry.shapes.PlaneShape;
import geometry.shapes.Rectangle;
import geometry.shapes.Shape;
import geometry.shapes.Sphere;
import geometry.shapes.SquarePyramid;
import geometry.shapes.Triangle;
import geometry.vertices.Vertex2D;
import geometry.vertices.Vertex3D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Geometry {

    public static void main(String[] args) {
        // Triangle test
        Triangle triangle = new Triangle(new Vertex2D[]{new Vertex2D(-1, 3), new Vertex2D(2, 3), new Vertex2D(2, 6)});
        double triangle1Perimeter = triangle.getPerimeter();
        System.out.println(String.format("Triangle perimeter: %f", triangle1Perimeter));

        double triangle1Area = triangle.getArea();
        System.out.println(String.format("Triangle area: %f", triangle1Area));

        // Rectangle test
        Rectangle rect = new Rectangle(new Vertex2D(2, 3), 12.5, 33);
        double rectPerimeter = rect.getPerimeter();
        System.out.println(String.format("Rectangle perimeter: %f", rectPerimeter));

        double rectArea = rect.getArea();
        System.out.println(String.format("Rectangle area: %f", rectArea));

        // Circle test
        Circle circle = new Circle(new Vertex2D(2, 3), 12.5);
        double circlePerimeter = circle.getPerimeter();
        System.out.println(String.format("Circle perimeter: %f", circlePerimeter));

        double circleArea = circle.getArea();
        System.out.println(String.format("Circle area: %f", circleArea));

        // Square Pyramid test
        SquarePyramid pyramid = new SquarePyramid(new Vertex3D(2, 3.4, 4), 5.2, 8);
        System.out.println(String.format("Pyramid area: %f", pyramid.getArea()));
        System.out.println(String.format("Pyramid volume: %f", pyramid.getVolume()));

        // Cuboid test
        Cuboid cub = new Cuboid(new Vertex3D(2, 3.4, 4), 0.2, 8, 9);
        System.out.println(String.format("Cuboid area: %f", cub.getArea()));
        System.out.println(String.format("Cuboid volume: %f", cub.getVolume()));

        // Sphere test
        Sphere sphere = new Sphere(new Vertex3D(2, 3.4, 4), 5.2);
        System.out.println(String.format("Sphere area: %f", sphere.getArea()));
        System.out.println(String.format("Sphere volume: %f", sphere.getVolume()));

        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(triangle);
        shapes.add(rect);
        shapes.add(cub);
        shapes.add(sphere);
        shapes.add(pyramid);
        shapes.add(circle);

        // get all VolumeMeasurables with volume bigger than 40
        System.out.println("");
        
        Stream<Object> biggerVolumeMeasurables = shapes.stream()
                .filter((sh) -> sh instanceof VolumeMeasurable)
                .filter((sh) -> ((VolumeMeasurable) sh).getVolume() > 40)
                .map(sh -> sh.toString());

        biggerVolumeMeasurables.forEach(shape -> System.out.println(shape));

        // get all PlaneShapes sorted ascending by perimeter
        System.out.println("");
        
        Stream<String> sortedPlaneShapes = shapes.stream().
                filter(plsh -> plsh instanceof PlaneShape).
                sorted((a, b) -> Double.compare(
                                ((PlaneShape) a).getPerimeter(), ((PlaneShape) b).getPerimeter())).
                map(plsh -> plsh.toString());

        sortedPlaneShapes.forEachOrdered(shape -> System.out.println(shape));
    }
}
