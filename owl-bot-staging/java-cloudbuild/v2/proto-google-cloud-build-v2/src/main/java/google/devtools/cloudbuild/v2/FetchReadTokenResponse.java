// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

package google.devtools.cloudbuild.v2;

/**
 * <pre>
 * Message for responding to get read token.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.FetchReadTokenResponse}
 */
public final class FetchReadTokenResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.FetchReadTokenResponse)
    FetchReadTokenResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetchReadTokenResponse.newBuilder() to construct.
  private FetchReadTokenResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchReadTokenResponse() {
    token_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FetchReadTokenResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_FetchReadTokenResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_FetchReadTokenResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.devtools.cloudbuild.v2.FetchReadTokenResponse.class, google.devtools.cloudbuild.v2.FetchReadTokenResponse.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object token_ = "";
  /**
   * <pre>
   * The token content.
   * </pre>
   *
   * <code>string token = 1;</code>
   * @return The token.
   */
  @java.lang.Override
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The token content.
   * </pre>
   *
   * <code>string token = 1;</code>
   * @return The bytes for token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp expirationTime_;
  /**
   * <pre>
   * Expiration timestamp. Can be empty if unknown or non-expiring.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   * @return Whether the expirationTime field is set.
   */
  @java.lang.Override
  public boolean hasExpirationTime() {
    return expirationTime_ != null;
  }
  /**
   * <pre>
   * Expiration timestamp. Can be empty if unknown or non-expiring.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   * @return The expirationTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getExpirationTime() {
    return expirationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expirationTime_;
  }
  /**
   * <pre>
   * Expiration timestamp. Can be empty if unknown or non-expiring.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder() {
    return expirationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expirationTime_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
    }
    if (expirationTime_ != null) {
      output.writeMessage(2, getExpirationTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
    }
    if (expirationTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExpirationTime());
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
    if (!(obj instanceof google.devtools.cloudbuild.v2.FetchReadTokenResponse)) {
      return super.equals(obj);
    }
    google.devtools.cloudbuild.v2.FetchReadTokenResponse other = (google.devtools.cloudbuild.v2.FetchReadTokenResponse) obj;

    if (!getToken()
        .equals(other.getToken())) return false;
    if (hasExpirationTime() != other.hasExpirationTime()) return false;
    if (hasExpirationTime()) {
      if (!getExpirationTime()
          .equals(other.getExpirationTime())) return false;
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
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    if (hasExpirationTime()) {
      hash = (37 * hash) + EXPIRATION_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getExpirationTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(google.devtools.cloudbuild.v2.FetchReadTokenResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Message for responding to get read token.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.FetchReadTokenResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.FetchReadTokenResponse)
      google.devtools.cloudbuild.v2.FetchReadTokenResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_FetchReadTokenResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_FetchReadTokenResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.devtools.cloudbuild.v2.FetchReadTokenResponse.class, google.devtools.cloudbuild.v2.FetchReadTokenResponse.Builder.class);
    }

    // Construct using google.devtools.cloudbuild.v2.FetchReadTokenResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      token_ = "";
      expirationTime_ = null;
      if (expirationTimeBuilder_ != null) {
        expirationTimeBuilder_.dispose();
        expirationTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_FetchReadTokenResponse_descriptor;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.FetchReadTokenResponse getDefaultInstanceForType() {
      return google.devtools.cloudbuild.v2.FetchReadTokenResponse.getDefaultInstance();
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.FetchReadTokenResponse build() {
      google.devtools.cloudbuild.v2.FetchReadTokenResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.FetchReadTokenResponse buildPartial() {
      google.devtools.cloudbuild.v2.FetchReadTokenResponse result = new google.devtools.cloudbuild.v2.FetchReadTokenResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(google.devtools.cloudbuild.v2.FetchReadTokenResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.token_ = token_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.expirationTime_ = expirationTimeBuilder_ == null
            ? expirationTime_
            : expirationTimeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof google.devtools.cloudbuild.v2.FetchReadTokenResponse) {
        return mergeFrom((google.devtools.cloudbuild.v2.FetchReadTokenResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.devtools.cloudbuild.v2.FetchReadTokenResponse other) {
      if (other == google.devtools.cloudbuild.v2.FetchReadTokenResponse.getDefaultInstance()) return this;
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExpirationTime()) {
        mergeExpirationTime(other.getExpirationTime());
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
            case 10: {
              token_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getExpirationTimeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
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

    private java.lang.Object token_ = "";
    /**
     * <pre>
     * The token content.
     * </pre>
     *
     * <code>string token = 1;</code>
     * @return The token.
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The token content.
     * </pre>
     *
     * <code>string token = 1;</code>
     * @return The bytes for token.
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The token content.
     * </pre>
     *
     * <code>string token = 1;</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      token_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token content.
     * </pre>
     *
     * <code>string token = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      token_ = getDefaultInstance().getToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The token content.
     * </pre>
     *
     * <code>string token = 1;</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      token_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp expirationTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> expirationTimeBuilder_;
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     * @return Whether the expirationTime field is set.
     */
    public boolean hasExpirationTime() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     * @return The expirationTime.
     */
    public com.google.protobuf.Timestamp getExpirationTime() {
      if (expirationTimeBuilder_ == null) {
        return expirationTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : expirationTime_;
      } else {
        return expirationTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     */
    public Builder setExpirationTime(com.google.protobuf.Timestamp value) {
      if (expirationTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expirationTime_ = value;
      } else {
        expirationTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     */
    public Builder setExpirationTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (expirationTimeBuilder_ == null) {
        expirationTime_ = builderForValue.build();
      } else {
        expirationTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     */
    public Builder mergeExpirationTime(com.google.protobuf.Timestamp value) {
      if (expirationTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          expirationTime_ != null &&
          expirationTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getExpirationTimeBuilder().mergeFrom(value);
        } else {
          expirationTime_ = value;
        }
      } else {
        expirationTimeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     */
    public Builder clearExpirationTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      expirationTime_ = null;
      if (expirationTimeBuilder_ != null) {
        expirationTimeBuilder_.dispose();
        expirationTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getExpirationTimeBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExpirationTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder() {
      if (expirationTimeBuilder_ != null) {
        return expirationTimeBuilder_.getMessageOrBuilder();
      } else {
        return expirationTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : expirationTime_;
      }
    }
    /**
     * <pre>
     * Expiration timestamp. Can be empty if unknown or non-expiring.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp expiration_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getExpirationTimeFieldBuilder() {
      if (expirationTimeBuilder_ == null) {
        expirationTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getExpirationTime(),
                getParentForChildren(),
                isClean());
        expirationTime_ = null;
      }
      return expirationTimeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.FetchReadTokenResponse)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.FetchReadTokenResponse)
  private static final google.devtools.cloudbuild.v2.FetchReadTokenResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new google.devtools.cloudbuild.v2.FetchReadTokenResponse();
  }

  public static google.devtools.cloudbuild.v2.FetchReadTokenResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchReadTokenResponse>
      PARSER = new com.google.protobuf.AbstractParser<FetchReadTokenResponse>() {
    @java.lang.Override
    public FetchReadTokenResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FetchReadTokenResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchReadTokenResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.devtools.cloudbuild.v2.FetchReadTokenResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

