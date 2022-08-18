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

package com.google.cloud.networkmanagement.v1beta1.samples;

// [START networkmanagement_v1beta1_generated_reachabilityserviceclient_getconnectivitytest_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.networkmanagement.v1beta1.ConnectivityTest;
import com.google.cloud.networkmanagement.v1beta1.GetConnectivityTestRequest;
import com.google.cloud.networkmanagement.v1beta1.ReachabilityServiceClient;

public class AsyncGetConnectivityTest {

  public static void main(String[] args) throws Exception {
    asyncGetConnectivityTest();
  }

  public static void asyncGetConnectivityTest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ReachabilityServiceClient reachabilityServiceClient = ReachabilityServiceClient.create()) {
      GetConnectivityTestRequest request =
          GetConnectivityTestRequest.newBuilder().setName("name3373707").build();
      ApiFuture<ConnectivityTest> future =
          reachabilityServiceClient.getConnectivityTestCallable().futureCall(request);
      // Do something.
      ConnectivityTest response = future.get();
    }
  }
}
// [END networkmanagement_v1beta1_generated_reachabilityserviceclient_getconnectivitytest_async]
