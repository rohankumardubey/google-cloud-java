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
// source: google/cloud/securitycenter/v1/effective_security_health_analytics_custom_module.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.securitycenter.v1;

public final class EffectiveSecurityHealthAnalyticsCustomModuleProto {
  private EffectiveSecurityHealthAnalyticsCustomModuleProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_EffectiveSecurityHealthAnalyticsCustomModule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_EffectiveSecurityHealthAnalyticsCustomModule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nVgoogle/cloud/securitycenter/v1/effecti"
          + "ve_security_health_analytics_custom_modu"
          + "le.proto\022\036google.cloud.securitycenter.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032Lgoogle/cloud/secur"
          + "itycenter/v1/security_health_analytics_c"
          + "ustom_config.proto\"\375\005\n,EffectiveSecurity"
          + "HealthAnalyticsCustomModule\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\003\022H\n\rcustom_config\030\002 \001(\0132,.google.c"
          + "loud.securitycenter.v1.CustomConfigB\003\340A\003"
          + "\022{\n\020enablement_state\030\003 \001(\0162\\.google.clou"
          + "d.securitycenter.v1.EffectiveSecurityHea"
          + "lthAnalyticsCustomModule.EnablementState"
          + "B\003\340A\003\022\031\n\014display_name\030\004 \001(\tB\003\340A\003\"N\n\017Enab"
          + "lementState\022 \n\034ENABLEMENT_STATE_UNSPECIF"
          + "IED\020\000\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002:\207\003\352A\203\003\n"
          + "Jsecuritycenter.googleapis.com/Effective"
          + "SecurityHealthAnalyticsCustomModule\022morg"
          + "anizations/{organization}/securityHealth"
          + "AnalyticsSettings/effectiveCustomModules"
          + "/{effective_custom_module}\022afolders/{fol"
          + "der}/securityHealthAnalyticsSettings/eff"
          + "ectiveCustomModules/{effective_custom_mo"
          + "dule}\022cprojects/{project}/securityHealth"
          + "AnalyticsSettings/effectiveCustomModules"
          + "/{effective_custom_module}B\213\002\n\"com.googl"
          + "e.cloud.securitycenter.v1B1EffectiveSecu"
          + "rityHealthAnalyticsCustomModuleProtoP\001ZJ"
          + "cloud.google.com/go/securitycenter/apiv1"
          + "/securitycenterpb;securitycenterpb\252\002\036Goo"
          + "gle.Cloud.SecurityCenter.V1\312\002\036Google\\Clo"
          + "ud\\SecurityCenter\\V1\352\002!Google::Cloud::Se"
          + "curityCenter::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomConfigProto
                  .getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v1_EffectiveSecurityHealthAnalyticsCustomModule_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_EffectiveSecurityHealthAnalyticsCustomModule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_EffectiveSecurityHealthAnalyticsCustomModule_descriptor,
            new java.lang.String[] {
              "Name", "CustomConfig", "EnablementState", "DisplayName",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.securitycenter.v1.SecurityHealthAnalyticsCustomConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
