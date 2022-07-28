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
// source: google/cloud/gkehub/v1/service.proto

package com.google.cloud.gkehub.v1;

public interface ConnectAgentResourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1.ConnectAgentResource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.TypeMeta type = 1;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.TypeMeta type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.gkehub.v1.TypeMeta getType();
  /**
   *
   *
   * <pre>
   * Kubernetes type of the resource.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.TypeMeta type = 1;</code>
   */
  com.google.cloud.gkehub.v1.TypeMetaOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 2;</code>
   *
   * @return The manifest.
   */
  java.lang.String getManifest();
  /**
   *
   *
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 2;</code>
   *
   * @return The bytes for manifest.
   */
  com.google.protobuf.ByteString getManifestBytes();
}