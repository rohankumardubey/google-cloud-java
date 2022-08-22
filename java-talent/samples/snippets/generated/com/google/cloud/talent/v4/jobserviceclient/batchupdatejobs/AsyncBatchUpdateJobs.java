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

package com.google.cloud.talent.v4.samples;

// [START talent_v4_generated_jobserviceclient_batchupdatejobs_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.talent.v4.BatchUpdateJobsRequest;
import com.google.cloud.talent.v4.Job;
import com.google.cloud.talent.v4.JobServiceClient;
import com.google.cloud.talent.v4.TenantName;
import com.google.longrunning.Operation;
import com.google.protobuf.FieldMask;
import java.util.ArrayList;

public class AsyncBatchUpdateJobs {

  public static void main(String[] args) throws Exception {
    asyncBatchUpdateJobs();
  }

  public static void asyncBatchUpdateJobs() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (JobServiceClient jobServiceClient = JobServiceClient.create()) {
      BatchUpdateJobsRequest request =
          BatchUpdateJobsRequest.newBuilder()
              .setParent(TenantName.of("[PROJECT]", "[TENANT]").toString())
              .addAllJobs(new ArrayList<Job>())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<Operation> future = jobServiceClient.batchUpdateJobsCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END talent_v4_generated_jobserviceclient_batchupdatejobs_async]
