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
// source: google/cloud/run/v2/revision_template.proto

package com.google.cloud.run.v2;

public interface RevisionTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.RevisionTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique name for the revision. If this field is omitted, it will be
   * automatically generated based on the Service name.
   * </pre>
   *
   * <code>string revision = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The revision.
   */
  java.lang.String getRevision();
  /**
   *
   *
   * <pre>
   * The unique name for the revision. If this field is omitted, it will be
   * automatically generated based on the Service name.
   * </pre>
   *
   * <code>string revision = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for revision.
   */
  com.google.protobuf.ByteString getRevisionBytes();

  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * KRM-style labels for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3;</code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3;</code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3;</code>
   */

  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * KRM-style annotations for the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 3;</code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Scaling settings for this Revision.
   * </pre>
   *
   * <code>.google.cloud.run.v2.RevisionScaling scaling = 4;</code>
   *
   * @return Whether the scaling field is set.
   */
  boolean hasScaling();
  /**
   *
   *
   * <pre>
   * Scaling settings for this Revision.
   * </pre>
   *
   * <code>.google.cloud.run.v2.RevisionScaling scaling = 4;</code>
   *
   * @return The scaling.
   */
  com.google.cloud.run.v2.RevisionScaling getScaling();
  /**
   *
   *
   * <pre>
   * Scaling settings for this Revision.
   * </pre>
   *
   * <code>.google.cloud.run.v2.RevisionScaling scaling = 4;</code>
   */
  com.google.cloud.run.v2.RevisionScalingOrBuilder getScalingOrBuilder();

  /**
   *
   *
   * <pre>
   * VPC Access configuration to use for this Revision. For more information,
   * visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 6;</code>
   *
   * @return Whether the vpcAccess field is set.
   */
  boolean hasVpcAccess();
  /**
   *
   *
   * <pre>
   * VPC Access configuration to use for this Revision. For more information,
   * visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 6;</code>
   *
   * @return The vpcAccess.
   */
  com.google.cloud.run.v2.VpcAccess getVpcAccess();
  /**
   *
   *
   * <pre>
   * VPC Access configuration to use for this Revision. For more information,
   * visit https://cloud.google.com/run/docs/configuring/connecting-vpc.
   * </pre>
   *
   * <code>.google.cloud.run.v2.VpcAccess vpc_access = 6;</code>
   */
  com.google.cloud.run.v2.VpcAccessOrBuilder getVpcAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * Max allowed time for an instance to respond to a request.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Max allowed time for an instance to respond to a request.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Max allowed time for an instance to respond to a request.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Email address of the IAM service account associated with the revision of
   * the service. The service account represents the identity of the running
   * revision, and determines what permissions the revision has. If not
   * provided, the revision will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Email address of the IAM service account associated with the revision of
   * the service. The service account represents the identity of the running
   * revision, and determines what permissions the revision has. If not
   * provided, the revision will use the project's default service account.
   * </pre>
   *
   * <code>string service_account = 9;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  java.util.List<com.google.cloud.run.v2.Container> getContainersList();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  com.google.cloud.run.v2.Container getContainers(int index);
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  int getContainersCount();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ContainerOrBuilder> getContainersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Holds the single container that defines the unit of execution for this
   * Revision.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Container containers = 10;</code>
   */
  com.google.cloud.run.v2.ContainerOrBuilder getContainersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 11;</code>
   */
  java.util.List<com.google.cloud.run.v2.Volume> getVolumesList();
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 11;</code>
   */
  com.google.cloud.run.v2.Volume getVolumes(int index);
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 11;</code>
   */
  int getVolumesCount();
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 11;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.VolumeOrBuilder> getVolumesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of Volumes to make available to containers.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Volume volumes = 11;</code>
   */
  com.google.cloud.run.v2.VolumeOrBuilder getVolumesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The sandbox environment to host this Revision.
   * </pre>
   *
   * <code>.google.cloud.run.v2.ExecutionEnvironment execution_environment = 13;</code>
   *
   * @return The enum numeric value on the wire for executionEnvironment.
   */
  int getExecutionEnvironmentValue();
  /**
   *
   *
   * <pre>
   * The sandbox environment to host this Revision.
   * </pre>
   *
   * <code>.google.cloud.run.v2.ExecutionEnvironment execution_environment = 13;</code>
   *
   * @return The executionEnvironment.
   */
  com.google.cloud.run.v2.ExecutionEnvironment getExecutionEnvironment();

  /**
   *
   *
   * <pre>
   * A reference to a customer managed encryption key (CMEK) to use to encrypt
   * this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>string encryption_key = 14 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The encryptionKey.
   */
  java.lang.String getEncryptionKey();
  /**
   *
   *
   * <pre>
   * A reference to a customer managed encryption key (CMEK) to use to encrypt
   * this container image. For more information, go to
   * https://cloud.google.com/run/docs/securing/using-cmek
   * </pre>
   *
   * <code>string encryption_key = 14 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for encryptionKey.
   */
  com.google.protobuf.ByteString getEncryptionKeyBytes();

  /**
   *
   *
   * <pre>
   * Sets the maximum number of requests that each serving instance can receive.
   * </pre>
   *
   * <code>int32 max_instance_request_concurrency = 15;</code>
   *
   * @return The maxInstanceRequestConcurrency.
   */
  int getMaxInstanceRequestConcurrency();
}
