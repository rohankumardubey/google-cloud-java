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
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

public interface AuthorizeEnvironmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.shell.v1.AuthorizeEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the resource that should receive the credentials, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the resource that should receive the credentials, for example
   * `users/me/environments/default` or
   * `users/someone&#64;example.com/environments/default`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The OAuth access token that should be sent to the environment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   *
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   *
   *
   * <pre>
   * The OAuth access token that should be sent to the environment.
   * </pre>
   *
   * <code>string access_token = 2;</code>
   *
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString getAccessTokenBytes();

  /**
   *
   *
   * <pre>
   * The OAuth ID token that should be sent to the environment.
   * </pre>
   *
   * <code>string id_token = 4;</code>
   *
   * @return The idToken.
   */
  java.lang.String getIdToken();
  /**
   *
   *
   * <pre>
   * The OAuth ID token that should be sent to the environment.
   * </pre>
   *
   * <code>string id_token = 4;</code>
   *
   * @return The bytes for idToken.
   */
  com.google.protobuf.ByteString getIdTokenBytes();

  /**
   *
   *
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * The time when the credentials expire. If not set, defaults to one hour from
   * when the server received the request.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();
}
