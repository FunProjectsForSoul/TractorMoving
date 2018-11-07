package classes;

public class Coordinates {
    private double x, y;

    Coordinates() {
        this.x = -1;
        this.y = -1;
    }

    Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void clone(Coordinates newCoord){
        this.x = newCoord.getX();
        this.y = newCoord.getY();
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y +
                ')';
    }
}
