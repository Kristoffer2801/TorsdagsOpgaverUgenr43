import java.util.ArrayList;

public class ShapeBuilder {
    private ArrayList<Shape> shapes;

    public ShapeBuilder(){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s){
        shapes.add(s);
    }

    public void printAreas(){
        for (Shape shape : shapes){
            System.out.println("Areal: " + shape.getArea());
        }
    }
}
