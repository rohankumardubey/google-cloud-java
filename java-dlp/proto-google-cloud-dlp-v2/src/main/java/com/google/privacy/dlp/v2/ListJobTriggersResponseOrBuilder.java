/*
 * Copyright 2023 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ListJobTriggersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListJobTriggersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.JobTrigger> getJobTriggersList();
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  com.google.privacy.dlp.v2.JobTrigger getJobTriggers(int index);
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  int getJobTriggersCount();
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.JobTriggerOrBuilder>
      getJobTriggersOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of triggeredJobs, up to page_size in ListJobTriggersRequest.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.JobTrigger job_triggers = 1;</code>
   */
  com.google.privacy.dlp.v2.JobTriggerOrBuilder getJobTriggersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If the next page is available then this value is the next page token to be
   * used in the following ListJobTriggers request.
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
   * If the next page is available then this value is the next page token to be
   * used in the following ListJobTriggers request.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
