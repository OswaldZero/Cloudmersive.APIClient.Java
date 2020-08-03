/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Spelling correction check result
 */
@ApiModel(description = "Spelling correction check result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:46:23.111-07:00")
public class CheckWordResponse {
  @SerializedName("Correct")
  private Boolean correct = null;

  @SerializedName("Suggestions")
  private List<String> suggestions = null;

  public CheckWordResponse correct(Boolean correct) {
    this.correct = correct;
    return this;
  }

   /**
   * True if the word is spelled correctly, false otherwise
   * @return correct
  **/
  @ApiModelProperty(value = "True if the word is spelled correctly, false otherwise")
  public Boolean isCorrect() {
    return correct;
  }

  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }

  public CheckWordResponse suggestions(List<String> suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  public CheckWordResponse addSuggestionsItem(String suggestionsItem) {
    if (this.suggestions == null) {
      this.suggestions = new ArrayList<String>();
    }
    this.suggestions.add(suggestionsItem);
    return this;
  }

   /**
   * Suggested spelling corrections
   * @return suggestions
  **/
  @ApiModelProperty(value = "Suggested spelling corrections")
  public List<String> getSuggestions() {
    return suggestions;
  }

  public void setSuggestions(List<String> suggestions) {
    this.suggestions = suggestions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckWordResponse checkWordResponse = (CheckWordResponse) o;
    return Objects.equals(this.correct, checkWordResponse.correct) &&
        Objects.equals(this.suggestions, checkWordResponse.suggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correct, suggestions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckWordResponse {\n");
    
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
    sb.append("    suggestions: ").append(toIndentedString(suggestions)).append("\n");
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

