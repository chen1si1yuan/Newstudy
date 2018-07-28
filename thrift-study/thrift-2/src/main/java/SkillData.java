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
public class SkillData implements org.apache.thrift.TBase<SkillData, SkillData._Fields>, java.io.Serializable, Cloneable, Comparable<SkillData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SkillData");

  private static final org.apache.thrift.protocol.TField IS_OPEN_FIELD_DESC = new org.apache.thrift.protocol.TField("is_open", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SkillDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SkillDataTupleSchemeFactory());
  }

  public boolean is_open; // optional
  public Map<String,String> values; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_OPEN((short)1, "is_open"),
    VALUES((short)2, "values");

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
        case 1: // IS_OPEN
          return IS_OPEN;
        case 2: // VALUES
          return VALUES;
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
  private static final int __IS_OPEN_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.IS_OPEN,_Fields.VALUES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_OPEN, new org.apache.thrift.meta_data.FieldMetaData("is_open", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SkillData.class, metaDataMap);
  }

  public SkillData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SkillData(SkillData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_open = other.is_open;
    if (other.isSetValues()) {
      Map<String,String> __this__values = new HashMap<String,String>(other.values);
      this.values = __this__values;
    }
  }

  public SkillData deepCopy() {
    return new SkillData(this);
  }

  
  public void clear() {
    setIs_openIsSet(false);
    this.is_open = false;
    this.values = null;
  }

  public boolean isIs_open() {
    return this.is_open;
  }

  public SkillData setIs_open(boolean is_open) {
    this.is_open = is_open;
    setIs_openIsSet(true);
    return this;
  }

  public void unsetIs_open() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_OPEN_ISSET_ID);
  }

  /** Returns true if field is_open is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_open() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_OPEN_ISSET_ID);
  }

  public void setIs_openIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_OPEN_ISSET_ID, value);
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public void putToValues(String key, String val) {
    if (this.values == null) {
      this.values = new HashMap<String,String>();
    }
    this.values.put(key, val);
  }

  public Map<String,String> getValues() {
    return this.values;
  }

  public SkillData setValues(Map<String,String> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_OPEN:
      if (value == null) {
        unsetIs_open();
      } else {
        setIs_open((Boolean)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_OPEN:
      return Boolean.valueOf(isIs_open());

    case VALUES:
      return getValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_OPEN:
      return isSetIs_open();
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SkillData)
      return this.equals((SkillData)that);
    return false;
  }

  public boolean equals(SkillData that) {
    if (that == null)
      return false;

    boolean this_present_is_open = true && this.isSetIs_open();
    boolean that_present_is_open = true && that.isSetIs_open();
    if (this_present_is_open || that_present_is_open) {
      if (!(this_present_is_open && that_present_is_open))
        return false;
      if (this.is_open != that.is_open)
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(SkillData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIs_open()).compareTo(other.isSetIs_open());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_open()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_open, other.is_open);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
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
    StringBuilder sb = new StringBuilder("SkillData(");
    boolean first = true;

    if (isSetIs_open()) {
      sb.append("is_open:");
      sb.append(this.is_open);
      first = false;
    }
    if (isSetValues()) {
      if (!first) sb.append(", ");
      sb.append("values:");
      if (this.values == null) {
        sb.append("null");
      } else {
        sb.append(this.values);
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

  private static class SkillDataStandardSchemeFactory implements SchemeFactory {
    public SkillDataStandardScheme getScheme() {
      return new SkillDataStandardScheme();
    }
  }

  private static class SkillDataStandardScheme extends StandardScheme<SkillData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SkillData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_OPEN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_open = iprot.readBool();
              struct.setIs_openIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map506 = iprot.readMapBegin();
                struct.values = new HashMap<String,String>(2*_map506.size);
                for (int _i507 = 0; _i507 < _map506.size; ++_i507)
                {
                  String _key508;
                  String _val509;
                  _key508 = iprot.readString();
                  _val509 = iprot.readString();
                  struct.values.put(_key508, _val509);
                }
                iprot.readMapEnd();
              }
              struct.setValuesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SkillData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetIs_open()) {
        oprot.writeFieldBegin(IS_OPEN_FIELD_DESC);
        oprot.writeBool(struct.is_open);
        oprot.writeFieldEnd();
      }
      if (struct.values != null) {
        if (struct.isSetValues()) {
          oprot.writeFieldBegin(VALUES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.values.size()));
            for (Map.Entry<String, String> _iter510 : struct.values.entrySet())
            {
              oprot.writeString(_iter510.getKey());
              oprot.writeString(_iter510.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SkillDataTupleSchemeFactory implements SchemeFactory {
    public SkillDataTupleScheme getScheme() {
      return new SkillDataTupleScheme();
    }
  }

  private static class SkillDataTupleScheme extends TupleScheme<SkillData> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, SkillData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIs_open()) {
        optionals.set(0);
      }
      if (struct.isSetValues()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetIs_open()) {
        oprot.writeBool(struct.is_open);
      }
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (Map.Entry<String, String> _iter511 : struct.values.entrySet())
          {
            oprot.writeString(_iter511.getKey());
            oprot.writeString(_iter511.getValue());
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, SkillData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.is_open = iprot.readBool();
        struct.setIs_openIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map512 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.values = new HashMap<String,String>(2*_map512.size);
          for (int _i513 = 0; _i513 < _map512.size; ++_i513)
          {
            String _key514;
            String _val515;
            _key514 = iprot.readString();
            _val515 = iprot.readString();
            struct.values.put(_key514, _val515);
          }
        }
        struct.setValuesIsSet(true);
      }
    }
  }

}

