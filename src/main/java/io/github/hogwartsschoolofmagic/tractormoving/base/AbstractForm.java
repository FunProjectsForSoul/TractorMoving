package io.github.hogwartsschoolofmagic.tractormoving.base;

import io.github.hogwartsschoolofmagic.tractormoving.record.Coordinates;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * An abstract form for application objects.
 *
 * @author Vladislav [SmithyVL] Kuznetsov.
 */
@Getter
@Setter
@ToString
public abstract class AbstractForm {

  /**
   * The size of the side of the object.
   */
  private final double side;

  /**
   * The coordinates of the corners of the object.
   */
  private List<Coordinates> coordinates;

  /**
   * Constructor for initializing parameters.
   *
   * @param side side size.
   * @param x    coordinates of the lower left corner: x.
   * @param y    coordinates of the lower left corner: y.
   */
  protected AbstractForm(double side, double x, double y) {
    this.side = side;
    coordinates = new ArrayList<>();
    coordinates.add(new Coordinates(x, y));
    coordinates.add(new Coordinates(x, y + side));
    coordinates.add(new Coordinates(x + side, y + side));
    coordinates.add(new Coordinates(x + side, y));
  }
}