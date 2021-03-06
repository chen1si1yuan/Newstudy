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
public class UserProfile implements org.apache.thrift.TBase<UserProfile, UserProfile._Fields>, java.io.Serializable, Cloneable, Comparable<UserProfile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserProfile");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CONTEXT_HISTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("context_history", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserProfileTupleSchemeFactory());
  }

  public String uid; // optional
  public List<OneRoundQR> context_history; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    CONTEXT_HISTORY((short)2, "context_history");

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
        case 1: // UID
          return UID;
        case 2: // CONTEXT_HISTORY
          return CONTEXT_HISTORY;
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
  private static final _Fields optionals[] = {_Fields.UID,_Fields.CONTEXT_HISTORY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTEXT_HISTORY, new org.apache.thrift.meta_data.FieldMetaData("context_history", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, OneRoundQR.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserProfile.class, metaDataMap);
  }

  public UserProfile() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserProfile(UserProfile other) {
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetContext_history()) {
      List<OneRoundQR> __this__context_history = new ArrayList<OneRoundQR>(other.context_history.size());
      for (OneRoundQR other_element : other.context_history) {
        __this__context_history.add(new OneRoundQR(other_element));
      }
      this.context_history = __this__context_history;
    }
  }

  public UserProfile deepCopy() {
    return new UserProfile(this);
  }

  
  public void clear() {
    this.uid = null;
    this.context_history = null;
  }

  public String getUid() {
    return this.uid;
  }

  public UserProfile setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public void unsetUid() {
    this.uid = null;
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return this.uid != null;
  }

  public void setUidIsSet(boolean value) {
    if (!value) {
      this.uid = null;
    }
  }

  public int getContext_historySize() {
    return (this.context_history == null) ? 0 : this.context_history.size();
  }

  public java.util.Iterator<OneRoundQR> getContext_historyIterator() {
    return (this.context_history == null) ? null : this.context_history.iterator();
  }

  public void addToContext_history(OneRoundQR elem) {
    if (this.context_history == null) {
      this.context_history = new ArrayList<OneRoundQR>();
    }
    this.context_history.add(elem);
  }

  public List<OneRoundQR> getContext_history() {
    return this.context_history;
  }

  public UserProfile setContext_history(List<OneRoundQR> context_history) {
    this.context_history = context_history;
    return this;
  }

  public void unsetContext_history() {
    this.context_history = null;
  }

  /** Returns true if field context_history is set (has been assigned a value) and false otherwise */
  public boolean isSetContext_history() {
    return this.context_history != null;
  }

  public void setContext_historyIsSet(boolean value) {
    if (!value) {
      this.context_history = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((String)value);
      }
      break;

    case CONTEXT_HISTORY:
      if (value == null) {
        unsetContext_history();
      } else {
        setContext_history((List<OneRoundQR>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case CONTEXT_HISTORY:
      return getContext_history();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID:
      return isSetUid();
    case CONTEXT_HISTORY:
      return isSetContext_history();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserProfile)
      return this.equals((UserProfile)that);
    return false;
  }

  public boolean equals(UserProfile that) {
    if (that == null)
      return false;

    boolean this_present_uid = true && this.isSetUid();
    boolean that_present_uid = true && that.isSetUid();
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (!this.uid.equals(that.uid))
        return false;
    }

    boolean this_present_context_history = true && this.isSetContext_history();
    boolean that_present_context_history = true && that.isSetContext_history();
    if (this_present_context_history || that_present_context_history) {
      if (!(this_present_context_history && that_present_context_history))
        return false;
      if (!this.context_history.equals(that.context_history))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(UserProfile other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUid()).compareTo(other.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, other.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContext_history()).compareTo(other.isSetContext_history());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContext_history()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.context_history, other.context_history);
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
    StringBuilder sb = new StringBuilder("UserProfile(");
    boolean first = true;

    if (isSetUid()) {
      sb.append("uid:");
      if (this.uid == null) {
        sb.append("null");
      } else {
        sb.append(this.uid);
      }
      first = false;
    }
    if (isSetContext_history()) {
      if (!first) sb.append(", ");
      sb.append("context_history:");
      if (this.context_history == null) {
        sb.append("null");
      } else {
        sb.append(this.context_history);
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

  private static class UserProfileStandardSchemeFactory implements SchemeFactory {
    public UserProfileStandardScheme getScheme() {
      return new UserProfileStandardScheme();
    }
  }

  private static class UserProfileStandardScheme extends StandardScheme<UserProfile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserProfile struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.uid = iprot.readString();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTEXT_HISTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list216 = iprot.readListBegin();
                struct.context_history = new ArrayList<OneRoundQR>(_list216.size);
                for (int _i217 = 0; _i217 < _list216.size; ++_i217)
                {
                  OneRoundQR _elem218;
                  _elem218 = new OneRoundQR();
                  _elem218.read(iprot);
                  struct.context_history.add(_elem218);
                }
                iprot.readListEnd();
              }
              struct.setContext_historyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserProfile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uid != null) {
        if (struct.isSetUid()) {
          oprot.writeFieldBegin(UID_FIELD_DESC);
          oprot.writeString(struct.uid);
          oprot.writeFieldEnd();
        }
      }
      if (struct.context_history != null) {
        if (struct.isSetContext_history()) {
          oprot.writeFieldBegin(CONTEXT_HISTORY_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.context_history.size()));
            for (OneRoundQR _iter219 : struct.context_history)
            {
              _iter219.write(oprot);
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

  private static class UserProfileTupleSchemeFactory implements SchemeFactory {
    public UserProfileTupleScheme getScheme() {
      return new UserProfileTupleScheme();
    }
  }

  private static class UserProfileTupleScheme extends TupleScheme<UserProfile> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, UserProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetContext_history()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetContext_history()) {
        {
          oprot.writeI32(struct.context_history.size());
          for (OneRoundQR _iter220 : struct.context_history)
          {
            _iter220.write(oprot);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, UserProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list221 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.context_history = new ArrayList<OneRoundQR>(_list221.size);
          for (int _i222 = 0; _i222 < _list221.size; ++_i222)
          {
            OneRoundQR _elem223;
            _elem223 = new OneRoundQR();
            _elem223.read(iprot);
            struct.context_history.add(_elem223);
          }
        }
        struct.setContext_historyIsSet(true);
      }
    }
  }

}

