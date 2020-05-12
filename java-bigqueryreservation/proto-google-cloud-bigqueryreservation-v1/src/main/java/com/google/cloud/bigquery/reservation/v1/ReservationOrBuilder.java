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
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface ReservationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Minimum slots available to this reservation. A slot is a unit of
   * computational power in BigQuery, and serves as the unit of parallelism.
   * Queries using this reservation might use more slots during runtime if
   * ignore_idle_slots is set to false.
   * If the new reservation's slot capacity exceed the parent's slot capacity or
   * if total slot capacity of the new reservation and its siblings exceeds the
   * parent's slot capacity, the request will fail with
   * `google.rpc.Code.RESOURCE_EXHAUSTED`.
   * </pre>
   *
   * <code>int64 slot_capacity = 2;</code>
   *
   * @return The slotCapacity.
   */
  long getSlotCapacity();

  /**
   *
   *
   * <pre>
   * If false, any query using this reservation will use idle slots from other
   * reservations within the same admin project. If true, a query using this
   * reservation will execute with the slot capacity specified above at most.
   * </pre>
   *
   * <code>bool ignore_idle_slots = 4;</code>
   *
   * @return The ignoreIdleSlots.
   */
  boolean getIgnoreIdleSlots();
}
