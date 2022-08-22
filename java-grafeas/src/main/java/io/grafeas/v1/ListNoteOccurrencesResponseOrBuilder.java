/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface ListNoteOccurrencesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.ListNoteOccurrencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<io.grafeas.v1.Occurrence> getOccurrencesList();
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.Occurrence getOccurrences(int index);
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  int getOccurrencesCount();
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  java.util.List<? extends io.grafeas.v1.OccurrenceOrBuilder> getOccurrencesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The occurrences attached to the specified note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.Occurrence occurrences = 1;</code>
   */
  io.grafeas.v1.OccurrenceOrBuilder getOccurrencesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to provide to skip to a particular spot in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
