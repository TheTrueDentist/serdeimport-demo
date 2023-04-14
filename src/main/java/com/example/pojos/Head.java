package com.example.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonPropertyOrder({
    "theTitle"
})
@Generated("jsonschema2pojo")
public class Head {

  @JsonProperty("theTitle")
  private String title;

  @JsonProperty("theTitle")
  public String getTitle() {
    return title;
  }

  @JsonProperty("theTitle")
  public void setTitle(String title) {
    this.title = title;
  }
}
