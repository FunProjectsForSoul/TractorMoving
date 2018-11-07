package classes;

import interfaces.Machine;

public class Driver {
    private int    act,
                   trackLength;
    private double side;


    Driver(int act, double side, int trackLength){
        this.act   = act;
        this.side  = side;
        this.trackLength = trackLength;
    }

    private Coordinates[] initTempCoords(Coordinates[] tCoords){
        Coordinates[] temp    = new Coordinates[4];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new Coordinates();
            temp[i].clone(tCoords[i]);
        }

        return temp;
    }

    public void move(Coordinates[] mCoords, Machine tractor){
        Coordinates[] tCoords = tractor.getCoords();
        Coordinates[] temp    = initTempCoords(tCoords);

        for(int j = 0; j < trackLength; j++){
            if(!tractor.checkMove(temp, mCoords)){
                System.out.println("Невозможно переместить трактор, мешает гора. ");
                break;
            }

            switch(act){
                case Constants.UP_MOVE:{
                    for(int i = 0; i < 4; i++) {
                        if ( j == 0 && i == 0) {
                            System.out.println("Перемещение трактора вверх на " +
                                    trackLength + " единиц...");
                        }
                        temp[i] = new Coordinates(tCoords[i].getX(),
                                           (tCoords[i].getY() + 1 > side) ? 0 : tCoords[i].getY() + 1);
                    }
                    break;
                }
                case Constants.DOWN_MOVE:{
                    for(int i = 0; i < 4; i++) {
                        if ( j == 0 && i == 0) {
                            System.out.println("Перемещение трактора вниз на " +
                                    trackLength +
                                               " единиц...");
                        }
                        temp[i] = new Coordinates(tCoords[i].getX(),
                                           (tCoords[i].getY() - 1 < 0) ? side : tCoords[i].getY() - 1);
                    }
                    break;
                }
                case Constants.LEFT_MOVE:{
                    for(int i = 0; i < 4; i++) {
                        if ( j == 0 && i == 0) {
                            System.out.println("Перемещение трактора влево на " +
                                    trackLength +
                                               " единиц...");
                        }
                        temp[i] = new Coordinates((tCoords[i].getX() - 1 < 0) ? side : tCoords[i].getX() - 1,
                                            (tCoords[i].getY()));
                    }
                    break;
                }
                case Constants.RIGHT_MOVE:{
                    for(int i = 0; i < 4; i++) {
                        if ( j == 0 && i == 0) {
                            System.out.println("Перемещение трактора вправо на " +
                                    trackLength +
                                               " единиц.");
                        }
                        temp[i] = new Coordinates((tCoords[i].getX() + 1 > side) ? 0 : tCoords[i].getX() + 1,
                                            (tCoords[i].getY()));
                    }
                    break;
                }
            }

            tractor.setCoords(temp);
        }
        System.out.println("Координаты левого нижнего угла - " + tCoords[0].toString());
    }
}
