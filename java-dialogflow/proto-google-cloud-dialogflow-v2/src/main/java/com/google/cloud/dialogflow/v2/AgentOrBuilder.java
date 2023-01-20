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
// source: google/cloud/dialogflow/v2/agent.proto

package com.google.cloud.dialogflow.v2;

public interface AgentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Agent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;`.
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
   * Required. The project of this agent.
   * Format: `projects/&lt;Project ID&gt;`.
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
   * Required. The name of this agent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The name of this agent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The default language of the agent as a language tag. See
   * [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. This field cannot be
   * set by the `Update` method.
   * </pre>
   *
   * <code>string default_language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The defaultLanguageCode.
   */
  java.lang.String getDefaultLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The default language of the agent as a language tag. See
   * [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. This field cannot be
   * set by the `Update` method.
   * </pre>
   *
   * <code>string default_language_code = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for defaultLanguageCode.
   */
  com.google.protobuf.ByteString getDefaultLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the supportedLanguageCodes.
   */
  java.util.List<java.lang.String> getSupportedLanguageCodesList();
  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of supportedLanguageCodes.
   */
  int getSupportedLanguageCodesCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The supportedLanguageCodes at the given index.
   */
  java.lang.String getSupportedLanguageCodes(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of all languages supported by this agent (except for the
   * `default_language_code`).
   * </pre>
   *
   * <code>repeated string supported_language_codes = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the supportedLanguageCodes at the given index.
   */
  com.google.protobuf.ByteString getSupportedLanguageCodesBytes(int index);

  /**
   *
   *
   * <pre>
   * Required. The time zone of this agent from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Required. The time zone of this agent from the
   * [time zone database](https://www.iana.org/time-zones), e.g.,
   * America/New_York, Europe/Paris.
   * </pre>
   *
   * <code>string time_zone = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of this agent.
   * The maximum length is 500 characters. If exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of this agent.
   * The maximum length is 500 characters. If exceeded, the request is rejected.
   * </pre>
   *
   * <code>string description = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The URI of the agent's avatar.
   * Avatars are used throughout the Dialogflow console and in the self-hosted
   * [Web
   * Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo)
   * integration.
   * </pre>
   *
   * <code>string avatar_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The avatarUri.
   */
  java.lang.String getAvatarUri();
  /**
   *
   *
   * <pre>
   * Optional. The URI of the agent's avatar.
   * Avatars are used throughout the Dialogflow console and in the self-hosted
   * [Web
   * Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo)
   * integration.
   * </pre>
   *
   * <code>string avatar_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for avatarUri.
   */
  com.google.protobuf.ByteString getAvatarUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Determines whether this agent should log conversation queries.
   * </pre>
   *
   * <code>bool enable_logging = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableLogging.
   */
  boolean getEnableLogging();

  /**
   *
   *
   * <pre>
   * Optional. Determines how intents are detected from user queries.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Agent.MatchMode match_mode = 9 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.dialogflow.v2.Agent.match_mode is deprecated. See
   *     google/cloud/dialogflow/v2/agent.proto;l=353
   * @return The enum numeric value on the wire for matchMode.
   */
  @java.lang.Deprecated
  int getMatchModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Determines how intents are detected from user queries.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Agent.MatchMode match_mode = 9 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.dialogflow.v2.Agent.match_mode is deprecated. See
   *     google/cloud/dialogflow/v2/agent.proto;l=353
   * @return The matchMode.
   */
  @java.lang.Deprecated
  com.google.cloud.dialogflow.v2.Agent.MatchMode getMatchMode();

  /**
   *
   *
   * <pre>
   * Optional. To filter out false positive results and still get variety in
   * matched natural language inputs for your agent, you can tune the machine
   * learning classification threshold. If the returned score value is less than
   * the threshold value, then a fallback intent will be triggered or, if there
   * are no fallback intents defined, no intent will be triggered. The score
   * values range from 0.0 (completely uncertain) to 1.0 (completely certain).
   * If set to 0.0, the default of 0.3 is used.
   * </pre>
   *
   * <code>float classification_threshold = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The classificationThreshold.
   */
  float getClassificationThreshold();

  /**
   *
   *
   * <pre>
   * Optional. API version displayed in Dialogflow console. If not specified,
   * V2 API is assumed. Clients are free to query different service endpoints
   * for different API versions. However, bots connectors and webhook calls will
   * follow the specified API version.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Agent.ApiVersion api_version = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for apiVersion.
   */
  int getApiVersionValue();
  /**
   *
   *
   * <pre>
   * Optional. API version displayed in Dialogflow console. If not specified,
   * V2 API is assumed. Clients are free to query different service endpoints
   * for different API versions. However, bots connectors and webhook calls will
   * follow the specified API version.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Agent.ApiVersion api_version = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The apiVersion.
   */
  com.google.cloud.dialogflow.v2.Agent.ApiVersion getApiVersion();

  /**
   *
   *
   * <pre>
   * Optional. The agent tier. If not specified, TIER_STANDARD is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Agent.Tier tier = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for tier.
   */
  int getTierValue();
  /**
   *
   *
   * <pre>
   * Optional. The agent tier. If not specified, TIER_STANDARD is assumed.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Agent.Tier tier = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The tier.
   */
  com.google.cloud.dialogflow.v2.Agent.Tier getTier();
}
