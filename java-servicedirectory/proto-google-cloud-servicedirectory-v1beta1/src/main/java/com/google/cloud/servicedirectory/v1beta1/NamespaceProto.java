/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/servicedirectory/v1beta1/namespace.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.servicedirectory.v1beta1;

public final class NamespaceProto {
  private NamespaceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Namespace_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/servicedirectory/v1beta1/"
          + "namespace.proto\022%google.cloud.servicedir"
          + "ectory.v1beta1\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\216\003\n\tNamespac"
          + "e\022\021\n\004name\030\001 \001(\tB\003\340A\005\022Q\n\006labels\030\002 \003(\0132<.g"
          + "oogle.cloud.servicedirectory.v1beta1.Nam"
          + "espace.LabelsEntryB\003\340A\001\0224\n\013create_time\030\004"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\005 \001(\0132\032.google.protobuf.Tim"
          + "estampB\003\340A\003\022\020\n\003uid\030\006 \001(\tB\003\340A\003\032-\n\013LabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:n\352A"
          + "k\n)servicedirectory.googleapis.com/Names"
          + "pace\022>projects/{project}/locations/{loca"
          + "tion}/namespaces/{namespace}B\222\002\n)com.goo"
          + "gle.cloud.servicedirectory.v1beta1B\016Name"
          + "spaceProtoP\001ZUcloud.google.com/go/servic"
          + "edirectory/apiv1beta1/servicedirectorypb"
          + ";servicedirectorypb\370\001\001\252\002%Google.Cloud.Se"
          + "rviceDirectory.V1Beta1\312\002%Google\\Cloud\\Se"
          + "rviceDirectory\\V1beta1\352\002(Google::Cloud::"
          + "ServiceDirectory::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor,
            new java.lang.String[] {
              "Name", "Labels", "CreateTime", "UpdateTime", "Uid",
            });
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_descriptor =
        internal_static_google_cloud_servicedirectory_v1beta1_Namespace_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_servicedirectory_v1beta1_Namespace_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
