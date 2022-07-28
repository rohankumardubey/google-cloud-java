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

package com.google.cloud.securitycenter.v1.samples;

// [START securitycenter_v1_generated_securitycenterclient_getiampolicy_string_sync]
import com.google.cloud.securitycenter.v1.FolderName;
import com.google.cloud.securitycenter.v1.SecurityCenterClient;
import com.google.iam.v1.Policy;

public class SyncGetIamPolicyString {

  public static void main(String[] args) throws Exception {
    syncGetIamPolicyString();
  }

  public static void syncGetIamPolicyString() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      String resource = FolderName.of("[FOLDER]").toString();
      Policy response = securityCenterClient.getIamPolicy(resource);
    }
  }
}
// [END securitycenter_v1_generated_securitycenterclient_getiampolicy_string_sync]