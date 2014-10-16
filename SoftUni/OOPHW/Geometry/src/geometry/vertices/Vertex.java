package geometry.vertices;

import geometry.interfaces.DistanceMeasurable;

public abstract class Vertex implements DistanceMeasurable {

    private double x;
    private double y;

    protected Vertex(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract double getDistanceTo(Vertex other);

    @Override
    public String toString() {
        return String.format("{%.2f %.2f}", this.getX(), this.getY());
    }
}
