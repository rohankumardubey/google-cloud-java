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
// source: google/cloud/documentai/v1beta2/document_understanding.proto

package com.google.cloud.documentai.v1beta2;

/**
 *
 *
 * <pre>
 * A hint for a table bounding box on the page for table parsing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta2.TableBoundHint}
 */
public final class TableBoundHint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta2.TableBoundHint)
    TableBoundHintOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TableBoundHint.newBuilder() to construct.
  private TableBoundHint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TableBoundHint() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TableBoundHint();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TableBoundHint(
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
          case 8:
            {
              pageNumber_ = input.readInt32();
              break;
            }
          case 18:
            {
              com.google.cloud.documentai.v1beta2.BoundingPoly.Builder subBuilder = null;
              if (boundingBox_ != null) {
                subBuilder = boundingBox_.toBuilder();
              }
              boundingBox_ =
                  input.readMessage(
                      com.google.cloud.documentai.v1beta2.BoundingPoly.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(boundingBox_);
                boundingBox_ = subBuilder.buildPartial();
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
    return com.google.cloud.documentai.v1beta2.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta2_TableBoundHint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta2.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta2_TableBoundHint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta2.TableBoundHint.class,
            com.google.cloud.documentai.v1beta2.TableBoundHint.Builder.class);
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 1;
  private int pageNumber_;
  /**
   *
   *
   * <pre>
   * Optional. Page number for multi-paged inputs this hint applies to. If not
   * provided, this hint will apply to all pages by default. This value is
   * 1-based.
   * </pre>
   *
   * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageNumber.
   */
  public int getPageNumber() {
    return pageNumber_;
  }

  public static final int BOUNDING_BOX_FIELD_NUMBER = 2;
  private com.google.cloud.documentai.v1beta2.BoundingPoly boundingBox_;
  /**
   *
   *
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
   *
   * @return Whether the boundingBox field is set.
   */
  public boolean hasBoundingBox() {
    return boundingBox_ != null;
  }
  /**
   *
   *
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
   *
   * @return The boundingBox.
   */
  public com.google.cloud.documentai.v1beta2.BoundingPoly getBoundingBox() {
    return boundingBox_ == null
        ? com.google.cloud.documentai.v1beta2.BoundingPoly.getDefaultInstance()
        : boundingBox_;
  }
  /**
   *
   *
   * <pre>
   * Bounding box hint for a table on this page. The coordinates must be
   * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
   */
  public com.google.cloud.documentai.v1beta2.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
    return getBoundingBox();
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
    if (pageNumber_ != 0) {
      output.writeInt32(1, pageNumber_);
    }
    if (boundingBox_ != null) {
      output.writeMessage(2, getBoundingBox());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pageNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, pageNumber_);
    }
    if (boundingBox_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getBoundingBox());
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta2.TableBoundHint)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta2.TableBoundHint other =
        (com.google.cloud.documentai.v1beta2.TableBoundHint) obj;

    if (getPageNumber() != other.getPageNumber()) return false;
    if (hasBoundingBox() != other.hasBoundingBox()) return false;
    if (hasBoundingBox()) {
      if (!getBoundingBox().equals(other.getBoundingBox())) return false;
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
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPageNumber();
    if (hasBoundingBox()) {
      hash = (37 * hash) + BOUNDING_BOX_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingBox().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint parseFrom(
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

  public static Builder newBuilder(com.google.cloud.documentai.v1beta2.TableBoundHint prototype) {
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
   * A hint for a table bounding box on the page for table parsing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta2.TableBoundHint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta2.TableBoundHint)
      com.google.cloud.documentai.v1beta2.TableBoundHintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta2.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta2_TableBoundHint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta2.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta2_TableBoundHint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta2.TableBoundHint.class,
              com.google.cloud.documentai.v1beta2.TableBoundHint.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta2.TableBoundHint.newBuilder()
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
      pageNumber_ = 0;

      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta2.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta2_TableBoundHint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.TableBoundHint getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta2.TableBoundHint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.TableBoundHint build() {
      com.google.cloud.documentai.v1beta2.TableBoundHint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta2.TableBoundHint buildPartial() {
      com.google.cloud.documentai.v1beta2.TableBoundHint result =
          new com.google.cloud.documentai.v1beta2.TableBoundHint(this);
      result.pageNumber_ = pageNumber_;
      if (boundingBoxBuilder_ == null) {
        result.boundingBox_ = boundingBox_;
      } else {
        result.boundingBox_ = boundingBoxBuilder_.build();
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
      if (other instanceof com.google.cloud.documentai.v1beta2.TableBoundHint) {
        return mergeFrom((com.google.cloud.documentai.v1beta2.TableBoundHint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta2.TableBoundHint other) {
      if (other == com.google.cloud.documentai.v1beta2.TableBoundHint.getDefaultInstance())
        return this;
      if (other.getPageNumber() != 0) {
        setPageNumber(other.getPageNumber());
      }
      if (other.hasBoundingBox()) {
        mergeBoundingBox(other.getBoundingBox());
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
      com.google.cloud.documentai.v1beta2.TableBoundHint parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.documentai.v1beta2.TableBoundHint) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pageNumber_;
    /**
     *
     *
     * <pre>
     * Optional. Page number for multi-paged inputs this hint applies to. If not
     * provided, this hint will apply to all pages by default. This value is
     * 1-based.
     * </pre>
     *
     * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The pageNumber.
     */
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Page number for multi-paged inputs this hint applies to. If not
     * provided, this hint will apply to all pages by default. This value is
     * 1-based.
     * </pre>
     *
     * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The pageNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPageNumber(int value) {

      pageNumber_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Page number for multi-paged inputs this hint applies to. If not
     * provided, this hint will apply to all pages by default. This value is
     * 1-based.
     * </pre>
     *
     * <code>int32 page_number = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPageNumber() {

      pageNumber_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.documentai.v1beta2.BoundingPoly boundingBox_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta2.BoundingPoly,
            com.google.cloud.documentai.v1beta2.BoundingPoly.Builder,
            com.google.cloud.documentai.v1beta2.BoundingPolyOrBuilder>
        boundingBoxBuilder_;
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     *
     * @return Whether the boundingBox field is set.
     */
    public boolean hasBoundingBox() {
      return boundingBoxBuilder_ != null || boundingBox_ != null;
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     *
     * @return The boundingBox.
     */
    public com.google.cloud.documentai.v1beta2.BoundingPoly getBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        return boundingBox_ == null
            ? com.google.cloud.documentai.v1beta2.BoundingPoly.getDefaultInstance()
            : boundingBox_;
      } else {
        return boundingBoxBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     */
    public Builder setBoundingBox(com.google.cloud.documentai.v1beta2.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundingBox_ = value;
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     */
    public Builder setBoundingBox(
        com.google.cloud.documentai.v1beta2.BoundingPoly.Builder builderForValue) {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = builderForValue.build();
        onChanged();
      } else {
        boundingBoxBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     */
    public Builder mergeBoundingBox(com.google.cloud.documentai.v1beta2.BoundingPoly value) {
      if (boundingBoxBuilder_ == null) {
        if (boundingBox_ != null) {
          boundingBox_ =
              com.google.cloud.documentai.v1beta2.BoundingPoly.newBuilder(boundingBox_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          boundingBox_ = value;
        }
        onChanged();
      } else {
        boundingBoxBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     */
    public Builder clearBoundingBox() {
      if (boundingBoxBuilder_ == null) {
        boundingBox_ = null;
        onChanged();
      } else {
        boundingBox_ = null;
        boundingBoxBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     */
    public com.google.cloud.documentai.v1beta2.BoundingPoly.Builder getBoundingBoxBuilder() {

      onChanged();
      return getBoundingBoxFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     */
    public com.google.cloud.documentai.v1beta2.BoundingPolyOrBuilder getBoundingBoxOrBuilder() {
      if (boundingBoxBuilder_ != null) {
        return boundingBoxBuilder_.getMessageOrBuilder();
      } else {
        return boundingBox_ == null
            ? com.google.cloud.documentai.v1beta2.BoundingPoly.getDefaultInstance()
            : boundingBox_;
      }
    }
    /**
     *
     *
     * <pre>
     * Bounding box hint for a table on this page. The coordinates must be
     * normalized to [0,1] and the bounding box must be an axis-aligned rectangle.
     * </pre>
     *
     * <code>.google.cloud.documentai.v1beta2.BoundingPoly bounding_box = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1beta2.BoundingPoly,
            com.google.cloud.documentai.v1beta2.BoundingPoly.Builder,
            com.google.cloud.documentai.v1beta2.BoundingPolyOrBuilder>
        getBoundingBoxFieldBuilder() {
      if (boundingBoxBuilder_ == null) {
        boundingBoxBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1beta2.BoundingPoly,
                com.google.cloud.documentai.v1beta2.BoundingPoly.Builder,
                com.google.cloud.documentai.v1beta2.BoundingPolyOrBuilder>(
                getBoundingBox(), getParentForChildren(), isClean());
        boundingBox_ = null;
      }
      return boundingBoxBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta2.TableBoundHint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta2.TableBoundHint)
  private static final com.google.cloud.documentai.v1beta2.TableBoundHint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta2.TableBoundHint();
  }

  public static com.google.cloud.documentai.v1beta2.TableBoundHint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableBoundHint> PARSER =
      new com.google.protobuf.AbstractParser<TableBoundHint>() {
        @java.lang.Override
        public TableBoundHint parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TableBoundHint(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TableBoundHint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableBoundHint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta2.TableBoundHint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
