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
// source: google/cloud/securitycenter/v2/bigquery_export.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v2;

public final class BigQueryExportProto {
  private BigQueryExportProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_BigQueryExport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_BigQueryExport_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/securitycenter/v2/bigquer"
          + "y_export.proto\022\036google.cloud.securitycen"
          + "ter.v2\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032\037google/proto"
          + "buf/timestamp.proto\"\235\004\n\016BigQueryExport\022\014"
          + "\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t\022\016\n\006fil"
          + "ter\030\003 \001(\t\022\017\n\007dataset\030\004 \001(\t\0224\n\013create_tim"
          + "e\030\005 \001(\0132\032.google.protobuf.TimestampB\003\340A\003"
          + "\0224\n\013update_time\030\006 \001(\0132\032.google.protobuf."
          + "TimestampB\003\340A\003\022\037\n\022most_recent_editor\030\007 \001"
          + "(\tB\003\340A\003\022\026\n\tprincipal\030\010 \001(\tB\003\340A\003:\241\002\352A\235\002\n,"
          + "securitycenter.googleapis.com/BigQueryEx"
          + "port\022Jorganizations/{organization}/locat"
          + "ions/{location}/bigQueryExports/{export}"
          + "\022>folders/{folder}/locations/{location}/"
          + "bigQueryExports/{export}\022@projects/{proj"
          + "ect}/locations/{location}/bigQueryExport"
          + "s/{export}*\017bigQueryExports2\016bigQueryExp"
          + "ortB\355\001\n\"com.google.cloud.securitycenter."
          + "v2B\023BigQueryExportProtoP\001ZJcloud.google."
          + "com/go/securitycenter/apiv2/securitycent"
          + "erpb;securitycenterpb\252\002\036Google.Cloud.Sec"
          + "urityCenter.V2\312\002\036Google\\Cloud\\SecurityCe"
          + "nter\\V2\352\002!Google::Cloud::SecurityCenter:"
          + ":V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_BigQueryExport_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_BigQueryExport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_BigQueryExport_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "Filter",
              "Dataset",
              "CreateTime",
              "UpdateTime",
              "MostRecentEditor",
              "Principal",
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
