// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notification.proto

package dk.via.nbnp.databaseserver.protobuf;

public interface NotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Notification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int64 userId = 2;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>string message = 3;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 3;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string title = 4;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 4;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string notificationType = 5;</code>
   * @return The notificationType.
   */
  java.lang.String getNotificationType();
  /**
   * <code>string notificationType = 5;</code>
   * @return The bytes for notificationType.
   */
  com.google.protobuf.ByteString
      getNotificationTypeBytes();

  /**
   * <code>int64 notificationTypeId = 6;</code>
   * @return The notificationTypeId.
   */
  long getNotificationTypeId();
}