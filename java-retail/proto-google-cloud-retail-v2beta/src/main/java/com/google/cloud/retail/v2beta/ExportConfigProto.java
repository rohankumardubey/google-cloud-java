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
// source: google/cloud/retail/v2beta/export_config.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.retail.v2beta;

public final class ExportConfigProto {
  private ExportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_OutputConfig_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_OutputConfig_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_OutputConfig_BigQueryDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_OutputConfig_BigQueryDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ExportErrorsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ExportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ExportMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ExportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ExportProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ExportProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ExportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ExportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_OutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_OutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_BigQueryOutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_BigQueryOutputResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_GcsOutputResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_GcsOutputResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/retail/v2beta/export_conf"
          + "ig.proto\022\032google.cloud.retail.v2beta\032\037go"
          + "ogle/api/field_behavior.proto\032\031google/ap"
          + "i/resource.proto\032\037google/protobuf/timest"
          + "amp.proto\032\027google/rpc/status.proto\"\350\002\n\014O"
          + "utputConfig\022R\n\017gcs_destination\030\001 \001(\01327.g"
          + "oogle.cloud.retail.v2beta.OutputConfig.G"
          + "csDestinationH\000\022\\\n\024bigquery_destination\030"
          + "\002 \001(\0132<.google.cloud.retail.v2beta.Outpu"
          + "tConfig.BigQueryDestinationH\000\0320\n\016GcsDest"
          + "ination\022\036\n\021output_uri_prefix\030\001 \001(\tB\003\340A\002\032"
          + "e\n\023BigQueryDestination\022\027\n\ndataset_id\030\001 \001"
          + "(\tB\003\340A\002\022\034\n\017table_id_prefix\030\002 \001(\tB\003\340A\002\022\027\n"
          + "\ntable_type\030\003 \001(\tB\003\340A\002B\r\n\013destination\"9\n"
          + "\022ExportErrorsConfig\022\024\n\ngcs_prefix\030\001 \001(\tH"
          + "\000B\r\n\013destination\"\213\001\n\035ExportAnalyticsMetr"
          + "icsRequest\022\024\n\007catalog\030\001 \001(\tB\003\340A\002\022D\n\routp"
          + "ut_config\030\002 \001(\0132(.google.cloud.retail.v2"
          + "beta.OutputConfigB\003\340A\002\022\016\n\006filter\030\003 \001(\t\"r"
          + "\n\016ExportMetadata\022/\n\013create_time\030\001 \001(\0132\032."
          + "google.protobuf.Timestamp\022/\n\013update_time"
          + "\030\002 \001(\0132\032.google.protobuf.Timestamp\"\313\001\n\026E"
          + "xportProductsResponse\022)\n\rerror_samples\030\001"
          + " \003(\0132\022.google.rpc.Status\022E\n\rerrors_confi"
          + "g\030\002 \001(\0132..google.cloud.retail.v2beta.Exp"
          + "ortErrorsConfig\022?\n\routput_result\030\003 \001(\0132("
          + ".google.cloud.retail.v2beta.OutputResult"
          + "\"\315\001\n\030ExportUserEventsResponse\022)\n\rerror_s"
          + "amples\030\001 \003(\0132\022.google.rpc.Status\022E\n\rerro"
          + "rs_config\030\002 \001(\0132..google.cloud.retail.v2"
          + "beta.ExportErrorsConfig\022?\n\routput_result"
          + "\030\003 \001(\0132(.google.cloud.retail.v2beta.Outp"
          + "utResult\"\323\001\n\036ExportAnalyticsMetricsRespo"
          + "nse\022)\n\rerror_samples\030\001 \003(\0132\022.google.rpc."
          + "Status\022E\n\rerrors_config\030\002 \001(\0132..google.c"
          + "loud.retail.v2beta.ExportErrorsConfig\022?\n"
          + "\routput_result\030\003 \001(\0132(.google.cloud.reta"
          + "il.v2beta.OutputResult\"\232\001\n\014OutputResult\022"
          + "I\n\017bigquery_result\030\001 \003(\01320.google.cloud."
          + "retail.v2beta.BigQueryOutputResult\022?\n\ngc"
          + "s_result\030\002 \003(\0132+.google.cloud.retail.v2b"
          + "eta.GcsOutputResult\"<\n\024BigQueryOutputRes"
          + "ult\022\022\n\ndataset_id\030\001 \001(\t\022\020\n\010table_id\030\002 \001("
          + "\t\"%\n\017GcsOutputResult\022\022\n\noutput_uri\030\001 \001(\t"
          + "B\320\001\n\036com.google.cloud.retail.v2betaB\021Exp"
          + "ortConfigProtoP\001Z6cloud.google.com/go/re"
          + "tail/apiv2beta/retailpb;retailpb\242\002\006RETAI"
          + "L\252\002\032Google.Cloud.Retail.V2Beta\312\002\032Google\\"
          + "Cloud\\Retail\\V2beta\352\002\035Google::Cloud::Ret"
          + "ail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "Destination",
            });
    internal_static_google_cloud_retail_v2beta_OutputConfig_GcsDestination_descriptor =
        internal_static_google_cloud_retail_v2beta_OutputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_retail_v2beta_OutputConfig_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_OutputConfig_GcsDestination_descriptor,
            new java.lang.String[] {
              "OutputUriPrefix",
            });
    internal_static_google_cloud_retail_v2beta_OutputConfig_BigQueryDestination_descriptor =
        internal_static_google_cloud_retail_v2beta_OutputConfig_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_retail_v2beta_OutputConfig_BigQueryDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_OutputConfig_BigQueryDestination_descriptor,
            new java.lang.String[] {
              "DatasetId", "TableIdPrefix", "TableType",
            });
    internal_static_google_cloud_retail_v2beta_ExportErrorsConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_ExportErrorsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ExportErrorsConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsRequest_descriptor,
            new java.lang.String[] {
              "Catalog", "OutputConfig", "Filter",
            });
    internal_static_google_cloud_retail_v2beta_ExportMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2beta_ExportMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ExportMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_retail_v2beta_ExportProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2beta_ExportProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ExportProductsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "OutputResult",
            });
    internal_static_google_cloud_retail_v2beta_ExportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2beta_ExportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ExportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "OutputResult",
            });
    internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_ExportAnalyticsMetricsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "OutputResult",
            });
    internal_static_google_cloud_retail_v2beta_OutputResult_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2beta_OutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_OutputResult_descriptor,
            new java.lang.String[] {
              "BigqueryResult", "GcsResult",
            });
    internal_static_google_cloud_retail_v2beta_BigQueryOutputResult_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_retail_v2beta_BigQueryOutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_BigQueryOutputResult_descriptor,
            new java.lang.String[] {
              "DatasetId", "TableId",
            });
    internal_static_google_cloud_retail_v2beta_GcsOutputResult_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_retail_v2beta_GcsOutputResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_GcsOutputResult_descriptor,
            new java.lang.String[] {
              "OutputUri",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
