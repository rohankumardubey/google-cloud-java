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
// source: google/cloud/webrisk/v1/webrisk.proto

package com.google.webrisk.v1;

public interface SearchUrisResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.webrisk.v1.SearchUrisResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The threat list matches. This may be empty if the URI is on no list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.SearchUrisResponse.ThreatUri threat = 1;</code>
   *
   * @return Whether the threat field is set.
   */
  boolean hasThreat();
  /**
   *
   *
   * <pre>
   * The threat list matches. This may be empty if the URI is on no list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.SearchUrisResponse.ThreatUri threat = 1;</code>
   *
   * @return The threat.
   */
  com.google.webrisk.v1.SearchUrisResponse.ThreatUri getThreat();
  /**
   *
   *
   * <pre>
   * The threat list matches. This may be empty if the URI is on no list.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.SearchUrisResponse.ThreatUri threat = 1;</code>
   */
  com.google.webrisk.v1.SearchUrisResponse.ThreatUriOrBuilder getThreatOrBuilder();
}
