/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/common.proto

package com.google.devtools.clouderrorreporting.v1beta1;

/**
 *
 *
 * <pre>
 * Resolution status of an error group.
 * </pre>
 *
 * Protobuf enum {@code google.devtools.clouderrorreporting.v1beta1.ResolutionStatus}
 */
public enum ResolutionStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Status is unknown. When left unspecified in requests, it is treated like
   * OPEN.
   * </pre>
   *
   * <code>RESOLUTION_STATUS_UNSPECIFIED = 0;</code>
   */
  RESOLUTION_STATUS_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The error group is not being addressed. This is the default for
   * new groups. It is also used for errors re-occurring after marked RESOLVED.
   * </pre>
   *
   * <code>OPEN = 1;</code>
   */
  OPEN(1),
  /**
   *
   *
   * <pre>
   * Error Group manually acknowledged, it can have an issue link attached.
   * </pre>
   *
   * <code>ACKNOWLEDGED = 2;</code>
   */
  ACKNOWLEDGED(2),
  /**
   *
   *
   * <pre>
   * Error Group manually resolved, more events for this group are not expected
   * to occur.
   * </pre>
   *
   * <code>RESOLVED = 3;</code>
   */
  RESOLVED(3),
  /**
   *
   *
   * <pre>
   * The error group is muted and excluded by default on group stats requests.
   * </pre>
   *
   * <code>MUTED = 4;</code>
   */
  MUTED(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Status is unknown. When left unspecified in requests, it is treated like
   * OPEN.
   * </pre>
   *
   * <code>RESOLUTION_STATUS_UNSPECIFIED = 0;</code>
   */
  public static final int RESOLUTION_STATUS_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The error group is not being addressed. This is the default for
   * new groups. It is also used for errors re-occurring after marked RESOLVED.
   * </pre>
   *
   * <code>OPEN = 1;</code>
   */
  public static final int OPEN_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Error Group manually acknowledged, it can have an issue link attached.
   * </pre>
   *
   * <code>ACKNOWLEDGED = 2;</code>
   */
  public static final int ACKNOWLEDGED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Error Group manually resolved, more events for this group are not expected
   * to occur.
   * </pre>
   *
   * <code>RESOLVED = 3;</code>
   */
  public static final int RESOLVED_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The error group is muted and excluded by default on group stats requests.
   * </pre>
   *
   * <code>MUTED = 4;</code>
   */
  public static final int MUTED_VALUE = 4;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ResolutionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResolutionStatus forNumber(int value) {
    switch (value) {
      case 0:
        return RESOLUTION_STATUS_UNSPECIFIED;
      case 1:
        return OPEN;
      case 2:
        return ACKNOWLEDGED;
      case 3:
        return RESOLVED;
      case 4:
        return MUTED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResolutionStatus> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ResolutionStatus> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ResolutionStatus>() {
        public ResolutionStatus findValueByNumber(int number) {
          return ResolutionStatus.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final ResolutionStatus[] VALUES = values();

  public static ResolutionStatus valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResolutionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.devtools.clouderrorreporting.v1beta1.ResolutionStatus)
}
