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
public class DomainInterestInfo implements org.apache.thrift.TBase<DomainInterestInfo, DomainInterestInfo._Fields>, java.io.Serializable, Cloneable, Comparable<DomainInterestInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DomainInterestInfo");

  private static final org.apache.thrift.protocol.TField MIAN_INTEREST_FIELD_DESC = new org.apache.thrift.protocol.TField("mian_interest", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SUB_INTERESTS_FIELD_DESC = new org.apache.thrift.protocol.TField("sub_interests", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField DOMAIN_FIELD_DESC = new org.apache.thrift.protocol.TField("domain", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DomainInterestInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DomainInterestInfoTupleSchemeFactory());
  }

  public InterestInfo mian_interest; // required
  public List<InterestInfo> sub_interests; // optional
  /**
   * 
   * @see .Domain
   */
  public Domain domain; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MIAN_INTEREST((short)1, "mian_interest"),
    SUB_INTERESTS((short)2, "sub_interests"),
    /**
     * 
     * @see .Domain
     */
    DOMAIN((short)3, "domain");

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
        case 1: // MIAN_INTEREST
          return MIAN_INTEREST;
        case 2: // SUB_INTERESTS
          return SUB_INTERESTS;
        case 3: // DOMAIN
          return DOMAIN;
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
  private static final _Fields optionals[] = {_Fields.SUB_INTERESTS,_Fields.DOMAIN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.MIAN_INTEREST, new org.apache.thrift.meta_data.FieldMetaData("mian_interest", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InterestInfo.class)));
    tmpMap.put(_Fields.SUB_INTERESTS, new org.apache.thrift.meta_data.FieldMetaData("sub_interests", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, InterestInfo.class))));
    tmpMap.put(_Fields.DOMAIN, new org.apache.thrift.meta_data.FieldMetaData("domain", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Domain.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainInterestInfo.class, metaDataMap);
  }

  public DomainInterestInfo() {
  }

  public DomainInterestInfo(
    InterestInfo mian_interest)
  {
    this();
    this.mian_interest = mian_interest;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainInterestInfo(DomainInterestInfo other) {
    if (other.isSetMian_interest()) {
      this.mian_interest = new InterestInfo(other.mian_interest);
    }
    if (other.isSetSub_interests()) {
      List<InterestInfo> __this__sub_interests = new ArrayList<InterestInfo>(other.sub_interests.size());
      for (InterestInfo other_element : other.sub_interests) {
        __this__sub_interests.add(new InterestInfo(other_element));
      }
      this.sub_interests = __this__sub_interests;
    }
    if (other.isSetDomain()) {
      this.domain = other.domain;
    }
  }

  public DomainInterestInfo deepCopy() {
    return new DomainInterestInfo(this);
  }

  
  public void clear() {
    this.mian_interest = null;
    this.sub_interests = null;
    this.domain = null;
  }

  public InterestInfo getMian_interest() {
    return this.mian_interest;
  }

  public DomainInterestInfo setMian_interest(InterestInfo mian_interest) {
    this.mian_interest = mian_interest;
    return this;
  }

  public void unsetMian_interest() {
    this.mian_interest = null;
  }

  /** Returns true if field mian_interest is set (has been assigned a value) and false otherwise */
  public boolean isSetMian_interest() {
    return this.mian_interest != null;
  }

  public void setMian_interestIsSet(boolean value) {
    if (!value) {
      this.mian_interest = null;
    }
  }

  public int getSub_interestsSize() {
    return (this.sub_interests == null) ? 0 : this.sub_interests.size();
  }

  public java.util.Iterator<InterestInfo> getSub_interestsIterator() {
    return (this.sub_interests == null) ? null : this.sub_interests.iterator();
  }

  public void addToSub_interests(InterestInfo elem) {
    if (this.sub_interests == null) {
      this.sub_interests = new ArrayList<InterestInfo>();
    }
    this.sub_interests.add(elem);
  }

  public List<InterestInfo> getSub_interests() {
    return this.sub_interests;
  }

  public DomainInterestInfo setSub_interests(List<InterestInfo> sub_interests) {
    this.sub_interests = sub_interests;
    return this;
  }

  public void unsetSub_interests() {
    this.sub_interests = null;
  }

  /** Returns true if field sub_interests is set (has been assigned a value) and false otherwise */
  public boolean isSetSub_interests() {
    return this.sub_interests != null;
  }

  public void setSub_interestsIsSet(boolean value) {
    if (!value) {
      this.sub_interests = null;
    }
  }

  /**
   * 
   * @see .Domain
   */
  public Domain getDomain() {
    return this.domain;
  }

  /**
   * 
   * @see .Domain
   */
  public DomainInterestInfo setDomain(Domain domain) {
    this.domain = domain;
    return this;
  }

  public void unsetDomain() {
    this.domain = null;
  }

  /** Returns true if field domain is set (has been assigned a value) and false otherwise */
  public boolean isSetDomain() {
    return this.domain != null;
  }

  public void setDomainIsSet(boolean value) {
    if (!value) {
      this.domain = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MIAN_INTEREST:
      if (value == null) {
        unsetMian_interest();
      } else {
        setMian_interest((InterestInfo)value);
      }
      break;

    case SUB_INTERESTS:
      if (value == null) {
        unsetSub_interests();
      } else {
        setSub_interests((List<InterestInfo>)value);
      }
      break;

    case DOMAIN:
      if (value == null) {
        unsetDomain();
      } else {
        setDomain((Domain)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MIAN_INTEREST:
      return getMian_interest();

    case SUB_INTERESTS:
      return getSub_interests();

    case DOMAIN:
      return getDomain();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MIAN_INTEREST:
      return isSetMian_interest();
    case SUB_INTERESTS:
      return isSetSub_interests();
    case DOMAIN:
      return isSetDomain();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainInterestInfo)
      return this.equals((DomainInterestInfo)that);
    return false;
  }

  public boolean equals(DomainInterestInfo that) {
    if (that == null)
      return false;

    boolean this_present_mian_interest = true && this.isSetMian_interest();
    boolean that_present_mian_interest = true && that.isSetMian_interest();
    if (this_present_mian_interest || that_present_mian_interest) {
      if (!(this_present_mian_interest && that_present_mian_interest))
        return false;
      if (!this.mian_interest.equals(that.mian_interest))
        return false;
    }

    boolean this_present_sub_interests = true && this.isSetSub_interests();
    boolean that_present_sub_interests = true && that.isSetSub_interests();
    if (this_present_sub_interests || that_present_sub_interests) {
      if (!(this_present_sub_interests && that_present_sub_interests))
        return false;
      if (!this.sub_interests.equals(that.sub_interests))
        return false;
    }

    boolean this_present_domain = true && this.isSetDomain();
    boolean that_present_domain = true && that.isSetDomain();
    if (this_present_domain || that_present_domain) {
      if (!(this_present_domain && that_present_domain))
        return false;
      if (!this.domain.equals(that.domain))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(DomainInterestInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMian_interest()).compareTo(other.isSetMian_interest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMian_interest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mian_interest, other.mian_interest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSub_interests()).compareTo(other.isSetSub_interests());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSub_interests()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sub_interests, other.sub_interests);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDomain()).compareTo(other.isSetDomain());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDomain()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain, other.domain);
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
    StringBuilder sb = new StringBuilder("DomainInterestInfo(");
    boolean first = true;

    sb.append("mian_interest:");
    if (this.mian_interest == null) {
      sb.append("null");
    } else {
      sb.append(this.mian_interest);
    }
    first = false;
    if (isSetSub_interests()) {
      if (!first) sb.append(", ");
      sb.append("sub_interests:");
      if (this.sub_interests == null) {
        sb.append("null");
      } else {
        sb.append(this.sub_interests);
      }
      first = false;
    }
    if (isSetDomain()) {
      if (!first) sb.append(", ");
      sb.append("domain:");
      if (this.domain == null) {
        sb.append("null");
      } else {
        sb.append(this.domain);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (mian_interest != null) {
      mian_interest.validate();
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

  private static class DomainInterestInfoStandardSchemeFactory implements SchemeFactory {
    public DomainInterestInfoStandardScheme getScheme() {
      return new DomainInterestInfoStandardScheme();
    }
  }

  private static class DomainInterestInfoStandardScheme extends StandardScheme<DomainInterestInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DomainInterestInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MIAN_INTEREST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.mian_interest = new InterestInfo();
              struct.mian_interest.read(iprot);
              struct.setMian_interestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUB_INTERESTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.sub_interests = new ArrayList<InterestInfo>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  InterestInfo _elem2;
                  _elem2 = new InterestInfo();
                  _elem2.read(iprot);
                  struct.sub_interests.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setSub_interestsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DOMAIN
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.domain = Domain.findByValue(iprot.readI32());
              struct.setDomainIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DomainInterestInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mian_interest != null) {
        oprot.writeFieldBegin(MIAN_INTEREST_FIELD_DESC);
        struct.mian_interest.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.sub_interests != null) {
        if (struct.isSetSub_interests()) {
          oprot.writeFieldBegin(SUB_INTERESTS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.sub_interests.size()));
            for (InterestInfo _iter3 : struct.sub_interests)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.domain != null) {
        if (struct.isSetDomain()) {
          oprot.writeFieldBegin(DOMAIN_FIELD_DESC);
          oprot.writeI32(struct.domain.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainInterestInfoTupleSchemeFactory implements SchemeFactory {
    public DomainInterestInfoTupleScheme getScheme() {
      return new DomainInterestInfoTupleScheme();
    }
  }

  private static class DomainInterestInfoTupleScheme extends TupleScheme<DomainInterestInfo> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, DomainInterestInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMian_interest()) {
        optionals.set(0);
      }
      if (struct.isSetSub_interests()) {
        optionals.set(1);
      }
      if (struct.isSetDomain()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMian_interest()) {
        struct.mian_interest.write(oprot);
      }
      if (struct.isSetSub_interests()) {
        {
          oprot.writeI32(struct.sub_interests.size());
          for (InterestInfo _iter4 : struct.sub_interests)
          {
            _iter4.write(oprot);
          }
        }
      }
      if (struct.isSetDomain()) {
        oprot.writeI32(struct.domain.getValue());
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, DomainInterestInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.mian_interest = new InterestInfo();
        struct.mian_interest.read(iprot);
        struct.setMian_interestIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.sub_interests = new ArrayList<InterestInfo>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            InterestInfo _elem7;
            _elem7 = new InterestInfo();
            _elem7.read(iprot);
            struct.sub_interests.add(_elem7);
          }
        }
        struct.setSub_interestsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.domain = Domain.findByValue(iprot.readI32());
        struct.setDomainIsSet(true);
      }
    }
  }

}

