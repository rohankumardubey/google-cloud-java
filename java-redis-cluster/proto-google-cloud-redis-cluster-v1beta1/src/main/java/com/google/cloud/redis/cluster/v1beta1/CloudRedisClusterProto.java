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
// source: google/cloud/redis/cluster/v1beta1/cloud_redis_cluster.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.redis.cluster.v1beta1;

public final class CloudRedisClusterProto {
  private CloudRedisClusterProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_CreateClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_CreateClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_ListClustersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_ListClustersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_ListClustersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_ListClustersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_UpdateClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_UpdateClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_GetClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_GetClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_DeleteClusterRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_DeleteClusterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_Cluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_Cluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_UpdateInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_UpdateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_PscConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_PscConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_DiscoveryEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_DiscoveryEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_PscConnection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_PscConnection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_cluster_v1beta1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_cluster_v1beta1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/redis/cluster/v1beta1/clo"
          + "ud_redis_cluster.proto\022\"google.cloud.red"
          + "is.cluster.v1beta1\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\031google/api/r"
          + "esource.proto\032#google/longrunning/operat"
          + "ions.proto\032\031google/protobuf/any.proto\032\033g"
          + "oogle/protobuf/empty.proto\032 google/proto"
          + "buf/field_mask.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\301\001\n\024CreateClusterRequest\0229"
          + "\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.google"
          + "apis.com/Location\022\027\n\ncluster_id\030\002 \001(\tB\003\340"
          + "A\002\022A\n\007cluster\030\003 \001(\0132+.google.cloud.redis"
          + ".cluster.v1beta1.ClusterB\003\340A\002\022\022\n\nrequest"
          + "_id\030\004 \001(\t\"w\n\023ListClustersRequest\0229\n\006pare"
          + "nt\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis.c"
          + "om/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t"
          + "oken\030\003 \001(\t\"\203\001\n\024ListClustersResponse\022=\n\010c"
          + "lusters\030\001 \003(\0132+.google.cloud.redis.clust"
          + "er.v1beta1.Cluster\022\027\n\017next_page_token\030\002 "
          + "\001(\t\022\023\n\013unreachable\030\003 \003(\t\"\243\001\n\024UpdateClust"
          + "erRequest\0224\n\013update_mask\030\001 \001(\0132\032.google."
          + "protobuf.FieldMaskB\003\340A\002\022A\n\007cluster\030\002 \001(\013"
          + "2+.google.cloud.redis.cluster.v1beta1.Cl"
          + "usterB\003\340A\002\022\022\n\nrequest_id\030\003 \001(\t\"G\n\021GetClu"
          + "sterRequest\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034redis"
          + ".googleapis.com/Cluster\"^\n\024DeleteCluster"
          + "Request\0222\n\004name\030\001 \001(\tB$\340A\002\372A\036\n\034redis.goo"
          + "gleapis.com/Cluster\022\022\n\nrequest_id\030\002 \001(\t\""
          + "\327\t\n\007Cluster\022\021\n\004name\030\001 \001(\tB\003\340A\002\0224\n\013create"
          + "_time\030\003 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\022E\n\005state\030\004 \001(\01621.google.cloud.redis"
          + ".cluster.v1beta1.Cluster.StateB\003\340A\003\022\020\n\003u"
          + "id\030\005 \001(\tB\003\340A\003\022\037\n\rreplica_count\030\010 \001(\005B\003\340A"
          + "\001H\000\210\001\001\022V\n\022authorization_mode\030\013 \001(\01625.goo"
          + "gle.cloud.redis.cluster.v1beta1.Authoriz"
          + "ationModeB\003\340A\001\022_\n\027transit_encryption_mod"
          + "e\030\014 \001(\01629.google.cloud.redis.cluster.v1b"
          + "eta1.TransitEncryptionModeB\003\340A\001\022\031\n\007size_"
          + "gb\030\r \001(\005B\003\340A\003H\001\210\001\001\022\035\n\013shard_count\030\016 \001(\005B"
          + "\003\340A\002H\002\210\001\001\022G\n\013psc_configs\030\017 \003(\0132-.google."
          + "cloud.redis.cluster.v1beta1.PscConfigB\003\340"
          + "A\002\022W\n\023discovery_endpoints\030\020 \003(\01325.google"
          + ".cloud.redis.cluster.v1beta1.DiscoveryEn"
          + "dpointB\003\340A\003\022O\n\017psc_connections\030\021 \003(\01321.g"
          + "oogle.cloud.redis.cluster.v1beta1.PscCon"
          + "nectionB\003\340A\003\022N\n\nstate_info\030\022 \001(\01325.googl"
          + "e.cloud.redis.cluster.v1beta1.Cluster.St"
          + "ateInfoB\003\340A\003\032\357\001\n\tStateInfo\022W\n\013update_inf"
          + "o\030\001 \001(\0132@.google.cloud.redis.cluster.v1b"
          + "eta1.Cluster.StateInfo.UpdateInfoH\000\032\200\001\n\n"
          + "UpdateInfo\022\037\n\022target_shard_count\030\001 \001(\005H\000"
          + "\210\001\001\022!\n\024target_replica_count\030\002 \001(\005H\001\210\001\001B\025"
          + "\n\023_target_shard_countB\027\n\025_target_replica"
          + "_countB\006\n\004info\"T\n\005State\022\025\n\021STATE_UNSPECI"
          + "FIED\020\000\022\014\n\010CREATING\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010UPDA"
          + "TING\020\003\022\014\n\010DELETING\020\004:]\352AZ\n\034redis.googlea"
          + "pis.com/Cluster\022:projects/{project}/loca"
          + "tions/{location}/clusters/{cluster}B\020\n\016_"
          + "replica_countB\n\n\010_size_gbB\016\n\014_shard_coun"
          + "t\"!\n\tPscConfig\022\024\n\007network\030\002 \001(\tB\003\340A\002\"\204\001\n"
          + "\021DiscoveryEndpoint\022\024\n\007address\030\001 \001(\tB\003\340A\003"
          + "\022\021\n\004port\030\002 \001(\005B\003\340A\003\022F\n\npsc_config\030\003 \001(\0132"
          + "-.google.cloud.redis.cluster.v1beta1.Psc"
          + "ConfigB\003\340A\003\"\215\001\n\rPscConnection\022\036\n\021psc_con"
          + "nection_id\030\001 \001(\tB\003\340A\003\022\024\n\007address\030\002 \001(\tB\003"
          + "\340A\003\022\034\n\017forwarding_rule\030\003 \001(\tB\003\340A\003\022\027\n\npro"
          + "ject_id\030\004 \001(\tB\003\340A\003\022\017\n\007network\030\005 \001(\t\"\200\002\n\021"
          + "OperationMetadata\0224\n\013create_time\030\001 \001(\0132\032"
          + ".google.protobuf.TimestampB\003\340A\003\0221\n\010end_t"
          + "ime\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340"
          + "A\003\022\033\n\016status_message\030\005 \001(\tB\003\340A\003\022#\n\026reque"
          + "sted_cancellation\030\006 \001(\010B\003\340A\003\022\030\n\013api_vers"
          + "ion\030\007 \001(\tB\003\340A\003*^\n\021AuthorizationMode\022\031\n\025A"
          + "UTH_MODE_UNSPECIFIED\020\000\022\026\n\022AUTH_MODE_IAM_"
          + "AUTH\020\001\022\026\n\022AUTH_MODE_DISABLED\020\002*\231\001\n\025Trans"
          + "itEncryptionMode\022\'\n#TRANSIT_ENCRYPTION_M"
          + "ODE_UNSPECIFIED\020\000\022$\n TRANSIT_ENCRYPTION_"
          + "MODE_DISABLED\020\001\0221\n-TRANSIT_ENCRYPTION_MO"
          + "DE_SERVER_AUTHENTICATION\020\0022\221\t\n\021CloudRedi"
          + "sCluster\022\305\001\n\014ListClusters\0227.google.cloud"
          + ".redis.cluster.v1beta1.ListClustersReque"
          + "st\0328.google.cloud.redis.cluster.v1beta1."
          + "ListClustersResponse\"B\332A\006parent\202\323\344\223\0023\0221/"
          + "v1beta1/{parent=projects/*/locations/*}/"
          + "clusters\022\262\001\n\nGetCluster\0225.google.cloud.r"
          + "edis.cluster.v1beta1.GetClusterRequest\032+"
          + ".google.cloud.redis.cluster.v1beta1.Clus"
          + "ter\"@\332A\004name\202\323\344\223\0023\0221/v1beta1/{name=proje"
          + "cts/*/locations/*/clusters/*}\022\354\001\n\rUpdate"
          + "Cluster\0228.google.cloud.redis.cluster.v1b"
          + "eta1.UpdateClusterRequest\032\035.google.longr"
          + "unning.Operation\"\201\001\312A\036\n\007Cluster\022\023google."
          + "protobuf.Any\332A\023cluster,update_mask\202\323\344\223\002D"
          + "29/v1beta1/{cluster.name=projects/*/loca"
          + "tions/*/clusters/*}:\007cluster\022\331\001\n\rDeleteC"
          + "luster\0228.google.cloud.redis.cluster.v1be"
          + "ta1.DeleteClusterRequest\032\035.google.longru"
          + "nning.Operation\"o\312A,\n\025google.protobuf.Em"
          + "pty\022\023google.protobuf.Any\332A\004name\202\323\344\223\0023*1/"
          + "v1beta1/{name=projects/*/locations/*/clu"
          + "sters/*}\022\351\001\n\rCreateCluster\0228.google.clou"
          + "d.redis.cluster.v1beta1.CreateClusterReq"
          + "uest\032\035.google.longrunning.Operation\"\177\312A\036"
          + "\n\007Cluster\022\023google.protobuf.Any\332A\031parent,"
          + "cluster,cluster_id\202\323\344\223\002<\"1/v1beta1/{pare"
          + "nt=projects/*/locations/*}/clusters:\007clu"
          + "ster\032H\312A\024redis.googleapis.com\322A.https://"
          + "www.googleapis.com/auth/cloud-platformB\204"
          + "\001\n&com.google.cloud.redis.cluster.v1beta"
          + "1B\026CloudRedisClusterProtoP\001Z@cloud.googl"
          + "e.com/go/redis/cluster/apiv1beta1/cluste"
          + "rpb;clusterpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_redis_cluster_v1beta1_CreateClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_redis_cluster_v1beta1_CreateClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_CreateClusterRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ClusterId", "Cluster", "RequestId",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_ListClustersRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_redis_cluster_v1beta1_ListClustersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_ListClustersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_ListClustersResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_redis_cluster_v1beta1_ListClustersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_ListClustersResponse_descriptor,
            new java.lang.String[] {
              "Clusters", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_UpdateClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_redis_cluster_v1beta1_UpdateClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_UpdateClusterRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Cluster", "RequestId",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_GetClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_redis_cluster_v1beta1_GetClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_GetClusterRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_DeleteClusterRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_redis_cluster_v1beta1_DeleteClusterRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_DeleteClusterRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_Cluster_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_redis_cluster_v1beta1_Cluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_Cluster_descriptor,
            new java.lang.String[] {
              "Name",
              "CreateTime",
              "State",
              "Uid",
              "ReplicaCount",
              "AuthorizationMode",
              "TransitEncryptionMode",
              "SizeGb",
              "ShardCount",
              "PscConfigs",
              "DiscoveryEndpoints",
              "PscConnections",
              "StateInfo",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_descriptor =
        internal_static_google_cloud_redis_cluster_v1beta1_Cluster_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_descriptor,
            new java.lang.String[] {
              "UpdateInfo", "Info",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_UpdateInfo_descriptor =
        internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_UpdateInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_Cluster_StateInfo_UpdateInfo_descriptor,
            new java.lang.String[] {
              "TargetShardCount", "TargetReplicaCount",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_PscConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_redis_cluster_v1beta1_PscConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_PscConfig_descriptor,
            new java.lang.String[] {
              "Network",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_DiscoveryEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_redis_cluster_v1beta1_DiscoveryEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_DiscoveryEndpoint_descriptor,
            new java.lang.String[] {
              "Address", "Port", "PscConfig",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_PscConnection_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_redis_cluster_v1beta1_PscConnection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_PscConnection_descriptor,
            new java.lang.String[] {
              "PscConnectionId", "Address", "ForwardingRule", "ProjectId", "Network",
            });
    internal_static_google_cloud_redis_cluster_v1beta1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_redis_cluster_v1beta1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_cluster_v1beta1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
