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
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface CreateRoleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.CreateRoleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `parent` parameter's value depends on the target resource for the
   * request, namely
   * [`projects`](/iam/reference/rest/v1/projects.roles) or
   * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
   * resource type's `parent` value format is described below:
   * * [`projects.roles.create()`](/iam/reference/rest/v1/projects.roles/create):
   *   `projects/{PROJECT_ID}`. This method creates project-level
   *   [custom roles](/iam/docs/understanding-custom-roles).
   *   Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles`
   * * [`organizations.roles.create()`](/iam/reference/rest/v1/organizations.roles/create):
   *   `organizations/{ORGANIZATION_ID}`. This method creates organization-level
   *   [custom roles](/iam/docs/understanding-custom-roles). Example request
   *   URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles`
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The `parent` parameter's value depends on the target resource for the
   * request, namely
   * [`projects`](/iam/reference/rest/v1/projects.roles) or
   * [`organizations`](/iam/reference/rest/v1/organizations.roles). Each
   * resource type's `parent` value format is described below:
   * * [`projects.roles.create()`](/iam/reference/rest/v1/projects.roles/create):
   *   `projects/{PROJECT_ID}`. This method creates project-level
   *   [custom roles](/iam/docs/understanding-custom-roles).
   *   Example request URL:
   *   `https://iam.googleapis.com/v1/projects/{PROJECT_ID}/roles`
   * * [`organizations.roles.create()`](/iam/reference/rest/v1/organizations.roles/create):
   *   `organizations/{ORGANIZATION_ID}`. This method creates organization-level
   *   [custom roles](/iam/docs/understanding-custom-roles). Example request
   *   URL:
   *   `https://iam.googleapis.com/v1/organizations/{ORGANIZATION_ID}/roles`
   * Note: Wildcard (*) values are invalid; you must specify a complete project
   * ID or organization ID.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The role ID to use for this role.
   * A role ID may contain alphanumeric characters, underscores (`_`), and
   * periods (`.`). It must contain a minimum of 3 characters and a maximum of
   * 64 characters.
   * </pre>
   *
   * <code>string role_id = 2;</code>
   *
   * @return The roleId.
   */
  java.lang.String getRoleId();
  /**
   *
   *
   * <pre>
   * The role ID to use for this role.
   * A role ID may contain alphanumeric characters, underscores (`_`), and
   * periods (`.`). It must contain a minimum of 3 characters and a maximum of
   * 64 characters.
   * </pre>
   *
   * <code>string role_id = 2;</code>
   *
   * @return The bytes for roleId.
   */
  com.google.protobuf.ByteString getRoleIdBytes();

  /**
   *
   *
   * <pre>
   * The Role resource to create.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Role role = 3;</code>
   *
   * @return Whether the role field is set.
   */
  boolean hasRole();
  /**
   *
   *
   * <pre>
   * The Role resource to create.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Role role = 3;</code>
   *
   * @return The role.
   */
  com.google.iam.admin.v1.Role getRole();
  /**
   *
   *
   * <pre>
   * The Role resource to create.
   * </pre>
   *
   * <code>.google.iam.admin.v1.Role role = 3;</code>
   */
  com.google.iam.admin.v1.RoleOrBuilder getRoleOrBuilder();
}