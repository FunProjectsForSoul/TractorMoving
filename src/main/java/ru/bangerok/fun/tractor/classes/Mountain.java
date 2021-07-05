package ru.bangerok.fun.tractor.classes;

import ru.bangerok.fun.tractor.interfaces.ConditionMountain;

public class Mountain extends Form implements ConditionMountain {

    public Mountain(double side, double x, double y) {
        super(side, x, y);
    }

    @Override
    public Coordinates[] getCoords() {
        return super.getCoords();
    }
}
