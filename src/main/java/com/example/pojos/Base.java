package com.example.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public abstract class Base {

  @JsonProperty("myBaseField")
  private String baseField;

  @JsonProperty("myBaseField")
  public String getBaseField() {
    return baseField;
  }

  @JsonProperty("myBaseField")
  public void setBaseField(String baseField) {
    this.baseField = baseField;
  }
}
