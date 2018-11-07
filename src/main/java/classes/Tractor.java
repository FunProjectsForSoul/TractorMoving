package classes;

import interfaces.Machine;

public class Tractor extends Form implements Machine {
    private Driver driver;

    public Tractor(double side, double x, double y) {
        super(side, x, y);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(int act, double side, int count) {
        driver = new Driver(act, side, count);
    }

    @Override
    public Coordinates[] getCoords() {
        return super.getCoords();
    }

    @Override
    public void setCoords(Coordinates[] temp) {
        super.setCoords(temp);
    }

    public boolean checkMove(Coordinates[] tCoords, Coordinates[] mCoord) {

        for (Coordinates i: tCoords){
            if ((i.getX() > mCoord[0].getX()) && (i.getX() < mCoord[3].getX()) &&
                (i.getY() > mCoord[0].getY()) && (i.getY() < mCoord[1].getY())) {
                return false;
            }
        }
        return true;
    }
}

