/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum WeatherType implements org.apache.thrift.TEnum {
  SUNNY(1),
  CLOUDY(2),
  SUNNYANDCLOUDY(3),
  MOSTLYCLOUDY(4),
  OVERCAST(5),
  SHOWER(6),
  THUNDERSHOWER(7),
  THUNDERSHOWERWITHHAIL(8),
  LIGHTRAIN(9),
  MODERATERAIN(10),
  HEAVYRAIN(11),
  RAINSTROM(12),
  HEAVYRAINSTROM(13),
  EXTRAORDINARYRAINSTROM(14),
  FREEZINGRAIN(15),
  RAINWITHSNOW(16),
  SNOWSHOWER(17),
  LIGHTSNOW(18),
  MODERATESNOW(19),
  HEAVYSNOW(20),
  HEAVYSNOWFALL(21),
  FLOATINGDUST(22),
  SANDBLOWING(23),
  SANDSTROM(24),
  HEAVYSANDSTROM(25),
  FOG(26),
  HAZE(27),
  WIND(28),
  HIGHWIND(29),
  HURRICANE(30),
  TROPICALSTROM(31),
  TORNADO(32);

  private final int value;

  private WeatherType(int value) {
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
  public static WeatherType findByValue(int value) { 
    switch (value) {
      case 1:
        return SUNNY;
      case 2:
        return CLOUDY;
      case 3:
        return SUNNYANDCLOUDY;
      case 4:
        return MOSTLYCLOUDY;
      case 5:
        return OVERCAST;
      case 6:
        return SHOWER;
      case 7:
        return THUNDERSHOWER;
      case 8:
        return THUNDERSHOWERWITHHAIL;
      case 9:
        return LIGHTRAIN;
      case 10:
        return MODERATERAIN;
      case 11:
        return HEAVYRAIN;
      case 12:
        return RAINSTROM;
      case 13:
        return HEAVYRAINSTROM;
      case 14:
        return EXTRAORDINARYRAINSTROM;
      case 15:
        return FREEZINGRAIN;
      case 16:
        return RAINWITHSNOW;
      case 17:
        return SNOWSHOWER;
      case 18:
        return LIGHTSNOW;
      case 19:
        return MODERATESNOW;
      case 20:
        return HEAVYSNOW;
      case 21:
        return HEAVYSNOWFALL;
      case 22:
        return FLOATINGDUST;
      case 23:
        return SANDBLOWING;
      case 24:
        return SANDSTROM;
      case 25:
        return HEAVYSANDSTROM;
      case 26:
        return FOG;
      case 27:
        return HAZE;
      case 28:
        return WIND;
      case 29:
        return HIGHWIND;
      case 30:
        return HURRICANE;
      case 31:
        return TROPICALSTROM;
      case 32:
        return TORNADO;
      default:
        return null;
    }
  }
}
