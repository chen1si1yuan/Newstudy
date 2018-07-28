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
public class Intents implements org.apache.thrift.TBase<Intents, Intents._Fields>, java.io.Serializable, Cloneable, Comparable<Intents> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Intents");

  private static final org.apache.thrift.protocol.TField INTENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("intents", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IntentsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IntentsTupleSchemeFactory());
  }

  public Map<Integer,Intent> intents; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTENTS((short)1, "intents");

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
        case 1: // INTENTS
          return INTENTS;
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
  private static final _Fields optionals[] = {_Fields.INTENTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INTENTS, new org.apache.thrift.meta_data.FieldMetaData("intents", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Intent.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Intents.class, metaDataMap);
  }

  public Intents() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Intents(Intents other) {
    if (other.isSetIntents()) {
      Map<Integer,Intent> __this__intents = new HashMap<Integer,Intent>(other.intents.size());
      for (Map.Entry<Integer, Intent> other_element : other.intents.entrySet()) {

        Integer other_element_key = other_element.getKey();
        Intent other_element_value = other_element.getValue();

        Integer __this__intents_copy_key = other_element_key;

        Intent __this__intents_copy_value = new Intent(other_element_value);

        __this__intents.put(__this__intents_copy_key, __this__intents_copy_value);
      }
      this.intents = __this__intents;
    }
  }

  public Intents deepCopy() {
    return new Intents(this);
  }

  
  public void clear() {
    this.intents = null;
  }

  public int getIntentsSize() {
    return (this.intents == null) ? 0 : this.intents.size();
  }

  public void putToIntents(int key, Intent val) {
    if (this.intents == null) {
      this.intents = new HashMap<Integer,Intent>();
    }
    this.intents.put(key, val);
  }

  public Map<Integer,Intent> getIntents() {
    return this.intents;
  }

  public Intents setIntents(Map<Integer,Intent> intents) {
    this.intents = intents;
    return this;
  }

  public void unsetIntents() {
    this.intents = null;
  }

  /** Returns true if field intents is set (has been assigned a value) and false otherwise */
  public boolean isSetIntents() {
    return this.intents != null;
  }

  public void setIntentsIsSet(boolean value) {
    if (!value) {
      this.intents = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INTENTS:
      if (value == null) {
        unsetIntents();
      } else {
        setIntents((Map<Integer,Intent>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INTENTS:
      return getIntents();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INTENTS:
      return isSetIntents();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Intents)
      return this.equals((Intents)that);
    return false;
  }

  public boolean equals(Intents that) {
    if (that == null)
      return false;

    boolean this_present_intents = true && this.isSetIntents();
    boolean that_present_intents = true && that.isSetIntents();
    if (this_present_intents || that_present_intents) {
      if (!(this_present_intents && that_present_intents))
        return false;
      if (!this.intents.equals(that.intents))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(Intents other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIntents()).compareTo(other.isSetIntents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intents, other.intents);
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
    StringBuilder sb = new StringBuilder("Intents(");
    boolean first = true;

    if (isSetIntents()) {
      sb.append("intents:");
      if (this.intents == null) {
        sb.append("null");
      } else {
        sb.append(this.intents);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IntentsStandardSchemeFactory implements SchemeFactory {
    public IntentsStandardScheme getScheme() {
      return new IntentsStandardScheme();
    }
  }

  private static class IntentsStandardScheme extends StandardScheme<Intents> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Intents struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INTENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map390 = iprot.readMapBegin();
                struct.intents = new HashMap<Integer,Intent>(2*_map390.size);
                for (int _i391 = 0; _i391 < _map390.size; ++_i391)
                {
                  int _key392;
                  Intent _val393;
                  _key392 = iprot.readI32();
                  _val393 = new Intent();
                  _val393.read(iprot);
                  struct.intents.put(_key392, _val393);
                }
                iprot.readMapEnd();
              }
              struct.setIntentsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Intents struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.intents != null) {
        if (struct.isSetIntents()) {
          oprot.writeFieldBegin(INTENTS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.intents.size()));
            for (Map.Entry<Integer, Intent> _iter394 : struct.intents.entrySet())
            {
              oprot.writeI32(_iter394.getKey());
              _iter394.getValue().write(oprot);
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

  private static class IntentsTupleSchemeFactory implements SchemeFactory {
    public IntentsTupleScheme getScheme() {
      return new IntentsTupleScheme();
    }
  }

  private static class IntentsTupleScheme extends TupleScheme<Intents> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, Intents struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIntents()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIntents()) {
        {
          oprot.writeI32(struct.intents.size());
          for (Map.Entry<Integer, Intent> _iter395 : struct.intents.entrySet())
          {
            oprot.writeI32(_iter395.getKey());
            _iter395.getValue().write(oprot);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, Intents struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map396 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.intents = new HashMap<Integer,Intent>(2*_map396.size);
          for (int _i397 = 0; _i397 < _map396.size; ++_i397)
          {
            int _key398;
            Intent _val399;
            _key398 = iprot.readI32();
            _val399 = new Intent();
            _val399.read(iprot);
            struct.intents.put(_key398, _val399);
          }
        }
        struct.setIntentsIsSet(true);
      }
    }
  }

}

