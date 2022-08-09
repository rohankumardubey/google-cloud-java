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
// source: google/cloud/bigquery/migration/v2/translation_config.proto

package com.google.cloud.bigquery.migration.v2;

public interface ObjectNameMappingListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2.ObjectNameMappingList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  java.util.List<com.google.cloud.bigquery.migration.v2.ObjectNameMapping> getNameMapList();
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2.ObjectNameMapping getNameMap(int index);
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  int getNameMapCount();
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder>
      getNameMapOrBuilderList();
  /**
   *
   *
   * <pre>
   * The elements of the object name map.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.migration.v2.ObjectNameMapping name_map = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2.ObjectNameMappingOrBuilder getNameMapOrBuilder(int index);
}
