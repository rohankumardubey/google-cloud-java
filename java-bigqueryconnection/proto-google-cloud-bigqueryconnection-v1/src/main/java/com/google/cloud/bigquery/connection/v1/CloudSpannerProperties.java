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
// source: google/cloud/bigquery/connection/v1/connection.proto

package com.google.cloud.bigquery.connection.v1;

/**
 *
 *
 * <pre>
 * Connection properties specific to Cloud Spanner.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.connection.v1.CloudSpannerProperties}
 */
public final class CloudSpannerProperties extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.connection.v1.CloudSpannerProperties)
    CloudSpannerPropertiesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudSpannerProperties.newBuilder() to construct.
  private CloudSpannerProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudSpannerProperties() {
    database_ = "";
    databaseRole_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudSpannerProperties();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
        .internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.connection.v1.CloudSpannerProperties.class,
            com.google.cloud.bigquery.connection.v1.CloudSpannerProperties.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object database_ = "";
  /**
   *
   *
   * <pre>
   * Cloud Spanner database in the form `project/instance/database'
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The database.
   */
  @java.lang.Override
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Cloud Spanner database in the form `project/instance/database'
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The bytes for database.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_PARALLELISM_FIELD_NUMBER = 2;
  private boolean useParallelism_ = false;
  /**
   *
   *
   * <pre>
   * If parallelism should be used when reading from Cloud Spanner
   * </pre>
   *
   * <code>bool use_parallelism = 2;</code>
   *
   * @return The useParallelism.
   */
  @java.lang.Override
  public boolean getUseParallelism() {
    return useParallelism_;
  }

  public static final int USE_SERVERLESS_ANALYTICS_FIELD_NUMBER = 3;
  private boolean useServerlessAnalytics_ = false;
  /**
   *
   *
   * <pre>
   * If the serverless analytics service should be used to read data from Cloud
   * Spanner.
   * Note: `use_parallelism` must be set when using serverless analytics.
   * </pre>
   *
   * <code>bool use_serverless_analytics = 3;</code>
   *
   * @return The useServerlessAnalytics.
   */
  @java.lang.Override
  public boolean getUseServerlessAnalytics() {
    return useServerlessAnalytics_;
  }

  public static final int DATABASE_ROLE_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object databaseRole_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Cloud Spanner database role for fine-grained access control.
   * A database role is a collection of fine-grained access privileges. Example:
   * Admin predefines roles that provides user a set of permissions (SELECT,
   * INSERT, ..). The user can then specify a predefined role on a connection to
   * execute their Cloud Spanner query. The role is passthrough here. If the
   * user is not authorized to use the specified role, they get an error. This
   * validation happens on Cloud Spanner.
   * See https://cloud.google.com/spanner/docs/fgac-about for more details.
   * REQUIRES: database role name must start with uppercase/lowercase letter
   * and only contain uppercase/lowercase letters, numbers, and underscores.
   * </pre>
   *
   * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The databaseRole.
   */
  @java.lang.Override
  public java.lang.String getDatabaseRole() {
    java.lang.Object ref = databaseRole_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      databaseRole_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Cloud Spanner database role for fine-grained access control.
   * A database role is a collection of fine-grained access privileges. Example:
   * Admin predefines roles that provides user a set of permissions (SELECT,
   * INSERT, ..). The user can then specify a predefined role on a connection to
   * execute their Cloud Spanner query. The role is passthrough here. If the
   * user is not authorized to use the specified role, they get an error. This
   * validation happens on Cloud Spanner.
   * See https://cloud.google.com/spanner/docs/fgac-about for more details.
   * REQUIRES: database role name must start with uppercase/lowercase letter
   * and only contain uppercase/lowercase letters, numbers, and underscores.
   * </pre>
   *
   * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for databaseRole.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatabaseRoleBytes() {
    java.lang.Object ref = databaseRole_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      databaseRole_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    if (useParallelism_ != false) {
      output.writeBool(2, useParallelism_);
    }
    if (useServerlessAnalytics_ != false) {
      output.writeBool(3, useServerlessAnalytics_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseRole_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, databaseRole_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    if (useParallelism_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, useParallelism_);
    }
    if (useServerlessAnalytics_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, useServerlessAnalytics_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(databaseRole_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, databaseRole_);
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
    if (!(obj instanceof com.google.cloud.bigquery.connection.v1.CloudSpannerProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.connection.v1.CloudSpannerProperties other =
        (com.google.cloud.bigquery.connection.v1.CloudSpannerProperties) obj;

    if (!getDatabase().equals(other.getDatabase())) return false;
    if (getUseParallelism() != other.getUseParallelism()) return false;
    if (getUseServerlessAnalytics() != other.getUseServerlessAnalytics()) return false;
    if (!getDatabaseRole().equals(other.getDatabaseRole())) return false;
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
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    hash = (37 * hash) + USE_PARALLELISM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUseParallelism());
    hash = (37 * hash) + USE_SERVERLESS_ANALYTICS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUseServerlessAnalytics());
    hash = (37 * hash) + DATABASE_ROLE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabaseRole().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties parseFrom(
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
      com.google.cloud.bigquery.connection.v1.CloudSpannerProperties prototype) {
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
   * Connection properties specific to Cloud Spanner.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.connection.v1.CloudSpannerProperties}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.connection.v1.CloudSpannerProperties)
      com.google.cloud.bigquery.connection.v1.CloudSpannerPropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.connection.v1.CloudSpannerProperties.class,
              com.google.cloud.bigquery.connection.v1.CloudSpannerProperties.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.connection.v1.CloudSpannerProperties.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      database_ = "";
      useParallelism_ = false;
      useServerlessAnalytics_ = false;
      databaseRole_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.connection.v1.ConnectionOuterClass
          .internal_static_google_cloud_bigquery_connection_v1_CloudSpannerProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.CloudSpannerProperties
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.connection.v1.CloudSpannerProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.CloudSpannerProperties build() {
      com.google.cloud.bigquery.connection.v1.CloudSpannerProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.connection.v1.CloudSpannerProperties buildPartial() {
      com.google.cloud.bigquery.connection.v1.CloudSpannerProperties result =
          new com.google.cloud.bigquery.connection.v1.CloudSpannerProperties(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.connection.v1.CloudSpannerProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.database_ = database_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.useParallelism_ = useParallelism_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.useServerlessAnalytics_ = useServerlessAnalytics_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.databaseRole_ = databaseRole_;
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
      if (other instanceof com.google.cloud.bigquery.connection.v1.CloudSpannerProperties) {
        return mergeFrom((com.google.cloud.bigquery.connection.v1.CloudSpannerProperties) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.connection.v1.CloudSpannerProperties other) {
      if (other
          == com.google.cloud.bigquery.connection.v1.CloudSpannerProperties.getDefaultInstance())
        return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getUseParallelism() != false) {
        setUseParallelism(other.getUseParallelism());
      }
      if (other.getUseServerlessAnalytics() != false) {
        setUseServerlessAnalytics(other.getUseServerlessAnalytics());
      }
      if (!other.getDatabaseRole().isEmpty()) {
        databaseRole_ = other.databaseRole_;
        bitField0_ |= 0x00000008;
        onChanged();
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
                database_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                useParallelism_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                useServerlessAnalytics_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                databaseRole_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object database_ = "";
    /**
     *
     *
     * <pre>
     * Cloud Spanner database in the form `project/instance/database'
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @return The database.
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Spanner database in the form `project/instance/database'
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @return The bytes for database.
     */
    public com.google.protobuf.ByteString getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Cloud Spanner database in the form `project/instance/database'
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @param value The database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      database_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Spanner database in the form `project/instance/database'
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabase() {
      database_ = getDefaultInstance().getDatabase();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Cloud Spanner database in the form `project/instance/database'
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @param value The bytes for database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      database_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean useParallelism_;
    /**
     *
     *
     * <pre>
     * If parallelism should be used when reading from Cloud Spanner
     * </pre>
     *
     * <code>bool use_parallelism = 2;</code>
     *
     * @return The useParallelism.
     */
    @java.lang.Override
    public boolean getUseParallelism() {
      return useParallelism_;
    }
    /**
     *
     *
     * <pre>
     * If parallelism should be used when reading from Cloud Spanner
     * </pre>
     *
     * <code>bool use_parallelism = 2;</code>
     *
     * @param value The useParallelism to set.
     * @return This builder for chaining.
     */
    public Builder setUseParallelism(boolean value) {

      useParallelism_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If parallelism should be used when reading from Cloud Spanner
     * </pre>
     *
     * <code>bool use_parallelism = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUseParallelism() {
      bitField0_ = (bitField0_ & ~0x00000002);
      useParallelism_ = false;
      onChanged();
      return this;
    }

    private boolean useServerlessAnalytics_;
    /**
     *
     *
     * <pre>
     * If the serverless analytics service should be used to read data from Cloud
     * Spanner.
     * Note: `use_parallelism` must be set when using serverless analytics.
     * </pre>
     *
     * <code>bool use_serverless_analytics = 3;</code>
     *
     * @return The useServerlessAnalytics.
     */
    @java.lang.Override
    public boolean getUseServerlessAnalytics() {
      return useServerlessAnalytics_;
    }
    /**
     *
     *
     * <pre>
     * If the serverless analytics service should be used to read data from Cloud
     * Spanner.
     * Note: `use_parallelism` must be set when using serverless analytics.
     * </pre>
     *
     * <code>bool use_serverless_analytics = 3;</code>
     *
     * @param value The useServerlessAnalytics to set.
     * @return This builder for chaining.
     */
    public Builder setUseServerlessAnalytics(boolean value) {

      useServerlessAnalytics_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the serverless analytics service should be used to read data from Cloud
     * Spanner.
     * Note: `use_parallelism` must be set when using serverless analytics.
     * </pre>
     *
     * <code>bool use_serverless_analytics = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUseServerlessAnalytics() {
      bitField0_ = (bitField0_ & ~0x00000004);
      useServerlessAnalytics_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object databaseRole_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Cloud Spanner database role for fine-grained access control.
     * A database role is a collection of fine-grained access privileges. Example:
     * Admin predefines roles that provides user a set of permissions (SELECT,
     * INSERT, ..). The user can then specify a predefined role on a connection to
     * execute their Cloud Spanner query. The role is passthrough here. If the
     * user is not authorized to use the specified role, they get an error. This
     * validation happens on Cloud Spanner.
     * See https://cloud.google.com/spanner/docs/fgac-about for more details.
     * REQUIRES: database role name must start with uppercase/lowercase letter
     * and only contain uppercase/lowercase letters, numbers, and underscores.
     * </pre>
     *
     * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The databaseRole.
     */
    public java.lang.String getDatabaseRole() {
      java.lang.Object ref = databaseRole_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        databaseRole_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Cloud Spanner database role for fine-grained access control.
     * A database role is a collection of fine-grained access privileges. Example:
     * Admin predefines roles that provides user a set of permissions (SELECT,
     * INSERT, ..). The user can then specify a predefined role on a connection to
     * execute their Cloud Spanner query. The role is passthrough here. If the
     * user is not authorized to use the specified role, they get an error. This
     * validation happens on Cloud Spanner.
     * See https://cloud.google.com/spanner/docs/fgac-about for more details.
     * REQUIRES: database role name must start with uppercase/lowercase letter
     * and only contain uppercase/lowercase letters, numbers, and underscores.
     * </pre>
     *
     * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for databaseRole.
     */
    public com.google.protobuf.ByteString getDatabaseRoleBytes() {
      java.lang.Object ref = databaseRole_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        databaseRole_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Cloud Spanner database role for fine-grained access control.
     * A database role is a collection of fine-grained access privileges. Example:
     * Admin predefines roles that provides user a set of permissions (SELECT,
     * INSERT, ..). The user can then specify a predefined role on a connection to
     * execute their Cloud Spanner query. The role is passthrough here. If the
     * user is not authorized to use the specified role, they get an error. This
     * validation happens on Cloud Spanner.
     * See https://cloud.google.com/spanner/docs/fgac-about for more details.
     * REQUIRES: database role name must start with uppercase/lowercase letter
     * and only contain uppercase/lowercase letters, numbers, and underscores.
     * </pre>
     *
     * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The databaseRole to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseRole(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      databaseRole_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Cloud Spanner database role for fine-grained access control.
     * A database role is a collection of fine-grained access privileges. Example:
     * Admin predefines roles that provides user a set of permissions (SELECT,
     * INSERT, ..). The user can then specify a predefined role on a connection to
     * execute their Cloud Spanner query. The role is passthrough here. If the
     * user is not authorized to use the specified role, they get an error. This
     * validation happens on Cloud Spanner.
     * See https://cloud.google.com/spanner/docs/fgac-about for more details.
     * REQUIRES: database role name must start with uppercase/lowercase letter
     * and only contain uppercase/lowercase letters, numbers, and underscores.
     * </pre>
     *
     * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabaseRole() {
      databaseRole_ = getDefaultInstance().getDatabaseRole();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Cloud Spanner database role for fine-grained access control.
     * A database role is a collection of fine-grained access privileges. Example:
     * Admin predefines roles that provides user a set of permissions (SELECT,
     * INSERT, ..). The user can then specify a predefined role on a connection to
     * execute their Cloud Spanner query. The role is passthrough here. If the
     * user is not authorized to use the specified role, they get an error. This
     * validation happens on Cloud Spanner.
     * See https://cloud.google.com/spanner/docs/fgac-about for more details.
     * REQUIRES: database role name must start with uppercase/lowercase letter
     * and only contain uppercase/lowercase letters, numbers, and underscores.
     * </pre>
     *
     * <code>string database_role = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for databaseRole to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseRoleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      databaseRole_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.connection.v1.CloudSpannerProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.connection.v1.CloudSpannerProperties)
  private static final com.google.cloud.bigquery.connection.v1.CloudSpannerProperties
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.connection.v1.CloudSpannerProperties();
  }

  public static com.google.cloud.bigquery.connection.v1.CloudSpannerProperties
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudSpannerProperties> PARSER =
      new com.google.protobuf.AbstractParser<CloudSpannerProperties>() {
        @java.lang.Override
        public CloudSpannerProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudSpannerProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudSpannerProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.connection.v1.CloudSpannerProperties
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
