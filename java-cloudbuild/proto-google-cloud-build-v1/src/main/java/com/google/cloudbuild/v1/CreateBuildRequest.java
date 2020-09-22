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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Request to create a new build.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.CreateBuildRequest}
 */
public final class CreateBuildRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.CreateBuildRequest)
    CreateBuildRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateBuildRequest.newBuilder() to construct.
  private CreateBuildRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateBuildRequest() {
    parent_ = "";
    projectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateBuildRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateBuildRequest(
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

              projectId_ = s;
              break;
            }
          case 18:
            {
              com.google.cloudbuild.v1.Build.Builder subBuilder = null;
              if (build_ != null) {
                subBuilder = build_.toBuilder();
              }
              build_ =
                  input.readMessage(com.google.cloudbuild.v1.Build.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(build_);
                build_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_CreateBuildRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_CreateBuildRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.CreateBuildRequest.class,
            com.google.cloudbuild.v1.CreateBuildRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 4;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * The parent resource where this build will be created.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The parent resource where this build will be created.
   * Format: `projects/{project}/locations/{location}`
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   *
   *
   * <pre>
   * Required. ID of the project.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. ID of the project.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BUILD_FIELD_NUMBER = 2;
  private com.google.cloudbuild.v1.Build build_;
  /**
   *
   *
   * <pre>
   * Required. Build resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the build field is set.
   */
  @java.lang.Override
  public boolean hasBuild() {
    return build_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Build resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The build.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.Build getBuild() {
    return build_ == null ? com.google.cloudbuild.v1.Build.getDefaultInstance() : build_;
  }
  /**
   *
   *
   * <pre>
   * Required. Build resource to create.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.BuildOrBuilder getBuildOrBuilder() {
    return getBuild();
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
    if (!getProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (build_ != null) {
      output.writeMessage(2, getBuild());
    }
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, parent_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (build_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBuild());
    }
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, parent_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.CreateBuildRequest)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.CreateBuildRequest other =
        (com.google.cloudbuild.v1.CreateBuildRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getProjectId().equals(other.getProjectId())) return false;
    if (hasBuild() != other.hasBuild()) return false;
    if (hasBuild()) {
      if (!getBuild().equals(other.getBuild())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    if (hasBuild()) {
      hash = (37 * hash) + BUILD_FIELD_NUMBER;
      hash = (53 * hash) + getBuild().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.CreateBuildRequest prototype) {
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
   * Request to create a new build.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.CreateBuildRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.CreateBuildRequest)
      com.google.cloudbuild.v1.CreateBuildRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_CreateBuildRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_CreateBuildRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.CreateBuildRequest.class,
              com.google.cloudbuild.v1.CreateBuildRequest.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.CreateBuildRequest.newBuilder()
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
      parent_ = "";

      projectId_ = "";

      if (buildBuilder_ == null) {
        build_ = null;
      } else {
        build_ = null;
        buildBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_CreateBuildRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.CreateBuildRequest getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.CreateBuildRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.CreateBuildRequest build() {
      com.google.cloudbuild.v1.CreateBuildRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.CreateBuildRequest buildPartial() {
      com.google.cloudbuild.v1.CreateBuildRequest result =
          new com.google.cloudbuild.v1.CreateBuildRequest(this);
      result.parent_ = parent_;
      result.projectId_ = projectId_;
      if (buildBuilder_ == null) {
        result.build_ = build_;
      } else {
        result.build_ = buildBuilder_.build();
      }
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
      if (other instanceof com.google.cloudbuild.v1.CreateBuildRequest) {
        return mergeFrom((com.google.cloudbuild.v1.CreateBuildRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.CreateBuildRequest other) {
      if (other == com.google.cloudbuild.v1.CreateBuildRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (other.hasBuild()) {
        mergeBuild(other.getBuild());
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
      com.google.cloudbuild.v1.CreateBuildRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.CreateBuildRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The parent resource where this build will be created.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The parent resource where this build will be created.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The parent resource where this build will be created.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parent resource where this build will be created.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The parent resource where this build will be created.
     * Format: `projects/{project}/locations/{location}`
     * </pre>
     *
     * <code>string parent = 4 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * Required. ID of the project.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID of the project.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. ID of the project.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID of the project.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {

      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. ID of the project.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      projectId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v1.Build build_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.Build,
            com.google.cloudbuild.v1.Build.Builder,
            com.google.cloudbuild.v1.BuildOrBuilder>
        buildBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the build field is set.
     */
    public boolean hasBuild() {
      return buildBuilder_ != null || build_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The build.
     */
    public com.google.cloudbuild.v1.Build getBuild() {
      if (buildBuilder_ == null) {
        return build_ == null ? com.google.cloudbuild.v1.Build.getDefaultInstance() : build_;
      } else {
        return buildBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBuild(com.google.cloudbuild.v1.Build value) {
      if (buildBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        build_ = value;
        onChanged();
      } else {
        buildBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setBuild(com.google.cloudbuild.v1.Build.Builder builderForValue) {
      if (buildBuilder_ == null) {
        build_ = builderForValue.build();
        onChanged();
      } else {
        buildBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeBuild(com.google.cloudbuild.v1.Build value) {
      if (buildBuilder_ == null) {
        if (build_ != null) {
          build_ =
              com.google.cloudbuild.v1.Build.newBuilder(build_).mergeFrom(value).buildPartial();
        } else {
          build_ = value;
        }
        onChanged();
      } else {
        buildBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearBuild() {
      if (buildBuilder_ == null) {
        build_ = null;
        onChanged();
      } else {
        build_ = null;
        buildBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloudbuild.v1.Build.Builder getBuildBuilder() {

      onChanged();
      return getBuildFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloudbuild.v1.BuildOrBuilder getBuildOrBuilder() {
      if (buildBuilder_ != null) {
        return buildBuilder_.getMessageOrBuilder();
      } else {
        return build_ == null ? com.google.cloudbuild.v1.Build.getDefaultInstance() : build_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Build resource to create.
     * </pre>
     *
     * <code>
     * .google.devtools.cloudbuild.v1.Build build = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.Build,
            com.google.cloudbuild.v1.Build.Builder,
            com.google.cloudbuild.v1.BuildOrBuilder>
        getBuildFieldBuilder() {
      if (buildBuilder_ == null) {
        buildBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloudbuild.v1.Build,
                com.google.cloudbuild.v1.Build.Builder,
                com.google.cloudbuild.v1.BuildOrBuilder>(
                getBuild(), getParentForChildren(), isClean());
        build_ = null;
      }
      return buildBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.CreateBuildRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.CreateBuildRequest)
  private static final com.google.cloudbuild.v1.CreateBuildRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.CreateBuildRequest();
  }

  public static com.google.cloudbuild.v1.CreateBuildRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBuildRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateBuildRequest>() {
        @java.lang.Override
        public CreateBuildRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateBuildRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateBuildRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBuildRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.CreateBuildRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
