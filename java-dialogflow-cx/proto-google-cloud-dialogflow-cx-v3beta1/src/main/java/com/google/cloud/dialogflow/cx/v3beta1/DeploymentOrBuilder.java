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
// source: google/cloud/dialogflow/cx/v3beta1/deployment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public interface DeploymentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Deployment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the deployment.
   * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/deployments/&lt;Deployment ID&gt;.
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
   * The name of the deployment.
   * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/deployments/&lt;Deployment ID&gt;.
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
   * The name of the flow version for this deployment.
   * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Verion ID&gt;.
   * </pre>
   *
   * <code>string flow_version = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The flowVersion.
   */
  java.lang.String getFlowVersion();
  /**
   *
   *
   * <pre>
   * The name of the flow version for this deployment.
   * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/versions/&lt;Verion ID&gt;.
   * </pre>
   *
   * <code>string flow_version = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for flowVersion.
   */
  com.google.protobuf.ByteString getFlowVersionBytes();

  /**
   *
   *
   * <pre>
   * The current state of the deployment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Deployment.State state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current state of the deployment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Deployment.State state = 3;</code>
   *
   * @return The state.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Deployment.State getState();

  /**
   *
   *
   * <pre>
   * Result of the deployment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Deployment.Result result = 4;</code>
   *
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   *
   *
   * <pre>
   * Result of the deployment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Deployment.Result result = 4;</code>
   *
   * @return The result.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Deployment.Result getResult();
  /**
   *
   *
   * <pre>
   * Result of the deployment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Deployment.Result result = 4;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Deployment.ResultOrBuilder getResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Start time of this deployment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Start time of this deployment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Start time of this deployment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * End time of this deployment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * End time of this deployment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * End time of this deployment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
