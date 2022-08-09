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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface TimeWindowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.TimeWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * MaintenanceExclusionOptions provides maintenance exclusion related
   * options.
   * </pre>
   *
   * <code>.google.container.v1beta1.MaintenanceExclusionOptions maintenance_exclusion_options = 3;
   * </code>
   *
   * @return Whether the maintenanceExclusionOptions field is set.
   */
  boolean hasMaintenanceExclusionOptions();
  /**
   *
   *
   * <pre>
   * MaintenanceExclusionOptions provides maintenance exclusion related
   * options.
   * </pre>
   *
   * <code>.google.container.v1beta1.MaintenanceExclusionOptions maintenance_exclusion_options = 3;
   * </code>
   *
   * @return The maintenanceExclusionOptions.
   */
  com.google.container.v1beta1.MaintenanceExclusionOptions getMaintenanceExclusionOptions();
  /**
   *
   *
   * <pre>
   * MaintenanceExclusionOptions provides maintenance exclusion related
   * options.
   * </pre>
   *
   * <code>.google.container.v1beta1.MaintenanceExclusionOptions maintenance_exclusion_options = 3;
   * </code>
   */
  com.google.container.v1beta1.MaintenanceExclusionOptionsOrBuilder
      getMaintenanceExclusionOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * The time that the window first starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The time that the window first starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * The time that the window first starts.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time that the window ends. The end time should take place after the
   * start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time that the window ends. The end time should take place after the
   * start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time that the window ends. The end time should take place after the
   * start time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  public com.google.container.v1beta1.TimeWindow.OptionsCase getOptionsCase();
}
