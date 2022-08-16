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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface LifecycleConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.LifecycleConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The duration to keep the cluster alive while idling (when no jobs
   * are running). Passing this threshold will cause the cluster to be
   * deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON
   * representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_delete_ttl = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the idleDeleteTtl field is set.
   */
  boolean hasIdleDeleteTtl();
  /**
   *
   *
   * <pre>
   * Optional. The duration to keep the cluster alive while idling (when no jobs
   * are running). Passing this threshold will cause the cluster to be
   * deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON
   * representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_delete_ttl = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The idleDeleteTtl.
   */
  com.google.protobuf.Duration getIdleDeleteTtl();
  /**
   *
   *
   * <pre>
   * Optional. The duration to keep the cluster alive while idling (when no jobs
   * are running). Passing this threshold will cause the cluster to be
   * deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON
   * representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_delete_ttl = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getIdleDeleteTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The time when cluster will be auto-deleted (see JSON representation of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp auto_delete_time = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the autoDeleteTime field is set.
   */
  boolean hasAutoDeleteTime();
  /**
   *
   *
   * <pre>
   * Optional. The time when cluster will be auto-deleted (see JSON representation of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp auto_delete_time = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The autoDeleteTime.
   */
  com.google.protobuf.Timestamp getAutoDeleteTime();
  /**
   *
   *
   * <pre>
   * Optional. The time when cluster will be auto-deleted (see JSON representation of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp auto_delete_time = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getAutoDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The lifetime duration of cluster. The cluster will be
   * auto-deleted at the end of this period. Minimum value is 10 minutes;
   * maximum value is 14 days (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration auto_delete_ttl = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the autoDeleteTtl field is set.
   */
  boolean hasAutoDeleteTtl();
  /**
   *
   *
   * <pre>
   * Optional. The lifetime duration of cluster. The cluster will be
   * auto-deleted at the end of this period. Minimum value is 10 minutes;
   * maximum value is 14 days (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration auto_delete_ttl = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The autoDeleteTtl.
   */
  com.google.protobuf.Duration getAutoDeleteTtl();
  /**
   *
   *
   * <pre>
   * Optional. The lifetime duration of cluster. The cluster will be
   * auto-deleted at the end of this period. Minimum value is 10 minutes;
   * maximum value is 14 days (see JSON representation of
   * [Duration](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>.google.protobuf.Duration auto_delete_ttl = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getAutoDeleteTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when cluster became idle (most recent job finished)
   * and became eligible for deletion due to idleness (see JSON representation
   * of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp idle_start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the idleStartTime field is set.
   */
  boolean hasIdleStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when cluster became idle (most recent job finished)
   * and became eligible for deletion due to idleness (see JSON representation
   * of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp idle_start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The idleStartTime.
   */
  com.google.protobuf.Timestamp getIdleStartTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when cluster became idle (most recent job finished)
   * and became eligible for deletion due to idleness (see JSON representation
   * of
   * [Timestamp](https://developers.google.com/protocol-buffers/docs/proto3#json)).
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp idle_start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getIdleStartTimeOrBuilder();

  public com.google.cloud.dataproc.v1.LifecycleConfig.TtlCase getTtlCase();
}
