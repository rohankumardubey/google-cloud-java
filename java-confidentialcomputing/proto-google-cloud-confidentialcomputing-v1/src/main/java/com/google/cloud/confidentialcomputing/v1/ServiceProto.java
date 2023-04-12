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
// source: google/cloud/confidentialcomputing/v1/service.proto

package com.google.cloud.confidentialcomputing.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_Challenge_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_Challenge_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/confidentialcomputing/v1/"
          + "service.proto\022%google.cloud.confidential"
          + "computing.v1\032\034google/api/annotations.pro"
          + "to\032\027google/api/client.proto\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032\037google/protobuf/timestamp.proto"
          + "\"\245\002\n\tChallenge\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013cre"
          + "ate_time\030\002 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\0224\n\013expire_time\030\003 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\022\021\n\004used\030\004 \001(\010B\003\340A\003"
          + "\022\026\n\ttpm_nonce\030\006 \001(\tB\003\340A\003:n\352Ak\n.confident"
          + "ialcomputing.googleapis.com/Challenge\0229p"
          + "rojects/{project}/locations/{location}/c"
          + "hallenges/{uuid}\"\235\001\n\026CreateChallengeRequ"
          + "est\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.g"
          + "oogleapis.com/Location\022H\n\tchallenge\030\002 \001("
          + "\01320.google.cloud.confidentialcomputing.v"
          + "1.ChallengeB\003\340A\002\"\217\002\n\030VerifyAttestationRe"
          + "quest\022I\n\tchallenge\030\001 \001(\tB6\340A\002\372A0\n.confid"
          + "entialcomputing.googleapis.com/Challenge"
          + "\022S\n\017gcp_credentials\030\002 \001(\01325.google.cloud"
          + ".confidentialcomputing.v1.GcpCredentials"
          + "B\003\340A\001\022S\n\017tpm_attestation\030\003 \001(\01325.google."
          + "cloud.confidentialcomputing.v1.TpmAttest"
          + "ationB\003\340A\002\";\n\031VerifyAttestationResponse\022"
          + "\036\n\021oidc_claims_token\030\002 \001(\tB\003\340A\003\"3\n\016GcpCr"
          + "edentials\022!\n\031service_account_id_tokens\030\002"
          + " \003(\t\"\217\003\n\016TpmAttestation\022K\n\006quotes\030\001 \003(\0132"
          + ";.google.cloud.confidentialcomputing.v1."
          + "TpmAttestation.Quote\022\025\n\rtcg_event_log\030\002 "
          + "\001(\014\022\033\n\023canonical_event_log\030\003 \001(\014\022\017\n\007ak_c"
          + "ert\030\004 \001(\014\022\022\n\ncert_chain\030\005 \003(\014\032\326\001\n\005Quote\022"
          + "\021\n\thash_algo\030\001 \001(\005\022^\n\npcr_values\030\002 \003(\0132J"
          + ".google.cloud.confidentialcomputing.v1.T"
          + "pmAttestation.Quote.PcrValuesEntry\022\021\n\tra"
          + "w_quote\030\003 \001(\014\022\025\n\rraw_signature\030\004 \001(\014\0320\n\016"
          + "PcrValuesEntry\022\013\n\003key\030\001 \001(\005\022\r\n\005value\030\002 \001"
          + "(\014:\0028\0012\267\004\n\025ConfidentialComputing\022\330\001\n\017Cre"
          + "ateChallenge\022=.google.cloud.confidential"
          + "computing.v1.CreateChallengeRequest\0320.go"
          + "ogle.cloud.confidentialcomputing.v1.Chal"
          + "lenge\"T\202\323\344\223\002;\"./v1/{parent=projects/*/lo"
          + "cations/*}/challenges:\tchallenge\332A\020paren"
          + "t,challenge\022\350\001\n\021VerifyAttestation\022?.goog"
          + "le.cloud.confidentialcomputing.v1.Verify"
          + "AttestationRequest\032@.google.cloud.confid"
          + "entialcomputing.v1.VerifyAttestationResp"
          + "onse\"P\202\323\344\223\002J\"E/v1/{challenge=projects/*/"
          + "locations/*/challenges/*}:verifyAttestat"
          + "ion:\001*\032X\312A$confidentialcomputing.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\227\002\n)com.google.cloud.co"
          + "nfidentialcomputing.v1B\014ServiceProtoP\001Z_"
          + "cloud.google.com/go/confidentialcomputin"
          + "g/apiv1/confidentialcomputingpb;confiden"
          + "tialcomputingpb\252\002%Google.Cloud.Confident"
          + "ialComputing.V1\312\002%Google\\Cloud\\Confident"
          + "ialComputing\\V1\352\002(Google::Cloud::Confide"
          + "ntialComputing::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_confidentialcomputing_v1_Challenge_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_confidentialcomputing_v1_Challenge_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_Challenge_descriptor,
            new java.lang.String[] {
              "Name", "CreateTime", "ExpireTime", "Used", "TpmNonce",
            });
    internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_CreateChallengeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Challenge",
            });
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationRequest_descriptor,
            new java.lang.String[] {
              "Challenge", "GcpCredentials", "TpmAttestation",
            });
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_VerifyAttestationResponse_descriptor,
            new java.lang.String[] {
              "OidcClaimsToken",
            });
    internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_GcpCredentials_descriptor,
            new java.lang.String[] {
              "ServiceAccountIdTokens",
            });
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor,
            new java.lang.String[] {
              "Quotes", "TcgEventLog", "CanonicalEventLog", "AkCert", "CertChain",
            });
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor =
        internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor,
            new java.lang.String[] {
              "HashAlgo", "PcrValues", "RawQuote", "RawSignature",
            });
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_descriptor =
        internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_confidentialcomputing_v1_TpmAttestation_Quote_PcrValuesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
