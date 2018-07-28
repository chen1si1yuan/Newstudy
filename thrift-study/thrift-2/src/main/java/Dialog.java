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
public class Dialog implements org.apache.thrift.TBase<Dialog, Dialog._Fields>, java.io.Serializable, Cloneable, Comparable<Dialog> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Dialog");

  private static final org.apache.thrift.protocol.TField USER_QUERY_FIELD_DESC = new org.apache.thrift.protocol.TField("user_query", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BOT_REPLY_FIELD_DESC = new org.apache.thrift.protocol.TField("bot_reply", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField BOT_PROACTIVE_REPLY_FIELD_DESC = new org.apache.thrift.protocol.TField("bot_proactive_reply", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField REQUEST_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("request_timestamp", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField RESPONSE_TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("response_timestamp", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DialogStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DialogTupleSchemeFactory());
  }

  public String user_query; // optional
  public Reply bot_reply; // optional
  public ProactiveReply bot_proactive_reply; // optional
  public long request_timestamp; // optional
  public long response_timestamp; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_QUERY((short)1, "user_query"),
    BOT_REPLY((short)2, "bot_reply"),
    BOT_PROACTIVE_REPLY((short)3, "bot_proactive_reply"),
    REQUEST_TIMESTAMP((short)4, "request_timestamp"),
    RESPONSE_TIMESTAMP((short)5, "response_timestamp");

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
        case 1: // USER_QUERY
          return USER_QUERY;
        case 2: // BOT_REPLY
          return BOT_REPLY;
        case 3: // BOT_PROACTIVE_REPLY
          return BOT_PROACTIVE_REPLY;
        case 4: // REQUEST_TIMESTAMP
          return REQUEST_TIMESTAMP;
        case 5: // RESPONSE_TIMESTAMP
          return RESPONSE_TIMESTAMP;
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
  private static final int __REQUEST_TIMESTAMP_ISSET_ID = 0;
  private static final int __RESPONSE_TIMESTAMP_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.USER_QUERY,_Fields.BOT_REPLY,_Fields.BOT_PROACTIVE_REPLY,_Fields.REQUEST_TIMESTAMP,_Fields.RESPONSE_TIMESTAMP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_QUERY, new org.apache.thrift.meta_data.FieldMetaData("user_query", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BOT_REPLY, new org.apache.thrift.meta_data.FieldMetaData("bot_reply", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Reply.class)));
    tmpMap.put(_Fields.BOT_PROACTIVE_REPLY, new org.apache.thrift.meta_data.FieldMetaData("bot_proactive_reply", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ProactiveReply.class)));
    tmpMap.put(_Fields.REQUEST_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("request_timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RESPONSE_TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("response_timestamp", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Dialog.class, metaDataMap);
  }

  public Dialog() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Dialog(Dialog other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUser_query()) {
      this.user_query = other.user_query;
    }
    if (other.isSetBot_reply()) {
      this.bot_reply = new Reply(other.bot_reply);
    }
    if (other.isSetBot_proactive_reply()) {
      this.bot_proactive_reply = new ProactiveReply(other.bot_proactive_reply);
    }
    this.request_timestamp = other.request_timestamp;
    this.response_timestamp = other.response_timestamp;
  }

  public Dialog deepCopy() {
    return new Dialog(this);
  }

  
  public void clear() {
    this.user_query = null;
    this.bot_reply = null;
    this.bot_proactive_reply = null;
    setRequest_timestampIsSet(false);
    this.request_timestamp = 0;
    setResponse_timestampIsSet(false);
    this.response_timestamp = 0;
  }

  public String getUser_query() {
    return this.user_query;
  }

  public Dialog setUser_query(String user_query) {
    this.user_query = user_query;
    return this;
  }

  public void unsetUser_query() {
    this.user_query = null;
  }

  /** Returns true if field user_query is set (has been assigned a value) and false otherwise */
  public boolean isSetUser_query() {
    return this.user_query != null;
  }

  public void setUser_queryIsSet(boolean value) {
    if (!value) {
      this.user_query = null;
    }
  }

  public Reply getBot_reply() {
    return this.bot_reply;
  }

  public Dialog setBot_reply(Reply bot_reply) {
    this.bot_reply = bot_reply;
    return this;
  }

  public void unsetBot_reply() {
    this.bot_reply = null;
  }

  /** Returns true if field bot_reply is set (has been assigned a value) and false otherwise */
  public boolean isSetBot_reply() {
    return this.bot_reply != null;
  }

  public void setBot_replyIsSet(boolean value) {
    if (!value) {
      this.bot_reply = null;
    }
  }

  public ProactiveReply getBot_proactive_reply() {
    return this.bot_proactive_reply;
  }

  public Dialog setBot_proactive_reply(ProactiveReply bot_proactive_reply) {
    this.bot_proactive_reply = bot_proactive_reply;
    return this;
  }

  public void unsetBot_proactive_reply() {
    this.bot_proactive_reply = null;
  }

  /** Returns true if field bot_proactive_reply is set (has been assigned a value) and false otherwise */
  public boolean isSetBot_proactive_reply() {
    return this.bot_proactive_reply != null;
  }

  public void setBot_proactive_replyIsSet(boolean value) {
    if (!value) {
      this.bot_proactive_reply = null;
    }
  }

  public long getRequest_timestamp() {
    return this.request_timestamp;
  }

  public Dialog setRequest_timestamp(long request_timestamp) {
    this.request_timestamp = request_timestamp;
    setRequest_timestampIsSet(true);
    return this;
  }

  public void unsetRequest_timestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUEST_TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field request_timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetRequest_timestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __REQUEST_TIMESTAMP_ISSET_ID);
  }

  public void setRequest_timestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUEST_TIMESTAMP_ISSET_ID, value);
  }

  public long getResponse_timestamp() {
    return this.response_timestamp;
  }

  public Dialog setResponse_timestamp(long response_timestamp) {
    this.response_timestamp = response_timestamp;
    setResponse_timestampIsSet(true);
    return this;
  }

  public void unsetResponse_timestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESPONSE_TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field response_timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetResponse_timestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __RESPONSE_TIMESTAMP_ISSET_ID);
  }

  public void setResponse_timestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESPONSE_TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_QUERY:
      if (value == null) {
        unsetUser_query();
      } else {
        setUser_query((String)value);
      }
      break;

    case BOT_REPLY:
      if (value == null) {
        unsetBot_reply();
      } else {
        setBot_reply((Reply)value);
      }
      break;

    case BOT_PROACTIVE_REPLY:
      if (value == null) {
        unsetBot_proactive_reply();
      } else {
        setBot_proactive_reply((ProactiveReply)value);
      }
      break;

    case REQUEST_TIMESTAMP:
      if (value == null) {
        unsetRequest_timestamp();
      } else {
        setRequest_timestamp((Long)value);
      }
      break;

    case RESPONSE_TIMESTAMP:
      if (value == null) {
        unsetResponse_timestamp();
      } else {
        setResponse_timestamp((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_QUERY:
      return getUser_query();

    case BOT_REPLY:
      return getBot_reply();

    case BOT_PROACTIVE_REPLY:
      return getBot_proactive_reply();

    case REQUEST_TIMESTAMP:
      return Long.valueOf(getRequest_timestamp());

    case RESPONSE_TIMESTAMP:
      return Long.valueOf(getResponse_timestamp());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_QUERY:
      return isSetUser_query();
    case BOT_REPLY:
      return isSetBot_reply();
    case BOT_PROACTIVE_REPLY:
      return isSetBot_proactive_reply();
    case REQUEST_TIMESTAMP:
      return isSetRequest_timestamp();
    case RESPONSE_TIMESTAMP:
      return isSetResponse_timestamp();
    }
    throw new IllegalStateException();
  }

  
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Dialog)
      return this.equals((Dialog)that);
    return false;
  }

  public boolean equals(Dialog that) {
    if (that == null)
      return false;

    boolean this_present_user_query = true && this.isSetUser_query();
    boolean that_present_user_query = true && that.isSetUser_query();
    if (this_present_user_query || that_present_user_query) {
      if (!(this_present_user_query && that_present_user_query))
        return false;
      if (!this.user_query.equals(that.user_query))
        return false;
    }

    boolean this_present_bot_reply = true && this.isSetBot_reply();
    boolean that_present_bot_reply = true && that.isSetBot_reply();
    if (this_present_bot_reply || that_present_bot_reply) {
      if (!(this_present_bot_reply && that_present_bot_reply))
        return false;
      if (!this.bot_reply.equals(that.bot_reply))
        return false;
    }

    boolean this_present_bot_proactive_reply = true && this.isSetBot_proactive_reply();
    boolean that_present_bot_proactive_reply = true && that.isSetBot_proactive_reply();
    if (this_present_bot_proactive_reply || that_present_bot_proactive_reply) {
      if (!(this_present_bot_proactive_reply && that_present_bot_proactive_reply))
        return false;
      if (!this.bot_proactive_reply.equals(that.bot_proactive_reply))
        return false;
    }

    boolean this_present_request_timestamp = true && this.isSetRequest_timestamp();
    boolean that_present_request_timestamp = true && that.isSetRequest_timestamp();
    if (this_present_request_timestamp || that_present_request_timestamp) {
      if (!(this_present_request_timestamp && that_present_request_timestamp))
        return false;
      if (this.request_timestamp != that.request_timestamp)
        return false;
    }

    boolean this_present_response_timestamp = true && this.isSetResponse_timestamp();
    boolean that_present_response_timestamp = true && that.isSetResponse_timestamp();
    if (this_present_response_timestamp || that_present_response_timestamp) {
      if (!(this_present_response_timestamp && that_present_response_timestamp))
        return false;
      if (this.response_timestamp != that.response_timestamp)
        return false;
    }

    return true;
  }

  
  public int hashCode() {
    return 0;
  }

  
  public int compareTo(Dialog other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUser_query()).compareTo(other.isSetUser_query());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUser_query()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.user_query, other.user_query);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBot_reply()).compareTo(other.isSetBot_reply());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBot_reply()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bot_reply, other.bot_reply);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBot_proactive_reply()).compareTo(other.isSetBot_proactive_reply());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBot_proactive_reply()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bot_proactive_reply, other.bot_proactive_reply);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequest_timestamp()).compareTo(other.isSetRequest_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequest_timestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.request_timestamp, other.request_timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponse_timestamp()).compareTo(other.isSetResponse_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponse_timestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.response_timestamp, other.response_timestamp);
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
    StringBuilder sb = new StringBuilder("Dialog(");
    boolean first = true;

    if (isSetUser_query()) {
      sb.append("user_query:");
      if (this.user_query == null) {
        sb.append("null");
      } else {
        sb.append(this.user_query);
      }
      first = false;
    }
    if (isSetBot_reply()) {
      if (!first) sb.append(", ");
      sb.append("bot_reply:");
      if (this.bot_reply == null) {
        sb.append("null");
      } else {
        sb.append(this.bot_reply);
      }
      first = false;
    }
    if (isSetBot_proactive_reply()) {
      if (!first) sb.append(", ");
      sb.append("bot_proactive_reply:");
      if (this.bot_proactive_reply == null) {
        sb.append("null");
      } else {
        sb.append(this.bot_proactive_reply);
      }
      first = false;
    }
    if (isSetRequest_timestamp()) {
      if (!first) sb.append(", ");
      sb.append("request_timestamp:");
      sb.append(this.request_timestamp);
      first = false;
    }
    if (isSetResponse_timestamp()) {
      if (!first) sb.append(", ");
      sb.append("response_timestamp:");
      sb.append(this.response_timestamp);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (bot_reply != null) {
      bot_reply.validate();
    }
    if (bot_proactive_reply != null) {
      bot_proactive_reply.validate();
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

  private static class DialogStandardSchemeFactory implements SchemeFactory {
    public DialogStandardScheme getScheme() {
      return new DialogStandardScheme();
    }
  }

  private static class DialogStandardScheme extends StandardScheme<Dialog> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Dialog struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_QUERY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.user_query = iprot.readString();
              struct.setUser_queryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BOT_REPLY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.bot_reply = new Reply();
              struct.bot_reply.read(iprot);
              struct.setBot_replyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BOT_PROACTIVE_REPLY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.bot_proactive_reply = new ProactiveReply();
              struct.bot_proactive_reply.read(iprot);
              struct.setBot_proactive_replyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REQUEST_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.request_timestamp = iprot.readI64();
              struct.setRequest_timestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RESPONSE_TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.response_timestamp = iprot.readI64();
              struct.setResponse_timestampIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Dialog struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.user_query != null) {
        if (struct.isSetUser_query()) {
          oprot.writeFieldBegin(USER_QUERY_FIELD_DESC);
          oprot.writeString(struct.user_query);
          oprot.writeFieldEnd();
        }
      }
      if (struct.bot_reply != null) {
        if (struct.isSetBot_reply()) {
          oprot.writeFieldBegin(BOT_REPLY_FIELD_DESC);
          struct.bot_reply.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.bot_proactive_reply != null) {
        if (struct.isSetBot_proactive_reply()) {
          oprot.writeFieldBegin(BOT_PROACTIVE_REPLY_FIELD_DESC);
          struct.bot_proactive_reply.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRequest_timestamp()) {
        oprot.writeFieldBegin(REQUEST_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.request_timestamp);
        oprot.writeFieldEnd();
      }
      if (struct.isSetResponse_timestamp()) {
        oprot.writeFieldBegin(RESPONSE_TIMESTAMP_FIELD_DESC);
        oprot.writeI64(struct.response_timestamp);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DialogTupleSchemeFactory implements SchemeFactory {
    public DialogTupleScheme getScheme() {
      return new DialogTupleScheme();
    }
  }

  private static class DialogTupleScheme extends TupleScheme<Dialog> {

    
    public void write(org.apache.thrift.protocol.TProtocol prot, Dialog struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUser_query()) {
        optionals.set(0);
      }
      if (struct.isSetBot_reply()) {
        optionals.set(1);
      }
      if (struct.isSetBot_proactive_reply()) {
        optionals.set(2);
      }
      if (struct.isSetRequest_timestamp()) {
        optionals.set(3);
      }
      if (struct.isSetResponse_timestamp()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetUser_query()) {
        oprot.writeString(struct.user_query);
      }
      if (struct.isSetBot_reply()) {
        struct.bot_reply.write(oprot);
      }
      if (struct.isSetBot_proactive_reply()) {
        struct.bot_proactive_reply.write(oprot);
      }
      if (struct.isSetRequest_timestamp()) {
        oprot.writeI64(struct.request_timestamp);
      }
      if (struct.isSetResponse_timestamp()) {
        oprot.writeI64(struct.response_timestamp);
      }
    }

    
    public void read(org.apache.thrift.protocol.TProtocol prot, Dialog struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.user_query = iprot.readString();
        struct.setUser_queryIsSet(true);
      }
      if (incoming.get(1)) {
        struct.bot_reply = new Reply();
        struct.bot_reply.read(iprot);
        struct.setBot_replyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.bot_proactive_reply = new ProactiveReply();
        struct.bot_proactive_reply.read(iprot);
        struct.setBot_proactive_replyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.request_timestamp = iprot.readI64();
        struct.setRequest_timestampIsSet(true);
      }
      if (incoming.get(4)) {
        struct.response_timestamp = iprot.readI64();
        struct.setResponse_timestampIsSet(true);
      }
    }
  }

}

