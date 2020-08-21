package pack;

public class Rectangle {
    private double side1, side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    public double areaCalculator (double side1, double side2){
       double area = side1 * side2;
    return area;
    }

    public double perimeterCalculator (double side1, double side2){
        double perimeter = (side1 + side2)*2;
        return perimeter;
    }
}
