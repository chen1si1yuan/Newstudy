/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SkillCmd implements org.apache.thrift.TEnum {
  Open(0),
  Close(1),
  Intent(2);

  private final int value;

  private SkillCmd(int value) {
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
  public static SkillCmd findByValue(int value) { 
    switch (value) {
      case 0:
        return Open;
      case 1:
        return Close;
      case 2:
        return Intent;
      default:
        return null;
    }
  }
}
