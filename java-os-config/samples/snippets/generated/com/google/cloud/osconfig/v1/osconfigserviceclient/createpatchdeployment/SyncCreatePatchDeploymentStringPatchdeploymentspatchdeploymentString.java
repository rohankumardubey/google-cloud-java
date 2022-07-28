/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.osconfig.v1.samples;

// [START osconfig_v1_generated_osconfigserviceclient_createpatchdeployment_stringpatchdeploymentspatchdeploymentstring_sync]
import com.google.cloud.osconfig.v1.OsConfigServiceClient;
import com.google.cloud.osconfig.v1.PatchDeployments;
import com.google.cloud.osconfig.v1.ProjectName;

public class SyncCreatePatchDeploymentStringPatchdeploymentspatchdeploymentString {

  public static void main(String[] args) throws Exception {
    syncCreatePatchDeploymentStringPatchdeploymentspatchdeploymentString();
  }

  public static void syncCreatePatchDeploymentStringPatchdeploymentspatchdeploymentString()
      throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (OsConfigServiceClient osConfigServiceClient = OsConfigServiceClient.create()) {
      String parent = ProjectName.of("[PROJECT]").toString();
      PatchDeployments.PatchDeployment patchDeployment =
          PatchDeployments.PatchDeployment.newBuilder().build();
      String patchDeploymentId = "patchDeploymentId-1180405976";
      PatchDeployments.PatchDeployment response =
          osConfigServiceClient.createPatchDeployment(parent, patchDeployment, patchDeploymentId);
    }
  }
}
// [END osconfig_v1_generated_osconfigserviceclient_createpatchdeployment_stringpatchdeploymentspatchdeploymentstring_sync]
