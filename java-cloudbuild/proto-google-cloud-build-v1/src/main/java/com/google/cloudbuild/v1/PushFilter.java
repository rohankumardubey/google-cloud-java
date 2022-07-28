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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

package com.google.cloudbuild.v1;

/**
 *
 *
 * <pre>
 * Push contains filter properties for matching GitHub git pushes.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.PushFilter}
 */
public final class PushFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.PushFilter)
    PushFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PushFilter.newBuilder() to construct.
  private PushFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PushFilter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PushFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PushFilter(
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
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              gitRefCase_ = 2;
              gitRef_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();
              gitRefCase_ = 3;
              gitRef_ = s;
              break;
            }
          case 32:
            {
              invertRegex_ = input.readBool();
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
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_PushFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild
        .internal_static_google_devtools_cloudbuild_v1_PushFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.PushFilter.class,
            com.google.cloudbuild.v1.PushFilter.Builder.class);
  }

  private int gitRefCase_ = 0;
  private java.lang.Object gitRef_;

  public enum GitRefCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BRANCH(2),
    TAG(3),
    GITREF_NOT_SET(0);
    private final int value;

    private GitRefCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GitRefCase valueOf(int value) {
      return forNumber(value);
    }

    public static GitRefCase forNumber(int value) {
      switch (value) {
        case 2:
          return BRANCH;
        case 3:
          return TAG;
        case 0:
          return GITREF_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public GitRefCase getGitRefCase() {
    return GitRefCase.forNumber(gitRefCase_);
  }

  public static final int BRANCH_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Regexes matching branches to build.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return Whether the branch field is set.
   */
  public boolean hasBranch() {
    return gitRefCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Regexes matching branches to build.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return The branch.
   */
  public java.lang.String getBranch() {
    java.lang.Object ref = "";
    if (gitRefCase_ == 2) {
      ref = gitRef_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (gitRefCase_ == 2) {
        gitRef_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Regexes matching branches to build.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string branch = 2;</code>
   *
   * @return The bytes for branch.
   */
  public com.google.protobuf.ByteString getBranchBytes() {
    java.lang.Object ref = "";
    if (gitRefCase_ == 2) {
      ref = gitRef_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (gitRefCase_ == 2) {
        gitRef_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAG_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Regexes matching tags to build.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string tag = 3;</code>
   *
   * @return Whether the tag field is set.
   */
  public boolean hasTag() {
    return gitRefCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Regexes matching tags to build.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string tag = 3;</code>
   *
   * @return The tag.
   */
  public java.lang.String getTag() {
    java.lang.Object ref = "";
    if (gitRefCase_ == 3) {
      ref = gitRef_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (gitRefCase_ == 3) {
        gitRef_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Regexes matching tags to build.
   * The syntax of the regular expressions accepted is the syntax accepted by
   * RE2 and described at https://github.com/google/re2/wiki/Syntax
   * </pre>
   *
   * <code>string tag = 3;</code>
   *
   * @return The bytes for tag.
   */
  public com.google.protobuf.ByteString getTagBytes() {
    java.lang.Object ref = "";
    if (gitRefCase_ == 3) {
      ref = gitRef_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (gitRefCase_ == 3) {
        gitRef_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INVERT_REGEX_FIELD_NUMBER = 4;
  private boolean invertRegex_;
  /**
   *
   *
   * <pre>
   * When true, only trigger a build if the revision regex does NOT match the
   * git_ref regex.
   * </pre>
   *
   * <code>bool invert_regex = 4;</code>
   *
   * @return The invertRegex.
   */
  @java.lang.Override
  public boolean getInvertRegex() {
    return invertRegex_;
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
    if (gitRefCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, gitRef_);
    }
    if (gitRefCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, gitRef_);
    }
    if (invertRegex_ != false) {
      output.writeBool(4, invertRegex_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gitRefCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, gitRef_);
    }
    if (gitRefCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, gitRef_);
    }
    if (invertRegex_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, invertRegex_);
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
    if (!(obj instanceof com.google.cloudbuild.v1.PushFilter)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.PushFilter other = (com.google.cloudbuild.v1.PushFilter) obj;

    if (getInvertRegex() != other.getInvertRegex()) return false;
    if (!getGitRefCase().equals(other.getGitRefCase())) return false;
    switch (gitRefCase_) {
      case 2:
        if (!getBranch().equals(other.getBranch())) return false;
        break;
      case 3:
        if (!getTag().equals(other.getTag())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + INVERT_REGEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getInvertRegex());
    switch (gitRefCase_) {
      case 2:
        hash = (37 * hash) + BRANCH_FIELD_NUMBER;
        hash = (53 * hash) + getBranch().hashCode();
        break;
      case 3:
        hash = (37 * hash) + TAG_FIELD_NUMBER;
        hash = (53 * hash) + getTag().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PushFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.PushFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.PushFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloudbuild.v1.PushFilter prototype) {
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
   * Push contains filter properties for matching GitHub git pushes.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.PushFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.PushFilter)
      com.google.cloudbuild.v1.PushFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_PushFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_PushFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.PushFilter.class,
              com.google.cloudbuild.v1.PushFilter.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.PushFilter.newBuilder()
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
      invertRegex_ = false;

      gitRefCase_ = 0;
      gitRef_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild
          .internal_static_google_devtools_cloudbuild_v1_PushFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.PushFilter getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.PushFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.PushFilter build() {
      com.google.cloudbuild.v1.PushFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.PushFilter buildPartial() {
      com.google.cloudbuild.v1.PushFilter result = new com.google.cloudbuild.v1.PushFilter(this);
      if (gitRefCase_ == 2) {
        result.gitRef_ = gitRef_;
      }
      if (gitRefCase_ == 3) {
        result.gitRef_ = gitRef_;
      }
      result.invertRegex_ = invertRegex_;
      result.gitRefCase_ = gitRefCase_;
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
      if (other instanceof com.google.cloudbuild.v1.PushFilter) {
        return mergeFrom((com.google.cloudbuild.v1.PushFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.PushFilter other) {
      if (other == com.google.cloudbuild.v1.PushFilter.getDefaultInstance()) return this;
      if (other.getInvertRegex() != false) {
        setInvertRegex(other.getInvertRegex());
      }
      switch (other.getGitRefCase()) {
        case BRANCH:
          {
            gitRefCase_ = 2;
            gitRef_ = other.gitRef_;
            onChanged();
            break;
          }
        case TAG:
          {
            gitRefCase_ = 3;
            gitRef_ = other.gitRef_;
            onChanged();
            break;
          }
        case GITREF_NOT_SET:
          {
            break;
          }
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
      com.google.cloudbuild.v1.PushFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloudbuild.v1.PushFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int gitRefCase_ = 0;
    private java.lang.Object gitRef_;

    public GitRefCase getGitRefCase() {
      return GitRefCase.forNumber(gitRefCase_);
    }

    public Builder clearGitRef() {
      gitRefCase_ = 0;
      gitRef_ = null;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Regexes matching branches to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return Whether the branch field is set.
     */
    @java.lang.Override
    public boolean hasBranch() {
      return gitRefCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Regexes matching branches to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return The branch.
     */
    @java.lang.Override
    public java.lang.String getBranch() {
      java.lang.Object ref = "";
      if (gitRefCase_ == 2) {
        ref = gitRef_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (gitRefCase_ == 2) {
          gitRef_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Regexes matching branches to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return The bytes for branch.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBranchBytes() {
      java.lang.Object ref = "";
      if (gitRefCase_ == 2) {
        ref = gitRef_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (gitRefCase_ == 2) {
          gitRef_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Regexes matching branches to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @param value The branch to set.
     * @return This builder for chaining.
     */
    public Builder setBranch(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gitRefCase_ = 2;
      gitRef_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regexes matching branches to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBranch() {
      if (gitRefCase_ == 2) {
        gitRefCase_ = 0;
        gitRef_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regexes matching branches to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string branch = 2;</code>
     *
     * @param value The bytes for branch to set.
     * @return This builder for chaining.
     */
    public Builder setBranchBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gitRefCase_ = 2;
      gitRef_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Regexes matching tags to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string tag = 3;</code>
     *
     * @return Whether the tag field is set.
     */
    @java.lang.Override
    public boolean hasTag() {
      return gitRefCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Regexes matching tags to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string tag = 3;</code>
     *
     * @return The tag.
     */
    @java.lang.Override
    public java.lang.String getTag() {
      java.lang.Object ref = "";
      if (gitRefCase_ == 3) {
        ref = gitRef_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (gitRefCase_ == 3) {
          gitRef_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Regexes matching tags to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string tag = 3;</code>
     *
     * @return The bytes for tag.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTagBytes() {
      java.lang.Object ref = "";
      if (gitRefCase_ == 3) {
        ref = gitRef_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (gitRefCase_ == 3) {
          gitRef_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Regexes matching tags to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string tag = 3;</code>
     *
     * @param value The tag to set.
     * @return This builder for chaining.
     */
    public Builder setTag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      gitRefCase_ = 3;
      gitRef_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regexes matching tags to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string tag = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTag() {
      if (gitRefCase_ == 3) {
        gitRefCase_ = 0;
        gitRef_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Regexes matching tags to build.
     * The syntax of the regular expressions accepted is the syntax accepted by
     * RE2 and described at https://github.com/google/re2/wiki/Syntax
     * </pre>
     *
     * <code>string tag = 3;</code>
     *
     * @param value The bytes for tag to set.
     * @return This builder for chaining.
     */
    public Builder setTagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      gitRefCase_ = 3;
      gitRef_ = value;
      onChanged();
      return this;
    }

    private boolean invertRegex_;
    /**
     *
     *
     * <pre>
     * When true, only trigger a build if the revision regex does NOT match the
     * git_ref regex.
     * </pre>
     *
     * <code>bool invert_regex = 4;</code>
     *
     * @return The invertRegex.
     */
    @java.lang.Override
    public boolean getInvertRegex() {
      return invertRegex_;
    }
    /**
     *
     *
     * <pre>
     * When true, only trigger a build if the revision regex does NOT match the
     * git_ref regex.
     * </pre>
     *
     * <code>bool invert_regex = 4;</code>
     *
     * @param value The invertRegex to set.
     * @return This builder for chaining.
     */
    public Builder setInvertRegex(boolean value) {

      invertRegex_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When true, only trigger a build if the revision regex does NOT match the
     * git_ref regex.
     * </pre>
     *
     * <code>bool invert_regex = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInvertRegex() {

      invertRegex_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.PushFilter)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.PushFilter)
  private static final com.google.cloudbuild.v1.PushFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.PushFilter();
  }

  public static com.google.cloudbuild.v1.PushFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PushFilter> PARSER =
      new com.google.protobuf.AbstractParser<PushFilter>() {
        @java.lang.Override
        public PushFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PushFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PushFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PushFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.PushFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}