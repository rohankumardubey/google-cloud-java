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

package com.google.cloud.security.privateca.v1.samples;

// [START privateca_v1_generated_certificateauthorityserviceclient_enablecertificateauthority_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.security.privateca.v1.CertificateAuthority;
import com.google.cloud.security.privateca.v1.CertificateAuthorityName;
import com.google.cloud.security.privateca.v1.CertificateAuthorityServiceClient;
import com.google.cloud.security.privateca.v1.EnableCertificateAuthorityRequest;
import com.google.cloud.security.privateca.v1.OperationMetadata;

public class AsyncEnableCertificateAuthorityLRO {

  public static void main(String[] args) throws Exception {
    asyncEnableCertificateAuthorityLRO();
  }

  public static void asyncEnableCertificateAuthorityLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (CertificateAuthorityServiceClient certificateAuthorityServiceClient =
        CertificateAuthorityServiceClient.create()) {
      EnableCertificateAuthorityRequest request =
          EnableCertificateAuthorityRequest.newBuilder()
              .setName(
                  CertificateAuthorityName.of(
                          "[PROJECT]", "[LOCATION]", "[CA_POOL]", "[CERTIFICATE_AUTHORITY]")
                      .toString())
              .setRequestId("requestId693933066")
              .build();
      OperationFuture<CertificateAuthority, OperationMetadata> future =
          certificateAuthorityServiceClient
              .enableCertificateAuthorityOperationCallable()
              .futureCall(request);
      // Do something.
      CertificateAuthority response = future.get();
    }
  }
}
// [END privateca_v1_generated_certificateauthorityserviceclient_enablecertificateauthority_lro_async]