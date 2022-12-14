// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image.proto

package dk.via.nbnp.databaseserver.protobuf;

public interface UploadImageDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UploadImageDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string base64data = 1;</code>
   * @return The base64data.
   */
  java.lang.String getBase64Data();
  /**
   * <code>string base64data = 1;</code>
   * @return The bytes for base64data.
   */
  com.google.protobuf.ByteString
      getBase64DataBytes();

  /**
   * <code>string contentType = 2;</code>
   * @return The contentType.
   */
  java.lang.String getContentType();
  /**
   * <code>string contentType = 2;</code>
   * @return The bytes for contentType.
   */
  com.google.protobuf.ByteString
      getContentTypeBytes();

  /**
   * <code>string fileName = 3;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string fileName = 3;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <code>int64 itemId = 4;</code>
   * @return The itemId.
   */
  long getItemId();
}
