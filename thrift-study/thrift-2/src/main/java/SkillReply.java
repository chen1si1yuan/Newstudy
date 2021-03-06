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
public class SkillReply implements org.apache.thrift.TBase<SkillReply, SkillReply._Fields>, java.io.Serializable, Cloneable, Comparable<SkillReply> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SkillReply");

  private static final org.apache.thrift.protocol.TField REPLY_FIELD_DESC = new org.apache.thrift.protocol.TField("reply", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField UI_REPLY_FIELD_DESC = new org.apache.thrift.protocol.TField("ui_reply", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EMOTION_FIELD_DESC = new org.apache.thrift.protocol.TField("emotion", org.apache.thrift.protocol.TType.I16, (short)3);
  private static final org.apache.thrift.protocol.TField SPORT_INSTRACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("sportInstraction", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField MUSIC_FIELD_DESC = new org.apache.thrift.protocol.TField("music", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SkillReplyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SkillReplyTupleSchemeFactory());
  }

  public String reply; // optional
  public String ui_reply; // optional
  public short emotion; // optional
  /**
   * 
   * @see .Instruction
   */
  public Instruction sportInstraction; // optional
  public music music; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REPLY((short)1, "reply"),
    UI_REPLY((short)2, "ui_reply"),
    EMOTION((short)3, "emotion"),
    /**
     * 
     * @see .Instruction
     */
    SPORT_INSTRACTION((short)4, "sportInstraction"),
    MUSIC((short)5, "music");

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
        case 1: // REPLY
          return REPLY;
        case 2: // UI_REPLY
          return UI_REPLY;
        case 3: // EMOTION
          return EMOTION;
        case 4: // SPORT_INSTRACTION
          return SPORT_INSTRACTION;
        case 5: // MUSIC
          return MUSIC;
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
  private static final int __EMOTION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.REPLY,_Fields.UI_REPLY,_Fields.EMOTION,_Fields.SPORT_INSTRACTION,_Fields.MUSIC};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REPLY, new org.apache.thrift.meta_data.FieldMetaData("reply", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UI_REPLY, new org.apache.thrift.meta_data.FieldMetaData("ui_reply", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMOTION, new org.apache.thrift.meta_data.FieldMetaData("emotion", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.SPORT_INSTRACTION, new org.apache.thrift.meta_data.FieldMetaData("sportInstraction", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Instruction.class)));
    tmpMap.put(_Fields.MUSIC, new org.apache.thrift.meta_data.FieldMetaData("music", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, music.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SkillReply.class, metaDataMap);
  }

  public SkillReply() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SkillReply(SkillReply other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetReply()) {
      this.reply = other.reply;
    }
    if (other.isSetUi_reply()) {
      this.ui_reply = other.ui_reply;
    }
    this.emotion = other.emotion;
    if (other.isSetSportInstraction()) {
      this.sportInstraction = other.sportInstraction;
    }
    if (other.isSetMusic()) {
      this.music = new music(other.music);
    }
  }

  public SkillReply deepCopy() {
    return new SkillReply(this);
  }

  
  public void clear() {
    this.reply = null;
    this.ui_reply = null;
    setEmotionIsSet(false);
    this.emotion = 0;
    this.sportInstraction = null;
    this.music = null;
  }

  public String getReply() {
    return this.reply;
  }

  public SkillReply setReply(String reply) {
    this.reply = reply;
    return this;
  }

  public void unsetReply() {
    this.reply = null;
  }

  /** Returns true if field reply is set (has been assigned a value) and false otherwise */
  public boolean isSetReply() {
    return this.reply != null;
  }

  public void setReplyIsSet(boolean value) {
    if (!value) {
      this.reply = null;
    }
  }

  public String getUi_reply() {
    return this.ui_reply;
  }

  public SkillReply setUi_reply(String ui_reply) {
    this.ui_reply = ui_reply;
    return this;
  }

  public void unsetUi_reply() {
    this.ui_reply = null;
  }

  /** Returns true if field ui_reply is set (has been assigned a value) and false otherwise */
  public boolean isSetUi_reply() {
    return this.ui_reply != null;
  }

  public void setUi_replyIsSet(boolean value) {
    if (!value) {
      this.ui_reply = null;
    }
  }

  public short getEmotion() {
    return this.emotion;
  }

  public SkillReply setEmotion(short emotion) {
    this.emotion = emotion;
    setEmotionIsSet(true);
    return this;
  }

  public void unsetEmotion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EMOTION_ISSET_ID);
  }

  /** Returns true if field emotion is set (has been assigned a value) and false otherwise */
  public boolean isSetEmotion() {
    return EncodingUtils.testBit(__isset_bitfield, __EMOTION_ISSET_ID);
  }

  public void setEmotionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EMOTION_ISSET_ID, value);
  }

  /**
   * 
   * @see .Instruction
   */
  public Instruction getSportInstraction() {
    return this.sportInstraction;
  }

  /**
   * 
   * @see .Instruction
   */
  public SkillReply setSportInstraction(Instruction sportInstraction) {
    this.sportInstraction = sportInstraction;
    return this;
  }

  public void unsetSportInstraction() {
    this.sportInstraction = null;
  }

  /** Returns true if field sportInstraction is set (has been assigned a value) and false otherwise */
  public boolean isSetSportInstraction() {
    return this.sportInstraction != null;
  }

  public void setSportInstractionIsSet(boolean value) {
    if (!value) {
      this.sportInstraction = null;
    }
  }

  public music getMusic() {
    return this.music;
  }

  public SkillReply setMusic(music music) {
    this.music = music;
    return this;
  }

  public void unsetMusic() {
    this.music = null;
  }

  /** Returns true if field music is set (has been assigned a value) and false otherwise */
  public boolean isSetMusic() {
    return this.music != null;
  }

  public void setMusicIsSet(boolean value) {
    if (!value) {
      this.music = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REPLY:
      if (value == null) {
        unsetReply();
      } else {
        setReply((String)value);
      }
      break;

    case UI_REPLY:
      if (value == null) {
        unsetUi_reply();
      } else {
        setUi_reply((String)value);
      }
      break;

    case EMOTION:
      if (value == null) {
        unsetEmotion();
      } else {
        setEmotion((Short)value);
      }
      break;

    case SPORT_INSTRACTION:
      if (value == null) {
        unsetSportInstraction();
      } else {
        setSportInstraction((Instruction)value);
      }
      break;

    case MUSIC:
      if (value == null) {
        unsetMusic();
      } else {
        setMusic((music)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REPLY:
      return getReply();

    case UI_REPLY:
      return getUi_reply();

    case EMOTION:
      return Short.valueOf(getEmotion());

    case SPORT_INSTRACTION:
      return getSportInstraction();

    case MUSIC:
      return getMusic();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REPLY:
      return isSetReply();
    case UI_REPLY:
      return isSetUi_reply();
    case EMOTION:
      return isSetEmotion();
    case SPORT_INSTRACTION:
      return isSetSportInstraction();
    case MUSIC:
      return isSetMusic();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SkillReply)
      return this.equals((SkillReply)that);
    return false;
  }

  public boolean equals(SkillReply that) {
    if (that == null)
      return false;

    boolean this_present_reply = true && this.isSetReply();
    boolean that_present_reply = true && that.isSetReply();
    if (this_present_reply || that_present_reply) {
      if (!(this_present_reply && that_present_reply))
        return false;
      if (!this.reply.equals(that.reply))
        return false;
    }

    boolean this_present_ui_reply = true && this.isSetUi_reply();
    boolean that_present_ui_reply = true && that.isSetUi_reply();
    if (this_present_ui_reply || that_present_ui_reply) {
      if (!(this_present_ui_reply && that_present_ui_reply))
        return false;
      if (!this.ui_reply.equals(that.ui_reply))
        return false;
    }

    boolean this_present_emotion = true && this.isSetEmotion();
    boolean that_present_emotion = true && that.isSetEmotion();
    if (this_present_emotion || that_present_emotion) {
      if (!(this_present_emotion && that_present_emotion))
        return false;
      if (this.emotion != that.emotion)
        return false;
    }

    boolean this_present_sportInstraction = true && this.isSetSportInstraction();
    boolean that_present_sportInstraction = true && that.isSetSportInstraction();
    if (this_present_sportInstraction || that_present_sportInstraction) {
      if (!(this_present_sportInstraction && that_present_sportInstraction))
        return false;
      if (!this.sportInstraction.equals(that.sportInstraction))
        return false;
    }

    boolean this_present_music = true && this.isSetMusic();
    boolean that_present_music = true && that.isSetMusic();
    if (this_present_music || that_present_music) {
      if (!(this_present_music && that_present_music))
        return false;
      if (!this.music.equals(that.music))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(SkillReply other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReply()).compareTo(other.isSetReply());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReply()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reply, other.reply);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUi_reply()).compareTo(other.isSetUi_reply());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUi_reply()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ui_reply, other.ui_reply);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmotion()).compareTo(other.isSetEmotion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmotion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emotion, other.emotion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSportInstraction()).compareTo(other.isSetSportInstraction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSportInstraction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sportInstraction, other.sportInstraction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMusic()).compareTo(other.isSetMusic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMusic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.music, other.music);
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
    StringBuilder sb = new StringBuilder("SkillReply(");
    boolean first = true;

    if (isSetReply()) {
      sb.append("reply:");
      if (this.reply == null) {
        sb.append("null");
      } else {
        sb.append(this.reply);
      }
      first = false;
    }
    if (isSetUi_reply()) {
      if (!first) sb.append(", ");
      sb.append("ui_reply:");
      if (this.ui_reply == null) {
        sb.append("null");
      } else {
        sb.append(this.ui_reply);
      }
      first = false;
    }
    if (isSetEmotion()) {
      if (!first) sb.append(", ");
      sb.append("emotion:");
      sb.append(this.emotion);
      first = false;
    }
    if (isSetSportInstraction()) {
      if (!first) sb.append(", ");
      sb.append("sportInstraction:");
      if (this.sportInstraction == null) {
        sb.append("null");
      } else {
        sb.append(this.sportInstraction);
      }
      first = false;
    }
    if (isSetMusic()) {
      if (!first) sb.append(", ");
      sb.append("music:");
      if (this.music == null) {
        sb.append("null");
      } else {
        sb.append(this.music);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (music != null) {
      music.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SkillReplyStandardSchemeFactory implements SchemeFactory {
    public SkillReplyStandardScheme getScheme() {
      return new SkillReplyStandardScheme();
    }
  }

  private static class SkillReplyStandardScheme extends StandardScheme<SkillReply> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SkillReply struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REPLY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reply = iprot.readString();
              struct.setReplyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UI_REPLY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ui_reply = iprot.readString();
              struct.setUi_replyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EMOTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.emotion = iprot.readI16();
              struct.setEmotionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SPORT_INSTRACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sportInstraction = Instruction.findByValue(iprot.readI32());
              struct.setSportInstractionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MUSIC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.music = new music();
              struct.music.read(iprot);
              struct.setMusicIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SkillReply struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reply != null) {
        if (struct.isSetReply()) {
          oprot.writeFieldBegin(REPLY_FIELD_DESC);
          oprot.writeString(struct.reply);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ui_reply != null) {
        if (struct.isSetUi_reply()) {
          oprot.writeFieldBegin(UI_REPLY_FIELD_DESC);
          oprot.writeString(struct.ui_reply);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetEmotion()) {
        oprot.writeFieldBegin(EMOTION_FIELD_DESC);
        oprot.writeI16(struct.emotion);
        oprot.writeFieldEnd();
      }
      if (struct.sportInstraction != null) {
        if (struct.isSetSportInstraction()) {
          oprot.writeFieldBegin(SPORT_INSTRACTION_FIELD_DESC);
          oprot.writeI32(struct.sportInstraction.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.music != null) {
        if (struct.isSetMusic()) {
          oprot.writeFieldBegin(MUSIC_FIELD_DESC);
          struct.music.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SkillReplyTupleSchemeFactory implements SchemeFactory {
    public SkillReplyTupleScheme getScheme() {
      return new SkillReplyTupleScheme();
    }
  }

  private static class SkillReplyTupleScheme extends TupleScheme<SkillReply> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, SkillReply struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReply()) {
        optionals.set(0);
      }
      if (struct.isSetUi_reply()) {
        optionals.set(1);
      }
      if (struct.isSetEmotion()) {
        optionals.set(2);
      }
      if (struct.isSetSportInstraction()) {
        optionals.set(3);
      }
      if (struct.isSetMusic()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetReply()) {
        oprot.writeString(struct.reply);
      }
      if (struct.isSetUi_reply()) {
        oprot.writeString(struct.ui_reply);
      }
      if (struct.isSetEmotion()) {
        oprot.writeI16(struct.emotion);
      }
      if (struct.isSetSportInstraction()) {
        oprot.writeI32(struct.sportInstraction.getValue());
      }
      if (struct.isSetMusic()) {
        struct.music.write(oprot);
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, SkillReply struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.reply = iprot.readString();
        struct.setReplyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ui_reply = iprot.readString();
        struct.setUi_replyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.emotion = iprot.readI16();
        struct.setEmotionIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sportInstraction = Instruction.findByValue(iprot.readI32());
        struct.setSportInstractionIsSet(true);
      }
      if (incoming.get(4)) {
        struct.music = new music();
        struct.music.read(iprot);
        struct.setMusicIsSet(true);
      }
    }
  }

}

