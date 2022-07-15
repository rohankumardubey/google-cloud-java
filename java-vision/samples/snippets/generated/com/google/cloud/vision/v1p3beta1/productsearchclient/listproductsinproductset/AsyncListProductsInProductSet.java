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

// [START vision_v1p3beta1_generated_productsearchclient_listproductsinproductset_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.vision.v1p3beta1.ListProductsInProductSetRequest;
import com.google.cloud.vision.v1p3beta1.Product;
import com.google.cloud.vision.v1p3beta1.ProductSearchClient;
import com.google.cloud.vision.v1p3beta1.ProductSetName;

public class AsyncListProductsInProductSet {

  public static void main(String[] args) throws Exception {
    asyncListProductsInProductSet();
  }

  public static void asyncListProductsInProductSet() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ProductSearchClient productSearchClient = ProductSearchClient.create()) {
      ListProductsInProductSetRequest request =
          ListProductsInProductSetRequest.newBuilder()
              .setName(ProductSetName.of("[PROJECT]", "[LOCATION]", "[PRODUCT_SET]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      ApiFuture<Product> future =
          productSearchClient.listProductsInProductSetPagedCallable().futureCall(request);
      // Do something.
      for (Product element : future.get().iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END vision_v1p3beta1_generated_productsearchclient_listproductsinproductset_async]