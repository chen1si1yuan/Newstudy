/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum IotDeviceType implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  AIR_CLEANER(1),
  CURTAIN(2),
  AIR_CONDITIONER(3),
  FAN(4),
  TV_INSTRUCTION(5),
  SOCKET(6),
  AIR_BOX(7),
  LIGHT(8),
  HUMIDIFIER(9),
  WATER_HEATER(10),
  SWEEPER(11),
  SPORT_CONTROL(12),
  BUILDIN(13),
  NOTYPE(14),
  COOKER(15),
  REFRIGERATOR(16),
  WATER_CLEANER(17),
  DISH_WASHER(18),
  WASH_MACHINE(19),
  GATE_LOCK(20),
  HEATER(21),
  DEHUMIDIFIER(22),
  SCALES(23),
  SET_TOP_BOX(24),
  PRESSURE_COOKER(25),
  KETTLE(26),
  STEWPAN(27),
  OVEN(28),
  STEAM_BOX(29),
  BREAD_MACHINE(30),
  MILK_MACHINE(31),
  MICROWAVE_OVEN(32),
  HEMOPIEZOMETER(33),
  BROKEN_MACHINE(34),
  GAS_TUBINE(35),
  CLOTHES_HORSE(36),
  JUICE_MACHINE(37),
  STERILIZER(38),
  COOKING_UTENSILS(39),
  FRID_MACHINE(40),
  DRYER(41),
  SWITCH(42),
  PRINTER(43),
  PROJECTION(44),
  CAMERA(45),
  FOOT_PLATE(46),
  ROUTER(47),
  HEALTH_POT(48),
  CAKE_PAN(49),
  AIR_FRIER(50),
  SOYMILK_MAKER(51),
  JD_SCENE(52);

  private final int value;

  private IotDeviceType(int value) {
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
  public static IotDeviceType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return AIR_CLEANER;
      case 2:
        return CURTAIN;
      case 3:
        return AIR_CONDITIONER;
      case 4:
        return FAN;
      case 5:
        return TV_INSTRUCTION;
      case 6:
        return SOCKET;
      case 7:
        return AIR_BOX;
      case 8:
        return LIGHT;
      case 9:
        return HUMIDIFIER;
      case 10:
        return WATER_HEATER;
      case 11:
        return SWEEPER;
      case 12:
        return SPORT_CONTROL;
      case 13:
        return BUILDIN;
      case 14:
        return NOTYPE;
      case 15:
        return COOKER;
      case 16:
        return REFRIGERATOR;
      case 17:
        return WATER_CLEANER;
      case 18:
        return DISH_WASHER;
      case 19:
        return WASH_MACHINE;
      case 20:
        return GATE_LOCK;
      case 21:
        return HEATER;
      case 22:
        return DEHUMIDIFIER;
      case 23:
        return SCALES;
      case 24:
        return SET_TOP_BOX;
      case 25:
        return PRESSURE_COOKER;
      case 26:
        return KETTLE;
      case 27:
        return STEWPAN;
      case 28:
        return OVEN;
      case 29:
        return STEAM_BOX;
      case 30:
        return BREAD_MACHINE;
      case 31:
        return MILK_MACHINE;
      case 32:
        return MICROWAVE_OVEN;
      case 33:
        return HEMOPIEZOMETER;
      case 34:
        return BROKEN_MACHINE;
      case 35:
        return GAS_TUBINE;
      case 36:
        return CLOTHES_HORSE;
      case 37:
        return JUICE_MACHINE;
      case 38:
        return STERILIZER;
      case 39:
        return COOKING_UTENSILS;
      case 40:
        return FRID_MACHINE;
      case 41:
        return DRYER;
      case 42:
        return SWITCH;
      case 43:
        return PRINTER;
      case 44:
        return PROJECTION;
      case 45:
        return CAMERA;
      case 46:
        return FOOT_PLATE;
      case 47:
        return ROUTER;
      case 48:
        return HEALTH_POT;
      case 49:
        return CAKE_PAN;
      case 50:
        return AIR_FRIER;
      case 51:
        return SOYMILK_MAKER;
      case 52:
        return JD_SCENE;
      default:
        return null;
    }
  }
}
