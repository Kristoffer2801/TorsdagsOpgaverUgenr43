public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    @Override
    public double getArea(){
        return sideLength * sideLength;
    }
}
