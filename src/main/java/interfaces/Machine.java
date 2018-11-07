package interfaces;

import classes.Driver;
import classes.Coordinates;

public interface Machine {
    boolean checkMove(Coordinates[] tCoord, Coordinates[] mCoord);
    Coordinates[] getCoords();
    void setCoords(Coordinates[] temp);
    void setDriver(int act, double side, int count);
    Driver getDriver();
}
