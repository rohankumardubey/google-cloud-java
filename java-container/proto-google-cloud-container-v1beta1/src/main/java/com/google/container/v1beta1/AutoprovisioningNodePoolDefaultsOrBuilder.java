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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface AutoprovisioningNodePoolDefaultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.AutoprovisioningNodePoolDefaults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @return A list containing the oauthScopes.
   */
  java.util.List<java.lang.String> getOauthScopesList();
  /**
   *
   *
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @return The count of oauthScopes.
   */
  int getOauthScopesCount();
  /**
   *
   *
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The oauthScopes at the given index.
   */
  java.lang.String getOauthScopes(int index);
  /**
   *
   *
   * <pre>
   * The set of Google API scopes to be made available on all of the
   * node VMs under the "default" service account.
   * The following scopes are recommended, but not required, and by default are
   * not included:
   * * `https://www.googleapis.com/auth/compute` is required for mounting
   * persistent storage on your nodes.
   * * `https://www.googleapis.com/auth/devstorage.read_only` is required for
   * communicating with **gcr.io**
   * (the [Google Container
   * Registry](https://cloud.google.com/container-registry/)).
   * If unspecified, no scopes are added, unless Cloud Logging or Cloud
   * Monitoring are enabled, in which case their required scopes will be added.
   * </pre>
   *
   * <code>repeated string oauth_scopes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the oauthScopes at the given index.
   */
  com.google.protobuf.ByteString getOauthScopesBytes(int index);

  /**
   *
   *
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs.
   * Specify the email address of the Service Account; otherwise, if no Service
   * Account is specified, the "default" service account is used.
   * </pre>
   *
   * <code>string service_account = 2;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * The Google Cloud Platform Service Account to be used by the node VMs.
   * Specify the email address of the Service Account; otherwise, if no Service
   * Account is specified, the "default" service account is used.
   * </pre>
   *
   * <code>string service_account = 2;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodePool.UpgradeSettings upgrade_settings = 3;</code>
   *
   * @return Whether the upgradeSettings field is set.
   */
  boolean hasUpgradeSettings();
  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodePool.UpgradeSettings upgrade_settings = 3;</code>
   *
   * @return The upgradeSettings.
   */
  com.google.container.v1beta1.NodePool.UpgradeSettings getUpgradeSettings();
  /**
   *
   *
   * <pre>
   * Upgrade settings control disruption and speed of the upgrade.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodePool.UpgradeSettings upgrade_settings = 3;</code>
   */
  com.google.container.v1beta1.NodePool.UpgradeSettingsOrBuilder getUpgradeSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeManagement management = 4;</code>
   *
   * @return Whether the management field is set.
   */
  boolean hasManagement();
  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeManagement management = 4;</code>
   *
   * @return The management.
   */
  com.google.container.v1beta1.NodeManagement getManagement();
  /**
   *
   *
   * <pre>
   * NodeManagement configuration for this NodePool.
   * </pre>
   *
   * <code>.google.container.v1beta1.NodeManagement management = 4;</code>
   */
  com.google.container.v1beta1.NodeManagementOrBuilder getManagementOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated. Minimum CPU platform to be used for NAP created node pools.
   * The instance may be scheduled on the specified or newer CPU platform.
   * Applicable values are the friendly names of CPU platforms, such as
   * minCpuPlatform: Intel Haswell or
   * minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * This field is deprecated, min_cpu_platform should be specified using
   * https://cloud.google.com/requested-min-cpu-platform label selector on the
   * pod.
   * To unset the min cpu platform field pass "automatic"
   * as field value.
   * </pre>
   *
   * <code>string min_cpu_platform = 5 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.AutoprovisioningNodePoolDefaults.min_cpu_platform is
   *     deprecated. See google/container/v1beta1/cluster_service.proto;l=3856
   * @return The minCpuPlatform.
   */
  @java.lang.Deprecated
  java.lang.String getMinCpuPlatform();
  /**
   *
   *
   * <pre>
   * Deprecated. Minimum CPU platform to be used for NAP created node pools.
   * The instance may be scheduled on the specified or newer CPU platform.
   * Applicable values are the friendly names of CPU platforms, such as
   * minCpuPlatform: Intel Haswell or
   * minCpuPlatform: Intel Sandy Bridge. For more
   * information, read [how to specify min CPU
   * platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
   * This field is deprecated, min_cpu_platform should be specified using
   * https://cloud.google.com/requested-min-cpu-platform label selector on the
   * pod.
   * To unset the min cpu platform field pass "automatic"
   * as field value.
   * </pre>
   *
   * <code>string min_cpu_platform = 5 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.AutoprovisioningNodePoolDefaults.min_cpu_platform is
   *     deprecated. See google/container/v1beta1/cluster_service.proto;l=3856
   * @return The bytes for minCpuPlatform.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getMinCpuPlatformBytes();

  /**
   *
   *
   * <pre>
   * Size of the disk attached to each node, specified in GB.
   * The smallest allowed disk size is 10GB.
   * If unspecified, the default disk size is 100GB.
   * </pre>
   *
   * <code>int32 disk_size_gb = 6;</code>
   *
   * @return The diskSizeGb.
   */
  int getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or
   * 'pd-balanced')
   * If unspecified, the default disk type is 'pd-standard'
   * </pre>
   *
   * <code>string disk_type = 7;</code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();
  /**
   *
   *
   * <pre>
   * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or
   * 'pd-balanced')
   * If unspecified, the default disk type is 'pd-standard'
   * </pre>
   *
   * <code>string disk_type = 7;</code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.container.v1beta1.ShieldedInstanceConfig shielded_instance_config = 8;</code>
   *
   * @return Whether the shieldedInstanceConfig field is set.
   */
  boolean hasShieldedInstanceConfig();
  /**
   *
   *
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.container.v1beta1.ShieldedInstanceConfig shielded_instance_config = 8;</code>
   *
   * @return The shieldedInstanceConfig.
   */
  com.google.container.v1beta1.ShieldedInstanceConfig getShieldedInstanceConfig();
  /**
   *
   *
   * <pre>
   * Shielded Instance options.
   * </pre>
   *
   * <code>.google.container.v1beta1.ShieldedInstanceConfig shielded_instance_config = 8;</code>
   */
  com.google.container.v1beta1.ShieldedInstanceConfigOrBuilder getShieldedInstanceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The Customer Managed Encryption Key used to encrypt the boot disk attached
   * to each node in the node pool. This should be of the form
   * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME].
   * For more information about protecting resources with Cloud KMS Keys please
   * see:
   * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
   * </pre>
   *
   * <code>string boot_disk_kms_key = 9;</code>
   *
   * @return The bootDiskKmsKey.
   */
  java.lang.String getBootDiskKmsKey();
  /**
   *
   *
   * <pre>
   * The Customer Managed Encryption Key used to encrypt the boot disk attached
   * to each node in the node pool. This should be of the form
   * projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME].
   * For more information about protecting resources with Cloud KMS Keys please
   * see:
   * https://cloud.google.com/compute/docs/disks/customer-managed-encryption
   * </pre>
   *
   * <code>string boot_disk_kms_key = 9;</code>
   *
   * @return The bytes for bootDiskKmsKey.
   */
  com.google.protobuf.ByteString getBootDiskKmsKeyBytes();

  /**
   *
   *
   * <pre>
   * The image type to use for NAP created node.
   * </pre>
   *
   * <code>string image_type = 10;</code>
   *
   * @return The imageType.
   */
  java.lang.String getImageType();
  /**
   *
   *
   * <pre>
   * The image type to use for NAP created node.
   * </pre>
   *
   * <code>string image_type = 10;</code>
   *
   * @return The bytes for imageType.
   */
  com.google.protobuf.ByteString getImageTypeBytes();
}
