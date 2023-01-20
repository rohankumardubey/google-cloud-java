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
// source: google/cloud/dialogflow/v2beta1/conversation.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * The request message for [Conversations.SuggestConversationSummary][google.cloud.dialogflow.v2beta1.Conversations.SuggestConversationSummary].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest}
 */
public final class SuggestConversationSummaryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest)
    SuggestConversationSummaryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SuggestConversationSummaryRequest.newBuilder() to construct.
  private SuggestConversationSummaryRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SuggestConversationSummaryRequest() {
    conversation_ = "";
    latestMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SuggestConversationSummaryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProto
        .internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.ConversationProto
        .internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest.class,
            com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest.Builder.class);
  }

  public static final int CONVERSATION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object conversation_ = "";
  /**
   *
   *
   * <pre>
   * Required. The conversation to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The conversation.
   */
  @java.lang.Override
  public java.lang.String getConversation() {
    java.lang.Object ref = conversation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The conversation to fetch suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;`.
   * </pre>
   *
   * <code>
   * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for conversation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getConversationBytes() {
    java.lang.Object ref = conversation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      conversation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LATEST_MESSAGE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object latestMessage_ = "";
  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used as context for
   * compiling suggestion. If empty, the latest message of the conversation will
   * be used.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The latestMessage.
   */
  @java.lang.Override
  public java.lang.String getLatestMessage() {
    java.lang.Object ref = latestMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      latestMessage_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used as context for
   * compiling suggestion. If empty, the latest message of the conversation will
   * be used.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for latestMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLatestMessageBytes() {
    java.lang.Object ref = latestMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      latestMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTEXT_SIZE_FIELD_NUMBER = 4;
  private int contextSize_ = 0;
  /**
   *
   *
   * <pre>
   * Max number of messages prior to and including
   * [latest_message] to use as context when compiling the
   * suggestion. By default 500 and at most 1000.
   * </pre>
   *
   * <code>int32 context_size = 4;</code>
   *
   * @return The contextSize.
   */
  @java.lang.Override
  public int getContextSize() {
    return contextSize_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, latestMessage_);
    }
    if (contextSize_ != 0) {
      output.writeInt32(4, contextSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(latestMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, latestMessage_);
    }
    if (contextSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, contextSize_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest other =
        (com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest) obj;

    if (!getConversation().equals(other.getConversation())) return false;
    if (!getLatestMessage().equals(other.getLatestMessage())) return false;
    if (getContextSize() != other.getContextSize()) return false;
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
    hash = (37 * hash) + CONVERSATION_FIELD_NUMBER;
    hash = (53 * hash) + getConversation().hashCode();
    hash = (37 * hash) + LATEST_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLatestMessage().hashCode();
    hash = (37 * hash) + CONTEXT_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getContextSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest prototype) {
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
   * The request message for [Conversations.SuggestConversationSummary][google.cloud.dialogflow.v2beta1.Conversations.SuggestConversationSummary].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest)
      com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto
          .internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto
          .internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest.class,
              com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      conversation_ = "";
      latestMessage_ = "";
      contextSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.ConversationProto
          .internal_static_google_cloud_dialogflow_v2beta1_SuggestConversationSummaryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest build() {
      com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest result =
          new com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.conversation_ = conversation_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.latestMessage_ = latestMessage_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.contextSize_ = contextSize_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest) {
        return mergeFrom(
            (com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
              .getDefaultInstance()) return this;
      if (!other.getConversation().isEmpty()) {
        conversation_ = other.conversation_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLatestMessage().isEmpty()) {
        latestMessage_ = other.latestMessage_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getContextSize() != 0) {
        setContextSize(other.getContextSize());
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
                conversation_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                latestMessage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            case 32:
              {
                contextSize_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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

    private java.lang.Object conversation_ = "";
    /**
     *
     *
     * <pre>
     * Required. The conversation to fetch suggestion for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>
     * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The conversation.
     */
    public java.lang.String getConversation() {
      java.lang.Object ref = conversation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation to fetch suggestion for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>
     * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for conversation.
     */
    public com.google.protobuf.ByteString getConversationBytes() {
      java.lang.Object ref = conversation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        conversation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation to fetch suggestion for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>
     * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The conversation to set.
     * @return This builder for chaining.
     */
    public Builder setConversation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      conversation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation to fetch suggestion for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>
     * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConversation() {
      conversation_ = getDefaultInstance().getConversation();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The conversation to fetch suggestion for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;`.
     * </pre>
     *
     * <code>
     * string conversation = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for conversation to set.
     * @return This builder for chaining.
     */
    public Builder setConversationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      conversation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object latestMessage_ = "";
    /**
     *
     *
     * <pre>
     * The name of the latest conversation message used as context for
     * compiling suggestion. If empty, the latest message of the conversation will
     * be used.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The latestMessage.
     */
    public java.lang.String getLatestMessage() {
      java.lang.Object ref = latestMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        latestMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the latest conversation message used as context for
     * compiling suggestion. If empty, the latest message of the conversation will
     * be used.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for latestMessage.
     */
    public com.google.protobuf.ByteString getLatestMessageBytes() {
      java.lang.Object ref = latestMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        latestMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the latest conversation message used as context for
     * compiling suggestion. If empty, the latest message of the conversation will
     * be used.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The latestMessage to set.
     * @return This builder for chaining.
     */
    public Builder setLatestMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      latestMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the latest conversation message used as context for
     * compiling suggestion. If empty, the latest message of the conversation will
     * be used.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLatestMessage() {
      latestMessage_ = getDefaultInstance().getLatestMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the latest conversation message used as context for
     * compiling suggestion. If empty, the latest message of the conversation will
     * be used.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
     * </pre>
     *
     * <code>string latest_message = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for latestMessage to set.
     * @return This builder for chaining.
     */
    public Builder setLatestMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      latestMessage_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int contextSize_;
    /**
     *
     *
     * <pre>
     * Max number of messages prior to and including
     * [latest_message] to use as context when compiling the
     * suggestion. By default 500 and at most 1000.
     * </pre>
     *
     * <code>int32 context_size = 4;</code>
     *
     * @return The contextSize.
     */
    @java.lang.Override
    public int getContextSize() {
      return contextSize_;
    }
    /**
     *
     *
     * <pre>
     * Max number of messages prior to and including
     * [latest_message] to use as context when compiling the
     * suggestion. By default 500 and at most 1000.
     * </pre>
     *
     * <code>int32 context_size = 4;</code>
     *
     * @param value The contextSize to set.
     * @return This builder for chaining.
     */
    public Builder setContextSize(int value) {

      contextSize_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Max number of messages prior to and including
     * [latest_message] to use as context when compiling the
     * suggestion. By default 500 and at most 1000.
     * </pre>
     *
     * <code>int32 context_size = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContextSize() {
      bitField0_ = (bitField0_ & ~0x00000004);
      contextSize_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest)
  private static final com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestConversationSummaryRequest> PARSER =
      new com.google.protobuf.AbstractParser<SuggestConversationSummaryRequest>() {
        @java.lang.Override
        public SuggestConversationSummaryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestConversationSummaryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestConversationSummaryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.SuggestConversationSummaryRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
