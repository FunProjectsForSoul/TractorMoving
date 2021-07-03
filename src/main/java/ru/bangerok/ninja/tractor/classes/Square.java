package ru.bangerok.ninja.tractor.classes;

import ru.bangerok.ninja.tractor.interfaces.ConditionSquare;

public class Square extends Form implements ConditionSquare {

    public Square(double side, double x, double y) {
        super(side, x, y);
    }

    @Override
    public double getSide() {
        return super.getSide();
    }
}
