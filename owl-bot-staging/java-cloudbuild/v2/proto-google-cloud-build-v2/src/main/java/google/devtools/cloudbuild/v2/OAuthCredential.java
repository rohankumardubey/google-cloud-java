// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

package google.devtools.cloudbuild.v2;

/**
 * <pre>
 * Represents an OAuth token of the account that authorized the Connection,
 * and associated metadata.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v2.OAuthCredential}
 */
public final class OAuthCredential extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v2.OAuthCredential)
    OAuthCredentialOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OAuthCredential.newBuilder() to construct.
  private OAuthCredential(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OAuthCredential() {
    oauthTokenSecretVersion_ = "";
    username_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OAuthCredential();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_OAuthCredential_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_OAuthCredential_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            google.devtools.cloudbuild.v2.OAuthCredential.class, google.devtools.cloudbuild.v2.OAuthCredential.Builder.class);
  }

  public static final int OAUTH_TOKEN_SECRET_VERSION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object oauthTokenSecretVersion_ = "";
  /**
   * <pre>
   * A SecretManager resource containing the OAuth token that authorizes
   * the Cloud Build connection. Format: `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string oauth_token_secret_version = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The oauthTokenSecretVersion.
   */
  @java.lang.Override
  public java.lang.String getOauthTokenSecretVersion() {
    java.lang.Object ref = oauthTokenSecretVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oauthTokenSecretVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A SecretManager resource containing the OAuth token that authorizes
   * the Cloud Build connection. Format: `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
   * </pre>
   *
   * <code>string oauth_token_secret_version = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for oauthTokenSecretVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOauthTokenSecretVersionBytes() {
    java.lang.Object ref = oauthTokenSecretVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      oauthTokenSecretVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";
  /**
   * <pre>
   * Output only. The username associated to this token.
   * </pre>
   *
   * <code>string username = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The username associated to this token.
   * </pre>
   *
   * <code>string username = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oauthTokenSecretVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, oauthTokenSecretVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oauthTokenSecretVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, oauthTokenSecretVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
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
    if (!(obj instanceof google.devtools.cloudbuild.v2.OAuthCredential)) {
      return super.equals(obj);
    }
    google.devtools.cloudbuild.v2.OAuthCredential other = (google.devtools.cloudbuild.v2.OAuthCredential) obj;

    if (!getOauthTokenSecretVersion()
        .equals(other.getOauthTokenSecretVersion())) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
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
    hash = (37 * hash) + OAUTH_TOKEN_SECRET_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getOauthTokenSecretVersion().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static google.devtools.cloudbuild.v2.OAuthCredential parseFrom(
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
  public static Builder newBuilder(google.devtools.cloudbuild.v2.OAuthCredential prototype) {
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
   * Represents an OAuth token of the account that authorized the Connection,
   * and associated metadata.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v2.OAuthCredential}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v2.OAuthCredential)
      google.devtools.cloudbuild.v2.OAuthCredentialOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_OAuthCredential_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_OAuthCredential_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.devtools.cloudbuild.v2.OAuthCredential.class, google.devtools.cloudbuild.v2.OAuthCredential.Builder.class);
    }

    // Construct using google.devtools.cloudbuild.v2.OAuthCredential.newBuilder()
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
      oauthTokenSecretVersion_ = "";
      username_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return google.devtools.cloudbuild.v2.RepositoryManagerProto.internal_static_google_devtools_cloudbuild_v2_OAuthCredential_descriptor;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.OAuthCredential getDefaultInstanceForType() {
      return google.devtools.cloudbuild.v2.OAuthCredential.getDefaultInstance();
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.OAuthCredential build() {
      google.devtools.cloudbuild.v2.OAuthCredential result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public google.devtools.cloudbuild.v2.OAuthCredential buildPartial() {
      google.devtools.cloudbuild.v2.OAuthCredential result = new google.devtools.cloudbuild.v2.OAuthCredential(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(google.devtools.cloudbuild.v2.OAuthCredential result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.oauthTokenSecretVersion_ = oauthTokenSecretVersion_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.username_ = username_;
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
      if (other instanceof google.devtools.cloudbuild.v2.OAuthCredential) {
        return mergeFrom((google.devtools.cloudbuild.v2.OAuthCredential)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(google.devtools.cloudbuild.v2.OAuthCredential other) {
      if (other == google.devtools.cloudbuild.v2.OAuthCredential.getDefaultInstance()) return this;
      if (!other.getOauthTokenSecretVersion().isEmpty()) {
        oauthTokenSecretVersion_ = other.oauthTokenSecretVersion_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000002;
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
            case 10: {
              oauthTokenSecretVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              username_ = input.readStringRequireUtf8();
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

    private java.lang.Object oauthTokenSecretVersion_ = "";
    /**
     * <pre>
     * A SecretManager resource containing the OAuth token that authorizes
     * the Cloud Build connection. Format: `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string oauth_token_secret_version = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The oauthTokenSecretVersion.
     */
    public java.lang.String getOauthTokenSecretVersion() {
      java.lang.Object ref = oauthTokenSecretVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oauthTokenSecretVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A SecretManager resource containing the OAuth token that authorizes
     * the Cloud Build connection. Format: `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string oauth_token_secret_version = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for oauthTokenSecretVersion.
     */
    public com.google.protobuf.ByteString
        getOauthTokenSecretVersionBytes() {
      java.lang.Object ref = oauthTokenSecretVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        oauthTokenSecretVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A SecretManager resource containing the OAuth token that authorizes
     * the Cloud Build connection. Format: `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string oauth_token_secret_version = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The oauthTokenSecretVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOauthTokenSecretVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      oauthTokenSecretVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A SecretManager resource containing the OAuth token that authorizes
     * the Cloud Build connection. Format: `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string oauth_token_secret_version = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearOauthTokenSecretVersion() {
      oauthTokenSecretVersion_ = getDefaultInstance().getOauthTokenSecretVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A SecretManager resource containing the OAuth token that authorizes
     * the Cloud Build connection. Format: `projects/&#42;&#47;secrets/&#42;&#47;versions/&#42;`.
     * </pre>
     *
     * <code>string oauth_token_secret_version = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for oauthTokenSecretVersion to set.
     * @return This builder for chaining.
     */
    public Builder setOauthTokenSecretVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      oauthTokenSecretVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <pre>
     * Output only. The username associated to this token.
     * </pre>
     *
     * <code>string username = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The username associated to this token.
     * </pre>
     *
     * <code>string username = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The username associated to this token.
     * </pre>
     *
     * <code>string username = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      username_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The username associated to this token.
     * </pre>
     *
     * <code>string username = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The username associated to this token.
     * </pre>
     *
     * <code>string username = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v2.OAuthCredential)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v2.OAuthCredential)
  private static final google.devtools.cloudbuild.v2.OAuthCredential DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new google.devtools.cloudbuild.v2.OAuthCredential();
  }

  public static google.devtools.cloudbuild.v2.OAuthCredential getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAuthCredential>
      PARSER = new com.google.protobuf.AbstractParser<OAuthCredential>() {
    @java.lang.Override
    public OAuthCredential parsePartialFrom(
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

  public static com.google.protobuf.Parser<OAuthCredential> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAuthCredential> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public google.devtools.cloudbuild.v2.OAuthCredential getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

