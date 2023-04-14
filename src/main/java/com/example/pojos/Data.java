package com.example.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonPropertyOrder({
    "theString",
    "theInnerData"
})
@Generated("jsonschema2pojo")
public class Data {

  @JsonProperty("theString")
  private String myString;

  @JsonProperty("theInnerData")
  private InnerData innerData;

  @JsonProperty("theString")
  public String getMyString() {
    return myString;
  }

  @JsonProperty("theString")
  public void setMyString(String myString) {
    this.myString = myString;
  }

  @JsonProperty("theInnerData")
  public InnerData getInnerData() {
    return innerData;
  }

  @JsonProperty("theInnerData")
  public void setInnerData(InnerData innerData) {
    this.innerData = innerData;
  }
}
