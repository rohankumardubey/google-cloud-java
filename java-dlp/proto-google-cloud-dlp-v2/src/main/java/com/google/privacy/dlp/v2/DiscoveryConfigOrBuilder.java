/*
 * Copyright 2023 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface DiscoveryConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DiscoveryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Unique resource name for the DiscoveryConfig, assigned by the service when
   * the DiscoveryConfig is created, for example
   * `projects/dlp-test-project/locations/global/discoveryConfigs/53234423`.
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
   * Unique resource name for the DiscoveryConfig, assigned by the service when
   * the DiscoveryConfig is created, for example
   * `projects/dlp-test-project/locations/global/discoveryConfigs/53234423`.
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
   * Display name (max 100 chars)
   * </pre>
   *
   * <code>string display_name = 11;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display name (max 100 chars)
   * </pre>
   *
   * <code>string display_name = 11;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Only set when the parent is an org.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryConfig.OrgConfig org_config = 2;</code>
   *
   * @return Whether the orgConfig field is set.
   */
  boolean hasOrgConfig();
  /**
   *
   *
   * <pre>
   * Only set when the parent is an org.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryConfig.OrgConfig org_config = 2;</code>
   *
   * @return The orgConfig.
   */
  com.google.privacy.dlp.v2.DiscoveryConfig.OrgConfig getOrgConfig();
  /**
   *
   *
   * <pre>
   * Only set when the parent is an org.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryConfig.OrgConfig org_config = 2;</code>
   */
  com.google.privacy.dlp.v2.DiscoveryConfig.OrgConfigOrBuilder getOrgConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by Discovery. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * Discovery.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/dlp/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 3;</code>
   *
   * @return A list containing the inspectTemplates.
   */
  java.util.List<java.lang.String> getInspectTemplatesList();
  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by Discovery. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * Discovery.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/dlp/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 3;</code>
   *
   * @return The count of inspectTemplates.
   */
  int getInspectTemplatesCount();
  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by Discovery. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * Discovery.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/dlp/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The inspectTemplates at the given index.
   */
  java.lang.String getInspectTemplates(int index);
  /**
   *
   *
   * <pre>
   * Detection logic for profile generation.
   *
   * Not all template features are used by Discovery. FindingLimits,
   * include_quote and exclude_info_types have no impact on
   * Discovery.
   *
   * Multiple templates may be provided if there is data in multiple regions.
   * At most one template must be specified per-region (including "global").
   * Each region is scanned using the applicable template. If no region-specific
   * template is specified, but a "global" template is specified, it will be
   * copied to that region and used instead. If no global or region-specific
   * template is provided for a region with data, that region's data will not be
   * scanned.
   *
   * For more information, see
   * https://cloud.google.com/dlp/docs/data-profiles#data-residency.
   * </pre>
   *
   * <code>repeated string inspect_templates = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the inspectTemplates at the given index.
   */
  com.google.protobuf.ByteString getInspectTemplatesBytes(int index);

  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of scanning.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction actions = 4;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.DataProfileAction> getActionsList();
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of scanning.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction actions = 4;</code>
   */
  com.google.privacy.dlp.v2.DataProfileAction getActions(int index);
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of scanning.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction actions = 4;</code>
   */
  int getActionsCount();
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of scanning.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction actions = 4;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.DataProfileActionOrBuilder>
      getActionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Actions to execute at the completion of scanning.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DataProfileAction actions = 4;</code>
   */
  com.google.privacy.dlp.v2.DataProfileActionOrBuilder getActionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Target to match against for determining what to scan and how frequently.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DiscoveryTarget targets = 5;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.DiscoveryTarget> getTargetsList();
  /**
   *
   *
   * <pre>
   * Target to match against for determining what to scan and how frequently.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DiscoveryTarget targets = 5;</code>
   */
  com.google.privacy.dlp.v2.DiscoveryTarget getTargets(int index);
  /**
   *
   *
   * <pre>
   * Target to match against for determining what to scan and how frequently.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DiscoveryTarget targets = 5;</code>
   */
  int getTargetsCount();
  /**
   *
   *
   * <pre>
   * Target to match against for determining what to scan and how frequently.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DiscoveryTarget targets = 5;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.DiscoveryTargetOrBuilder>
      getTargetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Target to match against for determining what to scan and how frequently.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.DiscoveryTarget targets = 5;</code>
   */
  com.google.privacy.dlp.v2.DiscoveryTargetOrBuilder getTargetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the config was activated.
   * Repeated errors may result in the config automatically being paused. Output
   * only field. Will return the last 100 errors. Whenever the config is
   * modified this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.Error> getErrorsList();
  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the config was activated.
   * Repeated errors may result in the config automatically being paused. Output
   * only field. Will return the last 100 errors. Whenever the config is
   * modified this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.privacy.dlp.v2.Error getErrors(int index);
  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the config was activated.
   * Repeated errors may result in the config automatically being paused. Output
   * only field. Will return the last 100 errors. Whenever the config is
   * modified this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the config was activated.
   * Repeated errors may result in the config automatically being paused. Output
   * only field. Will return the last 100 errors. Whenever the config is
   * modified this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.ErrorOrBuilder> getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A stream of errors encountered when the config was activated.
   * Repeated errors may result in the config automatically being paused. Output
   * only field. Will return the last 100 errors. Whenever the config is
   * modified this list will be cleared.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.Error errors = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.privacy.dlp.v2.ErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a DiscoveryConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a DiscoveryConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The creation timestamp of a DiscoveryConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a DiscoveryConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a DiscoveryConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The last update timestamp of a DiscoveryConfig.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the last time this config was executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_run_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the lastRunTime field is set.
   */
  boolean hasLastRunTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the last time this config was executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_run_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The lastRunTime.
   */
  com.google.protobuf.Timestamp getLastRunTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp of the last time this config was executed.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp last_run_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getLastRunTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A status for this configuration.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryConfig.Status status = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Required. A status for this configuration.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryConfig.Status status = 10 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The status.
   */
  com.google.privacy.dlp.v2.DiscoveryConfig.Status getStatus();
}
