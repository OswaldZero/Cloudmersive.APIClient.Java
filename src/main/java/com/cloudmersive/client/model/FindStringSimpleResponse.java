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
import com.cloudmersive.client.model.FindStringMatch;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Result of finding a string
 */
@ApiModel(description = "Result of finding a string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-30T15:26:08.828-07:00")
public class FindStringSimpleResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Matches")
  private List<FindStringMatch> matches = null;

  @SerializedName("MatchCount")
  private Integer matchCount = null;

  public FindStringSimpleResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public FindStringSimpleResponse matches(List<FindStringMatch> matches) {
    this.matches = matches;
    return this;
  }

  public FindStringSimpleResponse addMatchesItem(FindStringMatch matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<FindStringMatch>();
    }
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Found matches
   * @return matches
  **/
  @ApiModelProperty(value = "Found matches")
  public List<FindStringMatch> getMatches() {
    return matches;
  }

  public void setMatches(List<FindStringMatch> matches) {
    this.matches = matches;
  }

  public FindStringSimpleResponse matchCount(Integer matchCount) {
    this.matchCount = matchCount;
    return this;
  }

   /**
   * The number of matches
   * @return matchCount
  **/
  @ApiModelProperty(value = "The number of matches")
  public Integer getMatchCount() {
    return matchCount;
  }

  public void setMatchCount(Integer matchCount) {
    this.matchCount = matchCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindStringSimpleResponse findStringSimpleResponse = (FindStringSimpleResponse) o;
    return Objects.equals(this.successful, findStringSimpleResponse.successful) &&
        Objects.equals(this.matches, findStringSimpleResponse.matches) &&
        Objects.equals(this.matchCount, findStringSimpleResponse.matchCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, matches, matchCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindStringSimpleResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
    sb.append("    matchCount: ").append(toIndentedString(matchCount)).append("\n");
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

