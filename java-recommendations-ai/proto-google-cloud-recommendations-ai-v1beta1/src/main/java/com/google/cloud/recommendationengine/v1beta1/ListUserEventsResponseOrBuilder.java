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
// source: google/cloud/recommendationengine/v1beta1/user_event_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public interface ListUserEventsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommendationengine.v1beta1.ListUserEventsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  java.util.List<com.google.cloud.recommendationengine.v1beta1.UserEvent> getUserEventsList();
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.UserEvent getUserEvents(int index);
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  int getUserEventsCount();
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  java.util.List<? extends com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder>
      getUserEventsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The user events.
   * </pre>
   *
   * <code>repeated .google.cloud.recommendationengine.v1beta1.UserEvent user_events = 1;</code>
   */
  com.google.cloud.recommendationengine.v1beta1.UserEventOrBuilder getUserEventsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If empty, the list is complete. If nonempty, the token to pass to the next
   * request's ListUserEvents.page_token.
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
   * If empty, the list is complete. If nonempty, the token to pass to the next
   * request's ListUserEvents.page_token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}