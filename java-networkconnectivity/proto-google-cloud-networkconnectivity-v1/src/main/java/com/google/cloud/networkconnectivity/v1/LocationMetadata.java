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
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

/**
 *
 *
 * <pre>
 * Metadata about locations
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkconnectivity.v1.LocationMetadata}
 */
public final class LocationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkconnectivity.v1.LocationMetadata)
    LocationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationMetadata() {
    locationFeatures_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LocationMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private LocationMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                locationFeatures_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              locationFeatures_.add(rawValue);
              break;
            }
          case 10:
            {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                  locationFeatures_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000001;
                }
                locationFeatures_.add(rawValue);
              }
              input.popLimit(oldLimit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        locationFeatures_ = java.util.Collections.unmodifiableList(locationFeatures_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_LocationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkconnectivity.v1.HubProto
        .internal_static_google_cloud_networkconnectivity_v1_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkconnectivity.v1.LocationMetadata.class,
            com.google.cloud.networkconnectivity.v1.LocationMetadata.Builder.class);
  }

  public static final int LOCATION_FEATURES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> locationFeatures_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.cloud.networkconnectivity.v1.LocationFeature>
      locationFeatures_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.cloud.networkconnectivity.v1.LocationFeature>() {
            public com.google.cloud.networkconnectivity.v1.LocationFeature convert(
                java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.cloud.networkconnectivity.v1.LocationFeature result =
                  com.google.cloud.networkconnectivity.v1.LocationFeature.valueOf(from);
              return result == null
                  ? com.google.cloud.networkconnectivity.v1.LocationFeature.UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @return A list containing the locationFeatures.
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.networkconnectivity.v1.LocationFeature>
      getLocationFeaturesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.cloud.networkconnectivity.v1.LocationFeature>(
        locationFeatures_, locationFeatures_converter_);
  }
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @return The count of locationFeatures.
   */
  @java.lang.Override
  public int getLocationFeaturesCount() {
    return locationFeatures_.size();
  }
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The locationFeatures at the given index.
   */
  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.LocationFeature getLocationFeatures(int index) {
    return locationFeatures_converter_.convert(locationFeatures_.get(index));
  }
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for locationFeatures.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getLocationFeaturesValueList() {
    return locationFeatures_;
  }
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of locationFeatures at the given index.
   */
  @java.lang.Override
  public int getLocationFeaturesValue(int index) {
    return locationFeatures_.get(index);
  }

  private int locationFeaturesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getLocationFeaturesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(locationFeaturesMemoizedSerializedSize);
    }
    for (int i = 0; i < locationFeatures_.size(); i++) {
      output.writeEnumNoTag(locationFeatures_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < locationFeatures_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(locationFeatures_.get(i));
      }
      size += dataSize;
      if (!getLocationFeaturesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      locationFeaturesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.networkconnectivity.v1.LocationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.networkconnectivity.v1.LocationMetadata other =
        (com.google.cloud.networkconnectivity.v1.LocationMetadata) obj;

    if (!locationFeatures_.equals(other.locationFeatures_)) return false;
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
    if (getLocationFeaturesCount() > 0) {
      hash = (37 * hash) + LOCATION_FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + locationFeatures_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata parseFrom(
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
      com.google.cloud.networkconnectivity.v1.LocationMetadata prototype) {
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
   * Metadata about locations
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkconnectivity.v1.LocationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkconnectivity.v1.LocationMetadata)
      com.google.cloud.networkconnectivity.v1.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkconnectivity.v1.LocationMetadata.class,
              com.google.cloud.networkconnectivity.v1.LocationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.networkconnectivity.v1.LocationMetadata.newBuilder()
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
      locationFeatures_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkconnectivity.v1.HubProto
          .internal_static_google_cloud_networkconnectivity_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LocationMetadata getDefaultInstanceForType() {
      return com.google.cloud.networkconnectivity.v1.LocationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LocationMetadata build() {
      com.google.cloud.networkconnectivity.v1.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkconnectivity.v1.LocationMetadata buildPartial() {
      com.google.cloud.networkconnectivity.v1.LocationMetadata result =
          new com.google.cloud.networkconnectivity.v1.LocationMetadata(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        locationFeatures_ = java.util.Collections.unmodifiableList(locationFeatures_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.locationFeatures_ = locationFeatures_;
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
      if (other instanceof com.google.cloud.networkconnectivity.v1.LocationMetadata) {
        return mergeFrom((com.google.cloud.networkconnectivity.v1.LocationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkconnectivity.v1.LocationMetadata other) {
      if (other == com.google.cloud.networkconnectivity.v1.LocationMetadata.getDefaultInstance())
        return this;
      if (!other.locationFeatures_.isEmpty()) {
        if (locationFeatures_.isEmpty()) {
          locationFeatures_ = other.locationFeatures_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLocationFeaturesIsMutable();
          locationFeatures_.addAll(other.locationFeatures_);
        }
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
      com.google.cloud.networkconnectivity.v1.LocationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.networkconnectivity.v1.LocationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<java.lang.Integer> locationFeatures_ = java.util.Collections.emptyList();

    private void ensureLocationFeaturesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        locationFeatures_ = new java.util.ArrayList<java.lang.Integer>(locationFeatures_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @return A list containing the locationFeatures.
     */
    public java.util.List<com.google.cloud.networkconnectivity.v1.LocationFeature>
        getLocationFeaturesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.cloud.networkconnectivity.v1.LocationFeature>(
          locationFeatures_, locationFeatures_converter_);
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @return The count of locationFeatures.
     */
    public int getLocationFeaturesCount() {
      return locationFeatures_.size();
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param index The index of the element to return.
     * @return The locationFeatures at the given index.
     */
    public com.google.cloud.networkconnectivity.v1.LocationFeature getLocationFeatures(int index) {
      return locationFeatures_converter_.convert(locationFeatures_.get(index));
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The locationFeatures to set.
     * @return This builder for chaining.
     */
    public Builder setLocationFeatures(
        int index, com.google.cloud.networkconnectivity.v1.LocationFeature value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLocationFeaturesIsMutable();
      locationFeatures_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param value The locationFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addLocationFeatures(
        com.google.cloud.networkconnectivity.v1.LocationFeature value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLocationFeaturesIsMutable();
      locationFeatures_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param values The locationFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAllLocationFeatures(
        java.lang.Iterable<? extends com.google.cloud.networkconnectivity.v1.LocationFeature>
            values) {
      ensureLocationFeaturesIsMutable();
      for (com.google.cloud.networkconnectivity.v1.LocationFeature value : values) {
        locationFeatures_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocationFeatures() {
      locationFeatures_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for locationFeatures.
     */
    public java.util.List<java.lang.Integer> getLocationFeaturesValueList() {
      return java.util.Collections.unmodifiableList(locationFeatures_);
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of locationFeatures at the given index.
     */
    public int getLocationFeaturesValue(int index) {
      return locationFeatures_.get(index);
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for locationFeatures to set.
     * @return This builder for chaining.
     */
    public Builder setLocationFeaturesValue(int index, int value) {
      ensureLocationFeaturesIsMutable();
      locationFeatures_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for locationFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addLocationFeaturesValue(int value) {
      ensureLocationFeaturesIsMutable();
      locationFeatures_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of supported features
     * </pre>
     *
     * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
     * </code>
     *
     * @param values The enum numeric values on the wire for locationFeatures to add.
     * @return This builder for chaining.
     */
    public Builder addAllLocationFeaturesValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureLocationFeaturesIsMutable();
      for (int value : values) {
        locationFeatures_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkconnectivity.v1.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkconnectivity.v1.LocationMetadata)
  private static final com.google.cloud.networkconnectivity.v1.LocationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkconnectivity.v1.LocationMetadata();
  }

  public static com.google.cloud.networkconnectivity.v1.LocationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocationMetadata> PARSER =
      new com.google.protobuf.AbstractParser<LocationMetadata>() {
        @java.lang.Override
        public LocationMetadata parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new LocationMetadata(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<LocationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkconnectivity.v1.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
