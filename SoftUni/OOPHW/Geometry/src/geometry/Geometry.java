package geometry;

import geometry.shapes.Circle;
import geometry.shapes.Cuboid;
import geometry.shapes.Rectangle;
import geometry.shapes.Shape;
import geometry.shapes.Sphere;
import geometry.shapes.SquarePyramid;
import geometry.shapes.Triangle;
import geometry.vertices.Vertex2D;
import geometry.vertices.Vertex3D;

public class Geometry {

    public static void main(String[] args) {
        // Triangle test
        Triangle triangle1 = new Triangle(new Vertex2D[]{new Vertex2D(-1, 3), new Vertex2D(2, 3), new Vertex2D(2, 6)});
        double triangle1Perimeter = triangle1.getPerimeter();
        System.out.println(String.format("Triangle perimeter: %f", triangle1Perimeter));

        double triangle1Area = triangle1.getArea();
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
        Cuboid cub = new Cuboid(new Vertex3D(2, 3.4, 4), 5.2, 8, 9);
        System.out.println(String.format("Cuboid area: %f", cub.getArea()));
        System.out.println(String.format("Cuboid volume: %f", cub.getVolume()));

        // Sphere test
        Sphere sphere = new Sphere(new Vertex3D(2, 3.4, 4), 5.2);
        System.out.println(String.format("Sphere area: %f", sphere.getArea()));
        System.out.println(String.format("Sphere volume: %f", sphere.getVolume()));

        System.out.println(triangle1);
    }
}
