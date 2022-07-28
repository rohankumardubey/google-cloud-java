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

package com.google.cloud.vision.v1p3beta1.samples;

// [START
// vision_v1p3beta1_generated_imageannotatorclient_batchannotateimages_listannotateimagerequest_sync]
import com.google.cloud.vision.v1p3beta1.AnnotateImageRequest;
import com.google.cloud.vision.v1p3beta1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1p3beta1.ImageAnnotatorClient;
import java.util.ArrayList;
import java.util.List;

public class SyncBatchAnnotateImagesListannotateimagerequest {

  public static void main(String[] args) throws Exception {
    syncBatchAnnotateImagesListannotateimagerequest();
  }

  public static void syncBatchAnnotateImagesListannotateimagerequest() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ImageAnnotatorClient imageAnnotatorClient = ImageAnnotatorClient.create()) {
      List<AnnotateImageRequest> requests = new ArrayList<>();
      BatchAnnotateImagesResponse response = imageAnnotatorClient.batchAnnotateImages(requests);
    }
  }
}
// [END
// vision_v1p3beta1_generated_imageannotatorclient_batchannotateimages_listannotateimagerequest_sync]
