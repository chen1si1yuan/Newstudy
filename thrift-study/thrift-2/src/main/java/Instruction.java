/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum Instruction implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  TURN_ON(1),
  TURN_OFF(2),
  MODE_MUTE(3),
  MODE_AUTO(4),
  MODE_SLEEP(5),
  MODE_HIGH(6),
  MODE_MIDDLE(7),
  MODE_LOW(8),
  NET_IONIC_ON(9),
  NET_IONIC_OFF(10),
  CHILD_LOCK_ON(11),
  CHILD_LOCK_OFF(12),
  TURN_UP(13),
  TURN_DOWN(14),
  ASK(15),
  TURN_STOP(16),
  SET(17),
  MODE_COLD(18),
  MODE_DEWET(19),
  MODE_HOT(20),
  MODE_TOP(21),
  MODE_BOTTOM(22),
  MODE_SWING(23),
  TV_RETRIEVE(24),
  TV_VOLUME(25),
  TV_PAUSE(26),
  TV_GO_ON(27),
  TV_STOP(28),
  TV_MUTE(29),
  TV_FAST_FORWARD(30),
  TV_REWIND(31),
  TV_MENU(32),
  TV_HOMEPAGE(33),
  TV_BACK(34),
  TV_VOLUME_UP(35),
  TV_VOLUME_DOWN(36),
  TV_VOLUME_TOP(37),
  TV_VOLUME_BOTTOM(38),
  TV_VOLUME_UP_VALUE(39),
  TV_VOLUME_DOWN_VALUE(40),
  TV_VOLUME_VALUE(41),
  MODE_LIFE(42),
  MODE_READ(43),
  MODE_CINEMA(44),
  MODE_SOFT(45),
  MODE_NORMAL(46),
  MODE_SIDE(47),
  MODE_TIMING(48),
  MODE_RETURN(49),
  FRONT(50),
  BACK(51),
  WIND_AUTO(52),
  SPORT_FRONT(53),
  SPORT_BACK(54),
  SPORT_LEFT(55),
  SPORT_RIGHT(56),
  SPORT_CLOCKWISE(57),
  SPORT_ANTICLOCKWISE(58),
  SPORT_DANCE(59),
  SPORT_STOP(60),
  VOLUME_UP(100),
  VOLUME_DOWN(101),
  VOLUME_SET(102),
  PLAY_PAUSE(110),
  PLAY_RESUME(111),
  PLAY_PRE(112),
  PLAY_NEXT(113),
  PLAY_STOP(114),
  PLAY_QUIT(115),
  PLAY_FF(116),
  PLAY_REW(117),
  PLAY_SHARE(118),
  PLAY_FAVOR(119),
  PLAY_SINGLE_CYCLE(120),
  PLAY_ORDER_PLAY(121),
  FAVOR(200),
  CHARGE(300),
  DEV_OPEN(1000),
  DEV_CLOSE(1001),
  DEV_PAUSE(1002),
  DEV_CANCLE(1003),
  DEV_STOP(1004),
  DEV_MODE_OPEN(1005),
  DEV_MODE_CLOSE(1006),
  DEV_MODE_SET(1007),
  DEV_PROP_UP(1008),
  DEV_PROP_DOWN(1009),
  DEV_PROP_SET(1010),
  DEV_PROP_UP_VALUE(1011),
  DEV_PROP_DOWN_VALUE(1012),
  DEV_STATUS(1013);

  private final int value;

  private Instruction(int value) {
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
  public static Instruction findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return TURN_ON;
      case 2:
        return TURN_OFF;
      case 3:
        return MODE_MUTE;
      case 4:
        return MODE_AUTO;
      case 5:
        return MODE_SLEEP;
      case 6:
        return MODE_HIGH;
      case 7:
        return MODE_MIDDLE;
      case 8:
        return MODE_LOW;
      case 9:
        return NET_IONIC_ON;
      case 10:
        return NET_IONIC_OFF;
      case 11:
        return CHILD_LOCK_ON;
      case 12:
        return CHILD_LOCK_OFF;
      case 13:
        return TURN_UP;
      case 14:
        return TURN_DOWN;
      case 15:
        return ASK;
      case 16:
        return TURN_STOP;
      case 17:
        return SET;
      case 18:
        return MODE_COLD;
      case 19:
        return MODE_DEWET;
      case 20:
        return MODE_HOT;
      case 21:
        return MODE_TOP;
      case 22:
        return MODE_BOTTOM;
      case 23:
        return MODE_SWING;
      case 24:
        return TV_RETRIEVE;
      case 25:
        return TV_VOLUME;
      case 26:
        return TV_PAUSE;
      case 27:
        return TV_GO_ON;
      case 28:
        return TV_STOP;
      case 29:
        return TV_MUTE;
      case 30:
        return TV_FAST_FORWARD;
      case 31:
        return TV_REWIND;
      case 32:
        return TV_MENU;
      case 33:
        return TV_HOMEPAGE;
      case 34:
        return TV_BACK;
      case 35:
        return TV_VOLUME_UP;
      case 36:
        return TV_VOLUME_DOWN;
      case 37:
        return TV_VOLUME_TOP;
      case 38:
        return TV_VOLUME_BOTTOM;
      case 39:
        return TV_VOLUME_UP_VALUE;
      case 40:
        return TV_VOLUME_DOWN_VALUE;
      case 41:
        return TV_VOLUME_VALUE;
      case 42:
        return MODE_LIFE;
      case 43:
        return MODE_READ;
      case 44:
        return MODE_CINEMA;
      case 45:
        return MODE_SOFT;
      case 46:
        return MODE_NORMAL;
      case 47:
        return MODE_SIDE;
      case 48:
        return MODE_TIMING;
      case 49:
        return MODE_RETURN;
      case 50:
        return FRONT;
      case 51:
        return BACK;
      case 52:
        return WIND_AUTO;
      case 53:
        return SPORT_FRONT;
      case 54:
        return SPORT_BACK;
      case 55:
        return SPORT_LEFT;
      case 56:
        return SPORT_RIGHT;
      case 57:
        return SPORT_CLOCKWISE;
      case 58:
        return SPORT_ANTICLOCKWISE;
      case 59:
        return SPORT_DANCE;
      case 60:
        return SPORT_STOP;
      case 100:
        return VOLUME_UP;
      case 101:
        return VOLUME_DOWN;
      case 102:
        return VOLUME_SET;
      case 110:
        return PLAY_PAUSE;
      case 111:
        return PLAY_RESUME;
      case 112:
        return PLAY_PRE;
      case 113:
        return PLAY_NEXT;
      case 114:
        return PLAY_STOP;
      case 115:
        return PLAY_QUIT;
      case 116:
        return PLAY_FF;
      case 117:
        return PLAY_REW;
      case 118:
        return PLAY_SHARE;
      case 119:
        return PLAY_FAVOR;
      case 120:
        return PLAY_SINGLE_CYCLE;
      case 121:
        return PLAY_ORDER_PLAY;
      case 200:
        return FAVOR;
      case 300:
        return CHARGE;
      case 1000:
        return DEV_OPEN;
      case 1001:
        return DEV_CLOSE;
      case 1002:
        return DEV_PAUSE;
      case 1003:
        return DEV_CANCLE;
      case 1004:
        return DEV_STOP;
      case 1005:
        return DEV_MODE_OPEN;
      case 1006:
        return DEV_MODE_CLOSE;
      case 1007:
        return DEV_MODE_SET;
      case 1008:
        return DEV_PROP_UP;
      case 1009:
        return DEV_PROP_DOWN;
      case 1010:
        return DEV_PROP_SET;
      case 1011:
        return DEV_PROP_UP_VALUE;
      case 1012:
        return DEV_PROP_DOWN_VALUE;
      case 1013:
        return DEV_STATUS;
      default:
        return null;
    }
  }
}
