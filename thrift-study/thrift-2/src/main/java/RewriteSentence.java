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
public class RewriteSentence implements org.apache.thrift.TBase<RewriteSentence, RewriteSentence._Fields>, java.io.Serializable, Cloneable, Comparable<RewriteSentence> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RewriteSentence");

  private static final org.apache.thrift.protocol.TField WEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SENTEN_FIELD_DESC = new org.apache.thrift.protocol.TField("senten", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PINYIN_FIELD_DESC = new org.apache.thrift.protocol.TField("pinyin", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField BASIC_SEGS_FIELD_DESC = new org.apache.thrift.protocol.TField("basic_segs", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField PHRASE_SEGS_FIELD_DESC = new org.apache.thrift.protocol.TField("phrase_segs", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RewriteSentenceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RewriteSentenceTupleSchemeFactory());
  }

  public int weight; // optional
  public String senten; // optional
  public String pinyin; // optional
  public List<RewriteWord> basic_segs; // optional
  public List<RewriteWord> phrase_segs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WEIGHT((short)1, "weight"),
    SENTEN((short)2, "senten"),
    PINYIN((short)3, "pinyin"),
    BASIC_SEGS((short)4, "basic_segs"),
    PHRASE_SEGS((short)5, "phrase_segs");

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
        case 1: // WEIGHT
          return WEIGHT;
        case 2: // SENTEN
          return SENTEN;
        case 3: // PINYIN
          return PINYIN;
        case 4: // BASIC_SEGS
          return BASIC_SEGS;
        case 5: // PHRASE_SEGS
          return PHRASE_SEGS;
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
  private static final int __WEIGHT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.WEIGHT,_Fields.SENTEN,_Fields.PINYIN,_Fields.BASIC_SEGS,_Fields.PHRASE_SEGS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WEIGHT, new org.apache.thrift.meta_data.FieldMetaData("weight", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SENTEN, new org.apache.thrift.meta_data.FieldMetaData("senten", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PINYIN, new org.apache.thrift.meta_data.FieldMetaData("pinyin", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BASIC_SEGS, new org.apache.thrift.meta_data.FieldMetaData("basic_segs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RewriteWord.class))));
    tmpMap.put(_Fields.PHRASE_SEGS, new org.apache.thrift.meta_data.FieldMetaData("phrase_segs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, RewriteWord.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RewriteSentence.class, metaDataMap);
  }

  public RewriteSentence() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RewriteSentence(RewriteSentence other) {
    __isset_bitfield = other.__isset_bitfield;
    this.weight = other.weight;
    if (other.isSetSenten()) {
      this.senten = other.senten;
    }
    if (other.isSetPinyin()) {
      this.pinyin = other.pinyin;
    }
    if (other.isSetBasic_segs()) {
      List<RewriteWord> __this__basic_segs = new ArrayList<RewriteWord>(other.basic_segs.size());
      for (RewriteWord other_element : other.basic_segs) {
        __this__basic_segs.add(new RewriteWord(other_element));
      }
      this.basic_segs = __this__basic_segs;
    }
    if (other.isSetPhrase_segs()) {
      List<RewriteWord> __this__phrase_segs = new ArrayList<RewriteWord>(other.phrase_segs.size());
      for (RewriteWord other_element : other.phrase_segs) {
        __this__phrase_segs.add(new RewriteWord(other_element));
      }
      this.phrase_segs = __this__phrase_segs;
    }
  }

  public RewriteSentence deepCopy() {
    return new RewriteSentence(this);
  }

  
  public void clear() {
    setWeightIsSet(false);
    this.weight = 0;
    this.senten = null;
    this.pinyin = null;
    this.basic_segs = null;
    this.phrase_segs = null;
  }

  public int getWeight() {
    return this.weight;
  }

  public RewriteSentence setWeight(int weight) {
    this.weight = weight;
    setWeightIsSet(true);
    return this;
  }

  public void unsetWeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  /** Returns true if field weight is set (has been assigned a value) and false otherwise */
  public boolean isSetWeight() {
    return EncodingUtils.testBit(__isset_bitfield, __WEIGHT_ISSET_ID);
  }

  public void setWeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WEIGHT_ISSET_ID, value);
  }

  public String getSenten() {
    return this.senten;
  }

  public RewriteSentence setSenten(String senten) {
    this.senten = senten;
    return this;
  }

  public void unsetSenten() {
    this.senten = null;
  }

  /** Returns true if field senten is set (has been assigned a value) and false otherwise */
  public boolean isSetSenten() {
    return this.senten != null;
  }

  public void setSentenIsSet(boolean value) {
    if (!value) {
      this.senten = null;
    }
  }

  public String getPinyin() {
    return this.pinyin;
  }

  public RewriteSentence setPinyin(String pinyin) {
    this.pinyin = pinyin;
    return this;
  }

  public void unsetPinyin() {
    this.pinyin = null;
  }

  /** Returns true if field pinyin is set (has been assigned a value) and false otherwise */
  public boolean isSetPinyin() {
    return this.pinyin != null;
  }

  public void setPinyinIsSet(boolean value) {
    if (!value) {
      this.pinyin = null;
    }
  }

  public int getBasic_segsSize() {
    return (this.basic_segs == null) ? 0 : this.basic_segs.size();
  }

  public java.util.Iterator<RewriteWord> getBasic_segsIterator() {
    return (this.basic_segs == null) ? null : this.basic_segs.iterator();
  }

  public void addToBasic_segs(RewriteWord elem) {
    if (this.basic_segs == null) {
      this.basic_segs = new ArrayList<RewriteWord>();
    }
    this.basic_segs.add(elem);
  }

  public List<RewriteWord> getBasic_segs() {
    return this.basic_segs;
  }

  public RewriteSentence setBasic_segs(List<RewriteWord> basic_segs) {
    this.basic_segs = basic_segs;
    return this;
  }

  public void unsetBasic_segs() {
    this.basic_segs = null;
  }

  /** Returns true if field basic_segs is set (has been assigned a value) and false otherwise */
  public boolean isSetBasic_segs() {
    return this.basic_segs != null;
  }

  public void setBasic_segsIsSet(boolean value) {
    if (!value) {
      this.basic_segs = null;
    }
  }

  public int getPhrase_segsSize() {
    return (this.phrase_segs == null) ? 0 : this.phrase_segs.size();
  }

  public java.util.Iterator<RewriteWord> getPhrase_segsIterator() {
    return (this.phrase_segs == null) ? null : this.phrase_segs.iterator();
  }

  public void addToPhrase_segs(RewriteWord elem) {
    if (this.phrase_segs == null) {
      this.phrase_segs = new ArrayList<RewriteWord>();
    }
    this.phrase_segs.add(elem);
  }

  public List<RewriteWord> getPhrase_segs() {
    return this.phrase_segs;
  }

  public RewriteSentence setPhrase_segs(List<RewriteWord> phrase_segs) {
    this.phrase_segs = phrase_segs;
    return this;
  }

  public void unsetPhrase_segs() {
    this.phrase_segs = null;
  }

  /** Returns true if field phrase_segs is set (has been assigned a value) and false otherwise */
  public boolean isSetPhrase_segs() {
    return this.phrase_segs != null;
  }

  public void setPhrase_segsIsSet(boolean value) {
    if (!value) {
      this.phrase_segs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WEIGHT:
      if (value == null) {
        unsetWeight();
      } else {
        setWeight((Integer)value);
      }
      break;

    case SENTEN:
      if (value == null) {
        unsetSenten();
      } else {
        setSenten((String)value);
      }
      break;

    case PINYIN:
      if (value == null) {
        unsetPinyin();
      } else {
        setPinyin((String)value);
      }
      break;

    case BASIC_SEGS:
      if (value == null) {
        unsetBasic_segs();
      } else {
        setBasic_segs((List<RewriteWord>)value);
      }
      break;

    case PHRASE_SEGS:
      if (value == null) {
        unsetPhrase_segs();
      } else {
        setPhrase_segs((List<RewriteWord>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WEIGHT:
      return Integer.valueOf(getWeight());

    case SENTEN:
      return getSenten();

    case PINYIN:
      return getPinyin();

    case BASIC_SEGS:
      return getBasic_segs();

    case PHRASE_SEGS:
      return getPhrase_segs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WEIGHT:
      return isSetWeight();
    case SENTEN:
      return isSetSenten();
    case PINYIN:
      return isSetPinyin();
    case BASIC_SEGS:
      return isSetBasic_segs();
    case PHRASE_SEGS:
      return isSetPhrase_segs();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RewriteSentence)
      return this.equals((RewriteSentence)that);
    return false;
  }

  public boolean equals(RewriteSentence that) {
    if (that == null)
      return false;

    boolean this_present_weight = true && this.isSetWeight();
    boolean that_present_weight = true && that.isSetWeight();
    if (this_present_weight || that_present_weight) {
      if (!(this_present_weight && that_present_weight))
        return false;
      if (this.weight != that.weight)
        return false;
    }

    boolean this_present_senten = true && this.isSetSenten();
    boolean that_present_senten = true && that.isSetSenten();
    if (this_present_senten || that_present_senten) {
      if (!(this_present_senten && that_present_senten))
        return false;
      if (!this.senten.equals(that.senten))
        return false;
    }

    boolean this_present_pinyin = true && this.isSetPinyin();
    boolean that_present_pinyin = true && that.isSetPinyin();
    if (this_present_pinyin || that_present_pinyin) {
      if (!(this_present_pinyin && that_present_pinyin))
        return false;
      if (!this.pinyin.equals(that.pinyin))
        return false;
    }

    boolean this_present_basic_segs = true && this.isSetBasic_segs();
    boolean that_present_basic_segs = true && that.isSetBasic_segs();
    if (this_present_basic_segs || that_present_basic_segs) {
      if (!(this_present_basic_segs && that_present_basic_segs))
        return false;
      if (!this.basic_segs.equals(that.basic_segs))
        return false;
    }

    boolean this_present_phrase_segs = true && this.isSetPhrase_segs();
    boolean that_present_phrase_segs = true && that.isSetPhrase_segs();
    if (this_present_phrase_segs || that_present_phrase_segs) {
      if (!(this_present_phrase_segs && that_present_phrase_segs))
        return false;
      if (!this.phrase_segs.equals(that.phrase_segs))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(RewriteSentence other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWeight()).compareTo(other.isSetWeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.weight, other.weight);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSenten()).compareTo(other.isSetSenten());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSenten()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.senten, other.senten);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPinyin()).compareTo(other.isSetPinyin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPinyin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pinyin, other.pinyin);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBasic_segs()).compareTo(other.isSetBasic_segs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBasic_segs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.basic_segs, other.basic_segs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhrase_segs()).compareTo(other.isSetPhrase_segs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhrase_segs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phrase_segs, other.phrase_segs);
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
    StringBuilder sb = new StringBuilder("RewriteSentence(");
    boolean first = true;

    if (isSetWeight()) {
      sb.append("weight:");
      sb.append(this.weight);
      first = false;
    }
    if (isSetSenten()) {
      if (!first) sb.append(", ");
      sb.append("senten:");
      if (this.senten == null) {
        sb.append("null");
      } else {
        sb.append(this.senten);
      }
      first = false;
    }
    if (isSetPinyin()) {
      if (!first) sb.append(", ");
      sb.append("pinyin:");
      if (this.pinyin == null) {
        sb.append("null");
      } else {
        sb.append(this.pinyin);
      }
      first = false;
    }
    if (isSetBasic_segs()) {
      if (!first) sb.append(", ");
      sb.append("basic_segs:");
      if (this.basic_segs == null) {
        sb.append("null");
      } else {
        sb.append(this.basic_segs);
      }
      first = false;
    }
    if (isSetPhrase_segs()) {
      if (!first) sb.append(", ");
      sb.append("phrase_segs:");
      if (this.phrase_segs == null) {
        sb.append("null");
      } else {
        sb.append(this.phrase_segs);
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

  private static class RewriteSentenceStandardSchemeFactory implements SchemeFactory {
    public RewriteSentenceStandardScheme getScheme() {
      return new RewriteSentenceStandardScheme();
    }
  }

  private static class RewriteSentenceStandardScheme extends StandardScheme<RewriteSentence> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RewriteSentence struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.weight = iprot.readI32();
              struct.setWeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SENTEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.senten = iprot.readString();
              struct.setSentenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PINYIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pinyin = iprot.readString();
              struct.setPinyinIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BASIC_SEGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list358 = iprot.readListBegin();
                struct.basic_segs = new ArrayList<RewriteWord>(_list358.size);
                for (int _i359 = 0; _i359 < _list358.size; ++_i359)
                {
                  RewriteWord _elem360;
                  _elem360 = new RewriteWord();
                  _elem360.read(iprot);
                  struct.basic_segs.add(_elem360);
                }
                iprot.readListEnd();
              }
              struct.setBasic_segsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // PHRASE_SEGS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list361 = iprot.readListBegin();
                struct.phrase_segs = new ArrayList<RewriteWord>(_list361.size);
                for (int _i362 = 0; _i362 < _list361.size; ++_i362)
                {
                  RewriteWord _elem363;
                  _elem363 = new RewriteWord();
                  _elem363.read(iprot);
                  struct.phrase_segs.add(_elem363);
                }
                iprot.readListEnd();
              }
              struct.setPhrase_segsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, RewriteSentence struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetWeight()) {
        oprot.writeFieldBegin(WEIGHT_FIELD_DESC);
        oprot.writeI32(struct.weight);
        oprot.writeFieldEnd();
      }
      if (struct.senten != null) {
        if (struct.isSetSenten()) {
          oprot.writeFieldBegin(SENTEN_FIELD_DESC);
          oprot.writeString(struct.senten);
          oprot.writeFieldEnd();
        }
      }
      if (struct.pinyin != null) {
        if (struct.isSetPinyin()) {
          oprot.writeFieldBegin(PINYIN_FIELD_DESC);
          oprot.writeString(struct.pinyin);
          oprot.writeFieldEnd();
        }
      }
      if (struct.basic_segs != null) {
        if (struct.isSetBasic_segs()) {
          oprot.writeFieldBegin(BASIC_SEGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.basic_segs.size()));
            for (RewriteWord _iter364 : struct.basic_segs)
            {
              _iter364.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.phrase_segs != null) {
        if (struct.isSetPhrase_segs()) {
          oprot.writeFieldBegin(PHRASE_SEGS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.phrase_segs.size()));
            for (RewriteWord _iter365 : struct.phrase_segs)
            {
              _iter365.write(oprot);
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

  private static class RewriteSentenceTupleSchemeFactory implements SchemeFactory {
    public RewriteSentenceTupleScheme getScheme() {
      return new RewriteSentenceTupleScheme();
    }
  }

  private static class RewriteSentenceTupleScheme extends TupleScheme<RewriteSentence> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, RewriteSentence struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetWeight()) {
        optionals.set(0);
      }
      if (struct.isSetSenten()) {
        optionals.set(1);
      }
      if (struct.isSetPinyin()) {
        optionals.set(2);
      }
      if (struct.isSetBasic_segs()) {
        optionals.set(3);
      }
      if (struct.isSetPhrase_segs()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetWeight()) {
        oprot.writeI32(struct.weight);
      }
      if (struct.isSetSenten()) {
        oprot.writeString(struct.senten);
      }
      if (struct.isSetPinyin()) {
        oprot.writeString(struct.pinyin);
      }
      if (struct.isSetBasic_segs()) {
        {
          oprot.writeI32(struct.basic_segs.size());
          for (RewriteWord _iter366 : struct.basic_segs)
          {
            _iter366.write(oprot);
          }
        }
      }
      if (struct.isSetPhrase_segs()) {
        {
          oprot.writeI32(struct.phrase_segs.size());
          for (RewriteWord _iter367 : struct.phrase_segs)
          {
            _iter367.write(oprot);
          }
        }
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, RewriteSentence struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.weight = iprot.readI32();
        struct.setWeightIsSet(true);
      }
      if (incoming.get(1)) {
        struct.senten = iprot.readString();
        struct.setSentenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pinyin = iprot.readString();
        struct.setPinyinIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list368 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.basic_segs = new ArrayList<RewriteWord>(_list368.size);
          for (int _i369 = 0; _i369 < _list368.size; ++_i369)
          {
            RewriteWord _elem370;
            _elem370 = new RewriteWord();
            _elem370.read(iprot);
            struct.basic_segs.add(_elem370);
          }
        }
        struct.setBasic_segsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list371 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.phrase_segs = new ArrayList<RewriteWord>(_list371.size);
          for (int _i372 = 0; _i372 < _list371.size; ++_i372)
          {
            RewriteWord _elem373;
            _elem373 = new RewriteWord();
            _elem373.read(iprot);
            struct.phrase_segs.add(_elem373);
          }
        }
        struct.setPhrase_segsIsSet(true);
      }
    }
  }

}

