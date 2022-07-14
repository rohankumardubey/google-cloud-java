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
// source: google/cloud/talent/v4/common.proto

package com.google.cloud.talent.v4;

public interface DeviceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4.DeviceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the device.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.DeviceInfo.DeviceType device_type = 1;</code>
   *
   * @return The enum numeric value on the wire for deviceType.
   */
  int getDeviceTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the device.
   * </pre>
   *
   * <code>.google.cloud.talent.v4.DeviceInfo.DeviceType device_type = 1;</code>
   *
   * @return The deviceType.
   */
  com.google.cloud.talent.v4.DeviceInfo.DeviceType getDeviceType();

  /**
   *
   *
   * <pre>
   * A device-specific ID. The ID must be a unique identifier that
   * distinguishes the device from other devices.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * A device-specific ID. The ID must be a unique identifier that
   * distinguishes the device from other devices.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();
}
