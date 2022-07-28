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
// source: google/cloud/phishingprotection/v1beta1/phishingprotection.proto

package com.google.phishingprotection.v1beta1;

public interface ReportPhishingRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.phishingprotection.v1beta1.ReportPhishingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project for which the report will be created,
   * in the format "projects/{project_number}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project for which the report will be created,
   * in the format "projects/{project_number}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The URI that is being reported for phishing content to be analyzed.
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Required. The URI that is being reported for phishing content to be analyzed.
   * </pre>
   *
   * <code>string uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();
}