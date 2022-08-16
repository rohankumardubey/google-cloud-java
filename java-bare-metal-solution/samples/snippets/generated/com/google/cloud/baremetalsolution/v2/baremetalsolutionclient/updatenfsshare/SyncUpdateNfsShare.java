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

package com.google.cloud.baremetalsolution.v2.samples;

// [START baremetalsolution_v2_generated_baremetalsolutionclient_updatenfsshare_sync]
import com.google.cloud.baremetalsolution.v2.BareMetalSolutionClient;
import com.google.cloud.baremetalsolution.v2.NfsShare;
import com.google.cloud.baremetalsolution.v2.UpdateNfsShareRequest;
import com.google.protobuf.FieldMask;

public class SyncUpdateNfsShare {

  public static void main(String[] args) throws Exception {
    syncUpdateNfsShare();
  }

  public static void syncUpdateNfsShare() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (BareMetalSolutionClient bareMetalSolutionClient = BareMetalSolutionClient.create()) {
      UpdateNfsShareRequest request =
          UpdateNfsShareRequest.newBuilder()
              .setNfsShare(NfsShare.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      NfsShare response = bareMetalSolutionClient.updateNfsShareAsync(request).get();
    }
  }
}
// [END baremetalsolution_v2_generated_baremetalsolutionclient_updatenfsshare_sync]
