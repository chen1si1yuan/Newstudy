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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2017-12-16")
public class BuildInServiceContext implements org.apache.thrift.TBase<BuildInServiceContext, BuildInServiceContext._Fields>, java.io.Serializable, Cloneable, Comparable<BuildInServiceContext> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildInServiceContext");

  private static final org.apache.thrift.protocol.TField FRONTEND_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("frontend_status", org.apache.thrift.protocol.TType.SET, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildInServiceContextStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildInServiceContextTupleSchemeFactory());
  }

  public Set<Domain> frontend_status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FRONTEND_STATUS((short)1, "frontend_status");

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
        case 1: // FRONTEND_STATUS
          return FRONTEND_STATUS;
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
  private static final _Fields optionals[] = {_Fields.FRONTEND_STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FRONTEND_STATUS, new org.apache.thrift.meta_data.FieldMetaData("frontend_status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Domain.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildInServiceContext.class, metaDataMap);
  }

  public BuildInServiceContext() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildInServiceContext(BuildInServiceContext other) {
    if (other.isSetFrontend_status()) {
      Set<Domain> __this__frontend_status = new HashSet<Domain>(other.frontend_status.size());
      for (Domain other_element : other.frontend_status) {
        __this__frontend_status.add(other_element);
      }
      this.frontend_status = __this__frontend_status;
    }
  }

  public BuildInServiceContext deepCopy() {
    return new BuildInServiceContext(this);
  }

  
  public void clear() {
    this.frontend_status = null;
  }

  public int getFrontend_statusSize() {
    return (this.frontend_status == null) ? 0 : this.frontend_status.size();
  }

  public java.util.Iterator<Domain> getFrontend_statusIterator() {
    return (this.frontend_status == null) ? null : this.frontend_status.iterator();
  }

  public void addToFrontend_status(Domain elem) {
    if (this.frontend_status == null) {
      this.frontend_status = new HashSet<Domain>();
    }
    this.frontend_status.add(elem);
  }

  public Set<Domain> getFrontend_status() {
    return this.frontend_status;
  }

  public BuildInServiceContext setFrontend_status(Set<Domain> frontend_status) {
    this.frontend_status = frontend_status;
    return this;
  }

  public void unsetFrontend_status() {
    this.frontend_status = null;
  }

  /** Returns true if field frontend_status is set (has been assigned a value) and false otherwise */
  public boolean isSetFrontend_status() {
    return this.frontend_status != null;
  }

  public void setFrontend_statusIsSet(boolean value) {
    if (!value) {
      this.frontend_status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FRONTEND_STATUS:
      if (value == null) {
        unsetFrontend_status();
      } else {
        setFrontend_status((Set<Domain>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FRONTEND_STATUS:
      return getFrontend_status();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FRONTEND_STATUS:
      return isSetFrontend_status();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildInServiceContext)
      return this.equals((BuildInServiceContext)that);
    return false;
  }

  public boolean equals(BuildInServiceContext that) {
    if (that == null)
      return false;

    boolean this_present_frontend_status = true && this.isSetFrontend_status();
    boolean that_present_frontend_status = true && that.isSetFrontend_status();
    if (this_present_frontend_status || that_present_frontend_status) {
      if (!(this_present_frontend_status && that_present_frontend_status))
        return false;
      if (!this.frontend_status.equals(that.frontend_status))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(BuildInServiceContext other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetFrontend_status()).compareTo(other.isSetFrontend_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFrontend_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.frontend_status, other.frontend_status);
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
    StringBuilder sb = new StringBuilder("BuildInServiceContext(");
    boolean first = true;

    if (isSetFrontend_status()) {
      sb.append("frontend_status:");
      if (this.frontend_status == null) {
        sb.append("null");
      } else {
        sb.append(this.frontend_status);
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

  private static class BuildInServiceContextStandardSchemeFactory implements SchemeFactory {
    public BuildInServiceContextStandardScheme getScheme() {
      return new BuildInServiceContextStandardScheme();
    }
  }

  private static class BuildInServiceContextStandardScheme extends StandardScheme<BuildInServiceContext> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildInServiceContext struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FRONTEND_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set488 = iprot.readSetBegin();
                struct.frontend_status = new HashSet<Domain>(2*_set488.size);
                for (int _i489 = 0; _i489 < _set488.size; ++_i489)
                {
                  Domain _elem490;
                  _elem490 = Domain.findByValue(iprot.readI32());
                  struct.frontend_status.add(_elem490);
                }
                iprot.readSetEnd();
              }
              struct.setFrontend_statusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildInServiceContext struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.frontend_status != null) {
        if (struct.isSetFrontend_status()) {
          oprot.writeFieldBegin(FRONTEND_STATUS_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.frontend_status.size()));
            for (Domain _iter491 : struct.frontend_status)
            {
              oprot.writeI32(_iter491.getValue());
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildInServiceContextTupleSchemeFactory implements SchemeFactory {
    public BuildInServiceContextTupleScheme getScheme() {
      return new BuildInServiceContextTupleScheme();
    }
  }

  private static class BuildInServiceContextTupleScheme extends TupleScheme<BuildInServiceContext> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildInServiceContext struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetFrontend_status()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetFrontend_status()) {
        {
          oprot.writeI32(struct.frontend_status.size());
          for (Domain _iter492 : struct.frontend_status)
          {
            oprot.writeI32(_iter492.getValue());
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildInServiceContext struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set493 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.frontend_status = new HashSet<Domain>(2*_set493.size);
          for (int _i494 = 0; _i494 < _set493.size; ++_i494)
          {
            Domain _elem495;
            _elem495 = Domain.findByValue(iprot.readI32());
            struct.frontend_status.add(_elem495);
          }
        }
        struct.setFrontend_statusIsSet(true);
      }
    }
  }

}

