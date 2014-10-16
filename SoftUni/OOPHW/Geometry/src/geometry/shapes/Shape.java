package geometry.shapes;

import geometry.vertices.Vertex;
import java.util.Arrays;

public abstract class Shape {
    private Vertex[] vertices;

    public Vertex[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertex[] vertices) {
        if(null == vertices){
            throw new NullPointerException("Vertices can not be null!");
        }
        
        this.vertices = vertices;
    }
    
    @Override
    public String toString(){
        return String.format("Shape type: %s, Vertices[]", this.getClass().getName() );
    }
}
