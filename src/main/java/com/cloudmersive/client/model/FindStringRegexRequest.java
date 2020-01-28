/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to find a string in a string
 */
@ApiModel(description = "Request to find a string in a string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-27T21:27:50.029-08:00")
public class FindStringRegexRequest {
  @SerializedName("TextContent")
  private String textContent = null;

  @SerializedName("TargetRegex")
  private String targetRegex = null;

  @SerializedName("MatchCase")
  private Boolean matchCase = null;

  public FindStringRegexRequest textContent(String textContent) {
    this.textContent = textContent;
    return this;
  }

   /**
   * Input text content
   * @return textContent
  **/
  @ApiModelProperty(value = "Input text content")
  public String getTextContent() {
    return textContent;
  }

  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }

  public FindStringRegexRequest targetRegex(String targetRegex) {
    this.targetRegex = targetRegex;
    return this;
  }

   /**
   * Target input regular expression (regex) to find
   * @return targetRegex
  **/
  @ApiModelProperty(value = "Target input regular expression (regex) to find")
  public String getTargetRegex() {
    return targetRegex;
  }

  public void setTargetRegex(String targetRegex) {
    this.targetRegex = targetRegex;
  }

  public FindStringRegexRequest matchCase(Boolean matchCase) {
    this.matchCase = matchCase;
    return this;
  }

   /**
   * Set to True to match case, False to ignore case
   * @return matchCase
  **/
  @ApiModelProperty(value = "Set to True to match case, False to ignore case")
  public Boolean isMatchCase() {
    return matchCase;
  }

  public void setMatchCase(Boolean matchCase) {
    this.matchCase = matchCase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindStringRegexRequest findStringRegexRequest = (FindStringRegexRequest) o;
    return Objects.equals(this.textContent, findStringRegexRequest.textContent) &&
        Objects.equals(this.targetRegex, findStringRegexRequest.targetRegex) &&
        Objects.equals(this.matchCase, findStringRegexRequest.matchCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContent, targetRegex, matchCase);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindStringRegexRequest {\n");
    
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    targetRegex: ").append(toIndentedString(targetRegex)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
