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
import java.util.ArrayList;
import java.util.List;

/**
 * Individual regular expression match result of finding a target regex in a longer text string
 */
@ApiModel(description = "Individual regular expression match result of finding a target regex in a longer text string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-27T21:27:50.029-08:00")
public class FindRegexMatch {
  @SerializedName("CharacterOffsetStart")
  private Integer characterOffsetStart = null;

  @SerializedName("CharacterOffsetEnd")
  private Integer characterOffsetEnd = null;

  @SerializedName("ContainingLine")
  private String containingLine = null;

  @SerializedName("MatchValue")
  private String matchValue = null;

  @SerializedName("MatchGroups")
  private List<String> matchGroups = null;

  public FindRegexMatch characterOffsetStart(Integer characterOffsetStart) {
    this.characterOffsetStart = characterOffsetStart;
    return this;
  }

   /**
   * 0-based index of the start of the match
   * @return characterOffsetStart
  **/
  @ApiModelProperty(value = "0-based index of the start of the match")
  public Integer getCharacterOffsetStart() {
    return characterOffsetStart;
  }

  public void setCharacterOffsetStart(Integer characterOffsetStart) {
    this.characterOffsetStart = characterOffsetStart;
  }

  public FindRegexMatch characterOffsetEnd(Integer characterOffsetEnd) {
    this.characterOffsetEnd = characterOffsetEnd;
    return this;
  }

   /**
   * 0-based index of the end of the match
   * @return characterOffsetEnd
  **/
  @ApiModelProperty(value = "0-based index of the end of the match")
  public Integer getCharacterOffsetEnd() {
    return characterOffsetEnd;
  }

  public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
    this.characterOffsetEnd = characterOffsetEnd;
  }

  public FindRegexMatch containingLine(String containingLine) {
    this.containingLine = containingLine;
    return this;
  }

   /**
   * Text content of the line containing the match
   * @return containingLine
  **/
  @ApiModelProperty(value = "Text content of the line containing the match")
  public String getContainingLine() {
    return containingLine;
  }

  public void setContainingLine(String containingLine) {
    this.containingLine = containingLine;
  }

  public FindRegexMatch matchValue(String matchValue) {
    this.matchValue = matchValue;
    return this;
  }

   /**
   * The match value
   * @return matchValue
  **/
  @ApiModelProperty(value = "The match value")
  public String getMatchValue() {
    return matchValue;
  }

  public void setMatchValue(String matchValue) {
    this.matchValue = matchValue;
  }

  public FindRegexMatch matchGroups(List<String> matchGroups) {
    this.matchGroups = matchGroups;
    return this;
  }

  public FindRegexMatch addMatchGroupsItem(String matchGroupsItem) {
    if (this.matchGroups == null) {
      this.matchGroups = new ArrayList<String>();
    }
    this.matchGroups.add(matchGroupsItem);
    return this;
  }

   /**
   * Regular expression regex match groups; these correspond to the match values
   * @return matchGroups
  **/
  @ApiModelProperty(value = "Regular expression regex match groups; these correspond to the match values")
  public List<String> getMatchGroups() {
    return matchGroups;
  }

  public void setMatchGroups(List<String> matchGroups) {
    this.matchGroups = matchGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindRegexMatch findRegexMatch = (FindRegexMatch) o;
    return Objects.equals(this.characterOffsetStart, findRegexMatch.characterOffsetStart) &&
        Objects.equals(this.characterOffsetEnd, findRegexMatch.characterOffsetEnd) &&
        Objects.equals(this.containingLine, findRegexMatch.containingLine) &&
        Objects.equals(this.matchValue, findRegexMatch.matchValue) &&
        Objects.equals(this.matchGroups, findRegexMatch.matchGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterOffsetStart, characterOffsetEnd, containingLine, matchValue, matchGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindRegexMatch {\n");
    
    sb.append("    characterOffsetStart: ").append(toIndentedString(characterOffsetStart)).append("\n");
    sb.append("    characterOffsetEnd: ").append(toIndentedString(characterOffsetEnd)).append("\n");
    sb.append("    containingLine: ").append(toIndentedString(containingLine)).append("\n");
    sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
    sb.append("    matchGroups: ").append(toIndentedString(matchGroups)).append("\n");
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
