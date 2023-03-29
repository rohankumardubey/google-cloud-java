/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v2/cloud_speech.proto

package com.google.cloud.speech.v2;

public interface RecognitionOutputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.RecognitionOutputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If this message is populated, recognition results are written to the
   * provided Google Cloud Storage URI.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.GcsOutputConfig gcs_output_config = 1;</code>
   *
   * @return Whether the gcsOutputConfig field is set.
   */
  boolean hasGcsOutputConfig();
  /**
   *
   *
   * <pre>
   * If this message is populated, recognition results are written to the
   * provided Google Cloud Storage URI.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.GcsOutputConfig gcs_output_config = 1;</code>
   *
   * @return The gcsOutputConfig.
   */
  com.google.cloud.speech.v2.GcsOutputConfig getGcsOutputConfig();
  /**
   *
   *
   * <pre>
   * If this message is populated, recognition results are written to the
   * provided Google Cloud Storage URI.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.GcsOutputConfig gcs_output_config = 1;</code>
   */
  com.google.cloud.speech.v2.GcsOutputConfigOrBuilder getGcsOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * If this message is populated, recognition results are provided in the
   * [BatchRecognizeResponse][google.cloud.speech.v2.BatchRecognizeResponse]
   * message of the Operation when completed. This is only supported when
   * calling [BatchRecognize][google.cloud.speech.v2.Speech.BatchRecognize]
   * with just one audio file.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.InlineOutputConfig inline_response_config = 2;</code>
   *
   * @return Whether the inlineResponseConfig field is set.
   */
  boolean hasInlineResponseConfig();
  /**
   *
   *
   * <pre>
   * If this message is populated, recognition results are provided in the
   * [BatchRecognizeResponse][google.cloud.speech.v2.BatchRecognizeResponse]
   * message of the Operation when completed. This is only supported when
   * calling [BatchRecognize][google.cloud.speech.v2.Speech.BatchRecognize]
   * with just one audio file.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.InlineOutputConfig inline_response_config = 2;</code>
   *
   * @return The inlineResponseConfig.
   */
  com.google.cloud.speech.v2.InlineOutputConfig getInlineResponseConfig();
  /**
   *
   *
   * <pre>
   * If this message is populated, recognition results are provided in the
   * [BatchRecognizeResponse][google.cloud.speech.v2.BatchRecognizeResponse]
   * message of the Operation when completed. This is only supported when
   * calling [BatchRecognize][google.cloud.speech.v2.Speech.BatchRecognize]
   * with just one audio file.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.InlineOutputConfig inline_response_config = 2;</code>
   */
  com.google.cloud.speech.v2.InlineOutputConfigOrBuilder getInlineResponseConfigOrBuilder();

  public com.google.cloud.speech.v2.RecognitionOutputConfig.OutputCase getOutputCase();
}
