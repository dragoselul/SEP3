// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item.proto

package dk.via.nbnp.databaseserver.protobuf;

public interface UpdateItemDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UpdateItemDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>double price = 4;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>string currency = 5;</code>
   * @return The currency.
   */
  java.lang.String getCurrency();
  /**
   * <code>string currency = 5;</code>
   * @return The bytes for currency.
   */
  com.google.protobuf.ByteString
      getCurrencyBytes();

  /**
   * <code>string category = 6;</code>
   * @return The category.
   */
  java.lang.String getCategory();
  /**
   * <code>string category = 6;</code>
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <code>string status = 7;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 7;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
