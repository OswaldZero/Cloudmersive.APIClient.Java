/*
 * nlpapi
 * The powerful Natural Language Processing APIs let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
import com.cloudmersive.client.model.WordPosition;
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
 * Words in input string
 */
@ApiModel(description = "Words in input string")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-17T17:08:56.472-08:00")
public class GetWordsJsonResponse {
  @SerializedName("Words")
  private List<WordPosition> words = null;

  public GetWordsJsonResponse words(List<WordPosition> words) {
    this.words = words;
    return this;
  }

  public GetWordsJsonResponse addWordsItem(WordPosition wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<WordPosition>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Array of words
   * @return words
  **/
  @ApiModelProperty(value = "Array of words")
  public List<WordPosition> getWords() {
    return words;
  }

  public void setWords(List<WordPosition> words) {
    this.words = words;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWordsJsonResponse getWordsJsonResponse = (GetWordsJsonResponse) o;
    return Objects.equals(this.words, getWordsJsonResponse.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(words);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWordsJsonResponse {\n");
    
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

