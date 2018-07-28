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
public class NerSingleResp implements org.apache.thrift.TBase<NerSingleResp, NerSingleResp._Fields>, java.io.Serializable, Cloneable, Comparable<NerSingleResp> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NerSingleResp");

  private static final org.apache.thrift.protocol.TField RESP_FIELD_DESC = new org.apache.thrift.protocol.TField("resp", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NerSingleRespStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NerSingleRespTupleSchemeFactory());
  }

  public String resp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RESP((short)1, "resp");

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
        case 1: // RESP
          return RESP;
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
  private static final _Fields optionals[] = {_Fields.RESP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESP, new org.apache.thrift.meta_data.FieldMetaData("resp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NerSingleResp.class, metaDataMap);
  }

  public NerSingleResp() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NerSingleResp(NerSingleResp other) {
    if (other.isSetResp()) {
      this.resp = other.resp;
    }
  }

  public NerSingleResp deepCopy() {
    return new NerSingleResp(this);
  }

  
  public void clear() {
    this.resp = null;
  }

  public String getResp() {
    return this.resp;
  }

  public NerSingleResp setResp(String resp) {
    this.resp = resp;
    return this;
  }

  public void unsetResp() {
    this.resp = null;
  }

  /** Returns true if field resp is set (has been assigned a value) and false otherwise */
  public boolean isSetResp() {
    return this.resp != null;
  }

  public void setRespIsSet(boolean value) {
    if (!value) {
      this.resp = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESP:
      if (value == null) {
        unsetResp();
      } else {
        setResp((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESP:
      return getResp();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESP:
      return isSetResp();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NerSingleResp)
      return this.equals((NerSingleResp)that);
    return false;
  }

  public boolean equals(NerSingleResp that) {
    if (that == null)
      return false;

    boolean this_present_resp = true && this.isSetResp();
    boolean that_present_resp = true && that.isSetResp();
    if (this_present_resp || that_present_resp) {
      if (!(this_present_resp && that_present_resp))
        return false;
      if (!this.resp.equals(that.resp))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(NerSingleResp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResp()).compareTo(other.isSetResp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resp, other.resp);
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
    StringBuilder sb = new StringBuilder("NerSingleResp(");
    boolean first = true;

    if (isSetResp()) {
      sb.append("resp:");
      if (this.resp == null) {
        sb.append("null");
      } else {
        sb.append(this.resp);
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

  private static class NerSingleRespStandardSchemeFactory implements SchemeFactory {
    public NerSingleRespStandardScheme getScheme() {
      return new NerSingleRespStandardScheme();
    }
  }

  private static class NerSingleRespStandardScheme extends StandardScheme<NerSingleResp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NerSingleResp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.resp = iprot.readString();
              struct.setRespIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, NerSingleResp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.resp != null) {
        if (struct.isSetResp()) {
          oprot.writeFieldBegin(RESP_FIELD_DESC);
          oprot.writeString(struct.resp);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NerSingleRespTupleSchemeFactory implements SchemeFactory {
    public NerSingleRespTupleScheme getScheme() {
      return new NerSingleRespTupleScheme();
    }
  }

  private static class NerSingleRespTupleScheme extends TupleScheme<NerSingleResp> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, NerSingleResp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetResp()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetResp()) {
        oprot.writeString(struct.resp);
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, NerSingleResp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.resp = iprot.readString();
        struct.setRespIsSet(true);
      }
    }
  }

}

