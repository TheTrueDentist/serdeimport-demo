package com.example.util;

import io.micronaut.serde.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;

import java.io.IOException;

@Singleton
public class JsonSerdeFactory {

  @Inject
  private ObjectMapper objectMapper;

  private <T> byte[] serialize(T data) {
    try {
      return data != null ? objectMapper.writeValueAsBytes(data) : null;
    } catch (IOException e) {
      throw new RuntimeException("Fehler beim Serialisieren nach JSON.", e);
    }
  }

  private <T> T deserialize(byte[] data, Class<T> clazz) {
    try {
      return data != null ? objectMapper.readValue(data, clazz) : null;
    } catch (IOException e) {
      throw new RuntimeException("Fehler beim Deserialisieren aus JSON.", e);
    }
  }

  public <T> Serde<T> create(Class<T> clazz) {
    return Serdes.serdeFrom((topic, data) -> serialize(data), (topic, data) -> deserialize(data, clazz));
  }
}
