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

package com.google.cloud.securitycenter.v1p1beta1.samples;

// [START securitycenter_v1p1beta1_generated_securitycenterclient_groupfindings_sync]
import com.google.cloud.securitycenter.v1p1beta1.GroupFindingsRequest;
import com.google.cloud.securitycenter.v1p1beta1.GroupResult;
import com.google.cloud.securitycenter.v1p1beta1.SecurityCenterClient;
import com.google.cloud.securitycenter.v1p1beta1.SourceName;
import com.google.protobuf.Duration;
import com.google.protobuf.Timestamp;

public class SyncGroupFindings {

  public static void main(String[] args) throws Exception {
    syncGroupFindings();
  }

  public static void syncGroupFindings() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      GroupFindingsRequest request =
          GroupFindingsRequest.newBuilder()
              .setParent(
                  SourceName.ofOrganizationSourceName("[ORGANIZATION]", "[SOURCE]").toString())
              .setFilter("filter-1274492040")
              .setGroupBy("groupBy293428022")
              .setReadTime(Timestamp.newBuilder().build())
              .setCompareDuration(Duration.newBuilder().build())
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      for (GroupResult element : securityCenterClient.groupFindings(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END securitycenter_v1p1beta1_generated_securitycenterclient_groupfindings_sync]