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
// source: google/maps/addressvalidation/v1/address_validation_service.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.addressvalidation.v1;

public final class AddressValidationServiceProto {
  private AddressValidationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_ValidationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_ValidationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_addressvalidation_v1_Verdict_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_addressvalidation_v1_Verdict_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/maps/addressvalidation/v1/addre"
          + "ss_validation_service.proto\022 google.maps"
          + ".addressvalidation.v1\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\032\037go"
          + "ogle/api/field_behavior.proto\032.google/ma"
          + "ps/addressvalidation/v1/address.proto\032.g"
          + "oogle/maps/addressvalidation/v1/geocode."
          + "proto\032/google/maps/addressvalidation/v1/"
          + "metadata.proto\0320google/maps/addressvalid"
          + "ation/v1/usps_data.proto\032 google/type/po"
          + "stal_address.proto\"\202\001\n\026ValidateAddressRe"
          + "quest\0220\n\007address\030\001 \001(\0132\032.google.type.Pos"
          + "talAddressB\003\340A\002\022\034\n\024previous_response_id\030"
          + "\002 \001(\t\022\030\n\020enable_usps_cass\030\003 \001(\010\"r\n\027Valid"
          + "ateAddressResponse\022B\n\006result\030\001 \001(\01322.goo"
          + "gle.maps.addressvalidation.v1.Validation"
          + "Result\022\023\n\013response_id\030\002 \001(\t\"\313\002\n ProvideV"
          + "alidationFeedbackRequest\022p\n\nconclusion\030\001"
          + " \001(\0162W.google.maps.addressvalidation.v1."
          + "ProvideValidationFeedbackRequest.Validat"
          + "ionConclusionB\003\340A\002\022\030\n\013response_id\030\002 \001(\tB"
          + "\003\340A\002\"\232\001\n\024ValidationConclusion\022%\n!VALIDAT"
          + "ION_CONCLUSION_UNSPECIFIED\020\000\022\032\n\026VALIDATE"
          + "D_VERSION_USED\020\001\022\025\n\021USER_VERSION_USED\020\002\022"
          + "\034\n\030UNVALIDATED_VERSION_USED\020\003\022\n\n\006UNUSED\020"
          + "\004\"#\n!ProvideValidationFeedbackResponse\"\312"
          + "\002\n\020ValidationResult\022:\n\007verdict\030\001 \001(\0132).g"
          + "oogle.maps.addressvalidation.v1.Verdict\022"
          + ":\n\007address\030\002 \001(\0132).google.maps.addressva"
          + "lidation.v1.Address\022:\n\007geocode\030\003 \001(\0132).g"
          + "oogle.maps.addressvalidation.v1.Geocode\022"
          + "C\n\010metadata\030\004 \001(\01321.google.maps.addressv"
          + "alidation.v1.AddressMetadata\022=\n\tusps_dat"
          + "a\030\005 \001(\0132*.google.maps.addressvalidation."
          + "v1.UspsData\"\211\004\n\007Verdict\022P\n\021input_granula"
          + "rity\030\001 \001(\01625.google.maps.addressvalidati"
          + "on.v1.Verdict.Granularity\022U\n\026validation_"
          + "granularity\030\002 \001(\01625.google.maps.addressv"
          + "alidation.v1.Verdict.Granularity\022R\n\023geoc"
          + "ode_granularity\030\003 \001(\01625.google.maps.addr"
          + "essvalidation.v1.Verdict.Granularity\022\030\n\020"
          + "address_complete\030\004 \001(\010\022\"\n\032has_unconfirme"
          + "d_components\030\005 \001(\010\022\037\n\027has_inferred_compo"
          + "nents\030\006 \001(\010\022\037\n\027has_replaced_components\030\007"
          + " \001(\010\"\200\001\n\013Granularity\022\033\n\027GRANULARITY_UNSP"
          + "ECIFIED\020\000\022\017\n\013SUB_PREMISE\020\001\022\013\n\007PREMISE\020\002\022"
          + "\025\n\021PREMISE_PROXIMITY\020\003\022\t\n\005BLOCK\020\004\022\t\n\005ROU"
          + "TE\020\005\022\t\n\005OTHER\020\0062\262\003\n\021AddressValidation\022\246\001"
          + "\n\017ValidateAddress\0228.google.maps.addressv"
          + "alidation.v1.ValidateAddressRequest\0329.go"
          + "ogle.maps.addressvalidation.v1.ValidateA"
          + "ddressResponse\"\036\202\323\344\223\002\030\"\023/v1:validateAddr"
          + "ess:\001*\022\316\001\n\031ProvideValidationFeedback\022B.g"
          + "oogle.maps.addressvalidation.v1.ProvideV"
          + "alidationFeedbackRequest\032C.google.maps.a"
          + "ddressvalidation.v1.ProvideValidationFee"
          + "dbackResponse\"(\202\323\344\223\002\"\"\035/v1:provideValida"
          + "tionFeedback:\001*\032#\312A addressvalidation.go"
          + "ogleapis.comB\232\002\n$com.google.maps.address"
          + "validation.v1B\035AddressValidationServiceP"
          + "rotoP\001ZXcloud.google.com/go/maps/address"
          + "validation/apiv1/addressvalidationpb;add"
          + "ressvalidationpb\370\001\001\242\002\007GMPAVV1\252\002 Google.M"
          + "aps.AddressValidation.V1\312\002 Google\\Maps\\A"
          + "ddressValidation\\V1\352\002#Google::Maps::Addr"
          + "essValidation::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.AddressProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.GeocodeProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.MetadataProto.getDescriptor(),
              com.google.maps.addressvalidation.v1.UspsDataProto.getDescriptor(),
              com.google.type.PostalAddressProto.getDescriptor(),
            });
    internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ValidateAddressRequest_descriptor,
            new java.lang.String[] {
              "Address", "PreviousResponseId", "EnableUspsCass",
            });
    internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ValidateAddressResponse_descriptor,
            new java.lang.String[] {
              "Result", "ResponseId",
            });
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackRequest_descriptor,
            new java.lang.String[] {
              "Conclusion", "ResponseId",
            });
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ProvideValidationFeedbackResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_maps_addressvalidation_v1_ValidationResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_maps_addressvalidation_v1_ValidationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_ValidationResult_descriptor,
            new java.lang.String[] {
              "Verdict", "Address", "Geocode", "Metadata", "UspsData",
            });
    internal_static_google_maps_addressvalidation_v1_Verdict_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_maps_addressvalidation_v1_Verdict_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_addressvalidation_v1_Verdict_descriptor,
            new java.lang.String[] {
              "InputGranularity",
              "ValidationGranularity",
              "GeocodeGranularity",
              "AddressComplete",
              "HasUnconfirmedComponents",
              "HasInferredComponents",
              "HasReplacedComponents",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.maps.addressvalidation.v1.AddressProto.getDescriptor();
    com.google.maps.addressvalidation.v1.GeocodeProto.getDescriptor();
    com.google.maps.addressvalidation.v1.MetadataProto.getDescriptor();
    com.google.maps.addressvalidation.v1.UspsDataProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
