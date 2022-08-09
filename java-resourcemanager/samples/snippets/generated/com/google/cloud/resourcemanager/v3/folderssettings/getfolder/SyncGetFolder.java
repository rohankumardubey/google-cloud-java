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

package com.google.cloud.resourcemanager.v3.samples;

// [START resourcemanager_v3_generated_folderssettings_getfolder_sync]
import com.google.cloud.resourcemanager.v3.FoldersSettings;
import java.time.Duration;

public class SyncGetFolder {

  public static void main(String[] args) throws Exception {
    syncGetFolder();
  }

  public static void syncGetFolder() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    FoldersSettings.Builder foldersSettingsBuilder = FoldersSettings.newBuilder();
    foldersSettingsBuilder
        .getFolderSettings()
        .setRetrySettings(
            foldersSettingsBuilder
                .getFolderSettings()
                .getRetrySettings()
                .toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    FoldersSettings foldersSettings = foldersSettingsBuilder.build();
  }
}
// [END resourcemanager_v3_generated_folderssettings_getfolder_sync]
