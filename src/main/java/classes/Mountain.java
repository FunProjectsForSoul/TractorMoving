package classes;

import interfaces.ConditionMountain;

public class Mountain extends Form implements ConditionMountain {

    public Mountain(double side, double x, double y) {
        super(side, x, y);
    }

    @Override
    public Coordinates[] getCoords() {
        return super.getCoords();
    }
}
