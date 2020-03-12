// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.GetAllTablesPResponse}
 */
public  final class GetAllTablesPResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.GetAllTablesPResponse)
    GetAllTablesPResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAllTablesPResponse.newBuilder() to construct.
  private GetAllTablesPResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllTablesPResponse() {
    table_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAllTablesPResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAllTablesPResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              table_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            table_.add(bs);
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        table_ = table_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetAllTablesPResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetAllTablesPResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.GetAllTablesPResponse.class, alluxio.grpc.table.GetAllTablesPResponse.Builder.class);
  }

  public static final int TABLE_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList table_;
  /**
   * <code>repeated string table = 1;</code>
   * @return A list containing the table.
   */
  public com.google.protobuf.ProtocolStringList
      getTableList() {
    return table_;
  }
  /**
   * <code>repeated string table = 1;</code>
   * @return The count of table.
   */
  public int getTableCount() {
    return table_.size();
  }
  /**
   * <code>repeated string table = 1;</code>
   * @param index The index of the element to return.
   * @return The table at the given index.
   */
  public java.lang.String getTable(int index) {
    return table_.get(index);
  }
  /**
   * <code>repeated string table = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the table at the given index.
   */
  public com.google.protobuf.ByteString
      getTableBytes(int index) {
    return table_.getByteString(index);
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
    for (int i = 0; i < table_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, table_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < table_.size(); i++) {
        dataSize += computeStringSizeNoTag(table_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTableList().size();
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
    if (!(obj instanceof alluxio.grpc.table.GetAllTablesPResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.GetAllTablesPResponse other = (alluxio.grpc.table.GetAllTablesPResponse) obj;

    if (!getTableList()
        .equals(other.getTableList())) return false;
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
    if (getTableCount() > 0) {
      hash = (37 * hash) + TABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTableList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetAllTablesPResponse parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.table.GetAllTablesPResponse prototype) {
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
   * Protobuf type {@code alluxio.grpc.table.GetAllTablesPResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.GetAllTablesPResponse)
      alluxio.grpc.table.GetAllTablesPResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetAllTablesPResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetAllTablesPResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.GetAllTablesPResponse.class, alluxio.grpc.table.GetAllTablesPResponse.Builder.class);
    }

    // Construct using alluxio.grpc.table.GetAllTablesPResponse.newBuilder()
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
      table_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetAllTablesPResponse_descriptor;
    }

    @java.lang.Override
    public alluxio.grpc.table.GetAllTablesPResponse getDefaultInstanceForType() {
      return alluxio.grpc.table.GetAllTablesPResponse.getDefaultInstance();
    }

    @java.lang.Override
    public alluxio.grpc.table.GetAllTablesPResponse build() {
      alluxio.grpc.table.GetAllTablesPResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public alluxio.grpc.table.GetAllTablesPResponse buildPartial() {
      alluxio.grpc.table.GetAllTablesPResponse result = new alluxio.grpc.table.GetAllTablesPResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        table_ = table_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.table_ = table_;
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
      if (other instanceof alluxio.grpc.table.GetAllTablesPResponse) {
        return mergeFrom((alluxio.grpc.table.GetAllTablesPResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.GetAllTablesPResponse other) {
      if (other == alluxio.grpc.table.GetAllTablesPResponse.getDefaultInstance()) return this;
      if (!other.table_.isEmpty()) {
        if (table_.isEmpty()) {
          table_ = other.table_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTableIsMutable();
          table_.addAll(other.table_);
        }
        onChanged();
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
      alluxio.grpc.table.GetAllTablesPResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.GetAllTablesPResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList table_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTableIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        table_ = new com.google.protobuf.LazyStringArrayList(table_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string table = 1;</code>
     * @return A list containing the table.
     */
    public com.google.protobuf.ProtocolStringList
        getTableList() {
      return table_.getUnmodifiableView();
    }
    /**
     * <code>repeated string table = 1;</code>
     * @return The count of table.
     */
    public int getTableCount() {
      return table_.size();
    }
    /**
     * <code>repeated string table = 1;</code>
     * @param index The index of the element to return.
     * @return The table at the given index.
     */
    public java.lang.String getTable(int index) {
      return table_.get(index);
    }
    /**
     * <code>repeated string table = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the table at the given index.
     */
    public com.google.protobuf.ByteString
        getTableBytes(int index) {
      return table_.getByteString(index);
    }
    /**
     * <code>repeated string table = 1;</code>
     * @param index The index to set the value at.
     * @param value The table to set.
     * @return This builder for chaining.
     */
    public Builder setTable(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTableIsMutable();
      table_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string table = 1;</code>
     * @param value The table to add.
     * @return This builder for chaining.
     */
    public Builder addTable(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTableIsMutable();
      table_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string table = 1;</code>
     * @param values The table to add.
     * @return This builder for chaining.
     */
    public Builder addAllTable(
        java.lang.Iterable<java.lang.String> values) {
      ensureTableIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, table_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string table = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTable() {
      table_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string table = 1;</code>
     * @param value The bytes of the table to add.
     * @return This builder for chaining.
     */
    public Builder addTableBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTableIsMutable();
      table_.add(value);
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


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.GetAllTablesPResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.GetAllTablesPResponse)
  private static final alluxio.grpc.table.GetAllTablesPResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.GetAllTablesPResponse();
  }

  public static alluxio.grpc.table.GetAllTablesPResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetAllTablesPResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllTablesPResponse>() {
    @java.lang.Override
    public GetAllTablesPResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAllTablesPResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAllTablesPResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllTablesPResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public alluxio.grpc.table.GetAllTablesPResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
