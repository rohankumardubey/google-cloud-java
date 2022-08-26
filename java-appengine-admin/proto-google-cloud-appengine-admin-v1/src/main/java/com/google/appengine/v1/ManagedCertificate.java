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
// source: google/appengine/v1/certificate.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * A certificate managed by App Engine.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.ManagedCertificate}
 */
public final class ManagedCertificate extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.ManagedCertificate)
    ManagedCertificateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ManagedCertificate.newBuilder() to construct.
  private ManagedCertificate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ManagedCertificate() {
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ManagedCertificate();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ManagedCertificate(
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
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (lastRenewalTime_ != null) {
                subBuilder = lastRenewalTime_.toBuilder();
              }
              lastRenewalTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lastRenewalTime_);
                lastRenewalTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              status_ = rawValue;
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
    return com.google.appengine.v1.CertificateProto
        .internal_static_google_appengine_v1_ManagedCertificate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.CertificateProto
        .internal_static_google_appengine_v1_ManagedCertificate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.ManagedCertificate.class,
            com.google.appengine.v1.ManagedCertificate.Builder.class);
  }

  public static final int LAST_RENEWAL_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp lastRenewalTime_;
  /**
   *
   *
   * <pre>
   * Time at which the certificate was last renewed. The renewal process is
   * fully managed. Certificate renewal will automatically occur before the
   * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
   *
   * @return Whether the lastRenewalTime field is set.
   */
  @java.lang.Override
  public boolean hasLastRenewalTime() {
    return lastRenewalTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time at which the certificate was last renewed. The renewal process is
   * fully managed. Certificate renewal will automatically occur before the
   * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
   *
   * @return The lastRenewalTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastRenewalTime() {
    return lastRenewalTime_ == null
        ? com.google.protobuf.Timestamp.getDefaultInstance()
        : lastRenewalTime_;
  }
  /**
   *
   *
   * <pre>
   * Time at which the certificate was last renewed. The renewal process is
   * fully managed. Certificate renewal will automatically occur before the
   * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastRenewalTimeOrBuilder() {
    return getLastRenewalTime();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   *
   *
   * <pre>
   * Status of certificate management. Refers to the most recent certificate
   * acquisition or renewal attempt.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
   *
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override
  public int getStatusValue() {
    return status_;
  }
  /**
   *
   *
   * <pre>
   * Status of certificate management. Refers to the most recent certificate
   * acquisition or renewal attempt.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
   *
   * @return The status.
   */
  @java.lang.Override
  public com.google.appengine.v1.ManagementStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.appengine.v1.ManagementStatus result =
        com.google.appengine.v1.ManagementStatus.valueOf(status_);
    return result == null ? com.google.appengine.v1.ManagementStatus.UNRECOGNIZED : result;
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
    if (lastRenewalTime_ != null) {
      output.writeMessage(1, getLastRenewalTime());
    }
    if (status_
        != com.google.appengine.v1.ManagementStatus.MANAGEMENT_STATUS_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lastRenewalTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getLastRenewalTime());
    }
    if (status_
        != com.google.appengine.v1.ManagementStatus.MANAGEMENT_STATUS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, status_);
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
    if (!(obj instanceof com.google.appengine.v1.ManagedCertificate)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.ManagedCertificate other =
        (com.google.appengine.v1.ManagedCertificate) obj;

    if (hasLastRenewalTime() != other.hasLastRenewalTime()) return false;
    if (hasLastRenewalTime()) {
      if (!getLastRenewalTime().equals(other.getLastRenewalTime())) return false;
    }
    if (status_ != other.status_) return false;
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
    if (hasLastRenewalTime()) {
      hash = (37 * hash) + LAST_RENEWAL_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastRenewalTime().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ManagedCertificate parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ManagedCertificate parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.ManagedCertificate parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.ManagedCertificate prototype) {
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
   * A certificate managed by App Engine.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.ManagedCertificate}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.ManagedCertificate)
      com.google.appengine.v1.ManagedCertificateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.CertificateProto
          .internal_static_google_appengine_v1_ManagedCertificate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.CertificateProto
          .internal_static_google_appengine_v1_ManagedCertificate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.ManagedCertificate.class,
              com.google.appengine.v1.ManagedCertificate.Builder.class);
    }

    // Construct using com.google.appengine.v1.ManagedCertificate.newBuilder()
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
      if (lastRenewalTimeBuilder_ == null) {
        lastRenewalTime_ = null;
      } else {
        lastRenewalTime_ = null;
        lastRenewalTimeBuilder_ = null;
      }
      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.CertificateProto
          .internal_static_google_appengine_v1_ManagedCertificate_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.ManagedCertificate getDefaultInstanceForType() {
      return com.google.appengine.v1.ManagedCertificate.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.ManagedCertificate build() {
      com.google.appengine.v1.ManagedCertificate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.ManagedCertificate buildPartial() {
      com.google.appengine.v1.ManagedCertificate result =
          new com.google.appengine.v1.ManagedCertificate(this);
      if (lastRenewalTimeBuilder_ == null) {
        result.lastRenewalTime_ = lastRenewalTime_;
      } else {
        result.lastRenewalTime_ = lastRenewalTimeBuilder_.build();
      }
      result.status_ = status_;
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
      if (other instanceof com.google.appengine.v1.ManagedCertificate) {
        return mergeFrom((com.google.appengine.v1.ManagedCertificate) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.ManagedCertificate other) {
      if (other == com.google.appengine.v1.ManagedCertificate.getDefaultInstance()) return this;
      if (other.hasLastRenewalTime()) {
        mergeLastRenewalTime(other.getLastRenewalTime());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      com.google.appengine.v1.ManagedCertificate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.ManagedCertificate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp lastRenewalTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        lastRenewalTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     *
     * @return Whether the lastRenewalTime field is set.
     */
    public boolean hasLastRenewalTime() {
      return lastRenewalTimeBuilder_ != null || lastRenewalTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     *
     * @return The lastRenewalTime.
     */
    public com.google.protobuf.Timestamp getLastRenewalTime() {
      if (lastRenewalTimeBuilder_ == null) {
        return lastRenewalTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastRenewalTime_;
      } else {
        return lastRenewalTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     */
    public Builder setLastRenewalTime(com.google.protobuf.Timestamp value) {
      if (lastRenewalTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastRenewalTime_ = value;
        onChanged();
      } else {
        lastRenewalTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     */
    public Builder setLastRenewalTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastRenewalTimeBuilder_ == null) {
        lastRenewalTime_ = builderForValue.build();
        onChanged();
      } else {
        lastRenewalTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     */
    public Builder mergeLastRenewalTime(com.google.protobuf.Timestamp value) {
      if (lastRenewalTimeBuilder_ == null) {
        if (lastRenewalTime_ != null) {
          lastRenewalTime_ =
              com.google.protobuf.Timestamp.newBuilder(lastRenewalTime_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          lastRenewalTime_ = value;
        }
        onChanged();
      } else {
        lastRenewalTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     */
    public Builder clearLastRenewalTime() {
      if (lastRenewalTimeBuilder_ == null) {
        lastRenewalTime_ = null;
        onChanged();
      } else {
        lastRenewalTime_ = null;
        lastRenewalTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastRenewalTimeBuilder() {

      onChanged();
      return getLastRenewalTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastRenewalTimeOrBuilder() {
      if (lastRenewalTimeBuilder_ != null) {
        return lastRenewalTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastRenewalTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : lastRenewalTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time at which the certificate was last renewed. The renewal process is
     * fully managed. Certificate renewal will automatically occur before the
     * certificate expires. Renewal errors can be tracked via `ManagementStatus`.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_renewal_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getLastRenewalTimeFieldBuilder() {
      if (lastRenewalTimeBuilder_ == null) {
        lastRenewalTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getLastRenewalTime(), getParentForChildren(), isClean());
        lastRenewalTime_ = null;
      }
      return lastRenewalTimeBuilder_;
    }

    private int status_ = 0;
    /**
     *
     *
     * <pre>
     * Status of certificate management. Refers to the most recent certificate
     * acquisition or renewal attempt.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
     *
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override
    public int getStatusValue() {
      return status_;
    }
    /**
     *
     *
     * <pre>
     * Status of certificate management. Refers to the most recent certificate
     * acquisition or renewal attempt.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
     *
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {

      status_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of certificate management. Refers to the most recent certificate
     * acquisition or renewal attempt.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
     *
     * @return The status.
     */
    @java.lang.Override
    public com.google.appengine.v1.ManagementStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.appengine.v1.ManagementStatus result =
          com.google.appengine.v1.ManagementStatus.valueOf(status_);
      return result == null ? com.google.appengine.v1.ManagementStatus.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Status of certificate management. Refers to the most recent certificate
     * acquisition or renewal attempt.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
     *
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.appengine.v1.ManagementStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }

      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Status of certificate management. Refers to the most recent certificate
     * acquisition or renewal attempt.
     * &#64;OutputOnly
     * </pre>
     *
     * <code>.google.appengine.v1.ManagementStatus status = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStatus() {

      status_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.ManagedCertificate)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.ManagedCertificate)
  private static final com.google.appengine.v1.ManagedCertificate DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.ManagedCertificate();
  }

  public static com.google.appengine.v1.ManagedCertificate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagedCertificate> PARSER =
      new com.google.protobuf.AbstractParser<ManagedCertificate>() {
        @java.lang.Override
        public ManagedCertificate parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ManagedCertificate(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ManagedCertificate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagedCertificate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.ManagedCertificate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
