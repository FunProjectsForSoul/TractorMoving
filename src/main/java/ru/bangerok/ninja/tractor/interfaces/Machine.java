package ru.bangerok.ninja.tractor.interfaces;

import ru.bangerok.ninja.tractor.classes.Driver;
import ru.bangerok.ninja.tractor.classes.Coordinates;

public interface Machine {
    boolean checkMove(Coordinates[] tCoord, Coordinates[] mCoord);
    Coordinates[] getCoords();
    void setCoords(Coordinates[] temp);
    void setDriver(int act, double side, int count);
    Driver getDriver();
}
