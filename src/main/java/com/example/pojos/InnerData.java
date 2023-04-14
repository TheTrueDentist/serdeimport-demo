package com.example.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonPropertyOrder({
    "theInnerString"
})
@Generated("jsonschema2pojo")
public class InnerData {

  @JsonProperty("theInnerString")
  private String myInnerString;

  @JsonProperty("theInnerString")
  public String getMyInnerString() {
    return myInnerString;
  }

  @JsonProperty("theInnerString")
  public void setMyInnerString(String myInnerString) {
    this.myInnerString = myInnerString;
  }
}
