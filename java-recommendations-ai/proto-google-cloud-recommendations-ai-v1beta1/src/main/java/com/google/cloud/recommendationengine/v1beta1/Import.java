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
// source: google/cloud/recommendationengine/v1beta1/import.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.recommendationengine.v1beta1;

public final class Import {
  private Import() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ImportErrorsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ImportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ImportMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ImportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_UserEventImportSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_UserEventImportSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/recommendationengine/v1be"
          + "ta1/import.proto\022)google.cloud.recommend"
          + "ationengine.v1beta1\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "7google/cloud/recommendationengine/v1bet"
          + "a1/catalog.proto\032:google/cloud/recommend"
          + "ationengine/v1beta1/user_event.proto\032Ngo"
          + "ogle/cloud/recommendationengine/v1beta1/"
          + "recommendationengine_resources.proto\032\037go"
          + "ogle/protobuf/timestamp.proto\032\027google/rp"
          + "c/status.proto\"$\n\tGcsSource\022\027\n\ninput_uri"
          + "s\030\001 \003(\tB\003\340A\002\"i\n\023CatalogInlineSource\022R\n\rc"
          + "atalog_items\030\001 \003(\01326.google.cloud.recomm"
          + "endationengine.v1beta1.CatalogItemB\003\340A\001\""
          + "g\n\025UserEventInlineSource\022N\n\013user_events\030"
          + "\001 \003(\01324.google.cloud.recommendationengin"
          + "e.v1beta1.UserEventB\003\340A\001\"9\n\022ImportErrors"
          + "Config\022\024\n\ngcs_prefix\030\001 \001(\tH\000B\r\n\013destinat"
          + "ion\"\247\002\n\031ImportCatalogItemsRequest\022C\n\006par"
          + "ent\030\001 \001(\tB3\340A\002\372A-\n+recommendationengine."
          + "googleapis.com/Catalog\022\027\n\nrequest_id\030\002 \001"
          + "(\tB\003\340A\001\022Q\n\014input_config\030\003 \001(\01326.google.c"
          + "loud.recommendationengine.v1beta1.InputC"
          + "onfigB\003\340A\002\022Y\n\rerrors_config\030\004 \001(\0132=.goog"
          + "le.cloud.recommendationengine.v1beta1.Im"
          + "portErrorsConfigB\003\340A\001\"\250\002\n\027ImportUserEven"
          + "tsRequest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\n.recom"
          + "mendationengine.googleapis.com/EventStor"
          + "e\022\027\n\nrequest_id\030\002 \001(\tB\003\340A\001\022Q\n\014input_conf"
          + "ig\030\003 \001(\01326.google.cloud.recommendationen"
          + "gine.v1beta1.InputConfigB\003\340A\002\022Y\n\rerrors_"
          + "config\030\004 \001(\0132=.google.cloud.recommendati"
          + "onengine.v1beta1.ImportErrorsConfigB\003\340A\001"
          + "\"\252\002\n\013InputConfig\022_\n\025catalog_inline_sourc"
          + "e\030\001 \001(\0132>.google.cloud.recommendationeng"
          + "ine.v1beta1.CatalogInlineSourceH\000\022J\n\ngcs"
          + "_source\030\002 \001(\01324.google.cloud.recommendat"
          + "ionengine.v1beta1.GcsSourceH\000\022d\n\030user_ev"
          + "ent_inline_source\030\003 \001(\0132@.google.cloud.r"
          + "ecommendationengine.v1beta1.UserEventInl"
          + "ineSourceH\000B\010\n\006source\"\314\001\n\016ImportMetadata"
          + "\022\026\n\016operation_name\030\005 \001(\t\022\022\n\nrequest_id\030\003"
          + " \001(\t\022/\n\013create_time\030\004 \001(\0132\032.google.proto"
          + "buf.Timestamp\022\025\n\rsuccess_count\030\001 \001(\003\022\025\n\r"
          + "failure_count\030\002 \001(\003\022/\n\013update_time\030\006 \001(\013"
          + "2\032.google.protobuf.Timestamp\"\235\001\n\032ImportC"
          + "atalogItemsResponse\022)\n\rerror_samples\030\001 \003"
          + "(\0132\022.google.rpc.Status\022T\n\rerrors_config\030"
          + "\002 \001(\0132=.google.cloud.recommendationengin"
          + "e.v1beta1.ImportErrorsConfig\"\366\001\n\030ImportU"
          + "serEventsResponse\022)\n\rerror_samples\030\001 \003(\013"
          + "2\022.google.rpc.Status\022T\n\rerrors_config\030\002 "
          + "\001(\0132=.google.cloud.recommendationengine."
          + "v1beta1.ImportErrorsConfig\022Y\n\016import_sum"
          + "mary\030\003 \001(\0132A.google.cloud.recommendation"
          + "engine.v1beta1.UserEventImportSummary\"T\n"
          + "\026UserEventImportSummary\022\033\n\023joined_events"
          + "_count\030\001 \001(\003\022\035\n\025unjoined_events_count\030\002 "
          + "\001(\003B\243\002\n-com.google.cloud.recommendatione"
          + "ngine.v1beta1P\001Zacloud.google.com/go/rec"
          + "ommendationengine/apiv1beta1/recommendat"
          + "ionenginepb;recommendationenginepb\242\002\005REC"
          + "AI\252\002)Google.Cloud.RecommendationEngine.V"
          + "1Beta1\312\002)Google\\Cloud\\RecommendationEngi"
          + "ne\\V1beta1\352\002,Google::Cloud::Recommendati"
          + "onEngine::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.Catalog.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.RecommendationengineResources
                  .getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_CatalogInlineSource_descriptor,
            new java.lang.String[] {
              "CatalogItems",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_UserEventInlineSource_descriptor,
            new java.lang.String[] {
              "UserEvents",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ImportErrorsConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommendationengine_v1beta1_ImportErrorsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ImportErrorsConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RequestId", "InputConfig", "ErrorsConfig",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RequestId", "InputConfig", "ErrorsConfig",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommendationengine_v1beta1_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_InputConfig_descriptor,
            new java.lang.String[] {
              "CatalogInlineSource", "GcsSource", "UserEventInlineSource", "Source",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ImportMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_recommendationengine_v1beta1_ImportMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ImportMetadata_descriptor,
            new java.lang.String[] {
              "OperationName",
              "RequestId",
              "CreateTime",
              "SuccessCount",
              "FailureCount",
              "UpdateTime",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ImportCatalogItemsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ImportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "ImportSummary",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_UserEventImportSummary_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_recommendationengine_v1beta1_UserEventImportSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_UserEventImportSummary_descriptor,
            new java.lang.String[] {
              "JoinedEventsCount", "UnjoinedEventsCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.Catalog.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.RecommendationengineResources.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
