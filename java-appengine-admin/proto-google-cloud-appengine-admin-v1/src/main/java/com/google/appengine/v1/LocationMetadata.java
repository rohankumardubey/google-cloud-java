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
// source: google/appengine/v1/location.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Metadata for the given [google.cloud.location.Location][google.cloud.location.Location].
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.LocationMetadata}
 */
public final class LocationMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.LocationMetadata)
    LocationMetadataOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LocationMetadata.newBuilder() to construct.
  private LocationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LocationMetadata() {}

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
          case 16:
            {
              standardEnvironmentAvailable_ = input.readBool();
              break;
            }
          case 32:
            {
              flexibleEnvironmentAvailable_ = input.readBool();
              break;
            }
          case 48:
            {
              searchApiAvailable_ = input.readBool();
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
    return com.google.appengine.v1.LocationProto
        .internal_static_google_appengine_v1_LocationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.LocationProto
        .internal_static_google_appengine_v1_LocationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.LocationMetadata.class,
            com.google.appengine.v1.LocationMetadata.Builder.class);
  }

  public static final int STANDARD_ENVIRONMENT_AVAILABLE_FIELD_NUMBER = 2;
  private boolean standardEnvironmentAvailable_;
  /**
   *
   *
   * <pre>
   * App Engine standard environment is available in the given location.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>bool standard_environment_available = 2;</code>
   *
   * @return The standardEnvironmentAvailable.
   */
  @java.lang.Override
  public boolean getStandardEnvironmentAvailable() {
    return standardEnvironmentAvailable_;
  }

  public static final int FLEXIBLE_ENVIRONMENT_AVAILABLE_FIELD_NUMBER = 4;
  private boolean flexibleEnvironmentAvailable_;
  /**
   *
   *
   * <pre>
   * App Engine flexible environment is available in the given location.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>bool flexible_environment_available = 4;</code>
   *
   * @return The flexibleEnvironmentAvailable.
   */
  @java.lang.Override
  public boolean getFlexibleEnvironmentAvailable() {
    return flexibleEnvironmentAvailable_;
  }

  public static final int SEARCH_API_AVAILABLE_FIELD_NUMBER = 6;
  private boolean searchApiAvailable_;
  /**
   *
   *
   * <pre>
   * Output only. [Search API](https://cloud.google.com/appengine/docs/standard/python/search)
   * is available in the given location.
   * </pre>
   *
   * <code>bool search_api_available = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The searchApiAvailable.
   */
  @java.lang.Override
  public boolean getSearchApiAvailable() {
    return searchApiAvailable_;
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
    if (standardEnvironmentAvailable_ != false) {
      output.writeBool(2, standardEnvironmentAvailable_);
    }
    if (flexibleEnvironmentAvailable_ != false) {
      output.writeBool(4, flexibleEnvironmentAvailable_);
    }
    if (searchApiAvailable_ != false) {
      output.writeBool(6, searchApiAvailable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (standardEnvironmentAvailable_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(2, standardEnvironmentAvailable_);
    }
    if (flexibleEnvironmentAvailable_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(4, flexibleEnvironmentAvailable_);
    }
    if (searchApiAvailable_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, searchApiAvailable_);
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
    if (!(obj instanceof com.google.appengine.v1.LocationMetadata)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.LocationMetadata other = (com.google.appengine.v1.LocationMetadata) obj;

    if (getStandardEnvironmentAvailable() != other.getStandardEnvironmentAvailable()) return false;
    if (getFlexibleEnvironmentAvailable() != other.getFlexibleEnvironmentAvailable()) return false;
    if (getSearchApiAvailable() != other.getSearchApiAvailable()) return false;
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
    hash = (37 * hash) + STANDARD_ENVIRONMENT_AVAILABLE_FIELD_NUMBER;
    hash =
        (53 * hash) + com.google.protobuf.Internal.hashBoolean(getStandardEnvironmentAvailable());
    hash = (37 * hash) + FLEXIBLE_ENVIRONMENT_AVAILABLE_FIELD_NUMBER;
    hash =
        (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFlexibleEnvironmentAvailable());
    hash = (37 * hash) + SEARCH_API_AVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSearchApiAvailable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.LocationMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.LocationMetadata parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.LocationMetadata prototype) {
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
   * Metadata for the given [google.cloud.location.Location][google.cloud.location.Location].
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.LocationMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.LocationMetadata)
      com.google.appengine.v1.LocationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.LocationProto
          .internal_static_google_appengine_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.LocationProto
          .internal_static_google_appengine_v1_LocationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.LocationMetadata.class,
              com.google.appengine.v1.LocationMetadata.Builder.class);
    }

    // Construct using com.google.appengine.v1.LocationMetadata.newBuilder()
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
      standardEnvironmentAvailable_ = false;

      flexibleEnvironmentAvailable_ = false;

      searchApiAvailable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.LocationProto
          .internal_static_google_appengine_v1_LocationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.LocationMetadata getDefaultInstanceForType() {
      return com.google.appengine.v1.LocationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.LocationMetadata build() {
      com.google.appengine.v1.LocationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.LocationMetadata buildPartial() {
      com.google.appengine.v1.LocationMetadata result =
          new com.google.appengine.v1.LocationMetadata(this);
      result.standardEnvironmentAvailable_ = standardEnvironmentAvailable_;
      result.flexibleEnvironmentAvailable_ = flexibleEnvironmentAvailable_;
      result.searchApiAvailable_ = searchApiAvailable_;
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
      if (other instanceof com.google.appengine.v1.LocationMetadata) {
        return mergeFrom((com.google.appengine.v1.LocationMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.LocationMetadata other) {
      if (other == com.google.appengine.v1.LocationMetadata.getDefaultInstance()) return this;
      if (other.getStandardEnvironmentAvailable() != false) {
        setStandardEnvironmentAvailable(other.getStandardEnvironmentAvailable());
      }
      if (other.getFlexibleEnvironmentAvailable() != false) {
        setFlexibleEnvironmentAvailable(other.getFlexibleEnvironmentAvailable());
      }
      if (other.getSearchApiAvailable() != false) {
        setSearchApiAvailable(other.getSearchApiAvailable());
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
      com.google.appengine.v1.LocationMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.LocationMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean standardEnvironmentAvailable_;
    /**
     *
     *
     * <pre>
     * App Engine standard environment is available in the given location.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>bool standard_environment_available = 2;</code>
     *
     * @return The standardEnvironmentAvailable.
     */
    @java.lang.Override
    public boolean getStandardEnvironmentAvailable() {
      return standardEnvironmentAvailable_;
    }
    /**
     *
     *
     * <pre>
     * App Engine standard environment is available in the given location.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>bool standard_environment_available = 2;</code>
     *
     * @param value The standardEnvironmentAvailable to set.
     * @return This builder for chaining.
     */
    public Builder setStandardEnvironmentAvailable(boolean value) {

      standardEnvironmentAvailable_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * App Engine standard environment is available in the given location.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>bool standard_environment_available = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStandardEnvironmentAvailable() {

      standardEnvironmentAvailable_ = false;
      onChanged();
      return this;
    }

    private boolean flexibleEnvironmentAvailable_;
    /**
     *
     *
     * <pre>
     * App Engine flexible environment is available in the given location.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>bool flexible_environment_available = 4;</code>
     *
     * @return The flexibleEnvironmentAvailable.
     */
    @java.lang.Override
    public boolean getFlexibleEnvironmentAvailable() {
      return flexibleEnvironmentAvailable_;
    }
    /**
     *
     *
     * <pre>
     * App Engine flexible environment is available in the given location.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>bool flexible_environment_available = 4;</code>
     *
     * @param value The flexibleEnvironmentAvailable to set.
     * @return This builder for chaining.
     */
    public Builder setFlexibleEnvironmentAvailable(boolean value) {

      flexibleEnvironmentAvailable_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * App Engine flexible environment is available in the given location.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>bool flexible_environment_available = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFlexibleEnvironmentAvailable() {

      flexibleEnvironmentAvailable_ = false;
      onChanged();
      return this;
    }

    private boolean searchApiAvailable_;
    /**
     *
     *
     * <pre>
     * Output only. [Search API](https://cloud.google.com/appengine/docs/standard/python/search)
     * is available in the given location.
     * </pre>
     *
     * <code>bool search_api_available = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The searchApiAvailable.
     */
    @java.lang.Override
    public boolean getSearchApiAvailable() {
      return searchApiAvailable_;
    }
    /**
     *
     *
     * <pre>
     * Output only. [Search API](https://cloud.google.com/appengine/docs/standard/python/search)
     * is available in the given location.
     * </pre>
     *
     * <code>bool search_api_available = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The searchApiAvailable to set.
     * @return This builder for chaining.
     */
    public Builder setSearchApiAvailable(boolean value) {

      searchApiAvailable_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. [Search API](https://cloud.google.com/appengine/docs/standard/python/search)
     * is available in the given location.
     * </pre>
     *
     * <code>bool search_api_available = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSearchApiAvailable() {

      searchApiAvailable_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.LocationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.LocationMetadata)
  private static final com.google.appengine.v1.LocationMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.LocationMetadata();
  }

  public static com.google.appengine.v1.LocationMetadata getDefaultInstance() {
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
  public com.google.appengine.v1.LocationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
