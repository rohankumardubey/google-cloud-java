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
// source: google/cloud/datastream/v1/datastream_resources.proto

package com.google.cloud.datastream.v1;

public interface OracleSourceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.OracleSourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   *
   * @return Whether the includeObjects field is set.
   */
  boolean hasIncludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   *
   * @return The includeObjects.
   */
  com.google.cloud.datastream.v1.OracleRdbms getIncludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to include in the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms include_objects = 1;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getIncludeObjectsOrBuilder();

  /**
   *
   *
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   *
   * @return Whether the excludeObjects field is set.
   */
  boolean hasExcludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   *
   * @return The excludeObjects.
   */
  com.google.cloud.datastream.v1.OracleRdbms getExcludeObjects();
  /**
   *
   *
   * <pre>
   * Oracle objects to exclude from the stream.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1.OracleRdbms exclude_objects = 2;</code>
   */
  com.google.cloud.datastream.v1.OracleRdbmsOrBuilder getExcludeObjectsOrBuilder();
}