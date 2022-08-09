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

package com.google.cloud.dialogflow.v2.samples;

// [START dialogflow_v2_generated_intentsclient_listintents_paged_async]
import com.google.cloud.dialogflow.v2.AgentName;
import com.google.cloud.dialogflow.v2.Intent;
import com.google.cloud.dialogflow.v2.IntentView;
import com.google.cloud.dialogflow.v2.IntentsClient;
import com.google.cloud.dialogflow.v2.ListIntentsRequest;
import com.google.cloud.dialogflow.v2.ListIntentsResponse;
import com.google.common.base.Strings;

public class AsyncListIntentsPaged {

  public static void main(String[] args) throws Exception {
    asyncListIntentsPaged();
  }

  public static void asyncListIntentsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (IntentsClient intentsClient = IntentsClient.create()) {
      ListIntentsRequest request =
          ListIntentsRequest.newBuilder()
              .setParent(AgentName.ofProjectName("[PROJECT]").toString())
              .setLanguageCode("languageCode-2092349083")
              .setIntentView(IntentView.forNumber(0))
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListIntentsResponse response = intentsClient.listIntentsCallable().call(request);
        for (Intent element : response.getIntentsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END dialogflow_v2_generated_intentsclient_listintents_paged_async]
