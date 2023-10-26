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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * The rule to exclude findings based on a hotword. For record inspection of
 * tables, column names are considered hotwords. An example of this is to
 * exclude a finding if it belongs to a BigQuery column that matches a specific
 * pattern.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ExcludeByHotword}
 */
public final class ExcludeByHotword extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ExcludeByHotword)
    ExcludeByHotwordOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExcludeByHotword.newBuilder() to construct.
  private ExcludeByHotword(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExcludeByHotword() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExcludeByHotword();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ExcludeByHotword_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ExcludeByHotword_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ExcludeByHotword.class,
            com.google.privacy.dlp.v2.ExcludeByHotword.Builder.class);
  }

  public static final int HOTWORD_REGEX_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.CustomInfoType.Regex hotwordRegex_;
  /**
   *
   *
   * <pre>
   * Regular expression pattern defining what qualifies as a hotword.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
   *
   * @return Whether the hotwordRegex field is set.
   */
  @java.lang.Override
  public boolean hasHotwordRegex() {
    return hotwordRegex_ != null;
  }
  /**
   *
   *
   * <pre>
   * Regular expression pattern defining what qualifies as a hotword.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
   *
   * @return The hotwordRegex.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CustomInfoType.Regex getHotwordRegex() {
    return hotwordRegex_ == null
        ? com.google.privacy.dlp.v2.CustomInfoType.Regex.getDefaultInstance()
        : hotwordRegex_;
  }
  /**
   *
   *
   * <pre>
   * Regular expression pattern defining what qualifies as a hotword.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder getHotwordRegexOrBuilder() {
    return hotwordRegex_ == null
        ? com.google.privacy.dlp.v2.CustomInfoType.Regex.getDefaultInstance()
        : hotwordRegex_;
  }

  public static final int PROXIMITY_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity_;
  /**
   *
   *
   * <pre>
   * Range of characters within which the entire hotword must reside.
   * The total length of the window cannot exceed 1000 characters.
   * The windowBefore property in proximity should be set to 1 if the hotword
   * needs to be included in a column header.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
   *
   * @return Whether the proximity field is set.
   */
  @java.lang.Override
  public boolean hasProximity() {
    return proximity_ != null;
  }
  /**
   *
   *
   * <pre>
   * Range of characters within which the entire hotword must reside.
   * The total length of the window cannot exceed 1000 characters.
   * The windowBefore property in proximity should be set to 1 if the hotword
   * needs to be included in a column header.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
   *
   * @return The proximity.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity getProximity() {
    return proximity_ == null
        ? com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.getDefaultInstance()
        : proximity_;
  }
  /**
   *
   *
   * <pre>
   * Range of characters within which the entire hotword must reside.
   * The total length of the window cannot exceed 1000 characters.
   * The windowBefore property in proximity should be set to 1 if the hotword
   * needs to be included in a column header.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.ProximityOrBuilder
      getProximityOrBuilder() {
    return proximity_ == null
        ? com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.getDefaultInstance()
        : proximity_;
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
    if (hotwordRegex_ != null) {
      output.writeMessage(1, getHotwordRegex());
    }
    if (proximity_ != null) {
      output.writeMessage(2, getProximity());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hotwordRegex_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getHotwordRegex());
    }
    if (proximity_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProximity());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ExcludeByHotword)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ExcludeByHotword other =
        (com.google.privacy.dlp.v2.ExcludeByHotword) obj;

    if (hasHotwordRegex() != other.hasHotwordRegex()) return false;
    if (hasHotwordRegex()) {
      if (!getHotwordRegex().equals(other.getHotwordRegex())) return false;
    }
    if (hasProximity() != other.hasProximity()) return false;
    if (hasProximity()) {
      if (!getProximity().equals(other.getProximity())) return false;
    }
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
    if (hasHotwordRegex()) {
      hash = (37 * hash) + HOTWORD_REGEX_FIELD_NUMBER;
      hash = (53 * hash) + getHotwordRegex().hashCode();
    }
    if (hasProximity()) {
      hash = (37 * hash) + PROXIMITY_FIELD_NUMBER;
      hash = (53 * hash) + getProximity().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.ExcludeByHotword prototype) {
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
   * The rule to exclude findings based on a hotword. For record inspection of
   * tables, column names are considered hotwords. An example of this is to
   * exclude a finding if it belongs to a BigQuery column that matches a specific
   * pattern.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ExcludeByHotword}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ExcludeByHotword)
      com.google.privacy.dlp.v2.ExcludeByHotwordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ExcludeByHotword_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ExcludeByHotword_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ExcludeByHotword.class,
              com.google.privacy.dlp.v2.ExcludeByHotword.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ExcludeByHotword.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hotwordRegex_ = null;
      if (hotwordRegexBuilder_ != null) {
        hotwordRegexBuilder_.dispose();
        hotwordRegexBuilder_ = null;
      }
      proximity_ = null;
      if (proximityBuilder_ != null) {
        proximityBuilder_.dispose();
        proximityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ExcludeByHotword_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ExcludeByHotword getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ExcludeByHotword.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ExcludeByHotword build() {
      com.google.privacy.dlp.v2.ExcludeByHotword result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ExcludeByHotword buildPartial() {
      com.google.privacy.dlp.v2.ExcludeByHotword result =
          new com.google.privacy.dlp.v2.ExcludeByHotword(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.ExcludeByHotword result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hotwordRegex_ =
            hotwordRegexBuilder_ == null ? hotwordRegex_ : hotwordRegexBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.proximity_ = proximityBuilder_ == null ? proximity_ : proximityBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.ExcludeByHotword) {
        return mergeFrom((com.google.privacy.dlp.v2.ExcludeByHotword) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ExcludeByHotword other) {
      if (other == com.google.privacy.dlp.v2.ExcludeByHotword.getDefaultInstance()) return this;
      if (other.hasHotwordRegex()) {
        mergeHotwordRegex(other.getHotwordRegex());
      }
      if (other.hasProximity()) {
        mergeProximity(other.getProximity());
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
                input.readMessage(getHotwordRegexFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getProximityFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.privacy.dlp.v2.CustomInfoType.Regex hotwordRegex_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.CustomInfoType.Regex,
            com.google.privacy.dlp.v2.CustomInfoType.Regex.Builder,
            com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder>
        hotwordRegexBuilder_;
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     *
     * @return Whether the hotwordRegex field is set.
     */
    public boolean hasHotwordRegex() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     *
     * @return The hotwordRegex.
     */
    public com.google.privacy.dlp.v2.CustomInfoType.Regex getHotwordRegex() {
      if (hotwordRegexBuilder_ == null) {
        return hotwordRegex_ == null
            ? com.google.privacy.dlp.v2.CustomInfoType.Regex.getDefaultInstance()
            : hotwordRegex_;
      } else {
        return hotwordRegexBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     */
    public Builder setHotwordRegex(com.google.privacy.dlp.v2.CustomInfoType.Regex value) {
      if (hotwordRegexBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        hotwordRegex_ = value;
      } else {
        hotwordRegexBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     */
    public Builder setHotwordRegex(
        com.google.privacy.dlp.v2.CustomInfoType.Regex.Builder builderForValue) {
      if (hotwordRegexBuilder_ == null) {
        hotwordRegex_ = builderForValue.build();
      } else {
        hotwordRegexBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     */
    public Builder mergeHotwordRegex(com.google.privacy.dlp.v2.CustomInfoType.Regex value) {
      if (hotwordRegexBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && hotwordRegex_ != null
            && hotwordRegex_
                != com.google.privacy.dlp.v2.CustomInfoType.Regex.getDefaultInstance()) {
          getHotwordRegexBuilder().mergeFrom(value);
        } else {
          hotwordRegex_ = value;
        }
      } else {
        hotwordRegexBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     */
    public Builder clearHotwordRegex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hotwordRegex_ = null;
      if (hotwordRegexBuilder_ != null) {
        hotwordRegexBuilder_.dispose();
        hotwordRegexBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     */
    public com.google.privacy.dlp.v2.CustomInfoType.Regex.Builder getHotwordRegexBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHotwordRegexFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     */
    public com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder getHotwordRegexOrBuilder() {
      if (hotwordRegexBuilder_ != null) {
        return hotwordRegexBuilder_.getMessageOrBuilder();
      } else {
        return hotwordRegex_ == null
            ? com.google.privacy.dlp.v2.CustomInfoType.Regex.getDefaultInstance()
            : hotwordRegex_;
      }
    }
    /**
     *
     *
     * <pre>
     * Regular expression pattern defining what qualifies as a hotword.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.Regex hotword_regex = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.CustomInfoType.Regex,
            com.google.privacy.dlp.v2.CustomInfoType.Regex.Builder,
            com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder>
        getHotwordRegexFieldBuilder() {
      if (hotwordRegexBuilder_ == null) {
        hotwordRegexBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.CustomInfoType.Regex,
                com.google.privacy.dlp.v2.CustomInfoType.Regex.Builder,
                com.google.privacy.dlp.v2.CustomInfoType.RegexOrBuilder>(
                getHotwordRegex(), getParentForChildren(), isClean());
        hotwordRegex_ = null;
      }
      return hotwordRegexBuilder_;
    }

    private com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity,
            com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.Builder,
            com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.ProximityOrBuilder>
        proximityBuilder_;
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     *
     * @return Whether the proximity field is set.
     */
    public boolean hasProximity() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     *
     * @return The proximity.
     */
    public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity getProximity() {
      if (proximityBuilder_ == null) {
        return proximity_ == null
            ? com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.getDefaultInstance()
            : proximity_;
      } else {
        return proximityBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     */
    public Builder setProximity(
        com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity value) {
      if (proximityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        proximity_ = value;
      } else {
        proximityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     */
    public Builder setProximity(
        com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.Builder builderForValue) {
      if (proximityBuilder_ == null) {
        proximity_ = builderForValue.build();
      } else {
        proximityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     */
    public Builder mergeProximity(
        com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity value) {
      if (proximityBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && proximity_ != null
            && proximity_
                != com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity
                    .getDefaultInstance()) {
          getProximityBuilder().mergeFrom(value);
        } else {
          proximity_ = value;
        }
      } else {
        proximityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     */
    public Builder clearProximity() {
      bitField0_ = (bitField0_ & ~0x00000002);
      proximity_ = null;
      if (proximityBuilder_ != null) {
        proximityBuilder_.dispose();
        proximityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     */
    public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.Builder
        getProximityBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProximityFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     */
    public com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.ProximityOrBuilder
        getProximityOrBuilder() {
      if (proximityBuilder_ != null) {
        return proximityBuilder_.getMessageOrBuilder();
      } else {
        return proximity_ == null
            ? com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.getDefaultInstance()
            : proximity_;
      }
    }
    /**
     *
     *
     * <pre>
     * Range of characters within which the entire hotword must reside.
     * The total length of the window cannot exceed 1000 characters.
     * The windowBefore property in proximity should be set to 1 if the hotword
     * needs to be included in a column header.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity proximity = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity,
            com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.Builder,
            com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.ProximityOrBuilder>
        getProximityFieldBuilder() {
      if (proximityBuilder_ == null) {
        proximityBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity,
                com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.Proximity.Builder,
                com.google.privacy.dlp.v2.CustomInfoType.DetectionRule.ProximityOrBuilder>(
                getProximity(), getParentForChildren(), isClean());
        proximity_ = null;
      }
      return proximityBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ExcludeByHotword)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ExcludeByHotword)
  private static final com.google.privacy.dlp.v2.ExcludeByHotword DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ExcludeByHotword();
  }

  public static com.google.privacy.dlp.v2.ExcludeByHotword getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExcludeByHotword> PARSER =
      new com.google.protobuf.AbstractParser<ExcludeByHotword>() {
        @java.lang.Override
        public ExcludeByHotword parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExcludeByHotword> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExcludeByHotword> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ExcludeByHotword getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
