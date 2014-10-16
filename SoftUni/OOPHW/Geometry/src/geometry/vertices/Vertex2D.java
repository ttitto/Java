package geometry.vertices;

public class Vertex2D extends Vertex {

    public Vertex2D(double x, double y) {
        super(x, y);
    }

    @Override
    public double getDistanceTo(Vertex other) {
        double distance = Math.sqrt((this.getX() - other.getX()) * (this.getX() - other.getX())
                + (this.getY() - other.getY()) * (this.getY() - other.getY()));
        return distance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
