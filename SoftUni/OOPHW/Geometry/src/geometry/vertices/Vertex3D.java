package geometry.vertices;

public class Vertex3D extends Vertex {

    private double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.setZ(z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double getDistanceTo(Vertex other) {
        
        double z = 0;
        if (other instanceof Vertex3D) {
           z = ((Vertex3D)other).getZ();
        }
        
        double distance = (this.getX() + other.getX()) * (this.getX() + other.getX())
                + (this.getY() + other.getY()) * (this.getY() + other.getY())
                + (this.getZ() + z) * (this.getZ() + z);

        return distance;
    }
}
