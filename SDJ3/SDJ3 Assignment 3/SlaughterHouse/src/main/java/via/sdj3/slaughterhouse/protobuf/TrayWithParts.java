// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SlaughterHouse.proto

package via.sdj3.slaughterhouse.protobuf;

/**
 * Protobuf type {@code TrayWithParts}
 */
public final class TrayWithParts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TrayWithParts)
    TrayWithPartsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrayWithParts.newBuilder() to construct.
  private TrayWithParts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrayWithParts() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrayWithParts();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrayWithParts(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            trayId_ = input.readInt32();
            break;
          }
          case 16: {

            animalPartId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sdj3.slaughterhouse.protobuf.SlaughterHouseOuterClass.internal_static_TrayWithParts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.slaughterhouse.protobuf.SlaughterHouseOuterClass.internal_static_TrayWithParts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.slaughterhouse.protobuf.TrayWithParts.class, via.sdj3.slaughterhouse.protobuf.TrayWithParts.Builder.class);
  }

  public static final int TRAYID_FIELD_NUMBER = 1;
  private int trayId_;
  /**
   * <code>int32 trayId = 1;</code>
   * @return The trayId.
   */
  @java.lang.Override
  public int getTrayId() {
    return trayId_;
  }

  public static final int ANIMALPARTID_FIELD_NUMBER = 2;
  private int animalPartId_;
  /**
   * <code>int32 animalPartId = 2;</code>
   * @return The animalPartId.
   */
  @java.lang.Override
  public int getAnimalPartId() {
    return animalPartId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (trayId_ != 0) {
      output.writeInt32(1, trayId_);
    }
    if (animalPartId_ != 0) {
      output.writeInt32(2, animalPartId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trayId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, trayId_);
    }
    if (animalPartId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, animalPartId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sdj3.slaughterhouse.protobuf.TrayWithParts)) {
      return super.equals(obj);
    }
    via.sdj3.slaughterhouse.protobuf.TrayWithParts other = (via.sdj3.slaughterhouse.protobuf.TrayWithParts) obj;

    if (getTrayId()
        != other.getTrayId()) return false;
    if (getAnimalPartId()
        != other.getAnimalPartId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TRAYID_FIELD_NUMBER;
    hash = (53 * hash) + getTrayId();
    hash = (37 * hash) + ANIMALPARTID_FIELD_NUMBER;
    hash = (53 * hash) + getAnimalPartId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sdj3.slaughterhouse.protobuf.TrayWithParts prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TrayWithParts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TrayWithParts)
      via.sdj3.slaughterhouse.protobuf.TrayWithPartsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.slaughterhouse.protobuf.SlaughterHouseOuterClass.internal_static_TrayWithParts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.slaughterhouse.protobuf.SlaughterHouseOuterClass.internal_static_TrayWithParts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.slaughterhouse.protobuf.TrayWithParts.class, via.sdj3.slaughterhouse.protobuf.TrayWithParts.Builder.class);
    }

    // Construct using via.sdj3.slaughterhouse.protobuf.TrayWithParts.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      trayId_ = 0;

      animalPartId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.slaughterhouse.protobuf.SlaughterHouseOuterClass.internal_static_TrayWithParts_descriptor;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.TrayWithParts getDefaultInstanceForType() {
      return via.sdj3.slaughterhouse.protobuf.TrayWithParts.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.TrayWithParts build() {
      via.sdj3.slaughterhouse.protobuf.TrayWithParts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.slaughterhouse.protobuf.TrayWithParts buildPartial() {
      via.sdj3.slaughterhouse.protobuf.TrayWithParts result = new via.sdj3.slaughterhouse.protobuf.TrayWithParts(this);
      result.trayId_ = trayId_;
      result.animalPartId_ = animalPartId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sdj3.slaughterhouse.protobuf.TrayWithParts) {
        return mergeFrom((via.sdj3.slaughterhouse.protobuf.TrayWithParts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.slaughterhouse.protobuf.TrayWithParts other) {
      if (other == via.sdj3.slaughterhouse.protobuf.TrayWithParts.getDefaultInstance()) return this;
      if (other.getTrayId() != 0) {
        setTrayId(other.getTrayId());
      }
      if (other.getAnimalPartId() != 0) {
        setAnimalPartId(other.getAnimalPartId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sdj3.slaughterhouse.protobuf.TrayWithParts parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.slaughterhouse.protobuf.TrayWithParts) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int trayId_ ;
    /**
     * <code>int32 trayId = 1;</code>
     * @return The trayId.
     */
    @java.lang.Override
    public int getTrayId() {
      return trayId_;
    }
    /**
     * <code>int32 trayId = 1;</code>
     * @param value The trayId to set.
     * @return This builder for chaining.
     */
    public Builder setTrayId(int value) {
      
      trayId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 trayId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTrayId() {
      
      trayId_ = 0;
      onChanged();
      return this;
    }

    private int animalPartId_ ;
    /**
     * <code>int32 animalPartId = 2;</code>
     * @return The animalPartId.
     */
    @java.lang.Override
    public int getAnimalPartId() {
      return animalPartId_;
    }
    /**
     * <code>int32 animalPartId = 2;</code>
     * @param value The animalPartId to set.
     * @return This builder for chaining.
     */
    public Builder setAnimalPartId(int value) {
      
      animalPartId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 animalPartId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnimalPartId() {
      
      animalPartId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TrayWithParts)
  }

  // @@protoc_insertion_point(class_scope:TrayWithParts)
  private static final via.sdj3.slaughterhouse.protobuf.TrayWithParts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.slaughterhouse.protobuf.TrayWithParts();
  }

  public static via.sdj3.slaughterhouse.protobuf.TrayWithParts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrayWithParts>
      PARSER = new com.google.protobuf.AbstractParser<TrayWithParts>() {
    @java.lang.Override
    public TrayWithParts parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrayWithParts(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrayWithParts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrayWithParts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.slaughterhouse.protobuf.TrayWithParts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

