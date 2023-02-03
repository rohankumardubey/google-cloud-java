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

package google.devtools.cloudbuild.v2.samples;

// [START cloudbuild_v2_generated_RepositoryManager_FetchLinkableRepositories_Paged_async]
import com.google.common.base.Strings;
import google.devtools.cloudbuild.v2.ConnectionName;
import google.devtools.cloudbuild.v2.FetchLinkableRepositoriesRequest;
import google.devtools.cloudbuild.v2.FetchLinkableRepositoriesResponse;
import google.devtools.cloudbuild.v2.Repository;
import google.devtools.cloudbuild.v2.RepositoryManagerClient;

public class AsyncFetchLinkableRepositoriesPaged {

  public static void main(String[] args) throws Exception {
    asyncFetchLinkableRepositoriesPaged();
  }

  public static void asyncFetchLinkableRepositoriesPaged() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (RepositoryManagerClient repositoryManagerClient = RepositoryManagerClient.create()) {
      FetchLinkableRepositoriesRequest request =
          FetchLinkableRepositoriesRequest.newBuilder()
              .setConnection(
                  ConnectionName.of("[PROJECT]", "[LOCATION]", "[CONNECTION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        FetchLinkableRepositoriesResponse response =
            repositoryManagerClient.fetchLinkableRepositoriesCallable().call(request);
        for (Repository element : response.getRepositoriesList()) {
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
// [END cloudbuild_v2_generated_RepositoryManager_FetchLinkableRepositories_Paged_async]
