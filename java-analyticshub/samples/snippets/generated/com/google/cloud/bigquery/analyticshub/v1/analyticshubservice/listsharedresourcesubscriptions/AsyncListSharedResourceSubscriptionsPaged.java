/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.bigquery.analyticshub.v1.samples;

// [START analyticshub_v1_generated_AnalyticsHubService_ListSharedResourceSubscriptions_Paged_async]
import com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubServiceClient;
import com.google.cloud.bigquery.analyticshub.v1.DataExchangeName;
import com.google.cloud.bigquery.analyticshub.v1.ListSharedResourceSubscriptionsRequest;
import com.google.cloud.bigquery.analyticshub.v1.ListSharedResourceSubscriptionsResponse;
import com.google.cloud.bigquery.analyticshub.v1.Subscription;
import com.google.common.base.Strings;

public class AsyncListSharedResourceSubscriptionsPaged {

  public static void main(String[] args) throws Exception {
    asyncListSharedResourceSubscriptionsPaged();
  }

  public static void asyncListSharedResourceSubscriptionsPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (AnalyticsHubServiceClient analyticsHubServiceClient = AnalyticsHubServiceClient.create()) {
      ListSharedResourceSubscriptionsRequest request =
          ListSharedResourceSubscriptionsRequest.newBuilder()
              .setResource(
                  DataExchangeName.of("[PROJECT]", "[LOCATION]", "[DATA_EXCHANGE]").toString())
              .setIncludeDeletedSubscriptions(true)
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListSharedResourceSubscriptionsResponse response =
            analyticsHubServiceClient.listSharedResourceSubscriptionsCallable().call(request);
        for (Subscription element : response.getSharedResourceSubscriptionsList()) {
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
// [END analyticshub_v1_generated_AnalyticsHubService_ListSharedResourceSubscriptions_Paged_async]
