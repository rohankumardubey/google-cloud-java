/*
 * Copyright 2024 Google LLC
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
// source: google/chat/v1/message.proto

// Protobuf Java Version: 3.25.2
package com.google.chat.v1;

public final class MessageProto {
  private MessageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_Message_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_AttachedGif_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_AttachedGif_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_QuotedMessageMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_QuotedMessageMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_Thread_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_Thread_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ActionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ActionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ActionResponse_SelectionItems_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ActionResponse_SelectionItems_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ActionResponse_UpdatedWidget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ActionResponse_UpdatedWidget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_GetMessageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_GetMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_DeleteMessageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_DeleteMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_UpdateMessageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_UpdateMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_CreateMessageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_CreateMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ListMessagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ListMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ListMessagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ListMessagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_DialogAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_DialogAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_Dialog_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_Dialog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_CardWithId_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_CardWithId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\034google/chat/v1/message.proto\022\016google.c"
          + "hat.v1\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032\036google/apps/"
          + "card/v1/card.proto\032\"google/chat/v1/actio"
          + "n_status.proto\032\037google/chat/v1/annotatio"
          + "n.proto\032\037google/chat/v1/attachment.proto"
          + "\032%google/chat/v1/contextual_addon.proto\032"
          + "&google/chat/v1/deletion_metadata.proto\032"
          + " google/chat/v1/matched_url.proto\032\035googl"
          + "e/chat/v1/reaction.proto\032\"google/chat/v1"
          + "/slash_command.proto\032\032google/chat/v1/spa"
          + "ce.proto\032\031google/chat/v1/user.proto\032 goo"
          + "gle/protobuf/field_mask.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\355\t\n\007Message\022\014\n\004na"
          + "me\030\001 \001(\t\022)\n\006sender\030\002 \001(\0132\024.google.chat.v"
          + "1.UserB\003\340A\003\0227\n\013create_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\006\340A\005\340A\001\0229\n\020last_upd"
          + "ate_time\030\027 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\0224\n\013delete_time\030\032 \001(\0132\032.google.pr"
          + "otobuf.TimestampB\003\340A\003\022\014\n\004text\030\004 \001(\t\022\033\n\016f"
          + "ormatted_text\030+ \001(\tB\003\340A\003\022=\n\005cards\030\005 \003(\0132"
          + "*.google.chat.v1.ContextualAddOnMarkup.C"
          + "ardB\002\030\001\022,\n\010cards_v2\030\026 \003(\0132\032.google.chat."
          + "v1.CardWithId\0224\n\013annotations\030\n \003(\0132\032.goo"
          + "gle.chat.v1.AnnotationB\003\340A\003\022&\n\006thread\030\013 "
          + "\001(\0132\026.google.chat.v1.Thread\022$\n\005space\030\014 \001"
          + "(\0132\025.google.chat.v1.Space\022\025\n\rfallback_te"
          + "xt\030\r \001(\t\022<\n\017action_response\030\016 \001(\0132\036.goog"
          + "le.chat.v1.ActionResponseB\003\340A\004\022\032\n\rargume"
          + "nt_text\030\017 \001(\tB\003\340A\003\0228\n\rslash_command\030\021 \001("
          + "\0132\034.google.chat.v1.SlashCommandB\003\340A\003\022.\n\n"
          + "attachment\030\022 \003(\0132\032.google.chat.v1.Attach"
          + "ment\0224\n\013matched_url\030\024 \001(\0132\032.google.chat."
          + "v1.MatchedUrlB\003\340A\003\022\031\n\014thread_reply\030\031 \001(\010"
          + "B\003\340A\003\022\"\n\032client_assigned_message_id\030  \001("
          + "\t\022K\n\030emoji_reaction_summaries\030! \003(\0132$.go"
          + "ogle.chat.v1.EmojiReactionSummaryB\003\340A\003\0229"
          + "\n\026private_message_viewer\030$ \001(\0132\024.google."
          + "chat.v1.UserB\003\340A\005\022@\n\021deletion_metadata\030&"
          + " \001(\0132 .google.chat.v1.DeletionMetadataB\003"
          + "\340A\003\022K\n\027quoted_message_metadata\030\' \001(\0132%.g"
          + "oogle.chat.v1.QuotedMessageMetadataB\003\340A\003"
          + "\0227\n\rattached_gifs\030* \003(\0132\033.google.chat.v1"
          + ".AttachedGifB\003\340A\003:C\352A@\n\033chat.googleapis."
          + "com/Message\022!spaces/{space}/messages/{me"
          + "ssage}\"\037\n\013AttachedGif\022\020\n\003uri\030\001 \001(\tB\003\340A\003\""
          + "\211\002\n\025QuotedMessageMetadata\0221\n\004name\030\001 \001(\tB"
          + "#\340A\003\372A\035\n\033chat.googleapis.com/Message\0229\n\020"
          + "last_update_time\030\002 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003:\201\001\352A~\n)chat.googleapis.c"
          + "om/QuotedMessageMetadata\022Qspaces/{space}"
          + "/messages/{message}/quotedMessageMetadat"
          + "a/{quoted_message_metadata}\"q\n\006Thread\022\014\n"
          + "\004name\030\001 \001(\t\022\027\n\nthread_key\030\003 \001(\tB\003\340A\001:@\352A"
          + "=\n\032chat.googleapis.com/Thread\022\037spaces/{s"
          + "pace}/threads/{thread}\"\322\004\n\016ActionRespons"
          + "e\022>\n\004type\030\001 \001(\0162+.google.chat.v1.ActionR"
          + "esponse.ResponseTypeB\003\340A\004\022\020\n\003url\030\002 \001(\tB\003"
          + "\340A\004\0228\n\rdialog_action\030\003 \001(\0132\034.google.chat"
          + ".v1.DialogActionB\003\340A\004\022I\n\016updated_widget\030"
          + "\004 \001(\0132,.google.chat.v1.ActionResponse.Up"
          + "datedWidgetB\003\340A\004\032R\n\016SelectionItems\022@\n\005it"
          + "ems\030\001 \003(\01321.google.apps.card.v1.Selectio"
          + "nInput.SelectionItem\032w\n\rUpdatedWidget\022D\n"
          + "\013suggestions\030\001 \001(\0132-.google.chat.v1.Acti"
          + "onResponse.SelectionItemsH\000\022\016\n\006widget\030\002 "
          + "\001(\tB\020\n\016updated_widget\"\233\001\n\014ResponseType\022\024"
          + "\n\020TYPE_UNSPECIFIED\020\000\022\017\n\013NEW_MESSAGE\020\001\022\022\n"
          + "\016UPDATE_MESSAGE\020\002\022\035\n\031UPDATE_USER_MESSAGE"
          + "_CARDS\020\006\022\022\n\016REQUEST_CONFIG\020\003\022\n\n\006DIALOG\020\004"
          + "\022\021\n\rUPDATE_WIDGET\020\007\"F\n\021GetMessageRequest"
          + "\0221\n\004name\030\001 \001(\tB#\340A\002\372A\035\n\033chat.googleapis."
          + "com/Message\"X\n\024DeleteMessageRequest\0221\n\004n"
          + "ame\030\001 \001(\tB#\340A\002\372A\035\n\033chat.googleapis.com/M"
          + "essage\022\r\n\005force\030\002 \001(\010\"\222\001\n\024UpdateMessageR"
          + "equest\022-\n\007message\030\001 \001(\0132\027.google.chat.v1"
          + ".MessageB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.goo"
          + "gle.protobuf.FieldMask\022\032\n\rallow_missing\030"
          + "\004 \001(\010B\003\340A\001\"\244\003\n\024CreateMessageRequest\0223\n\006p"
          + "arent\030\001 \001(\tB#\340A\002\372A\035\022\033chat.googleapis.com"
          + "/Message\022-\n\007message\030\004 \001(\0132\027.google.chat."
          + "v1.MessageB\003\340A\002\022\031\n\nthread_key\030\006 \001(\tB\005\030\001\340"
          + "A\001\022\027\n\nrequest_id\030\007 \001(\tB\003\340A\001\022Z\n\024message_r"
          + "eply_option\030\010 \001(\01627.google.chat.v1.Creat"
          + "eMessageRequest.MessageReplyOptionB\003\340A\001\022"
          + "\027\n\nmessage_id\030\t \001(\tB\003\340A\001\"\177\n\022MessageReply"
          + "Option\022$\n MESSAGE_REPLY_OPTION_UNSPECIFI"
          + "ED\020\000\022(\n$REPLY_MESSAGE_FALLBACK_TO_NEW_TH"
          + "READ\020\001\022\031\n\025REPLY_MESSAGE_OR_FAIL\020\002\"\251\001\n\023Li"
          + "stMessagesRequest\0223\n\006parent\030\001 \001(\tB#\340A\002\372A"
          + "\035\022\033chat.googleapis.com/Message\022\021\n\tpage_s"
          + "ize\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030"
          + "\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\022\024\n\014show_deleted\030"
          + "\006 \001(\010\"Z\n\024ListMessagesResponse\022)\n\010message"
          + "s\030\001 \003(\0132\027.google.chat.v1.Message\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"\201\001\n\014DialogAction\022-\n\006di"
          + "alog\030\001 \001(\0132\026.google.chat.v1.DialogB\003\340A\004H"
          + "\000\0228\n\raction_status\030\002 \001(\0132\034.google.chat.v"
          + "1.ActionStatusB\003\340A\004B\010\n\006action\"6\n\006Dialog\022"
          + ",\n\004body\030\001 \001(\0132\031.google.apps.card.v1.Card"
          + "B\003\340A\004\"F\n\nCardWithId\022\017\n\007card_id\030\001 \001(\t\022\'\n\004"
          + "card\030\002 \001(\0132\031.google.apps.card.v1.CardB\227\001"
          + "\n\022com.google.chat.v1B\014MessageProtoP\001Z,cl"
          + "oud.google.com/go/chat/apiv1/chatpb;chat"
          + "pb\252\002\023Google.Apps.Chat.V1\312\002\023Google\\Apps\\C"
          + "hat\\V1\352\002\026Google::Apps::Chat::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.apps.card.v1.CardProto.getDescriptor(),
              com.google.chat.v1.ActionStatusProto.getDescriptor(),
              com.google.chat.v1.AnnotationProto.getDescriptor(),
              com.google.chat.v1.AttachmentProto.getDescriptor(),
              com.google.chat.v1.ContextualAddOnProto.getDescriptor(),
              com.google.chat.v1.DeletionMetadataProto.getDescriptor(),
              com.google.chat.v1.MatchedUrlProto.getDescriptor(),
              com.google.chat.v1.ReactionProto.getDescriptor(),
              com.google.chat.v1.SlashCommandProto.getDescriptor(),
              com.google.chat.v1.SpaceProto.getDescriptor(),
              com.google.chat.v1.UserProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_chat_v1_Message_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_Message_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_Message_descriptor,
            new java.lang.String[] {
              "Name",
              "Sender",
              "CreateTime",
              "LastUpdateTime",
              "DeleteTime",
              "Text",
              "FormattedText",
              "Cards",
              "CardsV2",
              "Annotations",
              "Thread",
              "Space",
              "FallbackText",
              "ActionResponse",
              "ArgumentText",
              "SlashCommand",
              "Attachment",
              "MatchedUrl",
              "ThreadReply",
              "ClientAssignedMessageId",
              "EmojiReactionSummaries",
              "PrivateMessageViewer",
              "DeletionMetadata",
              "QuotedMessageMetadata",
              "AttachedGifs",
            });
    internal_static_google_chat_v1_AttachedGif_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_chat_v1_AttachedGif_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_AttachedGif_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_chat_v1_QuotedMessageMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_chat_v1_QuotedMessageMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_QuotedMessageMetadata_descriptor,
            new java.lang.String[] {
              "Name", "LastUpdateTime",
            });
    internal_static_google_chat_v1_Thread_descriptor = getDescriptor().getMessageTypes().get(3);
    internal_static_google_chat_v1_Thread_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_Thread_descriptor,
            new java.lang.String[] {
              "Name", "ThreadKey",
            });
    internal_static_google_chat_v1_ActionResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_chat_v1_ActionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ActionResponse_descriptor,
            new java.lang.String[] {
              "Type", "Url", "DialogAction", "UpdatedWidget",
            });
    internal_static_google_chat_v1_ActionResponse_SelectionItems_descriptor =
        internal_static_google_chat_v1_ActionResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_chat_v1_ActionResponse_SelectionItems_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ActionResponse_SelectionItems_descriptor,
            new java.lang.String[] {
              "Items",
            });
    internal_static_google_chat_v1_ActionResponse_UpdatedWidget_descriptor =
        internal_static_google_chat_v1_ActionResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_chat_v1_ActionResponse_UpdatedWidget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ActionResponse_UpdatedWidget_descriptor,
            new java.lang.String[] {
              "Suggestions", "Widget", "UpdatedWidget",
            });
    internal_static_google_chat_v1_GetMessageRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_chat_v1_GetMessageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_GetMessageRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_chat_v1_DeleteMessageRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_chat_v1_DeleteMessageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_DeleteMessageRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_chat_v1_UpdateMessageRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_chat_v1_UpdateMessageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_UpdateMessageRequest_descriptor,
            new java.lang.String[] {
              "Message", "UpdateMask", "AllowMissing",
            });
    internal_static_google_chat_v1_CreateMessageRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_chat_v1_CreateMessageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_CreateMessageRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Message", "ThreadKey", "RequestId", "MessageReplyOption", "MessageId",
            });
    internal_static_google_chat_v1_ListMessagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_chat_v1_ListMessagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ListMessagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy", "ShowDeleted",
            });
    internal_static_google_chat_v1_ListMessagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_chat_v1_ListMessagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ListMessagesResponse_descriptor,
            new java.lang.String[] {
              "Messages", "NextPageToken",
            });
    internal_static_google_chat_v1_DialogAction_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_chat_v1_DialogAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_DialogAction_descriptor,
            new java.lang.String[] {
              "Dialog", "ActionStatus", "Action",
            });
    internal_static_google_chat_v1_Dialog_descriptor = getDescriptor().getMessageTypes().get(12);
    internal_static_google_chat_v1_Dialog_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_Dialog_descriptor,
            new java.lang.String[] {
              "Body",
            });
    internal_static_google_chat_v1_CardWithId_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_chat_v1_CardWithId_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_CardWithId_descriptor,
            new java.lang.String[] {
              "CardId", "Card",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.apps.card.v1.CardProto.getDescriptor();
    com.google.chat.v1.ActionStatusProto.getDescriptor();
    com.google.chat.v1.AnnotationProto.getDescriptor();
    com.google.chat.v1.AttachmentProto.getDescriptor();
    com.google.chat.v1.ContextualAddOnProto.getDescriptor();
    com.google.chat.v1.DeletionMetadataProto.getDescriptor();
    com.google.chat.v1.MatchedUrlProto.getDescriptor();
    com.google.chat.v1.ReactionProto.getDescriptor();
    com.google.chat.v1.SlashCommandProto.getDescriptor();
    com.google.chat.v1.SpaceProto.getDescriptor();
    com.google.chat.v1.UserProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
