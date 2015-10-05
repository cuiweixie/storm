/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-5-22")
public class BoltAggregateStats implements org.apache.thrift.TBase<BoltAggregateStats, BoltAggregateStats._Fields>, java.io.Serializable, Cloneable, Comparable<BoltAggregateStats> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BoltAggregateStats");

  private static final org.apache.thrift.protocol.TField EXECUTE_LATENCY_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("execute_latency_ms", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField PROCESS_LATENCY_MS_FIELD_DESC = new org.apache.thrift.protocol.TField("process_latency_ms", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField EXECUTED_FIELD_DESC = new org.apache.thrift.protocol.TField("executed", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField CAPACITY_FIELD_DESC = new org.apache.thrift.protocol.TField("capacity", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BoltAggregateStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BoltAggregateStatsTupleSchemeFactory());
  }

  private double execute_latency_ms; // optional
  private double process_latency_ms; // optional
  private long executed; // optional
  private double capacity; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EXECUTE_LATENCY_MS((short)1, "execute_latency_ms"),
    PROCESS_LATENCY_MS((short)2, "process_latency_ms"),
    EXECUTED((short)3, "executed"),
    CAPACITY((short)4, "capacity");

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
        case 1: // EXECUTE_LATENCY_MS
          return EXECUTE_LATENCY_MS;
        case 2: // PROCESS_LATENCY_MS
          return PROCESS_LATENCY_MS;
        case 3: // EXECUTED
          return EXECUTED;
        case 4: // CAPACITY
          return CAPACITY;
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
  private static final int __EXECUTE_LATENCY_MS_ISSET_ID = 0;
  private static final int __PROCESS_LATENCY_MS_ISSET_ID = 1;
  private static final int __EXECUTED_ISSET_ID = 2;
  private static final int __CAPACITY_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXECUTE_LATENCY_MS,_Fields.PROCESS_LATENCY_MS,_Fields.EXECUTED,_Fields.CAPACITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXECUTE_LATENCY_MS, new org.apache.thrift.meta_data.FieldMetaData("execute_latency_ms", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PROCESS_LATENCY_MS, new org.apache.thrift.meta_data.FieldMetaData("process_latency_ms", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.EXECUTED, new org.apache.thrift.meta_data.FieldMetaData("executed", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CAPACITY, new org.apache.thrift.meta_data.FieldMetaData("capacity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BoltAggregateStats.class, metaDataMap);
  }

  public BoltAggregateStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BoltAggregateStats(BoltAggregateStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.execute_latency_ms = other.execute_latency_ms;
    this.process_latency_ms = other.process_latency_ms;
    this.executed = other.executed;
    this.capacity = other.capacity;
  }

  public BoltAggregateStats deepCopy() {
    return new BoltAggregateStats(this);
  }

  @Override
  public void clear() {
    set_execute_latency_ms_isSet(false);
    this.execute_latency_ms = 0.0;
    set_process_latency_ms_isSet(false);
    this.process_latency_ms = 0.0;
    set_executed_isSet(false);
    this.executed = 0;
    set_capacity_isSet(false);
    this.capacity = 0.0;
  }

  public double get_execute_latency_ms() {
    return this.execute_latency_ms;
  }

  public void set_execute_latency_ms(double execute_latency_ms) {
    this.execute_latency_ms = execute_latency_ms;
    set_execute_latency_ms_isSet(true);
  }

  public void unset_execute_latency_ms() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXECUTE_LATENCY_MS_ISSET_ID);
  }

  /** Returns true if field execute_latency_ms is set (has been assigned a value) and false otherwise */
  public boolean is_set_execute_latency_ms() {
    return EncodingUtils.testBit(__isset_bitfield, __EXECUTE_LATENCY_MS_ISSET_ID);
  }

  public void set_execute_latency_ms_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXECUTE_LATENCY_MS_ISSET_ID, value);
  }

  public double get_process_latency_ms() {
    return this.process_latency_ms;
  }

  public void set_process_latency_ms(double process_latency_ms) {
    this.process_latency_ms = process_latency_ms;
    set_process_latency_ms_isSet(true);
  }

  public void unset_process_latency_ms() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROCESS_LATENCY_MS_ISSET_ID);
  }

  /** Returns true if field process_latency_ms is set (has been assigned a value) and false otherwise */
  public boolean is_set_process_latency_ms() {
    return EncodingUtils.testBit(__isset_bitfield, __PROCESS_LATENCY_MS_ISSET_ID);
  }

  public void set_process_latency_ms_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROCESS_LATENCY_MS_ISSET_ID, value);
  }

  public long get_executed() {
    return this.executed;
  }

  public void set_executed(long executed) {
    this.executed = executed;
    set_executed_isSet(true);
  }

  public void unset_executed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXECUTED_ISSET_ID);
  }

  /** Returns true if field executed is set (has been assigned a value) and false otherwise */
  public boolean is_set_executed() {
    return EncodingUtils.testBit(__isset_bitfield, __EXECUTED_ISSET_ID);
  }

  public void set_executed_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXECUTED_ISSET_ID, value);
  }

  public double get_capacity() {
    return this.capacity;
  }

  public void set_capacity(double capacity) {
    this.capacity = capacity;
    set_capacity_isSet(true);
  }

  public void unset_capacity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CAPACITY_ISSET_ID);
  }

  /** Returns true if field capacity is set (has been assigned a value) and false otherwise */
  public boolean is_set_capacity() {
    return EncodingUtils.testBit(__isset_bitfield, __CAPACITY_ISSET_ID);
  }

  public void set_capacity_isSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CAPACITY_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXECUTE_LATENCY_MS:
      if (value == null) {
        unset_execute_latency_ms();
      } else {
        set_execute_latency_ms((Double)value);
      }
      break;

    case PROCESS_LATENCY_MS:
      if (value == null) {
        unset_process_latency_ms();
      } else {
        set_process_latency_ms((Double)value);
      }
      break;

    case EXECUTED:
      if (value == null) {
        unset_executed();
      } else {
        set_executed((Long)value);
      }
      break;

    case CAPACITY:
      if (value == null) {
        unset_capacity();
      } else {
        set_capacity((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXECUTE_LATENCY_MS:
      return Double.valueOf(get_execute_latency_ms());

    case PROCESS_LATENCY_MS:
      return Double.valueOf(get_process_latency_ms());

    case EXECUTED:
      return Long.valueOf(get_executed());

    case CAPACITY:
      return Double.valueOf(get_capacity());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXECUTE_LATENCY_MS:
      return is_set_execute_latency_ms();
    case PROCESS_LATENCY_MS:
      return is_set_process_latency_ms();
    case EXECUTED:
      return is_set_executed();
    case CAPACITY:
      return is_set_capacity();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BoltAggregateStats)
      return this.equals((BoltAggregateStats)that);
    return false;
  }

  public boolean equals(BoltAggregateStats that) {
    if (that == null)
      return false;

    boolean this_present_execute_latency_ms = true && this.is_set_execute_latency_ms();
    boolean that_present_execute_latency_ms = true && that.is_set_execute_latency_ms();
    if (this_present_execute_latency_ms || that_present_execute_latency_ms) {
      if (!(this_present_execute_latency_ms && that_present_execute_latency_ms))
        return false;
      if (this.execute_latency_ms != that.execute_latency_ms)
        return false;
    }

    boolean this_present_process_latency_ms = true && this.is_set_process_latency_ms();
    boolean that_present_process_latency_ms = true && that.is_set_process_latency_ms();
    if (this_present_process_latency_ms || that_present_process_latency_ms) {
      if (!(this_present_process_latency_ms && that_present_process_latency_ms))
        return false;
      if (this.process_latency_ms != that.process_latency_ms)
        return false;
    }

    boolean this_present_executed = true && this.is_set_executed();
    boolean that_present_executed = true && that.is_set_executed();
    if (this_present_executed || that_present_executed) {
      if (!(this_present_executed && that_present_executed))
        return false;
      if (this.executed != that.executed)
        return false;
    }

    boolean this_present_capacity = true && this.is_set_capacity();
    boolean that_present_capacity = true && that.is_set_capacity();
    if (this_present_capacity || that_present_capacity) {
      if (!(this_present_capacity && that_present_capacity))
        return false;
      if (this.capacity != that.capacity)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_execute_latency_ms = true && (is_set_execute_latency_ms());
    list.add(present_execute_latency_ms);
    if (present_execute_latency_ms)
      list.add(execute_latency_ms);

    boolean present_process_latency_ms = true && (is_set_process_latency_ms());
    list.add(present_process_latency_ms);
    if (present_process_latency_ms)
      list.add(process_latency_ms);

    boolean present_executed = true && (is_set_executed());
    list.add(present_executed);
    if (present_executed)
      list.add(executed);

    boolean present_capacity = true && (is_set_capacity());
    list.add(present_capacity);
    if (present_capacity)
      list.add(capacity);

    return list.hashCode();
  }

  @Override
  public int compareTo(BoltAggregateStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_execute_latency_ms()).compareTo(other.is_set_execute_latency_ms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_execute_latency_ms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.execute_latency_ms, other.execute_latency_ms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_process_latency_ms()).compareTo(other.is_set_process_latency_ms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_process_latency_ms()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.process_latency_ms, other.process_latency_ms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_executed()).compareTo(other.is_set_executed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executed, other.executed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_capacity()).compareTo(other.is_set_capacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_capacity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capacity, other.capacity);
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

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BoltAggregateStats(");
    boolean first = true;

    if (is_set_execute_latency_ms()) {
      sb.append("execute_latency_ms:");
      sb.append(this.execute_latency_ms);
      first = false;
    }
    if (is_set_process_latency_ms()) {
      if (!first) sb.append(", ");
      sb.append("process_latency_ms:");
      sb.append(this.process_latency_ms);
      first = false;
    }
    if (is_set_executed()) {
      if (!first) sb.append(", ");
      sb.append("executed:");
      sb.append(this.executed);
      first = false;
    }
    if (is_set_capacity()) {
      if (!first) sb.append(", ");
      sb.append("capacity:");
      sb.append(this.capacity);
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

  private static class BoltAggregateStatsStandardSchemeFactory implements SchemeFactory {
    public BoltAggregateStatsStandardScheme getScheme() {
      return new BoltAggregateStatsStandardScheme();
    }
  }

  private static class BoltAggregateStatsStandardScheme extends StandardScheme<BoltAggregateStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BoltAggregateStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXECUTE_LATENCY_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.execute_latency_ms = iprot.readDouble();
              struct.set_execute_latency_ms_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROCESS_LATENCY_MS
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.process_latency_ms = iprot.readDouble();
              struct.set_process_latency_ms_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXECUTED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.executed = iprot.readI64();
              struct.set_executed_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CAPACITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.capacity = iprot.readDouble();
              struct.set_capacity_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BoltAggregateStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.is_set_execute_latency_ms()) {
        oprot.writeFieldBegin(EXECUTE_LATENCY_MS_FIELD_DESC);
        oprot.writeDouble(struct.execute_latency_ms);
        oprot.writeFieldEnd();
      }
      if (struct.is_set_process_latency_ms()) {
        oprot.writeFieldBegin(PROCESS_LATENCY_MS_FIELD_DESC);
        oprot.writeDouble(struct.process_latency_ms);
        oprot.writeFieldEnd();
      }
      if (struct.is_set_executed()) {
        oprot.writeFieldBegin(EXECUTED_FIELD_DESC);
        oprot.writeI64(struct.executed);
        oprot.writeFieldEnd();
      }
      if (struct.is_set_capacity()) {
        oprot.writeFieldBegin(CAPACITY_FIELD_DESC);
        oprot.writeDouble(struct.capacity);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BoltAggregateStatsTupleSchemeFactory implements SchemeFactory {
    public BoltAggregateStatsTupleScheme getScheme() {
      return new BoltAggregateStatsTupleScheme();
    }
  }

  private static class BoltAggregateStatsTupleScheme extends TupleScheme<BoltAggregateStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BoltAggregateStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_execute_latency_ms()) {
        optionals.set(0);
      }
      if (struct.is_set_process_latency_ms()) {
        optionals.set(1);
      }
      if (struct.is_set_executed()) {
        optionals.set(2);
      }
      if (struct.is_set_capacity()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.is_set_execute_latency_ms()) {
        oprot.writeDouble(struct.execute_latency_ms);
      }
      if (struct.is_set_process_latency_ms()) {
        oprot.writeDouble(struct.process_latency_ms);
      }
      if (struct.is_set_executed()) {
        oprot.writeI64(struct.executed);
      }
      if (struct.is_set_capacity()) {
        oprot.writeDouble(struct.capacity);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BoltAggregateStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.execute_latency_ms = iprot.readDouble();
        struct.set_execute_latency_ms_isSet(true);
      }
      if (incoming.get(1)) {
        struct.process_latency_ms = iprot.readDouble();
        struct.set_process_latency_ms_isSet(true);
      }
      if (incoming.get(2)) {
        struct.executed = iprot.readI64();
        struct.set_executed_isSet(true);
      }
      if (incoming.get(3)) {
        struct.capacity = iprot.readDouble();
        struct.set_capacity_isSet(true);
      }
    }
  }

}

