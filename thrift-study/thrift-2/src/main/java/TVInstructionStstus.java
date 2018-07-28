/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TVInstructionStstus implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  TURN_ON(1),
  TURN_DOWN(2),
  RETRIEVE(3),
  VOLUME(4),
  PAUSE(5),
  GO_ON(6),
  STOP(7);

  private final int value;

  private TVInstructionStstus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TVInstructionStstus findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return TURN_ON;
      case 2:
        return TURN_DOWN;
      case 3:
        return RETRIEVE;
      case 4:
        return VOLUME;
      case 5:
        return PAUSE;
      case 6:
        return GO_ON;
      case 7:
        return STOP;
      default:
        return null;
    }
  }
}