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
// source: google/cloud/vmmigration/v1/vmmigration.proto

package com.google.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [fetchInventory][google.cloud.vmmigration.v1.VmMigration.FetchInventory].
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmmigration.v1.FetchInventoryResponse}
 */
public final class FetchInventoryResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmmigration.v1.FetchInventoryResponse)
    FetchInventoryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FetchInventoryResponse.newBuilder() to construct.
  private FetchInventoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchInventoryResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchInventoryResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private FetchInventoryResponse(
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
              com.google.cloud.vmmigration.v1.VmwareVmsDetails.Builder subBuilder = null;
              if (sourceVmsCase_ == 1) {
                subBuilder =
                    ((com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_).toBuilder();
              }
              sourceVms_ =
                  input.readMessage(
                      com.google.cloud.vmmigration.v1.VmwareVmsDetails.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_);
                sourceVms_ = subBuilder.buildPartial();
              }
              sourceVmsCase_ = 1;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

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
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_FetchInventoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmmigration.v1.VmMigrationProto
        .internal_static_google_cloud_vmmigration_v1_FetchInventoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmmigration.v1.FetchInventoryResponse.class,
            com.google.cloud.vmmigration.v1.FetchInventoryResponse.Builder.class);
  }

  private int sourceVmsCase_ = 0;
  private java.lang.Object sourceVms_;

  public enum SourceVmsCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VMWARE_VMS(1),
    SOURCEVMS_NOT_SET(0);
    private final int value;

    private SourceVmsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceVmsCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceVmsCase forNumber(int value) {
      switch (value) {
        case 1:
          return VMWARE_VMS;
        case 0:
          return SOURCEVMS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceVmsCase getSourceVmsCase() {
    return SourceVmsCase.forNumber(sourceVmsCase_);
  }

  public static final int VMWARE_VMS_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Output only. The description of the VMs in a Source of type Vmware.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the vmwareVms field is set.
   */
  @java.lang.Override
  public boolean hasVmwareVms() {
    return sourceVmsCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Output only. The description of the VMs in a Source of type Vmware.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The vmwareVms.
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmwareVmsDetails getVmwareVms() {
    if (sourceVmsCase_ == 1) {
      return (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_;
    }
    return com.google.cloud.vmmigration.v1.VmwareVmsDetails.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Output only. The description of the VMs in a Source of type Vmware.
   * </pre>
   *
   * <code>
   * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.vmmigration.v1.VmwareVmsDetailsOrBuilder getVmwareVmsOrBuilder() {
    if (sourceVmsCase_ == 1) {
      return (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_;
    }
    return com.google.cloud.vmmigration.v1.VmwareVmsDetails.getDefaultInstance();
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the source was last queried (if the result is from the
   * cache).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the source was last queried (if the result is from the
   * cache).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the source was last queried (if the result is from the
   * cache).
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
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
    if (sourceVmsCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_);
    }
    if (updateTime_ != null) {
      output.writeMessage(2, getUpdateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceVmsCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_);
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.vmmigration.v1.FetchInventoryResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.vmmigration.v1.FetchInventoryResponse other =
        (com.google.cloud.vmmigration.v1.FetchInventoryResponse) obj;

    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!getSourceVmsCase().equals(other.getSourceVmsCase())) return false;
    switch (sourceVmsCase_) {
      case 1:
        if (!getVmwareVms().equals(other.getVmwareVms())) return false;
        break;
      case 0:
      default:
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
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    switch (sourceVmsCase_) {
      case 1:
        hash = (37 * hash) + VMWARE_VMS_FIELD_NUMBER;
        hash = (53 * hash) + getVmwareVms().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse parseFrom(
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
      com.google.cloud.vmmigration.v1.FetchInventoryResponse prototype) {
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
   * Response message for
   * [fetchInventory][google.cloud.vmmigration.v1.VmMigration.FetchInventory].
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmmigration.v1.FetchInventoryResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmmigration.v1.FetchInventoryResponse)
      com.google.cloud.vmmigration.v1.FetchInventoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_FetchInventoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_FetchInventoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmmigration.v1.FetchInventoryResponse.class,
              com.google.cloud.vmmigration.v1.FetchInventoryResponse.Builder.class);
    }

    // Construct using com.google.cloud.vmmigration.v1.FetchInventoryResponse.newBuilder()
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
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      sourceVmsCase_ = 0;
      sourceVms_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vmmigration.v1.VmMigrationProto
          .internal_static_google_cloud_vmmigration_v1_FetchInventoryResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.FetchInventoryResponse getDefaultInstanceForType() {
      return com.google.cloud.vmmigration.v1.FetchInventoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.FetchInventoryResponse build() {
      com.google.cloud.vmmigration.v1.FetchInventoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmmigration.v1.FetchInventoryResponse buildPartial() {
      com.google.cloud.vmmigration.v1.FetchInventoryResponse result =
          new com.google.cloud.vmmigration.v1.FetchInventoryResponse(this);
      if (sourceVmsCase_ == 1) {
        if (vmwareVmsBuilder_ == null) {
          result.sourceVms_ = sourceVms_;
        } else {
          result.sourceVms_ = vmwareVmsBuilder_.build();
        }
      }
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      result.sourceVmsCase_ = sourceVmsCase_;
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
      if (other instanceof com.google.cloud.vmmigration.v1.FetchInventoryResponse) {
        return mergeFrom((com.google.cloud.vmmigration.v1.FetchInventoryResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmmigration.v1.FetchInventoryResponse other) {
      if (other == com.google.cloud.vmmigration.v1.FetchInventoryResponse.getDefaultInstance())
        return this;
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      switch (other.getSourceVmsCase()) {
        case VMWARE_VMS:
          {
            mergeVmwareVms(other.getVmwareVms());
            break;
          }
        case SOURCEVMS_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.vmmigration.v1.FetchInventoryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vmmigration.v1.FetchInventoryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceVmsCase_ = 0;
    private java.lang.Object sourceVms_;

    public SourceVmsCase getSourceVmsCase() {
      return SourceVmsCase.forNumber(sourceVmsCase_);
    }

    public Builder clearSourceVms() {
      sourceVmsCase_ = 0;
      sourceVms_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vmmigration.v1.VmwareVmsDetails,
            com.google.cloud.vmmigration.v1.VmwareVmsDetails.Builder,
            com.google.cloud.vmmigration.v1.VmwareVmsDetailsOrBuilder>
        vmwareVmsBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the vmwareVms field is set.
     */
    @java.lang.Override
    public boolean hasVmwareVms() {
      return sourceVmsCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The vmwareVms.
     */
    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmwareVmsDetails getVmwareVms() {
      if (vmwareVmsBuilder_ == null) {
        if (sourceVmsCase_ == 1) {
          return (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_;
        }
        return com.google.cloud.vmmigration.v1.VmwareVmsDetails.getDefaultInstance();
      } else {
        if (sourceVmsCase_ == 1) {
          return vmwareVmsBuilder_.getMessage();
        }
        return com.google.cloud.vmmigration.v1.VmwareVmsDetails.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setVmwareVms(com.google.cloud.vmmigration.v1.VmwareVmsDetails value) {
      if (vmwareVmsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sourceVms_ = value;
        onChanged();
      } else {
        vmwareVmsBuilder_.setMessage(value);
      }
      sourceVmsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setVmwareVms(
        com.google.cloud.vmmigration.v1.VmwareVmsDetails.Builder builderForValue) {
      if (vmwareVmsBuilder_ == null) {
        sourceVms_ = builderForValue.build();
        onChanged();
      } else {
        vmwareVmsBuilder_.setMessage(builderForValue.build());
      }
      sourceVmsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeVmwareVms(com.google.cloud.vmmigration.v1.VmwareVmsDetails value) {
      if (vmwareVmsBuilder_ == null) {
        if (sourceVmsCase_ == 1
            && sourceVms_
                != com.google.cloud.vmmigration.v1.VmwareVmsDetails.getDefaultInstance()) {
          sourceVms_ =
              com.google.cloud.vmmigration.v1.VmwareVmsDetails.newBuilder(
                      (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          sourceVms_ = value;
        }
        onChanged();
      } else {
        if (sourceVmsCase_ == 1) {
          vmwareVmsBuilder_.mergeFrom(value);
        }
        vmwareVmsBuilder_.setMessage(value);
      }
      sourceVmsCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearVmwareVms() {
      if (vmwareVmsBuilder_ == null) {
        if (sourceVmsCase_ == 1) {
          sourceVmsCase_ = 0;
          sourceVms_ = null;
          onChanged();
        }
      } else {
        if (sourceVmsCase_ == 1) {
          sourceVmsCase_ = 0;
          sourceVms_ = null;
        }
        vmwareVmsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.vmmigration.v1.VmwareVmsDetails.Builder getVmwareVmsBuilder() {
      return getVmwareVmsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.vmmigration.v1.VmwareVmsDetailsOrBuilder getVmwareVmsOrBuilder() {
      if ((sourceVmsCase_ == 1) && (vmwareVmsBuilder_ != null)) {
        return vmwareVmsBuilder_.getMessageOrBuilder();
      } else {
        if (sourceVmsCase_ == 1) {
          return (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_;
        }
        return com.google.cloud.vmmigration.v1.VmwareVmsDetails.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The description of the VMs in a Source of type Vmware.
     * </pre>
     *
     * <code>
     * .google.cloud.vmmigration.v1.VmwareVmsDetails vmware_vms = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vmmigration.v1.VmwareVmsDetails,
            com.google.cloud.vmmigration.v1.VmwareVmsDetails.Builder,
            com.google.cloud.vmmigration.v1.VmwareVmsDetailsOrBuilder>
        getVmwareVmsFieldBuilder() {
      if (vmwareVmsBuilder_ == null) {
        if (!(sourceVmsCase_ == 1)) {
          sourceVms_ = com.google.cloud.vmmigration.v1.VmwareVmsDetails.getDefaultInstance();
        }
        vmwareVmsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.vmmigration.v1.VmwareVmsDetails,
                com.google.cloud.vmmigration.v1.VmwareVmsDetails.Builder,
                com.google.cloud.vmmigration.v1.VmwareVmsDetailsOrBuilder>(
                (com.google.cloud.vmmigration.v1.VmwareVmsDetails) sourceVms_,
                getParentForChildren(),
                isClean());
        sourceVms_ = null;
      }
      sourceVmsCase_ = 1;
      onChanged();
      ;
      return vmwareVmsBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The timestamp when the source was last queried (if the result is from the
     * cache).
     * </pre>
     *
     * <code>
     * .google.protobuf.Timestamp update_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vmmigration.v1.FetchInventoryResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmmigration.v1.FetchInventoryResponse)
  private static final com.google.cloud.vmmigration.v1.FetchInventoryResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmmigration.v1.FetchInventoryResponse();
  }

  public static com.google.cloud.vmmigration.v1.FetchInventoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchInventoryResponse> PARSER =
      new com.google.protobuf.AbstractParser<FetchInventoryResponse>() {
        @java.lang.Override
        public FetchInventoryResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new FetchInventoryResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<FetchInventoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchInventoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmmigration.v1.FetchInventoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
