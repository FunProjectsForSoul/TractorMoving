package ru.bangerok.fun.tractor.classes;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import ru.bangerok.fun.tractor.absctract.AbstractMachine;
import ru.bangerok.fun.tractor.record.Coordinates;
import ru.bangerok.fun.tractor.record.Driver;

/**
 * Tractor view.
 *
 * @author Vladislav [Bangerok] Kuznetsov.
 */
@Getter
@Setter
public class Tractor extends AbstractMachine {

  /**
   * Tractor driver.
   */
  private Driver driver;

  public Tractor(double side, double x, double y) {
    super(side, x, y);
  }

  /**
   * Checking the ability to move the tractor.
   *
   * @param tractorCoords tractor coordinates.
   * @param mountainCoords mountain coordinates.
   * @return true, if you can move, else false.
   */
  public boolean checkMove(List<Coordinates> tractorCoords, List<Coordinates> mountainCoords) {
    return tractorCoords.stream()
        .noneMatch(i -> (i.x() > mountainCoords.get(0).x())
            && (i.x() < mountainCoords.get(3).x())
            && (i.y() > mountainCoords.get(0).y())
            && (i.y() < mountainCoords.get(1).y())
        );
  }
}