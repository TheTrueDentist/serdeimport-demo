package com.example.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonPropertyOrder({
    "theHead",
    "theData",
    "myBaseField"
})
@Generated("jsonschema2pojo")
public class Container extends Base {

  @JsonProperty("theHead")
  private Head head;

  @JsonProperty("theData")
  private Data data;

  @JsonProperty("theHead")
  public Head getHead() {
    return head;
  }

  @JsonProperty("theHead")
  public void setHead(Head head) {
    this.head = head;
  }

  @JsonProperty("theData")
  public Data getData() {
    return data;
  }

  @JsonProperty("theData")
  public void setData(Data data) {
    this.data = data;
  }
}
