// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase}
 */
public final class IrDeclarationBase extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase)
    IrDeclarationBaseOrBuilder {
  // Use IrDeclarationBase.newBuilder() to construct.
  private IrDeclarationBase(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrDeclarationBase(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrDeclarationBase defaultInstance;
  public static IrDeclarationBase getDefaultInstance() {
    return defaultInstance;
  }

  public IrDeclarationBase getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrDeclarationBase(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = symbol_.toBuilder();
            }
            symbol_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(symbol_);
              symbol_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.Builder subBuilder = null;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
              subBuilder = origin_.toBuilder();
            }
            origin_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(origin_);
              origin_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000002;
            break;
          }
          case 26: {
            org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
              subBuilder = coordinates_.toBuilder();
            }
            coordinates_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(coordinates_);
              coordinates_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
            break;
          }
          case 34: {
            org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.Builder subBuilder = null;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
              subBuilder = annotations_.toBuilder();
            }
            annotations_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(annotations_);
              annotations_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000008;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrDeclarationBase> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrDeclarationBase>() {
    public IrDeclarationBase parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrDeclarationBase(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrDeclarationBase> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int SYMBOL_FIELD_NUMBER = 1;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
   */
  public boolean hasSymbol() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getSymbol() {
    return symbol_;
  }

  public static final int ORIGIN_FIELD_NUMBER = 2;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
   */
  public boolean hasOrigin() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin getOrigin() {
    return origin_;
  }

  public static final int COORDINATES_FIELD_NUMBER = 3;
  private org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
   */
  public boolean hasCoordinates() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates getCoordinates() {
    return coordinates_;
  }

  public static final int ANNOTATIONS_FIELD_NUMBER = 4;
  private org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations_;
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
   */
  public boolean hasAnnotations() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.Annotations getAnnotations() {
    return annotations_;
  }

  private void initFields() {
    symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
    origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.getDefaultInstance();
    coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();
    annotations_ = org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasSymbol()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasOrigin()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasCoordinates()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasAnnotations()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getSymbol().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getOrigin().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getCoordinates().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!getAnnotations().isInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, symbol_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, origin_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, coordinates_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, annotations_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(1, symbol_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(2, origin_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(3, coordinates_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(4, annotations_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBaseOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000002);
      coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000004);
      annotations_ = org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.symbol_ = symbol_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.origin_ = origin_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.coordinates_ = coordinates_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.annotations_ = annotations_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase.getDefaultInstance()) return this;
      if (other.hasSymbol()) {
        mergeSymbol(other.getSymbol());
      }
      if (other.hasOrigin()) {
        mergeOrigin(other.getOrigin());
      }
      if (other.hasCoordinates()) {
        mergeCoordinates(other.getCoordinates());
      }
      if (other.hasAnnotations()) {
        mergeAnnotations(other.getAnnotations());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasSymbol()) {
        
        return false;
      }
      if (!hasOrigin()) {
        
        return false;
      }
      if (!hasCoordinates()) {
        
        return false;
      }
      if (!hasAnnotations()) {
        
        return false;
      }
      if (!getSymbol().isInitialized()) {
        
        return false;
      }
      if (!getOrigin().isInitialized()) {
        
        return false;
      }
      if (!getCoordinates().isInitialized()) {
        
        return false;
      }
      if (!getAnnotations().isInitialized()) {
        
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
     */
    public boolean hasSymbol() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex getSymbol() {
      return symbol_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
     */
    public Builder setSymbol(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (value == null) {
        throw new NullPointerException();
      }
      symbol_ = value;

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
     */
    public Builder setSymbol(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.Builder builderForValue) {
      symbol_ = builderForValue.build();

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
     */
    public Builder mergeSymbol(org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex value) {
      if (((bitField0_ & 0x00000001) == 0x00000001) &&
          symbol_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance()) {
        symbol_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.newBuilder(symbol_).mergeFrom(value).buildPartial();
      } else {
        symbol_ = value;
      }

      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex symbol = 1;</code>
     */
    public Builder clearSymbol() {
      symbol_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDataIndex.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
     */
    public boolean hasOrigin() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin getOrigin() {
      return origin_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
     */
    public Builder setOrigin(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      origin_ = value;

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
     */
    public Builder setOrigin(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.Builder builderForValue) {
      origin_ = builderForValue.build();

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
     */
    public Builder mergeOrigin(org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin value) {
      if (((bitField0_ & 0x00000002) == 0x00000002) &&
          origin_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.getDefaultInstance()) {
        origin_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.newBuilder(origin_).mergeFrom(value).buildPartial();
      } else {
        origin_ = value;
      }

      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin origin = 2;</code>
     */
    public Builder clearOrigin() {
      origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationOrigin.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public boolean hasCoordinates() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates getCoordinates() {
      return coordinates_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder setCoordinates(org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates value) {
      if (value == null) {
        throw new NullPointerException();
      }
      coordinates_ = value;

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder setCoordinates(
        org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.Builder builderForValue) {
      coordinates_ = builderForValue.build();

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder mergeCoordinates(org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates value) {
      if (((bitField0_ & 0x00000004) == 0x00000004) &&
          coordinates_ != org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance()) {
        coordinates_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.newBuilder(coordinates_).mergeFrom(value).buildPartial();
      } else {
        coordinates_ = value;
      }

      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates coordinates = 3;</code>
     */
    public Builder clearCoordinates() {
      coordinates_ = org.jetbrains.kotlin.backend.common.serialization.proto.Coordinates.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations_ = org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.getDefaultInstance();
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
     */
    public boolean hasAnnotations() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.Annotations getAnnotations() {
      return annotations_;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
     */
    public Builder setAnnotations(org.jetbrains.kotlin.backend.common.serialization.proto.Annotations value) {
      if (value == null) {
        throw new NullPointerException();
      }
      annotations_ = value;

      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
     */
    public Builder setAnnotations(
        org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.Builder builderForValue) {
      annotations_ = builderForValue.build();

      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
     */
    public Builder mergeAnnotations(org.jetbrains.kotlin.backend.common.serialization.proto.Annotations value) {
      if (((bitField0_ & 0x00000008) == 0x00000008) &&
          annotations_ != org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.getDefaultInstance()) {
        annotations_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.newBuilder(annotations_).mergeFrom(value).buildPartial();
      } else {
        annotations_ = value;
      }

      bitField0_ |= 0x00000008;
      return this;
    }
    /**
     * <code>required .org.jetbrains.kotlin.backend.common.serialization.proto.Annotations annotations = 4;</code>
     */
    public Builder clearAnnotations() {
      annotations_ = org.jetbrains.kotlin.backend.common.serialization.proto.Annotations.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase)
  }

  static {
    defaultInstance = new IrDeclarationBase(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrDeclarationBase)
}
