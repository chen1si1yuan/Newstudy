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
public class TrioUserProfile implements org.apache.thrift.TBase<TrioUserProfile, TrioUserProfile._Fields>, java.io.Serializable, Cloneable, Comparable<TrioUserProfile> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TrioUserProfile");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INTERESTS_FIELD_DESC = new org.apache.thrift.protocol.TField("interests", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TrioUserProfileStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TrioUserProfileTupleSchemeFactory());
  }

  public String uid; // optional
  public List<DomainInterestInfo> interests; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    INTERESTS((short)2, "interests");

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
        case 2: // INTERESTS
          return INTERESTS;
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
  private static final _Fields optionals[] = {_Fields.UID,_Fields.INTERESTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INTERESTS, new org.apache.thrift.meta_data.FieldMetaData("interests", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DomainInterestInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TrioUserProfile.class, metaDataMap);
  }

  public TrioUserProfile() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TrioUserProfile(TrioUserProfile other) {
    if (other.isSetUid()) {
      this.uid = other.uid;
    }
    if (other.isSetInterests()) {
      List<DomainInterestInfo> __this__interests = new ArrayList<DomainInterestInfo>(other.interests.size());
      for (DomainInterestInfo other_element : other.interests) {
        __this__interests.add(new DomainInterestInfo(other_element));
      }
      this.interests = __this__interests;
    }
  }

  public TrioUserProfile deepCopy() {
    return new TrioUserProfile(this);
  }

  
  public void clear() {
    this.uid = null;
    this.interests = null;
  }

  public String getUid() {
    return this.uid;
  }

  public TrioUserProfile setUid(String uid) {
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

  public int getInterestsSize() {
    return (this.interests == null) ? 0 : this.interests.size();
  }

  public java.util.Iterator<DomainInterestInfo> getInterestsIterator() {
    return (this.interests == null) ? null : this.interests.iterator();
  }

  public void addToInterests(DomainInterestInfo elem) {
    if (this.interests == null) {
      this.interests = new ArrayList<DomainInterestInfo>();
    }
    this.interests.add(elem);
  }

  public List<DomainInterestInfo> getInterests() {
    return this.interests;
  }

  public TrioUserProfile setInterests(List<DomainInterestInfo> interests) {
    this.interests = interests;
    return this;
  }

  public void unsetInterests() {
    this.interests = null;
  }

  /** Returns true if field interests is set (has been assigned a value) and false otherwise */
  public boolean isSetInterests() {
    return this.interests != null;
  }

  public void setInterestsIsSet(boolean value) {
    if (!value) {
      this.interests = null;
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

    case INTERESTS:
      if (value == null) {
        unsetInterests();
      } else {
        setInterests((List<DomainInterestInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case INTERESTS:
      return getInterests();

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
    case INTERESTS:
      return isSetInterests();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TrioUserProfile)
      return this.equals((TrioUserProfile)that);
    return false;
  }

  public boolean equals(TrioUserProfile that) {
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

    boolean this_present_interests = true && this.isSetInterests();
    boolean that_present_interests = true && that.isSetInterests();
    if (this_present_interests || that_present_interests) {
      if (!(this_present_interests && that_present_interests))
        return false;
      if (!this.interests.equals(that.interests))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(TrioUserProfile other) {
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
    lastComparison = Boolean.valueOf(isSetInterests()).compareTo(other.isSetInterests());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterests()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interests, other.interests);
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
    StringBuilder sb = new StringBuilder("TrioUserProfile(");
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
    if (isSetInterests()) {
      if (!first) sb.append(", ");
      sb.append("interests:");
      if (this.interests == null) {
        sb.append("null");
      } else {
        sb.append(this.interests);
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

  private static class TrioUserProfileStandardSchemeFactory implements SchemeFactory {
    public TrioUserProfileStandardScheme getScheme() {
      return new TrioUserProfileStandardScheme();
    }
  }

  private static class TrioUserProfileStandardScheme extends StandardScheme<TrioUserProfile> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TrioUserProfile struct) throws org.apache.thrift.TException {
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
          case 2: // INTERESTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.interests = new ArrayList<DomainInterestInfo>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  DomainInterestInfo _elem10;
                  _elem10 = new DomainInterestInfo();
                  _elem10.read(iprot);
                  struct.interests.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setInterestsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TrioUserProfile struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uid != null) {
        if (struct.isSetUid()) {
          oprot.writeFieldBegin(UID_FIELD_DESC);
          oprot.writeString(struct.uid);
          oprot.writeFieldEnd();
        }
      }
      if (struct.interests != null) {
        if (struct.isSetInterests()) {
          oprot.writeFieldBegin(INTERESTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.interests.size()));
            for (DomainInterestInfo _iter11 : struct.interests)
            {
              _iter11.write(oprot);
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

  private static class TrioUserProfileTupleSchemeFactory implements SchemeFactory {
    public TrioUserProfileTupleScheme getScheme() {
      return new TrioUserProfileTupleScheme();
    }
  }

  private static class TrioUserProfileTupleScheme extends TupleScheme<TrioUserProfile> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, TrioUserProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetInterests()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUid()) {
        oprot.writeString(struct.uid);
      }
      if (struct.isSetInterests()) {
        {
          oprot.writeI32(struct.interests.size());
          for (DomainInterestInfo _iter12 : struct.interests)
          {
            _iter12.write(oprot);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, TrioUserProfile struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.uid = iprot.readString();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.interests = new ArrayList<DomainInterestInfo>(_list13.size);
          for (int _i14 = 0; _i14 < _list13.size; ++_i14)
          {
            DomainInterestInfo _elem15;
            _elem15 = new DomainInterestInfo();
            _elem15.read(iprot);
            struct.interests.add(_elem15);
          }
        }
        struct.setInterestsIsSet(true);
      }
    }
  }

}

