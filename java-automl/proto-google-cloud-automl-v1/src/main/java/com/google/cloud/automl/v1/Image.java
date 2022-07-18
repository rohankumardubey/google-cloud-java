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
// source: google/cloud/automl/v1/data_items.proto

package com.google.cloud.automl.v1;

/**
 *
 *
 * <pre>
 * A representation of an image.
 * Only images up to 30MB in size are supported.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1.Image}
 */
public final class Image extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1.Image)
    ImageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Image.newBuilder() to construct.
  private Image(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Image() {
    thumbnailUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Image();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Image(
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
              data_ = input.readBytes();
              dataCase_ = 1;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              thumbnailUri_ = s;
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
    return com.google.cloud.automl.v1.DataItems
        .internal_static_google_cloud_automl_v1_Image_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1.DataItems
        .internal_static_google_cloud_automl_v1_Image_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1.Image.class, com.google.cloud.automl.v1.Image.Builder.class);
  }

  private int dataCase_ = 0;
  private java.lang.Object data_;

  public enum DataCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    IMAGE_BYTES(1),
    DATA_NOT_SET(0);
    private final int value;

    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 1:
          return IMAGE_BYTES;
        case 0:
          return DATA_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public DataCase getDataCase() {
    return DataCase.forNumber(dataCase_);
  }

  public static final int IMAGE_BYTES_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Image content represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes image_bytes = 1;</code>
   *
   * @return Whether the imageBytes field is set.
   */
  @java.lang.Override
  public boolean hasImageBytes() {
    return dataCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Image content represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes image_bytes = 1;</code>
   *
   * @return The imageBytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getImageBytes() {
    if (dataCase_ == 1) {
      return (com.google.protobuf.ByteString) data_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int THUMBNAIL_URI_FIELD_NUMBER = 4;
  private volatile java.lang.Object thumbnailUri_;
  /**
   *
   *
   * <pre>
   * Output only. HTTP URI to the thumbnail image.
   * </pre>
   *
   * <code>string thumbnail_uri = 4;</code>
   *
   * @return The thumbnailUri.
   */
  @java.lang.Override
  public java.lang.String getThumbnailUri() {
    java.lang.Object ref = thumbnailUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      thumbnailUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. HTTP URI to the thumbnail image.
   * </pre>
   *
   * <code>string thumbnail_uri = 4;</code>
   *
   * @return The bytes for thumbnailUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getThumbnailUriBytes() {
    java.lang.Object ref = thumbnailUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      thumbnailUri_ = b;
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
    if (dataCase_ == 1) {
      output.writeBytes(1, (com.google.protobuf.ByteString) data_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thumbnailUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, thumbnailUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dataCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBytesSize(
              1, (com.google.protobuf.ByteString) data_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thumbnailUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, thumbnailUri_);
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
    if (!(obj instanceof com.google.cloud.automl.v1.Image)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1.Image other = (com.google.cloud.automl.v1.Image) obj;

    if (!getThumbnailUri().equals(other.getThumbnailUri())) return false;
    if (!getDataCase().equals(other.getDataCase())) return false;
    switch (dataCase_) {
      case 1:
        if (!getImageBytes().equals(other.getImageBytes())) return false;
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
    hash = (37 * hash) + THUMBNAIL_URI_FIELD_NUMBER;
    hash = (53 * hash) + getThumbnailUri().hashCode();
    switch (dataCase_) {
      case 1:
        hash = (37 * hash) + IMAGE_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + getImageBytes().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1.Image parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.Image parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.Image parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1.Image parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1.Image prototype) {
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
   * A representation of an image.
   * Only images up to 30MB in size are supported.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1.Image}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1.Image)
      com.google.cloud.automl.v1.ImageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1.DataItems
          .internal_static_google_cloud_automl_v1_Image_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1.DataItems
          .internal_static_google_cloud_automl_v1_Image_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1.Image.class,
              com.google.cloud.automl.v1.Image.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1.Image.newBuilder()
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
      thumbnailUri_ = "";

      dataCase_ = 0;
      data_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1.DataItems
          .internal_static_google_cloud_automl_v1_Image_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.Image getDefaultInstanceForType() {
      return com.google.cloud.automl.v1.Image.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.Image build() {
      com.google.cloud.automl.v1.Image result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1.Image buildPartial() {
      com.google.cloud.automl.v1.Image result = new com.google.cloud.automl.v1.Image(this);
      if (dataCase_ == 1) {
        result.data_ = data_;
      }
      result.thumbnailUri_ = thumbnailUri_;
      result.dataCase_ = dataCase_;
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
      if (other instanceof com.google.cloud.automl.v1.Image) {
        return mergeFrom((com.google.cloud.automl.v1.Image) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1.Image other) {
      if (other == com.google.cloud.automl.v1.Image.getDefaultInstance()) return this;
      if (!other.getThumbnailUri().isEmpty()) {
        thumbnailUri_ = other.thumbnailUri_;
        onChanged();
      }
      switch (other.getDataCase()) {
        case IMAGE_BYTES:
          {
            setImageBytes(other.getImageBytes());
            break;
          }
        case DATA_NOT_SET:
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
      com.google.cloud.automl.v1.Image parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.automl.v1.Image) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int dataCase_ = 0;
    private java.lang.Object data_;

    public DataCase getDataCase() {
      return DataCase.forNumber(dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @return Whether the imageBytes field is set.
     */
    public boolean hasImageBytes() {
      return dataCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @return The imageBytes.
     */
    public com.google.protobuf.ByteString getImageBytes() {
      if (dataCase_ == 1) {
        return (com.google.protobuf.ByteString) data_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @param value The imageBytes to set.
     * @return This builder for chaining.
     */
    public Builder setImageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dataCase_ = 1;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image content represented as a stream of bytes.
     * Note: As with all `bytes` fields, protobuffers use a pure binary
     * representation, whereas JSON representations use base64.
     * </pre>
     *
     * <code>bytes image_bytes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageBytes() {
      if (dataCase_ == 1) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }

    private java.lang.Object thumbnailUri_ = "";
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @return The thumbnailUri.
     */
    public java.lang.String getThumbnailUri() {
      java.lang.Object ref = thumbnailUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        thumbnailUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @return The bytes for thumbnailUri.
     */
    public com.google.protobuf.ByteString getThumbnailUriBytes() {
      java.lang.Object ref = thumbnailUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        thumbnailUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @param value The thumbnailUri to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnailUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      thumbnailUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThumbnailUri() {

      thumbnailUri_ = getDefaultInstance().getThumbnailUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. HTTP URI to the thumbnail image.
     * </pre>
     *
     * <code>string thumbnail_uri = 4;</code>
     *
     * @param value The bytes for thumbnailUri to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnailUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      thumbnailUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1.Image)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1.Image)
  private static final com.google.cloud.automl.v1.Image DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1.Image();
  }

  public static com.google.cloud.automl.v1.Image getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Image> PARSER =
      new com.google.protobuf.AbstractParser<Image>() {
        @java.lang.Override
        public Image parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Image(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Image> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Image> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1.Image getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
