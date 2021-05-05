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
// source: google/cloud/dialogflow/v2/environment.proto

package com.google.cloud.dialogflow.v2;

public interface EnvironmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Environment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this agent environment.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this agent environment.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location
   *   ID&gt;/agent/environments/&lt;Environment ID&gt;`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The developer-provided description for this environment.
   * The maximum length is 500 characters. If exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The developer-provided description for this environment.
   * The maximum length is 500 characters. If exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The agent version loaded into this environment.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/versions/&lt;Version ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version
   *   ID&gt;`
   * </pre>
   *
   * <code>string agent_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The agentVersion.
   */
  java.lang.String getAgentVersion();
  /**
   *
   *
   * <pre>
   * Optional. The agent version loaded into this environment.
   * Supported formats:
   * - `projects/&lt;Project ID&gt;/agent/versions/&lt;Version ID&gt;`
   * - `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agent/versions/&lt;Version
   *   ID&gt;`
   * </pre>
   *
   * <code>string agent_version = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for agentVersion.
   */
  com.google.protobuf.ByteString getAgentVersionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of this environment. This field is read-only, i.e., it cannot be
   * set by create and update methods.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Environment.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The state of this environment. This field is read-only, i.e., it cannot be
   * set by create and update methods.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Environment.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dialogflow.v2.Environment.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The last update time of this environment. This field is read-only, i.e., it
   * cannot be set by create and update methods.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update time of this environment. This field is read-only, i.e., it
   * cannot be set by create and update methods.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update time of this environment. This field is read-only, i.e., it
   * cannot be set by create and update methods.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Text to speech settings for this environment.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.TextToSpeechSettings text_to_speech_settings = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the textToSpeechSettings field is set.
   */
  boolean hasTextToSpeechSettings();
  /**
   *
   *
   * <pre>
   * Optional. Text to speech settings for this environment.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.TextToSpeechSettings text_to_speech_settings = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The textToSpeechSettings.
   */
  com.google.cloud.dialogflow.v2.TextToSpeechSettings getTextToSpeechSettings();
  /**
   *
   *
   * <pre>
   * Optional. Text to speech settings for this environment.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.TextToSpeechSettings text_to_speech_settings = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.TextToSpeechSettingsOrBuilder getTextToSpeechSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The fulfillment settings to use for this environment.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Fulfillment fulfillment = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the fulfillment field is set.
   */
  boolean hasFulfillment();
  /**
   *
   *
   * <pre>
   * Optional. The fulfillment settings to use for this environment.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Fulfillment fulfillment = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The fulfillment.
   */
  com.google.cloud.dialogflow.v2.Fulfillment getFulfillment();
  /**
   *
   *
   * <pre>
   * Optional. The fulfillment settings to use for this environment.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Fulfillment fulfillment = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.FulfillmentOrBuilder getFulfillmentOrBuilder();
}
