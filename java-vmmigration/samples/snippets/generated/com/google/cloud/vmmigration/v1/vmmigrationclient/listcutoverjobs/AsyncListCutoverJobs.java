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

package com.google.cloud.vmmigration.v1.samples;

// [START vmmigration_v1_generated_vmmigrationclient_listcutoverjobs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vmmigration.v1.CutoverJob;
import com.google.cloud.vmmigration.v1.ListCutoverJobsRequest;
import com.google.cloud.vmmigration.v1.MigratingVmName;
import com.google.cloud.vmmigration.v1.VmMigrationClient;

public class AsyncListCutoverJobs {

  public static void main(String[] args) throws Exception {
    asyncListCutoverJobs();
  }

  public static void asyncListCutoverJobs() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (VmMigrationClient vmMigrationClient = VmMigrationClient.create()) {
      ListCutoverJobsRequest request =
          ListCutoverJobsRequest.newBuilder()
              .setParent(
                  MigratingVmName.of("[PROJECT]", "[LOCATION]", "[SOURCE]", "[MIGRATING_VM]")
                      .toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      ApiFuture<CutoverJob> future =
          vmMigrationClient.listCutoverJobsPagedCallable().futureCall(request);
      // Do something.
      for (CutoverJob element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END vmmigration_v1_generated_vmmigrationclient_listcutoverjobs_async]
