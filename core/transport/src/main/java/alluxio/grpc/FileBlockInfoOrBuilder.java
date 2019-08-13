// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface FileBlockInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.FileBlockInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.BlockInfo blockInfo = 1;</code>
   */
  boolean hasBlockInfo();
  /**
   * <code>optional .alluxio.grpc.BlockInfo blockInfo = 1;</code>
   */
  alluxio.grpc.BlockInfo getBlockInfo();
  /**
   * <code>optional .alluxio.grpc.BlockInfo blockInfo = 1;</code>
   */
  alluxio.grpc.BlockInfoOrBuilder getBlockInfoOrBuilder();

  /**
   * <code>optional int64 offset = 2;</code>
   */
  boolean hasOffset();
  /**
   * <code>optional int64 offset = 2;</code>
   */
  long getOffset();

  /**
   * <pre>
   * deprecated since 1.1 will be removed in 2.0 (replaced by ufsStringLocations)
   * </pre>
   *
   * <code>repeated .alluxio.grpc.WorkerNetAddress ufsLocations = 3;</code>
   */
  java.util.List<alluxio.grpc.WorkerNetAddress> 
      getUfsLocationsList();
  /**
   * <pre>
   * deprecated since 1.1 will be removed in 2.0 (replaced by ufsStringLocations)
   * </pre>
   *
   * <code>repeated .alluxio.grpc.WorkerNetAddress ufsLocations = 3;</code>
   */
  alluxio.grpc.WorkerNetAddress getUfsLocations(int index);
  /**
   * <pre>
   * deprecated since 1.1 will be removed in 2.0 (replaced by ufsStringLocations)
   * </pre>
   *
   * <code>repeated .alluxio.grpc.WorkerNetAddress ufsLocations = 3;</code>
   */
  int getUfsLocationsCount();
  /**
   * <pre>
   * deprecated since 1.1 will be removed in 2.0 (replaced by ufsStringLocations)
   * </pre>
   *
   * <code>repeated .alluxio.grpc.WorkerNetAddress ufsLocations = 3;</code>
   */
  java.util.List<? extends alluxio.grpc.WorkerNetAddressOrBuilder> 
      getUfsLocationsOrBuilderList();
  /**
   * <pre>
   * deprecated since 1.1 will be removed in 2.0 (replaced by ufsStringLocations)
   * </pre>
   *
   * <code>repeated .alluxio.grpc.WorkerNetAddress ufsLocations = 3;</code>
   */
  alluxio.grpc.WorkerNetAddressOrBuilder getUfsLocationsOrBuilder(
      int index);

  /**
   * <code>repeated string ufsStringLocations = 4;</code>
   */
  java.util.List<java.lang.String>
      getUfsStringLocationsList();
  /**
   * <code>repeated string ufsStringLocations = 4;</code>
   */
  int getUfsStringLocationsCount();
  /**
   * <code>repeated string ufsStringLocations = 4;</code>
   */
  java.lang.String getUfsStringLocations(int index);
  /**
   * <code>repeated string ufsStringLocations = 4;</code>
   */
  com.google.protobuf.ByteString
      getUfsStringLocationsBytes(int index);
}