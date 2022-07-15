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

package com.google.cloud.gkehub.v1alpha2.samples;

// [START gkehub_v1alpha2_generated_gkehubclient_createmembership_sync]
import com.google.cloud.gkehub.v1alpha2.CreateMembershipRequest;
import com.google.cloud.gkehub.v1alpha2.GkeHubClient;
import com.google.cloud.gkehub.v1alpha2.LocationName;
import com.google.cloud.gkehub.v1alpha2.Membership;

public class SyncCreateMembership {

  public static void main(String[] args) throws Exception {
    syncCreateMembership();
  }

  public static void syncCreateMembership() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (GkeHubClient gkeHubClient = GkeHubClient.create()) {
      CreateMembershipRequest request =
          CreateMembershipRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setMembershipId("membershipId517665681")
              .setResource(Membership.newBuilder().build())
              .build();
      Membership response = gkeHubClient.createMembershipAsync(request).get();
    }
  }
}
// [END gkehub_v1alpha2_generated_gkehubclient_createmembership_sync]