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
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

/**
 *
 *
 * <pre>
 * Request for checking if a notebook instance is upgradeable.
 * </pre>
 *
 * Protobuf type {@code google.cloud.notebooks.v1.IsInstanceUpgradeableRequest}
 */
public final class IsInstanceUpgradeableRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.notebooks.v1.IsInstanceUpgradeableRequest)
    IsInstanceUpgradeableRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IsInstanceUpgradeableRequest.newBuilder() to construct.
  private IsInstanceUpgradeableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IsInstanceUpgradeableRequest() {
    notebookInstance_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IsInstanceUpgradeableRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private IsInstanceUpgradeableRequest(
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

              notebookInstance_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
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
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_IsInstanceUpgradeableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.notebooks.v1.NotebooksProto
        .internal_static_google_cloud_notebooks_v1_IsInstanceUpgradeableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest.class,
            com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest.Builder.class);
  }

  public static final int NOTEBOOK_INSTANCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object notebookInstance_;
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string notebook_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The notebookInstance.
   */
  @java.lang.Override
  public java.lang.String getNotebookInstance() {
    java.lang.Object ref = notebookInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      notebookInstance_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string notebook_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for notebookInstance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNotebookInstanceBytes() {
    java.lang.Object ref = notebookInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      notebookInstance_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   *
   *
   * <pre>
   * Optional. The optional UpgradeType. Setting this field will search for additional
   * compute images to upgrade this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The optional UpgradeType. Setting this field will search for additional
   * compute images to upgrade this instance.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.cloud.notebooks.v1.UpgradeType getType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.notebooks.v1.UpgradeType result =
        com.google.cloud.notebooks.v1.UpgradeType.valueOf(type_);
    return result == null ? com.google.cloud.notebooks.v1.UpgradeType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notebookInstance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notebookInstance_);
    }
    if (type_ != com.google.cloud.notebooks.v1.UpgradeType.UPGRADE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(notebookInstance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, notebookInstance_);
    }
    if (type_ != com.google.cloud.notebooks.v1.UpgradeType.UPGRADE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
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
    if (!(obj instanceof com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest other =
        (com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest) obj;

    if (!getNotebookInstance().equals(other.getNotebookInstance())) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + NOTEBOOK_INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getNotebookInstance().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parseFrom(
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
      com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest prototype) {
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
   * Request for checking if a notebook instance is upgradeable.
   * </pre>
   *
   * Protobuf type {@code google.cloud.notebooks.v1.IsInstanceUpgradeableRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.notebooks.v1.IsInstanceUpgradeableRequest)
      com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_IsInstanceUpgradeableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_IsInstanceUpgradeableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest.class,
              com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest.Builder.class);
    }

    // Construct using com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest.newBuilder()
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
      notebookInstance_ = "";

      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.notebooks.v1.NotebooksProto
          .internal_static_google_cloud_notebooks_v1_IsInstanceUpgradeableRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest getDefaultInstanceForType() {
      return com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest build() {
      com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest buildPartial() {
      com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest result =
          new com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest(this);
      result.notebookInstance_ = notebookInstance_;
      result.type_ = type_;
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
      if (other instanceof com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest) {
        return mergeFrom((com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest other) {
      if (other == com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest.getDefaultInstance())
        return this;
      if (!other.getNotebookInstance().isEmpty()) {
        notebookInstance_ = other.notebookInstance_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object notebookInstance_ = "";
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string notebook_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The notebookInstance.
     */
    public java.lang.String getNotebookInstance() {
      java.lang.Object ref = notebookInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        notebookInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string notebook_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for notebookInstance.
     */
    public com.google.protobuf.ByteString getNotebookInstanceBytes() {
      java.lang.Object ref = notebookInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        notebookInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string notebook_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The notebookInstance to set.
     * @return This builder for chaining.
     */
    public Builder setNotebookInstance(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      notebookInstance_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string notebook_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNotebookInstance() {

      notebookInstance_ = getDefaultInstance().getNotebookInstance();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Format:
     * `projects/{project_id}/locations/{location}/instances/{instance_id}`
     * </pre>
     *
     * <code>string notebook_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for notebookInstance to set.
     * @return This builder for chaining.
     */
    public Builder setNotebookInstanceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      notebookInstance_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The optional UpgradeType. Setting this field will search for additional
     * compute images to upgrade this instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The optional UpgradeType. Setting this field will search for additional
     * compute images to upgrade this instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {

      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The optional UpgradeType. Setting this field will search for additional
     * compute images to upgrade this instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.cloud.notebooks.v1.UpgradeType getType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.notebooks.v1.UpgradeType result =
          com.google.cloud.notebooks.v1.UpgradeType.valueOf(type_);
      return result == null ? com.google.cloud.notebooks.v1.UpgradeType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The optional UpgradeType. Setting this field will search for additional
     * compute images to upgrade this instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.cloud.notebooks.v1.UpgradeType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The optional UpgradeType. Setting this field will search for additional
     * compute images to upgrade this instance.
     * </pre>
     *
     * <code>
     * .google.cloud.notebooks.v1.UpgradeType type = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.notebooks.v1.IsInstanceUpgradeableRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.notebooks.v1.IsInstanceUpgradeableRequest)
  private static final com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest();
  }

  public static com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IsInstanceUpgradeableRequest> PARSER =
      new com.google.protobuf.AbstractParser<IsInstanceUpgradeableRequest>() {
        @java.lang.Override
        public IsInstanceUpgradeableRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new IsInstanceUpgradeableRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<IsInstanceUpgradeableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IsInstanceUpgradeableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.notebooks.v1.IsInstanceUpgradeableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
