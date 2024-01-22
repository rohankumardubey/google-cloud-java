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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * SandboxConfig contains configurations of the sandbox to use for the node.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.SandboxConfig}
 */
public final class SandboxConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.SandboxConfig)
    SandboxConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SandboxConfig.newBuilder() to construct.
  private SandboxConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SandboxConfig() {
    sandboxType_ = "";
    type_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SandboxConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_SandboxConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_SandboxConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.SandboxConfig.class,
            com.google.container.v1beta1.SandboxConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible types of sandboxes.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.SandboxConfig.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This should not be used.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Run sandbox using gvisor.
     * </pre>
     *
     * <code>GVISOR = 1;</code>
     */
    GVISOR(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This should not be used.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Run sandbox using gvisor.
     * </pre>
     *
     * <code>GVISOR = 1;</code>
     */
    public static final int GVISOR_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return UNSPECIFIED;
        case 1:
          return GVISOR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.container.v1beta1.SandboxConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.SandboxConfig.Type)
  }

  public static final int SANDBOX_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sandboxType_ = "";
  /**
   *
   *
   * <pre>
   * Type of the sandbox to use for the node (e.g. 'gvisor')
   * </pre>
   *
   * <code>string sandbox_type = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=1004
   * @return The sandboxType.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getSandboxType() {
    java.lang.Object ref = sandboxType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sandboxType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Type of the sandbox to use for the node (e.g. 'gvisor')
   * </pre>
   *
   * <code>string sandbox_type = 1 [deprecated = true];</code>
   *
   * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=1004
   * @return The bytes for sandboxType.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getSandboxTypeBytes() {
    java.lang.Object ref = sandboxType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sandboxType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_ = 0;
  /**
   *
   *
   * <pre>
   * Type of the sandbox to use for the node.
   * </pre>
   *
   * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
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
   * Type of the sandbox to use for the node.
   * </pre>
   *
   * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public com.google.container.v1beta1.SandboxConfig.Type getType() {
    com.google.container.v1beta1.SandboxConfig.Type result =
        com.google.container.v1beta1.SandboxConfig.Type.forNumber(type_);
    return result == null ? com.google.container.v1beta1.SandboxConfig.Type.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sandboxType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sandboxType_);
    }
    if (type_ != com.google.container.v1beta1.SandboxConfig.Type.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sandboxType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sandboxType_);
    }
    if (type_ != com.google.container.v1beta1.SandboxConfig.Type.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.container.v1beta1.SandboxConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.SandboxConfig other =
        (com.google.container.v1beta1.SandboxConfig) obj;

    if (!getSandboxType().equals(other.getSandboxType())) return false;
    if (type_ != other.type_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SANDBOX_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getSandboxType().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.SandboxConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.SandboxConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.SandboxConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.SandboxConfig prototype) {
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
   * SandboxConfig contains configurations of the sandbox to use for the node.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.SandboxConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.SandboxConfig)
      com.google.container.v1beta1.SandboxConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_SandboxConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_SandboxConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.SandboxConfig.class,
              com.google.container.v1beta1.SandboxConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.SandboxConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sandboxType_ = "";
      type_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_SandboxConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.SandboxConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.SandboxConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.SandboxConfig build() {
      com.google.container.v1beta1.SandboxConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.SandboxConfig buildPartial() {
      com.google.container.v1beta1.SandboxConfig result =
          new com.google.container.v1beta1.SandboxConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.SandboxConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sandboxType_ = sandboxType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
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
      if (other instanceof com.google.container.v1beta1.SandboxConfig) {
        return mergeFrom((com.google.container.v1beta1.SandboxConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.SandboxConfig other) {
      if (other == com.google.container.v1beta1.SandboxConfig.getDefaultInstance()) return this;
      if (!other.getSandboxType().isEmpty()) {
        sandboxType_ = other.sandboxType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                sandboxType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                type_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object sandboxType_ = "";
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node (e.g. 'gvisor')
     * </pre>
     *
     * <code>string sandbox_type = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1004
     * @return The sandboxType.
     */
    @java.lang.Deprecated
    public java.lang.String getSandboxType() {
      java.lang.Object ref = sandboxType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sandboxType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node (e.g. 'gvisor')
     * </pre>
     *
     * <code>string sandbox_type = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1004
     * @return The bytes for sandboxType.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getSandboxTypeBytes() {
      java.lang.Object ref = sandboxType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sandboxType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node (e.g. 'gvisor')
     * </pre>
     *
     * <code>string sandbox_type = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1004
     * @param value The sandboxType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setSandboxType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sandboxType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node (e.g. 'gvisor')
     * </pre>
     *
     * <code>string sandbox_type = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1004
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearSandboxType() {
      sandboxType_ = getDefaultInstance().getSandboxType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node (e.g. 'gvisor')
     * </pre>
     *
     * <code>string sandbox_type = 1 [deprecated = true];</code>
     *
     * @deprecated google.container.v1beta1.SandboxConfig.sandbox_type is deprecated. See
     *     google/container/v1beta1/cluster_service.proto;l=1004
     * @param value The bytes for sandboxType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setSandboxTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sandboxType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
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
     * Type of the sandbox to use for the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
     *
     * @return The type.
     */
    @java.lang.Override
    public com.google.container.v1beta1.SandboxConfig.Type getType() {
      com.google.container.v1beta1.SandboxConfig.Type result =
          com.google.container.v1beta1.SandboxConfig.Type.forNumber(type_);
      return result == null ? com.google.container.v1beta1.SandboxConfig.Type.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.container.v1beta1.SandboxConfig.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the sandbox to use for the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.SandboxConfig.Type type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000002);
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.SandboxConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.SandboxConfig)
  private static final com.google.container.v1beta1.SandboxConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.SandboxConfig();
  }

  public static com.google.container.v1beta1.SandboxConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SandboxConfig> PARSER =
      new com.google.protobuf.AbstractParser<SandboxConfig>() {
        @java.lang.Override
        public SandboxConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<SandboxConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SandboxConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.SandboxConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
