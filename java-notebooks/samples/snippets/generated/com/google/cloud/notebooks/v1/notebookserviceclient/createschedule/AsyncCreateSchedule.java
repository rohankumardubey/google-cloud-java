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

package com.google.cloud.notebooks.v1.samples;

// [START notebooks_v1_generated_notebookserviceclient_createschedule_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.notebooks.v1.CreateScheduleRequest;
import com.google.cloud.notebooks.v1.NotebookServiceClient;
import com.google.cloud.notebooks.v1.Schedule;
import com.google.cloud.notebooks.v1.ScheduleName;
import com.google.longrunning.Operation;

public class AsyncCreateSchedule {

  public static void main(String[] args) throws Exception {
    asyncCreateSchedule();
  }

  public static void asyncCreateSchedule() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NotebookServiceClient notebookServiceClient = NotebookServiceClient.create()) {
      CreateScheduleRequest request =
          CreateScheduleRequest.newBuilder()
              .setParent(ScheduleName.of("[PROJECT]", "[LOCATION]", "[SCHEDULE]").toString())
              .setScheduleId("scheduleId-687058414")
              .setSchedule(Schedule.newBuilder().build())
              .build();
      ApiFuture<Operation> future =
          notebookServiceClient.createScheduleCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END notebooks_v1_generated_notebookserviceclient_createschedule_async]
