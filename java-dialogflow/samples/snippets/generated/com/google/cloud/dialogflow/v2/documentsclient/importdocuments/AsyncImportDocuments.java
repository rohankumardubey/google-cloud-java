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

// [START dialogflow_v2_generated_documentsclient_importdocuments_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.dialogflow.v2.DocumentsClient;
import com.google.cloud.dialogflow.v2.ImportDocumentTemplate;
import com.google.cloud.dialogflow.v2.ImportDocumentsRequest;
import com.google.cloud.dialogflow.v2.KnowledgeBaseName;
import com.google.longrunning.Operation;

public class AsyncImportDocuments {

  public static void main(String[] args) throws Exception {
    asyncImportDocuments();
  }

  public static void asyncImportDocuments() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DocumentsClient documentsClient = DocumentsClient.create()) {
      ImportDocumentsRequest request =
          ImportDocumentsRequest.newBuilder()
              .setParent(
                  KnowledgeBaseName.ofProjectKnowledgeBaseName("[PROJECT]", "[KNOWLEDGE_BASE]")
                      .toString())
              .setDocumentTemplate(ImportDocumentTemplate.newBuilder().build())
              .setImportGcsCustomMetadata(true)
              .build();
      ApiFuture<Operation> future = documentsClient.importDocumentsCallable().futureCall(request);
      // Do something.
      Operation response = future.get();
    }
  }
}
// [END dialogflow_v2_generated_documentsclient_importdocuments_async]