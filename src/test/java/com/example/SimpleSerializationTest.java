package com.example;

import com.example.pojos.Container;
import com.example.pojos.Data;
import com.example.pojos.Head;
import com.example.pojos.InnerData;
import com.example.util.JsonSerdeFactory;

import org.apache.kafka.common.serialization.Serde;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class SimpleSerializationTest {

  @Inject
  private JsonSerdeFactory serdeFactory;

  @Test
  public void myTest() {
    Head head = new Head();
    head.setTitle("cool title");

    InnerData innerData = new InnerData();
    innerData.setMyInnerString("cool inner string");

    Data data = new Data();
    data.setMyString("cool string");
    data.setInnerData(innerData);

    Container container = new Container();
    container.setHead(head);
    container.setData(data);
    container.setBaseField("cool base string");

    try (Serde<Container> serde = serdeFactory.create(Container.class)) {
       byte[] bytes = serde.serializer().serialize(null, container);
      String json = new String(bytes, StandardCharsets.UTF_8);

      Assertions.assertEquals("{\"theHead\":{\"theTitle\":\"cool title\"},\"theData\":{\"theString\":\"cool string\",\"theInnerData\":{\"theInnerString\":\"cool inner string\"}},\"myBaseField\":\"cool base string\"}",
          json);
    }
  }
}
