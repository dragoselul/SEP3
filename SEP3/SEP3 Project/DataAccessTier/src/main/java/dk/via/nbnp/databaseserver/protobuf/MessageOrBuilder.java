// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package dk.via.nbnp.databaseserver.protobuf;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.User sender = 3;</code>
   * @return Whether the sender field is set.
   */
  boolean hasSender();
  /**
   * <code>.User sender = 3;</code>
   * @return The sender.
   */
  dk.via.nbnp.databaseserver.protobuf.User getSender();
  /**
   * <code>.User sender = 3;</code>
   */
  dk.via.nbnp.databaseserver.protobuf.UserOrBuilder getSenderOrBuilder();

  /**
   * <code>int64 conversationId = 4;</code>
   * @return The conversationId.
   */
  long getConversationId();
}
