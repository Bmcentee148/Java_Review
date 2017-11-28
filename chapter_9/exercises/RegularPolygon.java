/**
* The RegularPolygon class represents a polygon that is both equilateral
* and equiangular, meaning all sides are the same length and all angles are
* the same size.
* @author Brian McEntee
* @version 0.0
*/
public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0.0;
    private double y = 0.0;

    public RegularPolygon() {}

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this(n, side);
        this.x = x;
        this.y = y;
    }

    public int getNumSides() {
        return n;
    }

    public void setNumSides(int n) {
        this.n = n;
    }

    public double getLengthOfSides() {
        return side;
    }

    public void setLengthOfSides(double side) {
        this.side = side;
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

    public double getPerimeter() {
        return Math.round(n * side * 100) / 100.0;
    }

    public double getArea() {
        double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        return Math.round(area * 100) / 100.0;
    }

    @Override
    public String toString() {
        return  "Perimeter: " + getPerimeter() + 
                "\nArea: " + getArea();
    }

}