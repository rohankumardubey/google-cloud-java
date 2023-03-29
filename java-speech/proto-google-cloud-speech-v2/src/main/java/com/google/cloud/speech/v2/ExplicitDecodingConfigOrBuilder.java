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

public interface ExplicitDecodingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v2.ExplicitDecodingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Encoding of the audio data sent for recognition.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for encoding.
   */
  int getEncodingValue();
  /**
   *
   *
   * <pre>
   * Required. Encoding of the audio data sent for recognition.
   * </pre>
   *
   * <code>
   * .google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding encoding = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The encoding.
   */
  com.google.cloud.speech.v2.ExplicitDecodingConfig.AudioEncoding getEncoding();

  /**
   *
   *
   * <pre>
   * Sample rate in Hertz of the audio data sent for recognition. Valid
   * values are: 8000-48000. 16000 is optimal. For best results, set the
   * sampling rate of the audio source to 16000 Hz. If that's not possible, use
   * the native sample rate of the audio source (instead of re-sampling).
   * Supported for the following encodings:
   * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
   * * MULAW: Headerless 8-bit companded mulaw samples.
   * * ALAW: Headerless 8-bit companded alaw samples.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   *
   * @return The sampleRateHertz.
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Number of channels present in the audio data sent for recognition.
   * Supported for the following encodings:
   * * LINEAR16: Headerless 16-bit signed little-endian PCM samples.
   * * MULAW: Headerless 8-bit companded mulaw samples.
   * * ALAW: Headerless 8-bit companded alaw samples.
   * The maximum allowed value is 8.
   * </pre>
   *
   * <code>int32 audio_channel_count = 3;</code>
   *
   * @return The audioChannelCount.
   */
  int getAudioChannelCount();
}
