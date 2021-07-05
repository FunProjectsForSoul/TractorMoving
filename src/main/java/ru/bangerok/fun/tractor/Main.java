package ru.bangerok.fun.tractor;
//Формулировка задачи:
/*=======================================================================================================
    Есть квадратное поле n x n клеток. По центру этого поля расположена квадратная гора m x m клеток,
А в левом нижнем углу стоит квадратный трактор размером k x k клеток.
    Написать программу, которая бы позволяла:
      1) Ввести размеры поля - n, горы - m и трактора - k с клавиатуры.
      2) Передвинуть трактор на произвольное число клеток вверх, вниз, влево или вправо.
         ! Если передвинуть трактор невозможно (например, если траектория упирается в гору),
         ! то оставить трактор на месте. Поле считать замкнутым в кольцо, то есть при выезде
         ! трактора за левую границу поля, он появляется на правой и так далее.
      3) Вывести текущие координаты левого нижнего угла трактора.
========================================================================================================*/

import ru.bangerok.fun.tractor.classes.Mountain;
import ru.bangerok.fun.tractor.classes.Square;
import ru.bangerok.fun.tractor.classes.Tractor;
import ru.bangerok.fun.tractor.interfaces.ConditionMountain;
import ru.bangerok.fun.tractor.interfaces.ConditionSquare;
import ru.bangerok.fun.tractor.interfaces.Machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while(i != 1) {
            System.out.print("Введите размеры поля, горы и трактора -  n, m, k:");

            List <Double> dimension = new ArrayList <Double>();

            for (int j = 0; j < 3; j++) {
                if (sc.hasNextDouble()) {
                    dimension.add(sc.nextDouble());
                } else {
                    System.out.print("Введено не числовое значение... Перезапуск\n");
                    break;
                }
            }

            double squareDimension   = dimension.get(0),
                   mountainDimension = dimension.get(1),
                   tractorDimension  = dimension.get(2);

            if (squareDimension <= 0) {
                System.out.print("Размеры поля не могут быть равными 0... Перезапуск\n");
                continue;
            }

            if (mountainDimension >= squareDimension) {
                System.out.print("Гора не может быть больше или равной размеру поля... Перезапуск\n");
                continue;
            }

            if (tractorDimension + mountainDimension > squareDimension) {
                System.out.print("С такими размерами трактор нельзя разместить... Перезапуск\n");
                continue;
            }

            ConditionSquare square     = new Square(squareDimension, 0, 0);
            ConditionMountain mountain = new Mountain(mountainDimension,
                                                     (squareDimension - mountainDimension) / 2,
                                                     (squareDimension - mountainDimension) / 2);
            Machine tractor            = new Tractor(tractorDimension, 0, 0);

            System.out.println();

            System.out.print("Координаты и размеры поля: "     + square.toString()   + "\n" +
                             "Координаты и размеры горы: "     + mountain.toString() + "\n" +
                             "Координаты и размеры трактора: " + tractor.toString()  + "\n");

            System.out.println("==============================");
            int act = -1;
            while (act != 0) {
                System.out.print("Выбор действия:\n"                  +
                                 "1 - Перемещение трактора вверх. \n" +
                                 "2 - Перемещение трактора вниз.  \n" +
                                 "3 - Перемещение трактора влево. \n" +
                                 "4 - Перемещение трактора вправо.\n" +
                                 "0 - выход.\n");

                act = sc.nextInt();
                if (act == 0) {
                    continue;
                }

                System.out.print("==============================\n");
                System.out.print("Длина пути трактора в клетках:");

                int trackLength = rand.nextInt((int) square.getSide());
                System.out.println(trackLength);

                System.out.print("==============================\n");

                tractor.setDriver(act, square.getSide(), trackLength);
                tractor.getDriver().move(mountain.getCoords(), tractor);

                System.out.print("Перемещение закончено.\n");
            }

            i++;
        }
    }
}
