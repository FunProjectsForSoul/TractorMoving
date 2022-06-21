package io.github.hogwartsschoolofmagic.tractormoving;

import io.github.hogwartsschoolofmagic.tractormoving.classes.Mountain;
import io.github.hogwartsschoolofmagic.tractormoving.classes.Square;
import io.github.hogwartsschoolofmagic.tractormoving.classes.Tractor;
import io.github.hogwartsschoolofmagic.tractormoving.enumeration.Direction;
import io.github.hogwartsschoolofmagic.tractormoving.record.Driver;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;

/**
 * Launching the application for moving the tractor.
 *
 * @author Vladislav [SmithyVL] Kuznetsov.
 */
@Slf4j
public class TractorApplication {

  /**
   * Launching the application.
   *
   * @param args arguments.
   */
  public static void main(String[] args) {
    run();
  }

  /**
   * Running and setting parameters and driving the tractor.
   */
  private static void run() {
    var rand = new SecureRandom();
    var sc = new Scanner(System.in);

    int i = 0;
    while (i != 1) {
      log.info("Введите размеры поля, горы и трактора -  n, m, k:");

      ArrayList<Double> dimensions = configureDimensions(sc);
      if (!dimensions.isEmpty()) {
        var squareDimension = dimensions.get(0);
        var mountainDimension = dimensions.get(1);
        var tractorDimension = dimensions.get(2);

        if (isBadDimensions(squareDimension, mountainDimension, tractorDimension)) {
          continue;
        }

        var square = new Square(squareDimension, 0, 0);
        var mountain = new Mountain(mountainDimension,
            (squareDimension - mountainDimension) / 2,
            (squareDimension - mountainDimension) / 2);
        var tractor = new Tractor(tractorDimension, 0, 0);

        log.info("\n"
            + "Координаты и размеры поля: " + square + "\n"
            + "Координаты и размеры горы: " + mountain + "\n"
            + "Координаты и размеры трактора: " + tractor + "\n"
        );

        var act = -1;
        while (act != 0) {
          log.info("""
                
              Выбор действия:
                1 - Перемещение трактора вверх.
                2 - Перемещение трактора вниз.
                3 - Перемещение трактора влево.
                4 - Перемещение трактора вправо.
                0 - выход.
              """
          );

          act = sc.nextInt();
          if (act != 0) {
            var trackLength = rand.nextInt((int) square.getSide());
            log.info("Длина пути трактора в клетках: " + trackLength);

            tractor.setDriver(
                new Driver(Direction.getValueByOrdinal(act - 1), square.getSide(), trackLength)
            );
            tractor.getDriver().move(mountain.getCoordinates(), tractor);

            log.info("Перемещение закончено. \n");
          }
        }

        i++;
      }
    }
  }

  private static boolean isBadDimensions(double squareDimension, double mountainDimension,
                                         double tractorDimension) {
    if (squareDimension <= 0) {
      log.info("Размеры поля не могут быть равными 0... Перезапуск \n");
      return true;
    }

    if (mountainDimension >= squareDimension) {
      log.info("Гора не может быть больше или равной размеру поля... Перезапуск \n");
      return true;
    }

    if (tractorDimension + mountainDimension > squareDimension) {
      log.info("С такими размерами трактор нельзя разместить... Перезапуск \n");
      return true;
    }

    return false;
  }

  private static ArrayList<Double> configureDimensions(Scanner sc) {
    var dimensions = new ArrayList<Double>();
    for (int j = 0; j < 3; j++) {
      if (sc.hasNextDouble()) {
        dimensions.add(sc.nextDouble());
      } else {
        log.info("Введено не числовое значение... Перезапуск \n");
        return new ArrayList<>();
      }
    }

    return dimensions;
  }
}