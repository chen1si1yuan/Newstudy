/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2018-7-28")
public class CustomRepeat implements org.apache.thrift.TBase<CustomRepeat, CustomRepeat._Fields>, java.io.Serializable, Cloneable, Comparable<CustomRepeat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CustomRepeat");

  private static final org.apache.thrift.protocol.TField FESTIVAL_FIELD_DESC = new org.apache.thrift.protocol.TField("festival", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField FREQUENCY_FIELD_DESC = new org.apache.thrift.protocol.TField("frequency", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField EVERY_N_CYCLE_FIELD_DESC = new org.apache.thrift.protocol.TField("every_n_cycle", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField CALENDAR_FIELD_DESC = new org.apache.thrift.protocol.TField("calendar", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField YEARLY_OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("yearly_option", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CustomRepeatStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CustomRepeatTupleSchemeFactory());
  }

  /**
   * 
   * @see Festival
   */
  public Festival festival; // optional
  /**
   * 
   * @see Frequency
   */
  public Frequency frequency; // optional
  public int every_n_cycle; // optional
  /**
   * 
   * @see CalendarType
   */
  public CalendarType calendar; // optional
  public List<YearlyOption> yearly_option; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see Festival
     */
    FESTIVAL((short)1, "festival"),
    /**
     * 
     * @see Frequency
     */
    FREQUENCY((short)2, "frequency"),
    EVERY_N_CYCLE((short)3, "every_n_cycle"),
    /**
     * 
     * @see CalendarType
     */
    CALENDAR((short)4, "calendar"),
    YEARLY_OPTION((short)5, "yearly_option");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // FESTIVAL
          return FESTIVAL;
        case 2: // FREQUENCY
          return FREQUENCY;
        case 3: // EVERY_N_CYCLE
          return EVERY_N_CYCLE;
        case 4: // CALENDAR
          return CALENDAR;
        case 5: // YEARLY_OPTION
          return YEARLY_OPTION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __EVERY_N_CYCLE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.FESTIVAL,_Fields.FREQUENCY,_Fields.EVERY_N_CYCLE,_Fields.CALENDAR,_Fields.YEARLY_OPTION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FESTIVAL, new org.apache.thrift.meta_data.FieldMetaData("festival", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Festival.class)));
    tmpMap.put(_Fields.FREQUENCY, new org.apache.thrift.meta_data.FieldMetaData("frequency", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Frequency.class)));
    tmpMap.put(_Fields.EVERY_N_CYCLE, new org.apache.thrift.meta_data.FieldMetaData("every_n_cycle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.CALENDAR, new org.apache.thrift.meta_data.FieldMetaData("calendar", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CalendarType.class)));
    tmpMap.put(_Fields.YEARLY_OPTION, new org.apache.thrift.meta_data.FieldMetaData("yearly_option", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, YearlyOption.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CustomRepeat.class, metaDataMap);
  }

  public CustomRepeat() {
    this.every_n_cycle = 1;

    this.calendar = CalendarType.GREGORIAN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CustomRepeat(CustomRepeat other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetFestival()) {
      this.festival = other.festival;
    }
    if (other.isSetFrequency()) {
      this.frequency = other.frequency;
    }
    this.every_n_cycle = other.every_n_cycle;
    if (other.isSetCalendar()) {
      this.calendar = other.calendar;
    }
    if (other.isSetYearly_option()) {
      List<YearlyOption> __this__yearly_option = new ArrayList<YearlyOption>(other.yearly_option.size());
      for (YearlyOption other_element : other.yearly_option) {
        __this__yearly_option.add(new YearlyOption(other_element));
      }
      this.yearly_option = __this__yearly_option;
    }
  }

  public CustomRepeat deepCopy() {
    return new CustomRepeat(this);
  }

  
  public void clear() {
    this.festival = null;
    this.frequency = null;
    this.every_n_cycle = 1;

    this.calendar = CalendarType.GREGORIAN;

    this.yearly_option = null;
  }

  /**
   * 
   * @see Festival
   */
  public Festival getFestival() {
    return this.festival;
  }

  /**
   * 
   * @see Festival
   */
  public CustomRepeat setFestival(Festival festival) {
    this.festival = festival;
    return this;
  }

  public void unsetFestival() {
    this.festival = null;
  }

  /** Returns true if field festival is set (has been assigned a value) and false otherwise */
  public boolean isSetFestival() {
    return this.festival != null;
  }

  public void setFestivalIsSet(boolean value) {
    if (!value) {
      this.festival = null;
    }
  }

  /**
   * 
   * @see Frequency
   */
  public Frequency getFrequency() {
    return this.frequency;
  }

  /**
   * 
   * @see Frequency
   */
  public CustomRepeat setFrequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

  public void unsetFrequency() {
    this.frequency = null;
  }

  /** Returns true if field frequency is set (has been assigned a value) and false otherwise */
  public boolean isSetFrequency() {
    return this.frequency != null;
  }

  public void setFrequencyIsSet(boolean value) {
    if (!value) {
      this.frequency = null;
    }
  }

  public int getEvery_n_cycle() {
    return this.every_n_cycle;
  }

  public CustomRepeat setEvery_n_cycle(int every_n_cycle) {
    this.every_n_cycle = every_n_cycle;
    setEvery_n_cycleIsSet(true);
    return this;
  }

  public void unsetEvery_n_cycle() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EVERY_N_CYCLE_ISSET_ID);
  }

  /** Returns true if field every_n_cycle is set (has been assigned a value) and false otherwise */
  public boolean isSetEvery_n_cycle() {
    return EncodingUtils.testBit(__isset_bitfield, __EVERY_N_CYCLE_ISSET_ID);
  }

  public void setEvery_n_cycleIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EVERY_N_CYCLE_ISSET_ID, value);
  }

  /**
   * 
   * @see CalendarType
   */
  public CalendarType getCalendar() {
    return this.calendar;
  }

  /**
   * 
   * @see CalendarType
   */
  public CustomRepeat setCalendar(CalendarType calendar) {
    this.calendar = calendar;
    return this;
  }

  public void unsetCalendar() {
    this.calendar = null;
  }

  /** Returns true if field calendar is set (has been assigned a value) and false otherwise */
  public boolean isSetCalendar() {
    return this.calendar != null;
  }

  public void setCalendarIsSet(boolean value) {
    if (!value) {
      this.calendar = null;
    }
  }

  public int getYearly_optionSize() {
    return (this.yearly_option == null) ? 0 : this.yearly_option.size();
  }

  public java.util.Iterator<YearlyOption> getYearly_optionIterator() {
    return (this.yearly_option == null) ? null : this.yearly_option.iterator();
  }

  public void addToYearly_option(YearlyOption elem) {
    if (this.yearly_option == null) {
      this.yearly_option = new ArrayList<YearlyOption>();
    }
    this.yearly_option.add(elem);
  }

  public List<YearlyOption> getYearly_option() {
    return this.yearly_option;
  }

  public CustomRepeat setYearly_option(List<YearlyOption> yearly_option) {
    this.yearly_option = yearly_option;
    return this;
  }

  public void unsetYearly_option() {
    this.yearly_option = null;
  }

  /** Returns true if field yearly_option is set (has been assigned a value) and false otherwise */
  public boolean isSetYearly_option() {
    return this.yearly_option != null;
  }

  public void setYearly_optionIsSet(boolean value) {
    if (!value) {
      this.yearly_option = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FESTIVAL:
      if (value == null) {
        unsetFestival();
      } else {
        setFestival((Festival)value);
      }
      break;

    case FREQUENCY:
      if (value == null) {
        unsetFrequency();
      } else {
        setFrequency((Frequency)value);
      }
      break;

    case EVERY_N_CYCLE:
      if (value == null) {
        unsetEvery_n_cycle();
      } else {
        setEvery_n_cycle((Integer)value);
      }
      break;

    case CALENDAR:
      if (value == null) {
        unsetCalendar();
      } else {
        setCalendar((CalendarType)value);
      }
      break;

    case YEARLY_OPTION:
      if (value == null) {
        unsetYearly_option();
      } else {
        setYearly_option((List<YearlyOption>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FESTIVAL:
      return getFestival();

    case FREQUENCY:
      return getFrequency();

    case EVERY_N_CYCLE:
      return Integer.valueOf(getEvery_n_cycle());

    case CALENDAR:
      return getCalendar();

    case YEARLY_OPTION:
      return getYearly_option();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FESTIVAL:
      return isSetFestival();
    case FREQUENCY:
      return isSetFrequency();
    case EVERY_N_CYCLE:
      return isSetEvery_n_cycle();
    case CALENDAR:
      return isSetCalendar();
    case YEARLY_OPTION:
      return isSetYearly_option();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CustomRepeat)
      return this.equals((CustomRepeat)that);
    return false;
  }

  public boolean equals(CustomRepeat that) {
    if (that == null)
      return false;

    boolean this_present_festival = true && this.isSetFestival();
    boolean that_present_festival = true && that.isSetFestival();
    if (this_present_festival || that_present_festival) {
      if (!(this_present_festival && that_present_festival))
        return false;
      if (!this.festival.equals(that.festival))
        return false;
    }

    boolean this_present_frequency = true && this.isSetFrequency();
    boolean that_present_frequency = true && that.isSetFrequency();
    if (this_present_frequency || that_present_frequency) {
      if (!(this_present_frequency && that_present_frequency))
        return false;
      if (!this.frequency.equals(that.frequency))
        return false;
    }

    boolean this_present_every_n_cycle = true && this.isSetEvery_n_cycle();
    boolean that_present_every_n_cycle = true && that.isSetEvery_n_cycle();
    if (this_present_every_n_cycle || that_present_every_n_cycle) {
      if (!(this_present_every_n_cycle && that_present_every_n_cycle))
        return false;
      if (this.every_n_cycle != that.every_n_cycle)
        return false;
    }

    boolean this_present_calendar = true && this.isSetCalendar();
    boolean that_present_calendar = true && that.isSetCalendar();
    if (this_present_calendar || that_present_calendar) {
      if (!(this_present_calendar && that_present_calendar))
        return false;
      if (!this.calendar.equals(that.calendar))
        return false;
    }

    boolean this_present_yearly_option = true && this.isSetYearly_option();
    boolean that_present_yearly_option = true && that.isSetYearly_option();
    if (this_present_yearly_option || that_present_yearly_option) {
      if (!(this_present_yearly_option && that_present_yearly_option))
        return false;
      if (!this.yearly_option.equals(that.yearly_option))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(CustomRepeat other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFestival()).compareTo(other.isSetFestival());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFestival()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.festival, other.festival);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFrequency()).compareTo(other.isSetFrequency());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrequency()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.frequency, other.frequency);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEvery_n_cycle()).compareTo(other.isSetEvery_n_cycle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEvery_n_cycle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.every_n_cycle, other.every_n_cycle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCalendar()).compareTo(other.isSetCalendar());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCalendar()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.calendar, other.calendar);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetYearly_option()).compareTo(other.isSetYearly_option());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetYearly_option()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.yearly_option, other.yearly_option);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  
  public String toString() {
    StringBuilder sb = new StringBuilder("CustomRepeat(");
    boolean first = true;

    if (isSetFestival()) {
      sb.append("festival:");
      if (this.festival == null) {
        sb.append("null");
      } else {
        sb.append(this.festival);
      }
      first = false;
    }
    if (isSetFrequency()) {
      if (!first) sb.append(", ");
      sb.append("frequency:");
      if (this.frequency == null) {
        sb.append("null");
      } else {
        sb.append(this.frequency);
      }
      first = false;
    }
    if (isSetEvery_n_cycle()) {
      if (!first) sb.append(", ");
      sb.append("every_n_cycle:");
      sb.append(this.every_n_cycle);
      first = false;
    }
    if (isSetCalendar()) {
      if (!first) sb.append(", ");
      sb.append("calendar:");
      if (this.calendar == null) {
        sb.append("null");
      } else {
        sb.append(this.calendar);
      }
      first = false;
    }
    if (isSetYearly_option()) {
      if (!first) sb.append(", ");
      sb.append("yearly_option:");
      if (this.yearly_option == null) {
        sb.append("null");
      } else {
        sb.append(this.yearly_option);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CustomRepeatStandardSchemeFactory implements SchemeFactory {
    public CustomRepeatStandardScheme getScheme() {
      return new CustomRepeatStandardScheme();
    }
  }

  private static class CustomRepeatStandardScheme extends StandardScheme<CustomRepeat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CustomRepeat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FESTIVAL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.festival = Festival.findByValue(iprot.readI32());
              struct.setFestivalIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FREQUENCY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.frequency = Frequency.findByValue(iprot.readI32());
              struct.setFrequencyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EVERY_N_CYCLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.every_n_cycle = iprot.readI32();
              struct.setEvery_n_cycleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CALENDAR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.calendar = CalendarType.findByValue(iprot.readI32());
              struct.setCalendarIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // YEARLY_OPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.yearly_option = new ArrayList<YearlyOption>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  YearlyOption _elem2;
                  _elem2 = new YearlyOption();
                  _elem2.read(iprot);
                  struct.yearly_option.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setYearly_optionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CustomRepeat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.festival != null) {
        if (struct.isSetFestival()) {
          oprot.writeFieldBegin(FESTIVAL_FIELD_DESC);
          oprot.writeI32(struct.festival.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.frequency != null) {
        if (struct.isSetFrequency()) {
          oprot.writeFieldBegin(FREQUENCY_FIELD_DESC);
          oprot.writeI32(struct.frequency.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetEvery_n_cycle()) {
        oprot.writeFieldBegin(EVERY_N_CYCLE_FIELD_DESC);
        oprot.writeI32(struct.every_n_cycle);
        oprot.writeFieldEnd();
      }
      if (struct.calendar != null) {
        if (struct.isSetCalendar()) {
          oprot.writeFieldBegin(CALENDAR_FIELD_DESC);
          oprot.writeI32(struct.calendar.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.yearly_option != null) {
        if (struct.isSetYearly_option()) {
          oprot.writeFieldBegin(YEARLY_OPTION_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.yearly_option.size()));
            for (YearlyOption _iter3 : struct.yearly_option)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CustomRepeatTupleSchemeFactory implements SchemeFactory {
    public CustomRepeatTupleScheme getScheme() {
      return new CustomRepeatTupleScheme();
    }
  }

  private static class CustomRepeatTupleScheme extends TupleScheme<CustomRepeat> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, CustomRepeat struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFestival()) {
        optionals.set(0);
      }
      if (struct.isSetFrequency()) {
        optionals.set(1);
      }
      if (struct.isSetEvery_n_cycle()) {
        optionals.set(2);
      }
      if (struct.isSetCalendar()) {
        optionals.set(3);
      }
      if (struct.isSetYearly_option()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetFestival()) {
        oprot.writeI32(struct.festival.getValue());
      }
      if (struct.isSetFrequency()) {
        oprot.writeI32(struct.frequency.getValue());
      }
      if (struct.isSetEvery_n_cycle()) {
        oprot.writeI32(struct.every_n_cycle);
      }
      if (struct.isSetCalendar()) {
        oprot.writeI32(struct.calendar.getValue());
      }
      if (struct.isSetYearly_option()) {
        {
          oprot.writeI32(struct.yearly_option.size());
          for (YearlyOption _iter4 : struct.yearly_option)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, CustomRepeat struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.festival = Festival.findByValue(iprot.readI32());
        struct.setFestivalIsSet(true);
      }
      if (incoming.get(1)) {
        struct.frequency = Frequency.findByValue(iprot.readI32());
        struct.setFrequencyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.every_n_cycle = iprot.readI32();
        struct.setEvery_n_cycleIsSet(true);
      }
      if (incoming.get(3)) {
        struct.calendar = CalendarType.findByValue(iprot.readI32());
        struct.setCalendarIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.yearly_option = new ArrayList<YearlyOption>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            YearlyOption _elem7;
            _elem7 = new YearlyOption();
            _elem7.read(iprot);
            struct.yearly_option.add(_elem7);
          }
        }
        struct.setYearly_optionIsSet(true);
      }
    }
  }

}

