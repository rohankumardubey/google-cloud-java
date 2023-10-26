/*
 * Copyright 2023 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * How frequently data profiles can be updated. New options can be added at a
 * later time.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.DataProfileUpdateFrequency}
 */
public enum DataProfileUpdateFrequency implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_UNSPECIFIED = 0;</code>
   */
  UPDATE_FREQUENCY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * After the data profile is created, it will never be updated.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_NEVER = 1;</code>
   */
  UPDATE_FREQUENCY_NEVER(1),
  /**
   *
   *
   * <pre>
   * The data profile can be updated up to once every 24 hours.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_DAILY = 2;</code>
   */
  UPDATE_FREQUENCY_DAILY(2),
  /**
   *
   *
   * <pre>
   * The data profile can be updated up to once every 30 days. Default.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_MONTHLY = 4;</code>
   */
  UPDATE_FREQUENCY_MONTHLY(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_UNSPECIFIED = 0;</code>
   */
  public static final int UPDATE_FREQUENCY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * After the data profile is created, it will never be updated.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_NEVER = 1;</code>
   */
  public static final int UPDATE_FREQUENCY_NEVER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The data profile can be updated up to once every 24 hours.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_DAILY = 2;</code>
   */
  public static final int UPDATE_FREQUENCY_DAILY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The data profile can be updated up to once every 30 days. Default.
   * </pre>
   *
   * <code>UPDATE_FREQUENCY_MONTHLY = 4;</code>
   */
  public static final int UPDATE_FREQUENCY_MONTHLY_VALUE = 4;

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
  public static DataProfileUpdateFrequency valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataProfileUpdateFrequency forNumber(int value) {
    switch (value) {
      case 0:
        return UPDATE_FREQUENCY_UNSPECIFIED;
      case 1:
        return UPDATE_FREQUENCY_NEVER;
      case 2:
        return UPDATE_FREQUENCY_DAILY;
      case 4:
        return UPDATE_FREQUENCY_MONTHLY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataProfileUpdateFrequency>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DataProfileUpdateFrequency>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DataProfileUpdateFrequency>() {
            public DataProfileUpdateFrequency findValueByNumber(int number) {
              return DataProfileUpdateFrequency.forNumber(number);
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
    return com.google.privacy.dlp.v2.DlpProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final DataProfileUpdateFrequency[] VALUES = values();

  public static DataProfileUpdateFrequency valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataProfileUpdateFrequency(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.DataProfileUpdateFrequency)
}
