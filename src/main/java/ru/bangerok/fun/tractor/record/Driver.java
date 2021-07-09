package ru.bangerok.fun.tractor.record;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import ru.bangerok.fun.tractor.base.AbstractMachine;
import ru.bangerok.fun.tractor.enumeration.Direction;

/**
 * Tractor driver.
 *
 * @author Vladislav [Bangerok] Kuznetsov.
 */
@Slf4j
public record Driver(Direction act, double side, int trackLength) {

  private static final String movePrefix = "Перемещение трактора ";
  private static final String movePostfix = " единиц...";

  /**
   * Driving the tractor by the driver.
   *
   * @param mountainCoords coordinates of the mountain.
   * @param tractor        driver driven tractor.
   */
  public void move(List<Coordinates> mountainCoords, AbstractMachine tractor) {
    List<Coordinates> tractorCoordinates = tractor.getCoordinates();
    for (int j = 0; j < trackLength; j++) {
      if (!tractor.checkMove(tractorCoordinates, mountainCoords)) {
        log.info("Невозможно переместить трактор, мешает гора. ");
        break;
      }

      for (int i = 0; i < 4; i++) {
        if (j == 0 && i == 0) {
          log.info(movePrefix + Direction.getStringValueByOrdinal(i) + trackLength + movePostfix);
        }

        moving(tractorCoordinates, i);
      }

      tractor.setCoordinates(tractorCoordinates);
    }

    log.info("Координаты левого нижнего угла - " + tractorCoordinates.get(0).toString());
  }

  private void moving(List<Coordinates> tractorCoordinates, int i) {
    tractorCoordinates.set(i,
        switch (act) {
          case UP_MOVE -> new Coordinates(
              tractorCoordinates.get(i).x(),
              (tractorCoordinates.get(i).y() + 1 > side) ? 0 : tractorCoordinates.get(i).y() + 1
          );
          case DOWN_MOVE -> new Coordinates(
              tractorCoordinates.get(i).x(),
              (tractorCoordinates.get(i).y() - 1 < 0) ? side : tractorCoordinates.get(i).y() - 1
          );
          case LEFT_MOVE -> new Coordinates(
              (tractorCoordinates.get(i).x() - 1 < 0) ? side : tractorCoordinates.get(i).x() - 1,
              (tractorCoordinates.get(i).y())
          );
          case RIGHT_MOVE -> new Coordinates(
              (tractorCoordinates.get(i).x() + 1 > side) ? 0 : tractorCoordinates.get(i).x() + 1,
              (tractorCoordinates.get(i).y())
          );
        });
  }
}