package ru.bangerok.fun.tractor.interfaces;

import ru.bangerok.fun.tractor.classes.Driver;
import ru.bangerok.fun.tractor.classes.Coordinates;

public interface Machine {
    boolean checkMove(Coordinates[] tCoord, Coordinates[] mCoord);
    Coordinates[] getCoords();
    void setCoords(Coordinates[] temp);
    void setDriver(int act, double side, int count);
    Driver getDriver();
}
