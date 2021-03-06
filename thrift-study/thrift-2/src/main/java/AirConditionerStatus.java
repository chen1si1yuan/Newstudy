/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum AirConditionerStatus implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  TURN_ON(1),
  TURN_DOWN(2),
  MODE_AUTO(3),
  MODE_COLD(4),
  MODE_DEWET(5),
  MODE_HOT(6),
  ASK_TEMPERATURE(7),
  SET_TEMPERATURE(8),
  UP_TEMPERATURE(9),
  DOWN_TEMPERATURE(10),
  TOP_TEMPERATURE(11),
  BOTTOM_TEMPERATURE(12),
  WIND_AUTO(13),
  WIND_LOW(14),
  WIND_MID(15),
  WIND_HI(16);

  private final int value;

  private AirConditionerStatus(int value) {
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
  public static AirConditionerStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return TURN_ON;
      case 2:
        return TURN_DOWN;
      case 3:
        return MODE_AUTO;
      case 4:
        return MODE_COLD;
      case 5:
        return MODE_DEWET;
      case 6:
        return MODE_HOT;
      case 7:
        return ASK_TEMPERATURE;
      case 8:
        return SET_TEMPERATURE;
      case 9:
        return UP_TEMPERATURE;
      case 10:
        return DOWN_TEMPERATURE;
      case 11:
        return TOP_TEMPERATURE;
      case 12:
        return BOTTOM_TEMPERATURE;
      case 13:
        return WIND_AUTO;
      case 14:
        return WIND_LOW;
      case 15:
        return WIND_MID;
      case 16:
        return WIND_HI;
      default:
        return null;
    }
  }
}
