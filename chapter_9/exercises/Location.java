public class Location {
    public int row;
    public int col;
    public double maxValue;

    public Location() {
        this.row = 0;
        this.col = 0;
        this.maxValue = 0.0;
    }

    public Location(int row, int col, double maxValue) {
        this.row = row;
        this.col = col;
        this.maxValue = maxValue;
    }

    public String toString() {
        return "The location of the largest element is " + this.maxValue + 
            " at (" + this.row + ", " + this.col + ")";
    }
}