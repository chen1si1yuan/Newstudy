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
public class ServiceContext implements org.apache.thrift.TBase<ServiceContext, ServiceContext._Fields>, java.io.Serializable, Cloneable, Comparable<ServiceContext> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ServiceContext");

  private static final org.apache.thrift.protocol.TField REPLY_FROM_SERVICE_FIELD_DESC = new org.apache.thrift.protocol.TField("reply_from_service", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CHAT_FIELD_DESC = new org.apache.thrift.protocol.TField("chat", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SKILL_FIELD_DESC = new org.apache.thrift.protocol.TField("skill", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField IOT_FIELD_DESC = new org.apache.thrift.protocol.TField("iot", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ServiceContextStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ServiceContextTupleSchemeFactory());
  }

  /**
   * 
   * @see ServiceName
   */
  public ServiceName reply_from_service; // optional
  public ChatServiceContext chat; // optional
  public SkillServiceContext skill; // optional
  public IotServiceContext iot; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ServiceName
     */
    REPLY_FROM_SERVICE((short)1, "reply_from_service"),
    CHAT((short)2, "chat"),
    SKILL((short)3, "skill"),
    IOT((short)4, "iot");

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
        case 1: // REPLY_FROM_SERVICE
          return REPLY_FROM_SERVICE;
        case 2: // CHAT
          return CHAT;
        case 3: // SKILL
          return SKILL;
        case 4: // IOT
          return IOT;
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
  private static final _Fields optionals[] = {_Fields.REPLY_FROM_SERVICE,_Fields.CHAT,_Fields.SKILL,_Fields.IOT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REPLY_FROM_SERVICE, new org.apache.thrift.meta_data.FieldMetaData("reply_from_service", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ServiceName.class)));
    tmpMap.put(_Fields.CHAT, new org.apache.thrift.meta_data.FieldMetaData("chat", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ChatServiceContext.class)));
    tmpMap.put(_Fields.SKILL, new org.apache.thrift.meta_data.FieldMetaData("skill", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SkillServiceContext.class)));
    tmpMap.put(_Fields.IOT, new org.apache.thrift.meta_data.FieldMetaData("iot", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, IotServiceContext.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ServiceContext.class, metaDataMap);
  }

  public ServiceContext() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ServiceContext(ServiceContext other) {
    if (other.isSetReply_from_service()) {
      this.reply_from_service = other.reply_from_service;
    }
    if (other.isSetChat()) {
      this.chat = new ChatServiceContext(other.chat);
    }
    if (other.isSetSkill()) {
      this.skill = new SkillServiceContext(other.skill);
    }
    if (other.isSetIot()) {
      this.iot = new IotServiceContext(other.iot);
    }
  }

  public ServiceContext deepCopy() {
    return new ServiceContext(this);
  }

  
  public void clear() {
    this.reply_from_service = null;
    this.chat = null;
    this.skill = null;
    this.iot = null;
  }

  /**
   * 
   * @see ServiceName
   */
  public ServiceName getReply_from_service() {
    return this.reply_from_service;
  }

  /**
   * 
   * @see ServiceName
   */
  public ServiceContext setReply_from_service(ServiceName reply_from_service) {
    this.reply_from_service = reply_from_service;
    return this;
  }

  public void unsetReply_from_service() {
    this.reply_from_service = null;
  }

  /** Returns true if field reply_from_service is set (has been assigned a value) and false otherwise */
  public boolean isSetReply_from_service() {
    return this.reply_from_service != null;
  }

  public void setReply_from_serviceIsSet(boolean value) {
    if (!value) {
      this.reply_from_service = null;
    }
  }

  public ChatServiceContext getChat() {
    return this.chat;
  }

  public ServiceContext setChat(ChatServiceContext chat) {
    this.chat = chat;
    return this;
  }

  public void unsetChat() {
    this.chat = null;
  }

  /** Returns true if field chat is set (has been assigned a value) and false otherwise */
  public boolean isSetChat() {
    return this.chat != null;
  }

  public void setChatIsSet(boolean value) {
    if (!value) {
      this.chat = null;
    }
  }

  public SkillServiceContext getSkill() {
    return this.skill;
  }

  public ServiceContext setSkill(SkillServiceContext skill) {
    this.skill = skill;
    return this;
  }

  public void unsetSkill() {
    this.skill = null;
  }

  /** Returns true if field skill is set (has been assigned a value) and false otherwise */
  public boolean isSetSkill() {
    return this.skill != null;
  }

  public void setSkillIsSet(boolean value) {
    if (!value) {
      this.skill = null;
    }
  }

  public IotServiceContext getIot() {
    return this.iot;
  }

  public ServiceContext setIot(IotServiceContext iot) {
    this.iot = iot;
    return this;
  }

  public void unsetIot() {
    this.iot = null;
  }

  /** Returns true if field iot is set (has been assigned a value) and false otherwise */
  public boolean isSetIot() {
    return this.iot != null;
  }

  public void setIotIsSet(boolean value) {
    if (!value) {
      this.iot = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REPLY_FROM_SERVICE:
      if (value == null) {
        unsetReply_from_service();
      } else {
        setReply_from_service((ServiceName)value);
      }
      break;

    case CHAT:
      if (value == null) {
        unsetChat();
      } else {
        setChat((ChatServiceContext)value);
      }
      break;

    case SKILL:
      if (value == null) {
        unsetSkill();
      } else {
        setSkill((SkillServiceContext)value);
      }
      break;

    case IOT:
      if (value == null) {
        unsetIot();
      } else {
        setIot((IotServiceContext)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REPLY_FROM_SERVICE:
      return getReply_from_service();

    case CHAT:
      return getChat();

    case SKILL:
      return getSkill();

    case IOT:
      return getIot();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REPLY_FROM_SERVICE:
      return isSetReply_from_service();
    case CHAT:
      return isSetChat();
    case SKILL:
      return isSetSkill();
    case IOT:
      return isSetIot();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ServiceContext)
      return this.equals((ServiceContext)that);
    return false;
  }

  public boolean equals(ServiceContext that) {
    if (that == null)
      return false;

    boolean this_present_reply_from_service = true && this.isSetReply_from_service();
    boolean that_present_reply_from_service = true && that.isSetReply_from_service();
    if (this_present_reply_from_service || that_present_reply_from_service) {
      if (!(this_present_reply_from_service && that_present_reply_from_service))
        return false;
      if (!this.reply_from_service.equals(that.reply_from_service))
        return false;
    }

    boolean this_present_chat = true && this.isSetChat();
    boolean that_present_chat = true && that.isSetChat();
    if (this_present_chat || that_present_chat) {
      if (!(this_present_chat && that_present_chat))
        return false;
      if (!this.chat.equals(that.chat))
        return false;
    }

    boolean this_present_skill = true && this.isSetSkill();
    boolean that_present_skill = true && that.isSetSkill();
    if (this_present_skill || that_present_skill) {
      if (!(this_present_skill && that_present_skill))
        return false;
      if (!this.skill.equals(that.skill))
        return false;
    }

    boolean this_present_iot = true && this.isSetIot();
    boolean that_present_iot = true && that.isSetIot();
    if (this_present_iot || that_present_iot) {
      if (!(this_present_iot && that_present_iot))
        return false;
      if (!this.iot.equals(that.iot))
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(ServiceContext other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetReply_from_service()).compareTo(other.isSetReply_from_service());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReply_from_service()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reply_from_service, other.reply_from_service);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChat()).compareTo(other.isSetChat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chat, other.chat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSkill()).compareTo(other.isSetSkill());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSkill()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.skill, other.skill);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIot()).compareTo(other.isSetIot());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIot()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.iot, other.iot);
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
    StringBuilder sb = new StringBuilder("ServiceContext(");
    boolean first = true;

    if (isSetReply_from_service()) {
      sb.append("reply_from_service:");
      if (this.reply_from_service == null) {
        sb.append("null");
      } else {
        sb.append(this.reply_from_service);
      }
      first = false;
    }
    if (isSetChat()) {
      if (!first) sb.append(", ");
      sb.append("chat:");
      if (this.chat == null) {
        sb.append("null");
      } else {
        sb.append(this.chat);
      }
      first = false;
    }
    if (isSetSkill()) {
      if (!first) sb.append(", ");
      sb.append("skill:");
      if (this.skill == null) {
        sb.append("null");
      } else {
        sb.append(this.skill);
      }
      first = false;
    }
    if (isSetIot()) {
      if (!first) sb.append(", ");
      sb.append("iot:");
      if (this.iot == null) {
        sb.append("null");
      } else {
        sb.append(this.iot);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (chat != null) {
      chat.validate();
    }
    if (skill != null) {
      skill.validate();
    }
    if (iot != null) {
      iot.validate();
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

  private static class ServiceContextStandardSchemeFactory implements SchemeFactory {
    public ServiceContextStandardScheme getScheme() {
      return new ServiceContextStandardScheme();
    }
  }

  private static class ServiceContextStandardScheme extends StandardScheme<ServiceContext> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ServiceContext struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REPLY_FROM_SERVICE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reply_from_service = ServiceName.findByValue(iprot.readI32());
              struct.setReply_from_serviceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHAT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.chat = new ChatServiceContext();
              struct.chat.read(iprot);
              struct.setChatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SKILL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.skill = new SkillServiceContext();
              struct.skill.read(iprot);
              struct.setSkillIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IOT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.iot = new IotServiceContext();
              struct.iot.read(iprot);
              struct.setIotIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ServiceContext struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reply_from_service != null) {
        if (struct.isSetReply_from_service()) {
          oprot.writeFieldBegin(REPLY_FROM_SERVICE_FIELD_DESC);
          oprot.writeI32(struct.reply_from_service.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.chat != null) {
        if (struct.isSetChat()) {
          oprot.writeFieldBegin(CHAT_FIELD_DESC);
          struct.chat.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.skill != null) {
        if (struct.isSetSkill()) {
          oprot.writeFieldBegin(SKILL_FIELD_DESC);
          struct.skill.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.iot != null) {
        if (struct.isSetIot()) {
          oprot.writeFieldBegin(IOT_FIELD_DESC);
          struct.iot.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ServiceContextTupleSchemeFactory implements SchemeFactory {
    public ServiceContextTupleScheme getScheme() {
      return new ServiceContextTupleScheme();
    }
  }

  private static class ServiceContextTupleScheme extends TupleScheme<ServiceContext> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, ServiceContext struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReply_from_service()) {
        optionals.set(0);
      }
      if (struct.isSetChat()) {
        optionals.set(1);
      }
      if (struct.isSetSkill()) {
        optionals.set(2);
      }
      if (struct.isSetIot()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetReply_from_service()) {
        oprot.writeI32(struct.reply_from_service.getValue());
      }
      if (struct.isSetChat()) {
        struct.chat.write(oprot);
      }
      if (struct.isSetSkill()) {
        struct.skill.write(oprot);
      }
      if (struct.isSetIot()) {
        struct.iot.write(oprot);
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, ServiceContext struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.reply_from_service = ServiceName.findByValue(iprot.readI32());
        struct.setReply_from_serviceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.chat = new ChatServiceContext();
        struct.chat.read(iprot);
        struct.setChatIsSet(true);
      }
      if (incoming.get(2)) {
        struct.skill = new SkillServiceContext();
        struct.skill.read(iprot);
        struct.setSkillIsSet(true);
      }
      if (incoming.get(3)) {
        struct.iot = new IotServiceContext();
        struct.iot.read(iprot);
        struct.setIotIsSet(true);
      }
    }
  }

}

