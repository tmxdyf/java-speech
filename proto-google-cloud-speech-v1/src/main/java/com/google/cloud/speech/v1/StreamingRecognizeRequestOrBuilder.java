/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface StreamingRecognizeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.StreamingRecognizeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.StreamingRecognitionConfig streaming_config = 1;</code>
   */
  boolean hasStreamingConfig();
  /**
   *
   *
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.StreamingRecognitionConfig streaming_config = 1;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionConfig getStreamingConfig();
  /**
   *
   *
   * <pre>
   * Provides information to the recognizer that specifies how to process the
   * request. The first `StreamingRecognizeRequest` message must contain a
   * `streaming_config`  message.
   * </pre>
   *
   * <code>.google.cloud.speech.v1.StreamingRecognitionConfig streaming_config = 1;</code>
   */
  com.google.cloud.speech.v1.StreamingRecognitionConfigOrBuilder getStreamingConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The audio data to be recognized. Sequential chunks of audio data are sent
   * in sequential `StreamingRecognizeRequest` messages. The first
   * `StreamingRecognizeRequest` message must not contain `audio_content` data
   * and all subsequent `StreamingRecognizeRequest` messages must contain
   * `audio_content` data. The audio bytes must be encoded as specified in
   * `RecognitionConfig`. Note: as with all bytes fields, protobuffers use a
   * pure binary representation (not base64). See
   * [content limits](/speech-to-text/quotas#content).
   * </pre>
   *
   * <code>bytes audio_content = 2;</code>
   */
  com.google.protobuf.ByteString getAudioContent();

  public com.google.cloud.speech.v1.StreamingRecognizeRequest.StreamingRequestCase
      getStreamingRequestCase();
}