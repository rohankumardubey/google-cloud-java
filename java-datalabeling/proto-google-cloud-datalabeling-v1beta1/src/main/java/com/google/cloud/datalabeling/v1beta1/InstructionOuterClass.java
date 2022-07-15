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
// source: google/cloud/datalabeling/v1beta1/instruction.proto

package com.google.cloud.datalabeling.v1beta1;

public final class InstructionOuterClass {
  private InstructionOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Instruction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Instruction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/datalabeling/v1beta1/inst"
          + "ruction.proto\022!google.cloud.datalabeling"
          + ".v1beta1\032\034google/api/annotations.proto\032\031"
          + "google/api/resource.proto\032/google/cloud/"
          + "datalabeling/v1beta1/dataset.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\375\003\n\013Instruct"
          + "ion\022\014\n\004name\030\001 \001(\t\022\024\n\014display_name\030\002 \001(\t\022"
          + "\023\n\013description\030\003 \001(\t\022/\n\013create_time\030\004 \001("
          + "\0132\032.google.protobuf.Timestamp\022/\n\013update_"
          + "time\030\005 \001(\0132\032.google.protobuf.Timestamp\022>"
          + "\n\tdata_type\030\006 \001(\0162+.google.cloud.datalab"
          + "eling.v1beta1.DataType\022N\n\017csv_instructio"
          + "n\030\007 \001(\01321.google.cloud.datalabeling.v1be"
          + "ta1.CsvInstructionB\002\030\001\022J\n\017pdf_instructio"
          + "n\030\t \001(\01321.google.cloud.datalabeling.v1be"
          + "ta1.PdfInstruction\022\032\n\022blocking_resources"
          + "\030\n \003(\t:[\352AX\n\'datalabeling.googleapis.com"
          + "/Instruction\022-projects/{project}/instruc"
          + "tions/{instruction}\"&\n\016CsvInstruction\022\024\n"
          + "\014gcs_file_uri\030\001 \001(\t\"&\n\016PdfInstruction\022\024\n"
          + "\014gcs_file_uri\030\001 \001(\tB\347\001\n%com.google.cloud"
          + ".datalabeling.v1beta1P\001ZMgoogle.golang.o"
          + "rg/genproto/googleapis/cloud/datalabelin"
          + "g/v1beta1;datalabeling\252\002!Google.Cloud.Da"
          + "taLabeling.V1Beta1\312\002!Google\\Cloud\\DataLa"
          + "beling\\V1beta1\352\002$Google::Cloud::DataLabe"
          + "ling::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_Instruction_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_Instruction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Instruction_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "CreateTime",
              "UpdateTime",
              "DataType",
              "CsvInstruction",
              "PdfInstruction",
              "BlockingResources",
            });
    internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_CsvInstruction_descriptor,
            new java.lang.String[] {
              "GcsFileUri",
            });
    internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_PdfInstruction_descriptor,
            new java.lang.String[] {
              "GcsFileUri",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}