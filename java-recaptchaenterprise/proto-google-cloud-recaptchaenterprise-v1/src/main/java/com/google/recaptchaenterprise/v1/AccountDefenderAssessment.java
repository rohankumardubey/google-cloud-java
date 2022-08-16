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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Account Defender risk assessment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment}
 */
public final class AccountDefenderAssessment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment)
    AccountDefenderAssessmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccountDefenderAssessment.newBuilder() to construct.
  private AccountDefenderAssessment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccountDefenderAssessment() {
    labels_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccountDefenderAssessment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AccountDefenderAssessment(
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
                labels_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              labels_.add(rawValue);
              break;
            }
          case 10:
            {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                  labels_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000001;
                }
                labels_.add(rawValue);
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
        labels_ = java.util.Collections.unmodifiableList(labels_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_AccountDefenderAssessment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_AccountDefenderAssessment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.AccountDefenderAssessment.class,
            com.google.recaptchaenterprise.v1.AccountDefenderAssessment.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Labels returned by Account Defender for this request.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel}
   */
  public enum AccountDefenderLabel implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default unspecified type.
     * </pre>
     *
     * <code>ACCOUNT_DEFENDER_LABEL_UNSPECIFIED = 0;</code>
     */
    ACCOUNT_DEFENDER_LABEL_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The request matches a known good profile for the user.
     * </pre>
     *
     * <code>PROFILE_MATCH = 1;</code>
     */
    PROFILE_MATCH(1),
    /**
     *
     *
     * <pre>
     * The request is potentially a suspicious login event and should be further
     * verified either via multi-factor authentication or another system.
     * </pre>
     *
     * <code>SUSPICIOUS_LOGIN_ACTIVITY = 2;</code>
     */
    SUSPICIOUS_LOGIN_ACTIVITY(2),
    /**
     *
     *
     * <pre>
     * The request matched a profile that previously had suspicious account
     * creation behavior. This could mean this is a fake account.
     * </pre>
     *
     * <code>SUSPICIOUS_ACCOUNT_CREATION = 3;</code>
     */
    SUSPICIOUS_ACCOUNT_CREATION(3),
    /**
     *
     *
     * <pre>
     * The account in the request has a high number of related accounts. It does
     * not necessarily imply that the account is bad but could require
     * investigating.
     * </pre>
     *
     * <code>RELATED_ACCOUNTS_NUMBER_HIGH = 4;</code>
     */
    RELATED_ACCOUNTS_NUMBER_HIGH(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default unspecified type.
     * </pre>
     *
     * <code>ACCOUNT_DEFENDER_LABEL_UNSPECIFIED = 0;</code>
     */
    public static final int ACCOUNT_DEFENDER_LABEL_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The request matches a known good profile for the user.
     * </pre>
     *
     * <code>PROFILE_MATCH = 1;</code>
     */
    public static final int PROFILE_MATCH_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The request is potentially a suspicious login event and should be further
     * verified either via multi-factor authentication or another system.
     * </pre>
     *
     * <code>SUSPICIOUS_LOGIN_ACTIVITY = 2;</code>
     */
    public static final int SUSPICIOUS_LOGIN_ACTIVITY_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The request matched a profile that previously had suspicious account
     * creation behavior. This could mean this is a fake account.
     * </pre>
     *
     * <code>SUSPICIOUS_ACCOUNT_CREATION = 3;</code>
     */
    public static final int SUSPICIOUS_ACCOUNT_CREATION_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The account in the request has a high number of related accounts. It does
     * not necessarily imply that the account is bad but could require
     * investigating.
     * </pre>
     *
     * <code>RELATED_ACCOUNTS_NUMBER_HIGH = 4;</code>
     */
    public static final int RELATED_ACCOUNTS_NUMBER_HIGH_VALUE = 4;

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
    public static AccountDefenderLabel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AccountDefenderLabel forNumber(int value) {
      switch (value) {
        case 0:
          return ACCOUNT_DEFENDER_LABEL_UNSPECIFIED;
        case 1:
          return PROFILE_MATCH;
        case 2:
          return SUSPICIOUS_LOGIN_ACTIVITY;
        case 3:
          return SUSPICIOUS_ACCOUNT_CREATION;
        case 4:
          return RELATED_ACCOUNTS_NUMBER_HIGH;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AccountDefenderLabel>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AccountDefenderLabel>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<AccountDefenderLabel>() {
              public AccountDefenderLabel findValueByNumber(int number) {
                return AccountDefenderLabel.forNumber(number);
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
      return com.google.recaptchaenterprise.v1.AccountDefenderAssessment.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final AccountDefenderLabel[] VALUES = values();

    public static AccountDefenderLabel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AccountDefenderLabel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel)
  }

  public static final int LABELS_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> labels_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer,
          com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel>
      labels_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer,
              com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel>() {
            public com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel
                convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel
                  result =
                      com.google.recaptchaenterprise.v1.AccountDefenderAssessment
                          .AccountDefenderLabel.valueOf(from);
              return result == null
                  ? com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel
                      .UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
   * </code>
   *
   * @return A list containing the labels.
   */
  @java.lang.Override
  public java.util.List<
          com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel>
      getLabelsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer,
        com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel>(
        labels_, labels_converter_);
  }
  /**
   *
   *
   * <pre>
   * Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
   * </code>
   *
   * @return The count of labels.
   */
  @java.lang.Override
  public int getLabelsCount() {
    return labels_.size();
  }
  /**
   *
   *
   * <pre>
   * Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The labels at the given index.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel getLabels(
      int index) {
    return labels_converter_.convert(labels_.get(index));
  }
  /**
   *
   *
   * <pre>
   * Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for labels.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getLabelsValueList() {
    return labels_;
  }
  /**
   *
   *
   * <pre>
   * Labels for this request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of labels at the given index.
   */
  @java.lang.Override
  public int getLabelsValue(int index) {
    return labels_.get(index);
  }

  private int labelsMemoizedSerializedSize;

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
    if (getLabelsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(labelsMemoizedSerializedSize);
    }
    for (int i = 0; i < labels_.size(); i++) {
      output.writeEnumNoTag(labels_.get(i));
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
      for (int i = 0; i < labels_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(labels_.get(i));
      }
      size += dataSize;
      if (!getLabelsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      labelsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.AccountDefenderAssessment)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.AccountDefenderAssessment other =
        (com.google.recaptchaenterprise.v1.AccountDefenderAssessment) obj;

    if (!labels_.equals(other.labels_)) return false;
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
    if (getLabelsCount() > 0) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + labels_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment parseFrom(
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
      com.google.recaptchaenterprise.v1.AccountDefenderAssessment prototype) {
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
   * Account Defender risk assessment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment)
      com.google.recaptchaenterprise.v1.AccountDefenderAssessmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_AccountDefenderAssessment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_AccountDefenderAssessment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.AccountDefenderAssessment.class,
              com.google.recaptchaenterprise.v1.AccountDefenderAssessment.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.AccountDefenderAssessment.newBuilder()
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
      labels_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_AccountDefenderAssessment_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.AccountDefenderAssessment getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.AccountDefenderAssessment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.AccountDefenderAssessment build() {
      com.google.recaptchaenterprise.v1.AccountDefenderAssessment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.AccountDefenderAssessment buildPartial() {
      com.google.recaptchaenterprise.v1.AccountDefenderAssessment result =
          new com.google.recaptchaenterprise.v1.AccountDefenderAssessment(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        labels_ = java.util.Collections.unmodifiableList(labels_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.labels_ = labels_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.AccountDefenderAssessment) {
        return mergeFrom((com.google.recaptchaenterprise.v1.AccountDefenderAssessment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.AccountDefenderAssessment other) {
      if (other == com.google.recaptchaenterprise.v1.AccountDefenderAssessment.getDefaultInstance())
        return this;
      if (!other.labels_.isEmpty()) {
        if (labels_.isEmpty()) {
          labels_ = other.labels_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLabelsIsMutable();
          labels_.addAll(other.labels_);
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
      com.google.recaptchaenterprise.v1.AccountDefenderAssessment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.recaptchaenterprise.v1.AccountDefenderAssessment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<java.lang.Integer> labels_ = java.util.Collections.emptyList();

    private void ensureLabelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        labels_ = new java.util.ArrayList<java.lang.Integer>(labels_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @return A list containing the labels.
     */
    public java.util.List<
            com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel>
        getLabelsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer,
          com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel>(
          labels_, labels_converter_);
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @return The count of labels.
     */
    public int getLabelsCount() {
      return labels_.size();
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param index The index of the element to return.
     * @return The labels at the given index.
     */
    public com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel
        getLabels(int index) {
      return labels_converter_.convert(labels_.get(index));
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The labels to set.
     * @return This builder for chaining.
     */
    public Builder setLabels(
        int index,
        com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLabelsIsMutable();
      labels_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param value The labels to add.
     * @return This builder for chaining.
     */
    public Builder addLabels(
        com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureLabelsIsMutable();
      labels_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param values The labels to add.
     * @return This builder for chaining.
     */
    public Builder addAllLabels(
        java.lang.Iterable<
                ? extends
                    com.google.recaptchaenterprise.v1.AccountDefenderAssessment
                        .AccountDefenderLabel>
            values) {
      ensureLabelsIsMutable();
      for (com.google.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel value :
          values) {
        labels_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLabels() {
      labels_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for labels.
     */
    public java.util.List<java.lang.Integer> getLabelsValueList() {
      return java.util.Collections.unmodifiableList(labels_);
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of labels at the given index.
     */
    public int getLabelsValue(int index) {
      return labels_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for labels to set.
     * @return This builder for chaining.
     */
    public Builder setLabelsValue(int index, int value) {
      ensureLabelsIsMutable();
      labels_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param value The enum numeric value on the wire for labels to add.
     * @return This builder for chaining.
     */
    public Builder addLabelsValue(int value) {
      ensureLabelsIsMutable();
      labels_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels for this request.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment.AccountDefenderLabel labels = 1;
     * </code>
     *
     * @param values The enum numeric values on the wire for labels to add.
     * @return This builder for chaining.
     */
    public Builder addAllLabelsValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureLabelsIsMutable();
      for (int value : values) {
        labels_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.AccountDefenderAssessment)
  private static final com.google.recaptchaenterprise.v1.AccountDefenderAssessment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.AccountDefenderAssessment();
  }

  public static com.google.recaptchaenterprise.v1.AccountDefenderAssessment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountDefenderAssessment> PARSER =
      new com.google.protobuf.AbstractParser<AccountDefenderAssessment>() {
        @java.lang.Override
        public AccountDefenderAssessment parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AccountDefenderAssessment(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AccountDefenderAssessment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountDefenderAssessment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.AccountDefenderAssessment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
