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
public class Session implements org.apache.thrift.TBase<Session, Session._Fields>, java.io.Serializable, Cloneable, Comparable<Session> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Session");

  private static final org.apache.thrift.protocol.TField USER_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("user_info", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DIALOG_VEC_FIELD_DESC = new org.apache.thrift.protocol.TField("dialog_vec", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SessionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SessionTupleSchemeFactory());
  }

  public UserInfo user_info; // optional
  public List<Dialog> dialog_vec; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_INFO((short)1, "user_info"),
    DIALOG_VEC((short)2, "dialog_vec");

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
        case 1: // USER_INFO
          return USER_INFO;
        case 2: // DIALOG_VEC
          return DIALOG_VEC;
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
  private static final _Fields optionals[] = {_Fields.USER_INFO,_Fields.DIALOG_VEC};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_INFO, new org.apache.thrift.meta_data.FieldMetaData("user_info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, UserInfo.class)));
    tmpMap.put(_Fields.DIALOG_VEC, new org.apache.thrift.meta_data.FieldMetaData("dialog_vec", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Dialog.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Session.class, metaDataMap);
  }

  public Session() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Session(Session other) {
    if (other.isSetUser_info()) {
      this.user_info = new UserInfo(other.user_info);
    }
    if (other.isSetDialog_vec()) {
      List<Dialog> __this__dialog_vec = new ArrayList<Dialog>(other.dialog_vec.size());
      for (Dialog other_element : other.dialog_vec) {
        __this__dialog_vec.add(new Dialog(other_element));
      }
      this.dialog_vec = __this__dialog_vec;
    }
  }

  public Session deepCopy() {
    return new Session(this);
  }

  
  public void clear() {
    this.user_info = null;
    this.dialog_vec = null;
  }

  public UserInfo getUser_info() {
    return this.user_info;
  }

  public Session setUser_info(UserInfo user_info) {
    this.user_info = user_info;
    return this;
  }

  public void unsetUser_info() {
    this.user_info = null;
  }

  /** Returns true if field user_info is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_info() {
    return this.user_info != null;
  }

  public void setUser_infoIsSet(boolean value) {
    if (!value) {
      this.user_info = null;
    }
  }

  public int getDialog_vecSize() {
    return (this.dialog_vec == null) ? 0 : this.dialog_vec.size();
  }

  public java.util.Iterator<Dialog> getDialog_vecIterator() {
    return (this.dialog_vec == null) ? null : this.dialog_vec.iterator();
  }

  public void addToDialog_vec(Dialog elem) {
    if (this.dialog_vec == null) {
      this.dialog_vec = new ArrayList<Dialog>();
    }
    this.dialog_vec.add(elem);
  }

  public List<Dialog> getDialog_vec() {
    return this.dialog_vec;
  }

  public Session setDialog_vec(List<Dialog> dialog_vec) {
    this.dialog_vec = dialog_vec;
    return this;
  }

  public void unsetDialog_vec() {
    this.dialog_vec = null;
  }

  /** Returns true if field dialog_vec is set (has been assigned a value) and false otherwise */
  public boolean isSetDialog_vec() {
    return this.dialog_vec != null;
  }

  public void setDialog_vecIsSet(boolean value) {
    if (!value) {
      this.dialog_vec = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_INFO:
      if (value == null) {
        unsetUser_info();
      } else {
        setUser_info((UserInfo)value);
      }
      break;

    case DIALOG_VEC:
      if (value == null) {
        unsetDialog_vec();
      } else {
        setDialog_vec((List<Dialog>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_INFO:
      return getUser_info();

    case DIALOG_VEC:
      return getDialog_vec();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_INFO:
      return isSetUser_info();
    case DIALOG_VEC:
      return isSetDialog_vec();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Session)
      return this.equals((Session)that);
    return false;
  }

  public boolean equals(Session that) {
    if (that == null)
      return false;

    boolean this_present_user_info = true && this.isSetUser_info();
    boolean that_present_user_info = true && that.isSetUser_info();
    if (this_present_user_info || that_present_user_info) {
      if (!(this_present_user_info && that_present_user_info))
        return false;
      if (!this.user_info.equals(that.user_info))
        return false;
    }

    boolean this_present_dialog_vec = true && this.isSetDialog_vec();
    boolean that_present_dialog_vec = true && that.isSetDialog_vec();
    if (this_present_dialog_vec || that_present_dialog_vec) {
      if (!(this_present_dialog_vec && that_present_dialog_vec))
        return false;
      if (!this.dialog_vec.equals(that.dialog_vec))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(Session other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser_info()).compareTo(other.isSetUser_info());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_info()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_info, other.user_info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDialog_vec()).compareTo(other.isSetDialog_vec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDialog_vec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dialog_vec, other.dialog_vec);
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
    StringBuilder sb = new StringBuilder("Session(");
    boolean first = true;

    if (isSetUser_info()) {
      sb.append("user_info:");
      if (this.user_info == null) {
        sb.append("null");
      } else {
        sb.append(this.user_info);
      }
      first = false;
    }
    if (isSetDialog_vec()) {
      if (!first) sb.append(", ");
      sb.append("dialog_vec:");
      if (this.dialog_vec == null) {
        sb.append("null");
      } else {
        sb.append(this.dialog_vec);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (user_info != null) {
      user_info.validate();
    }
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

  private static class SessionStandardSchemeFactory implements SchemeFactory {
    public SessionStandardScheme getScheme() {
      return new SessionStandardScheme();
    }
  }

  private static class SessionStandardScheme extends StandardScheme<Session> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Session struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.user_info = new UserInfo();
              struct.user_info.read(iprot);
              struct.setUser_infoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DIALOG_VEC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list224 = iprot.readListBegin();
                struct.dialog_vec = new ArrayList<Dialog>(_list224.size);
                for (int _i225 = 0; _i225 < _list224.size; ++_i225)
                {
                  Dialog _elem226;
                  _elem226 = new Dialog();
                  _elem226.read(iprot);
                  struct.dialog_vec.add(_elem226);
                }
                iprot.readListEnd();
              }
              struct.setDialog_vecIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Session struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user_info != null) {
        if (struct.isSetUser_info()) {
          oprot.writeFieldBegin(USER_INFO_FIELD_DESC);
          struct.user_info.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.dialog_vec != null) {
        if (struct.isSetDialog_vec()) {
          oprot.writeFieldBegin(DIALOG_VEC_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.dialog_vec.size()));
            for (Dialog _iter227 : struct.dialog_vec)
            {
              _iter227.write(oprot);
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

  private static class SessionTupleSchemeFactory implements SchemeFactory {
    public SessionTupleScheme getScheme() {
      return new SessionTupleScheme();
    }
  }

  private static class SessionTupleScheme extends TupleScheme<Session> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, Session struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUser_info()) {
        optionals.set(0);
      }
      if (struct.isSetDialog_vec()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUser_info()) {
        struct.user_info.write(oprot);
      }
      if (struct.isSetDialog_vec()) {
        {
          oprot.writeI32(struct.dialog_vec.size());
          for (Dialog _iter228 : struct.dialog_vec)
          {
            _iter228.write(oprot);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, Session struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.user_info = new UserInfo();
        struct.user_info.read(iprot);
        struct.setUser_infoIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list229 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.dialog_vec = new ArrayList<Dialog>(_list229.size);
          for (int _i230 = 0; _i230 < _list229.size; ++_i230)
          {
            Dialog _elem231;
            _elem231 = new Dialog();
            _elem231.read(iprot);
            struct.dialog_vec.add(_elem231);
          }
        }
        struct.setDialog_vecIsSet(true);
      }
    }
  }

}

