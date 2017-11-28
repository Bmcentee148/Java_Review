/** 
* This class represents a simple 2 x 2 linear equation. It stores the
* coefficients and has the ability to solve the equation if a solution exists.
* @author Brian McEntee
*/
public class LinearEquation {
    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d,
        double e, double f) {

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return this.a * this.d - this.b * this.c != 0;
    }

    public double getX() {
        if (isSolvable()) {
            return (this.e * this.d - this.b * this.f) / 
                (this.a * this.d - this.b * this.c); 
        }
        else {
            return 0.0;
        }
    }

    public double getY() {
        if (isSolvable()) {
            return (this.a * this.f - this.e * this.c) /
                (this.a * this.d - this.b * this.c);
        }
        else {
            return 0.0;
        }
    }
}