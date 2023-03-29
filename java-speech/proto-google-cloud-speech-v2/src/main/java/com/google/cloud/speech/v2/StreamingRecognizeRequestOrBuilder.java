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

public interface StreamingRecognizeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.StreamingRecognizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Streaming recognition should start with an initial request having
   * a `recognizer`. Subsequent requests carry the audio data to be recognized.
   * The initial request with configuration can be omitted if the Recognizer
   * being used has a
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config].
   * </pre>
   *
   * <code>
   * string recognizer = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The recognizer.
   */
  java.lang.String getRecognizer();
  /**
   *
   *
   * <pre>
   * Required. Streaming recognition should start with an initial request having
   * a `recognizer`. Subsequent requests carry the audio data to be recognized.
   * The initial request with configuration can be omitted if the Recognizer
   * being used has a
   * [default_recognition_config][google.cloud.speech.v2.Recognizer.default_recognition_config].
   * </pre>
   *
   * <code>
   * string recognizer = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for recognizer.
   */
  com.google.protobuf.ByteString getRecognizerBytes();

  /**
   *
   *
   * <pre>
   * StreamingRecognitionConfig to be used in this recognition attempt.
   * If provided, it will override the default RecognitionConfig stored in the
   * Recognizer.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.StreamingRecognitionConfig streaming_config = 6;</code>
   *
   * @return Whether the streamingConfig field is set.
   */
  boolean hasStreamingConfig();
  /**
   *
   *
   * <pre>
   * StreamingRecognitionConfig to be used in this recognition attempt.
   * If provided, it will override the default RecognitionConfig stored in the
   * Recognizer.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.StreamingRecognitionConfig streaming_config = 6;</code>
   *
   * @return The streamingConfig.
   */
  com.google.cloud.speech.v2.StreamingRecognitionConfig getStreamingConfig();
  /**
   *
   *
   * <pre>
   * StreamingRecognitionConfig to be used in this recognition attempt.
   * If provided, it will override the default RecognitionConfig stored in the
   * Recognizer.
   * </pre>
   *
   * <code>.google.cloud.speech.v2.StreamingRecognitionConfig streaming_config = 6;</code>
   */
  com.google.cloud.speech.v2.StreamingRecognitionConfigOrBuilder getStreamingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Inline audio bytes to be Recognized.
   * Maximum size for this field is 15 KB per request.
   * </pre>
   *
   * <code>bytes audio = 5;</code>
   *
   * @return Whether the audio field is set.
   */
  boolean hasAudio();
  /**
   *
   *
   * <pre>
   * Inline audio bytes to be Recognized.
   * Maximum size for this field is 15 KB per request.
   * </pre>
   *
   * <code>bytes audio = 5;</code>
   *
   * @return The audio.
   */
  com.google.protobuf.ByteString getAudio();

  public com.google.cloud.speech.v2.StreamingRecognizeRequest.StreamingRequestCase
      getStreamingRequestCase();
}
