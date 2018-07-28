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
public class SysProfileServing {

  public interface Iface {

    public DataBundle SysProfileProcess(DataBundle bundle) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void SysProfileProcess(DataBundle bundle, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public DataBundle SysProfileProcess(DataBundle bundle) throws org.apache.thrift.TException
    {
      send_SysProfileProcess(bundle);
      return recv_SysProfileProcess();
    }

    public void send_SysProfileProcess(DataBundle bundle) throws org.apache.thrift.TException
    {
      SysProfileProcess_args args = new SysProfileProcess_args();
      args.setBundle(bundle);
      sendBase("SysProfileProcess", args);
    }

    public DataBundle recv_SysProfileProcess() throws org.apache.thrift.TException
    {
      SysProfileProcess_result result = new SysProfileProcess_result();
      receiveBase(result, "SysProfileProcess");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "SysProfileProcess failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void SysProfileProcess(DataBundle bundle, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      SysProfileProcess_call method_call = new SysProfileProcess_call(bundle, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class SysProfileProcess_call extends org.apache.thrift.async.TAsyncMethodCall {
      private DataBundle bundle;
      public SysProfileProcess_call(DataBundle bundle, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.bundle = bundle;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("SysProfileProcess", org.apache.thrift.protocol.TMessageType.CALL, 0));
        SysProfileProcess_args args = new SysProfileProcess_args();
        args.setBundle(bundle);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public DataBundle getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_SysProfileProcess();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("SysProfileProcess", new SysProfileProcess());
      return processMap;
    }

    public static class SysProfileProcess<I extends Iface> extends org.apache.thrift.ProcessFunction<I, SysProfileProcess_args> {
      public SysProfileProcess() {
        super("SysProfileProcess");
      }

      public SysProfileProcess_args getEmptyArgsInstance() {
        return new SysProfileProcess_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public SysProfileProcess_result getResult(I iface, SysProfileProcess_args args) throws org.apache.thrift.TException {
        SysProfileProcess_result result = new SysProfileProcess_result();
        result.success = iface.SysProfileProcess(args.bundle);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("SysProfileProcess", new SysProfileProcess());
      return processMap;
    }

    public static class SysProfileProcess<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, SysProfileProcess_args, DataBundle> {
      public SysProfileProcess() {
        super("SysProfileProcess");
      }

      public SysProfileProcess_args getEmptyArgsInstance() {
        return new SysProfileProcess_args();
      }

      public AsyncMethodCallback<DataBundle> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<DataBundle>() { 
          public void onComplete(DataBundle o) {
            SysProfileProcess_result result = new SysProfileProcess_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            SysProfileProcess_result result = new SysProfileProcess_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, SysProfileProcess_args args, org.apache.thrift.async.AsyncMethodCallback<DataBundle> resultHandler) throws TException {
        iface.SysProfileProcess(args.bundle,resultHandler);
      }
    }

  }

  public static class SysProfileProcess_args implements org.apache.thrift.TBase<SysProfileProcess_args, SysProfileProcess_args._Fields>, java.io.Serializable, Cloneable, Comparable<SysProfileProcess_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SysProfileProcess_args");

    private static final org.apache.thrift.protocol.TField BUNDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("bundle", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new SysProfileProcess_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new SysProfileProcess_argsTupleSchemeFactory());
    }

    public DataBundle bundle; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      BUNDLE((short)1, "bundle");

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
          case 1: // BUNDLE
            return BUNDLE;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.BUNDLE, new org.apache.thrift.meta_data.FieldMetaData("bundle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DataBundle.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SysProfileProcess_args.class, metaDataMap);
    }

    public SysProfileProcess_args() {
    }

    public SysProfileProcess_args(
      DataBundle bundle)
    {
      this();
      this.bundle = bundle;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public SysProfileProcess_args(SysProfileProcess_args other) {
      if (other.isSetBundle()) {
        this.bundle = new DataBundle(other.bundle);
      }
    }

    public SysProfileProcess_args deepCopy() {
      return new SysProfileProcess_args(this);
    }

    
    public void clear() {
      this.bundle = null;
    }

    public DataBundle getBundle() {
      return this.bundle;
    }

    public SysProfileProcess_args setBundle(DataBundle bundle) {
      this.bundle = bundle;
      return this;
    }

    public void unsetBundle() {
      this.bundle = null;
    }

    /** Returns true if field bundle is set (has been assigned a value) and false otherwise */
    public boolean isSetBundle() {
      return this.bundle != null;
    }

    public void setBundleIsSet(boolean value) {
      if (!value) {
        this.bundle = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case BUNDLE:
        if (value == null) {
          unsetBundle();
        } else {
          setBundle((DataBundle)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case BUNDLE:
        return getBundle();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case BUNDLE:
        return isSetBundle();
      }
      throw new IllegalStateException();
    }

    
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof SysProfileProcess_args)
        return this.equals((SysProfileProcess_args)that);
      return false;
    }

    public boolean equals(SysProfileProcess_args that) {
      if (that == null)
        return false;

      boolean this_present_bundle = true && this.isSetBundle();
      boolean that_present_bundle = true && that.isSetBundle();
      if (this_present_bundle || that_present_bundle) {
        if (!(this_present_bundle && that_present_bundle))
          return false;
        if (!this.bundle.equals(that.bundle))
          return false;
      }

      return true;
    }

    
    public int hashCode() {
      return 0;
    }

    
    public int compareTo(SysProfileProcess_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetBundle()).compareTo(other.isSetBundle());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetBundle()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bundle, other.bundle);
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
      StringBuilder sb = new StringBuilder("SysProfileProcess_args(");
      boolean first = true;

      sb.append("bundle:");
      if (this.bundle == null) {
        sb.append("null");
      } else {
        sb.append(this.bundle);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (bundle != null) {
        bundle.validate();
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

    private static class SysProfileProcess_argsStandardSchemeFactory implements SchemeFactory {
      public SysProfileProcess_argsStandardScheme getScheme() {
        return new SysProfileProcess_argsStandardScheme();
      }
    }

    private static class SysProfileProcess_argsStandardScheme extends StandardScheme<SysProfileProcess_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, SysProfileProcess_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // BUNDLE
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.bundle = new DataBundle();
                struct.bundle.read(iprot);
                struct.setBundleIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, SysProfileProcess_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.bundle != null) {
          oprot.writeFieldBegin(BUNDLE_FIELD_DESC);
          struct.bundle.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class SysProfileProcess_argsTupleSchemeFactory implements SchemeFactory {
      public SysProfileProcess_argsTupleScheme getScheme() {
        return new SysProfileProcess_argsTupleScheme();
      }
    }

    private static class SysProfileProcess_argsTupleScheme extends TupleScheme<SysProfileProcess_args> {

      
      public void write(org.apache.thrift.protocol.TProtocol prot, SysProfileProcess_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetBundle()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetBundle()) {
          struct.bundle.write(oprot);
        }
      }

      
      public void read(org.apache.thrift.protocol.TProtocol prot, SysProfileProcess_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.bundle = new DataBundle();
          struct.bundle.read(iprot);
          struct.setBundleIsSet(true);
        }
      }
    }

  }

  public static class SysProfileProcess_result implements org.apache.thrift.TBase<SysProfileProcess_result, SysProfileProcess_result._Fields>, java.io.Serializable, Cloneable, Comparable<SysProfileProcess_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SysProfileProcess_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new SysProfileProcess_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new SysProfileProcess_resultTupleSchemeFactory());
    }

    public DataBundle success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

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
          case 0: // SUCCESS
            return SUCCESS;
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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DataBundle.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SysProfileProcess_result.class, metaDataMap);
    }

    public SysProfileProcess_result() {
    }

    public SysProfileProcess_result(
      DataBundle success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public SysProfileProcess_result(SysProfileProcess_result other) {
      if (other.isSetSuccess()) {
        this.success = new DataBundle(other.success);
      }
    }

    public SysProfileProcess_result deepCopy() {
      return new SysProfileProcess_result(this);
    }

    
    public void clear() {
      this.success = null;
    }

    public DataBundle getSuccess() {
      return this.success;
    }

    public SysProfileProcess_result setSuccess(DataBundle success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((DataBundle)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof SysProfileProcess_result)
        return this.equals((SysProfileProcess_result)that);
      return false;
    }

    public boolean equals(SysProfileProcess_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    
    public int hashCode() {
      return 0;
    }

    
    public int compareTo(SysProfileProcess_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
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
      StringBuilder sb = new StringBuilder("SysProfileProcess_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
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

    private static class SysProfileProcess_resultStandardSchemeFactory implements SchemeFactory {
      public SysProfileProcess_resultStandardScheme getScheme() {
        return new SysProfileProcess_resultStandardScheme();
      }
    }

    private static class SysProfileProcess_resultStandardScheme extends StandardScheme<SysProfileProcess_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, SysProfileProcess_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new DataBundle();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, SysProfileProcess_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class SysProfileProcess_resultTupleSchemeFactory implements SchemeFactory {
      public SysProfileProcess_resultTupleScheme getScheme() {
        return new SysProfileProcess_resultTupleScheme();
      }
    }

    private static class SysProfileProcess_resultTupleScheme extends TupleScheme<SysProfileProcess_result> {

      
      public void write(org.apache.thrift.protocol.TProtocol prot, SysProfileProcess_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      
      public void read(org.apache.thrift.protocol.TProtocol prot, SysProfileProcess_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new DataBundle();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
