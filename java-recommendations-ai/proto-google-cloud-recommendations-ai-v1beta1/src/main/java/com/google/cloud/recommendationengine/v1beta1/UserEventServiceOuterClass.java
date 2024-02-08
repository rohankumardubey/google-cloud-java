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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.recommendationengine.v1beta1;

public final class UserEventServiceOuterClass {
  private UserEventServiceOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/cloud/recommendationengine/v1be"
          + "ta1/user_event_service.proto\022)google.clo"
          + "ud.recommendationengine.v1beta1\032\034google/"
          + "api/annotations.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/httpbody.prot"
          + "o\032\031google/api/resource.proto\0326google/clo"
          + "ud/recommendationengine/v1beta1/import.p"
          + "roto\032:google/cloud/recommendationengine/"
          + "v1beta1/user_event.proto\032#google/longrun"
          + "ning/operations.proto\032\037google/protobuf/t"
          + "imestamp.proto\032\027google/api/client.proto\""
          + "\211\001\n\026PurgeUserEventsRequest\022F\n\006parent\030\001 \001"
          + "(\tB6\340A\002\372A0\n.recommendationengine.googlea"
          + "pis.com/EventStore\022\023\n\006filter\030\002 \001(\tB\003\340A\002\022"
          + "\022\n\005force\030\003 \001(\010B\003\340A\001\"b\n\027PurgeUserEventsMe"
          + "tadata\022\026\n\016operation_name\030\001 \001(\t\022/\n\013create"
          + "_time\030\002 \001(\0132\032.google.protobuf.Timestamp\""
          + "\210\001\n\027PurgeUserEventsResponse\022\033\n\023purged_ev"
          + "ents_count\030\001 \001(\003\022P\n\022user_events_sample\030\002"
          + " \003(\01324.google.cloud.recommendationengine"
          + ".v1beta1.UserEvent\"\256\001\n\025WriteUserEventReq"
          + "uest\022F\n\006parent\030\001 \001(\tB6\340A\002\372A0\n.recommenda"
          + "tionengine.googleapis.com/EventStore\022M\n\n"
          + "user_event\030\002 \001(\01324.google.cloud.recommen"
          + "dationengine.v1beta1.UserEventB\003\340A\002\"\236\001\n\027"
          + "CollectUserEventRequest\022F\n\006parent\030\001 \001(\tB"
          + "6\340A\002\372A0\n.recommendationengine.googleapis"
          + ".com/EventStore\022\027\n\nuser_event\030\002 \001(\tB\003\340A\002"
          + "\022\020\n\003uri\030\003 \001(\tB\003\340A\001\022\020\n\003ets\030\004 \001(\003B\003\340A\001\"\245\001\n"
          + "\025ListUserEventsRequest\022F\n\006parent\030\001 \001(\tB6"
          + "\340A\002\372A0\n.recommendationengine.googleapis."
          + "com/EventStore\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027"
          + "\n\npage_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB"
          + "\003\340A\001\"|\n\026ListUserEventsResponse\022I\n\013user_e"
          + "vents\030\001 \003(\01324.google.cloud.recommendatio"
          + "nengine.v1beta1.UserEvent\022\027\n\017next_page_t"
          + "oken\030\002 \001(\t2\330\014\n\020UserEventService\022\204\002\n\016Writ"
          + "eUserEvent\022@.google.cloud.recommendation"
          + "engine.v1beta1.WriteUserEventRequest\0324.g"
          + "oogle.cloud.recommendationengine.v1beta1"
          + ".UserEvent\"z\332A\021parent,user_event\202\323\344\223\002`\"R"
          + "/v1beta1/{parent=projects/*/locations/*/"
          + "catalogs/*/eventStores/*}/userEvents:wri"
          + "te:\nuser_event\022\346\001\n\020CollectUserEvent\022B.go"
          + "ogle.cloud.recommendationengine.v1beta1."
          + "CollectUserEventRequest\032\024.google.api.Htt"
          + "pBody\"x\332A\031parent,user_event,uri,ets\202\323\344\223\002"
          + "V\022T/v1beta1/{parent=projects/*/locations"
          + "/*/catalogs/*/eventStores/*}/userEvents:"
          + "collect\022\373\001\n\016ListUserEvents\022@.google.clou"
          + "d.recommendationengine.v1beta1.ListUserE"
          + "ventsRequest\032A.google.cloud.recommendati"
          + "onengine.v1beta1.ListUserEventsResponse\""
          + "d\332A\rparent,filter\202\323\344\223\002N\022L/v1beta1/{paren"
          + "t=projects/*/locations/*/catalogs/*/even"
          + "tStores/*}/userEvents\022\363\002\n\017PurgeUserEvent"
          + "s\022A.google.cloud.recommendationengine.v1"
          + "beta1.PurgeUserEventsRequest\032\035.google.lo"
          + "ngrunning.Operation\"\375\001\312A\206\001\nAgoogle.cloud"
          + ".recommendationengine.v1beta1.PurgeUserE"
          + "ventsResponse\022Agoogle.cloud.recommendati"
          + "onengine.v1beta1.PurgeUserEventsMetadata"
          + "\332A\023parent,filter,force\202\323\344\223\002W\"R/v1beta1/{"
          + "parent=projects/*/locations/*/catalogs/*"
          + "/eventStores/*}/userEvents:purge:\001*\022\206\003\n\020"
          + "ImportUserEvents\022B.google.cloud.recommen"
          + "dationengine.v1beta1.ImportUserEventsReq"
          + "uest\032\035.google.longrunning.Operation\"\216\002\312A"
          + "~\nBgoogle.cloud.recommendationengine.v1b"
          + "eta1.ImportUserEventsResponse\0228google.cl"
          + "oud.recommendationengine.v1beta1.ImportM"
          + "etadata\332A,parent,request_id,input_config"
          + ",errors_config\202\323\344\223\002X\"S/v1beta1/{parent=p"
          + "rojects/*/locations/*/catalogs/*/eventSt"
          + "ores/*}/userEvents:import:\001*\032W\312A#recomme"
          + "ndationengine.googleapis.com\322A.https://w"
          + "ww.googleapis.com/auth/cloud-platformB\243\002"
          + "\n-com.google.cloud.recommendationengine."
          + "v1beta1P\001Zacloud.google.com/go/recommend"
          + "ationengine/apiv1beta1/recommendationeng"
          + "inepb;recommendationenginepb\242\002\005RECAI\252\002)G"
          + "oogle.Cloud.RecommendationEngine.V1Beta1"
          + "\312\002)Google\\Cloud\\RecommendationEngine\\V1b"
          + "eta1\352\002,Google::Cloud::RecommendationEngi"
          + "ne::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.Import.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "Force",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "OperationName", "CreateTime",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PurgeUserEventsResponse_descriptor,
            new java.lang.String[] {
              "PurgedEventsCount", "UserEventsSample",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_WriteUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_CollectUserEventRequest_descriptor,
            new java.lang.String[] {
              "Parent", "UserEvent", "Uri", "Ets",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListUserEventsResponse_descriptor,
            new java.lang.String[] {
              "UserEvents", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.Import.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.UserEventOuterClass.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
