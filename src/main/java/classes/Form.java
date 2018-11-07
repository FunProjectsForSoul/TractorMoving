package classes;

import java.util.Arrays;

abstract class Form {

    private final double side;
    private Coordinates[] coords;

    Form(double side, double x, double y) {
        this.side = side;
        coords = new Coordinates[4];
        coords[0] = new Coordinates(x, y);
        coords[1] = new Coordinates(x, y + side);
        coords[2] = new Coordinates(x + side, y + side);
        coords[3] = new Coordinates(x + side, y);
    }

    Coordinates[] getCoords() {
        return coords;
    }

    void setCoords(Coordinates[] temp) {
        for(int i = 0; i < 4; i++){
            coords[i] = new Coordinates(temp[i].getX(), temp[i].getY());
        }
    }

    double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "side = " + side + ", coords = " + Arrays.toString(coords);
    }
}