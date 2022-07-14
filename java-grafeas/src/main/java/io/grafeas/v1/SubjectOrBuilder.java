/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/intoto_statement.proto

package io.grafeas.v1;

public interface SubjectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Subject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  int getDigestCount();
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  boolean containsDigest(java.lang.String key);
  /** Use {@link #getDigestMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDigest();
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDigestMap();
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */

  /* nullable */
  java.lang.String getDigestOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * `"&lt;ALGORITHM&gt;": "&lt;HEX_VALUE&gt;"`
   * Algorithms can be e.g. sha256, sha512
   * See
   * https://github.com/in-toto/attestation/blob/main/spec/field_types.md#DigestSet
   * </pre>
   *
   * <code>map&lt;string, string&gt; digest = 2;</code>
   */
  java.lang.String getDigestOrThrow(java.lang.String key);
}
