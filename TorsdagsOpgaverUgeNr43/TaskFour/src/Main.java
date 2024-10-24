import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.0));
        shapes.add(new Square(4.0));

        for (Shape shape : shapes) {
            System.out.println("Areal: " + shape.getArea());
        }
    }
}
