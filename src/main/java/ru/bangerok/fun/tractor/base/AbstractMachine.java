package ru.bangerok.fun.tractor.base;

import java.util.List;
import lombok.ToString;
import ru.bangerok.fun.tractor.record.Coordinates;

/**
 * An abstract machine for machine objects.
 *
 * @author Vladislav [Bangerok] Kuznetsov.
 */
@ToString(callSuper = true)
public abstract class AbstractMachine extends AbstractForm {

  /**
   * Constructor for initializing parameters.
   *
   * @param side side size.
   * @param x    coordinates of the lower left corner: x.
   * @param y    coordinates of the lower left corner: y.
   */
  protected AbstractMachine(double side, double x, double y) {
    super(side, x, y);
  }

  /**
   * Checking the ability to move the tractor.
   *
   * @param tractorCoords tractor coordinates.
   * @param mountainCoords mountain coordinates.
   * @return true, if you can move, else false.
   */
  public abstract boolean checkMove(List<Coordinates> tractorCoords,
                                    List<Coordinates> mountainCoords);
}