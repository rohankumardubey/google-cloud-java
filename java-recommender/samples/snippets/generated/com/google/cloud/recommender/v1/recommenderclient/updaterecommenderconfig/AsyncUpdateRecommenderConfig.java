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

package com.google.cloud.recommender.v1.samples;

// [START recommender_v1_generated_recommenderclient_updaterecommenderconfig_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.recommender.v1.RecommenderClient;
import com.google.cloud.recommender.v1.RecommenderConfig;
import com.google.cloud.recommender.v1.UpdateRecommenderConfigRequest;
import com.google.protobuf.FieldMask;

public class AsyncUpdateRecommenderConfig {

  public static void main(String[] args) throws Exception {
    asyncUpdateRecommenderConfig();
  }

  public static void asyncUpdateRecommenderConfig() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (RecommenderClient recommenderClient = RecommenderClient.create()) {
      UpdateRecommenderConfigRequest request =
          UpdateRecommenderConfigRequest.newBuilder()
              .setRecommenderConfig(RecommenderConfig.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .setValidateOnly(true)
              .build();
      ApiFuture<RecommenderConfig> future =
          recommenderClient.updateRecommenderConfigCallable().futureCall(request);
      // Do something.
      RecommenderConfig response = future.get();
    }
  }
}
// [END recommender_v1_generated_recommenderclient_updaterecommenderconfig_async]