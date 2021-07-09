package ru.bangerok.fun.tractor.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Directions for driving the tractor.
 *
 * @author Vladislav [Bangerok] Kuznetsov.
 */
@Getter
@RequiredArgsConstructor
public enum Direction {

  UP_MOVE("вверх на "),
  DOWN_MOVE("вниз на "),
  LEFT_MOVE("влево на "),
  RIGHT_MOVE("вправо на ");

  private final String stringValue;

  /**
   * Getting a string value of a direction by its ordinal.
   *
   * @param ordinal index in enum.
   * @return string value by ordinal.
   */
  public static String getStringValueByOrdinal(int ordinal) {
    return Direction.values()[ordinal].getStringValue();
  }

  /**
   * Getting a direction by its ordinal.
   *
   * @param ordinal index in enum.
   * @return value by ordinal.
   */
  public static Direction getValueByOrdinal(int ordinal) {
    return Direction.values()[ordinal];
  }
}