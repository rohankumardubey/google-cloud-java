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
// source: google/cloud/osconfig/v1alpha/os_policy_assignment_reports.proto

package com.google.cloud.osconfig.v1alpha;

/**
 *
 *
 * <pre>
 * Get a report of the OS policy assignment for a VM instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest}
 */
public final class GetOSPolicyAssignmentReportRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest)
    GetOSPolicyAssignmentReportRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetOSPolicyAssignmentReportRequest.newBuilder() to construct.
  private GetOSPolicyAssignmentReportRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetOSPolicyAssignmentReportRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetOSPolicyAssignmentReportRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetOSPolicyAssignmentReportRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportsProto
        .internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportsProto
        .internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest.class,
            com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. API resource name for OS policy assignment report.
   * Format:
   * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
   * can be provided.
   * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. API resource name for OS policy assignment report.
   * Format:
   * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
   * For `{project}`, either `project-number` or `project-id` can be provided.
   * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
   * can be provided.
   * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest other =
        (com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Get a report of the OS policy assignment for a VM instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest)
      com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportsProto
          .internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportsProto
          .internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest.class,
              com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportsProto
          .internal_static_google_cloud_osconfig_v1alpha_GetOSPolicyAssignmentReportRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
        getDefaultInstanceForType() {
      return com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest build() {
      com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest buildPartial() {
      com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest result =
          new com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest(this);
      result.name_ = name_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest) {
        return mergeFrom(
            (com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest other) {
      if (other
          == com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. API resource name for OS policy assignment report.
     * Format:
     * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
     * can be provided.
     * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. API resource name for OS policy assignment report.
     * Format:
     * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
     * can be provided.
     * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. API resource name for OS policy assignment report.
     * Format:
     * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
     * can be provided.
     * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. API resource name for OS policy assignment report.
     * Format:
     * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
     * can be provided.
     * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. API resource name for OS policy assignment report.
     * Format:
     * `/projects/{project}/locations/{location}/instances/{instance}/osPolicyAssignments/{assignment}/report`
     * For `{project}`, either `project-number` or `project-id` can be provided.
     * For `{instance_id}`, either Compute Engine `instance-id` or `instance-name`
     * can be provided.
     * For `{assignment_id}`, the OSPolicyAssignment id must be provided.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest)
  private static final com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest();
  }

  public static com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetOSPolicyAssignmentReportRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetOSPolicyAssignmentReportRequest>() {
        @java.lang.Override
        public GetOSPolicyAssignmentReportRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetOSPolicyAssignmentReportRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetOSPolicyAssignmentReportRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetOSPolicyAssignmentReportRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.v1alpha.GetOSPolicyAssignmentReportRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}