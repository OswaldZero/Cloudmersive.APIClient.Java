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
import com.cloudmersive.client.model.CorrectWordInSentenceJsonResponse;
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
 * Result of spell checking a sentence
 */
@ApiModel(description = "Result of spell checking a sentence")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-08T20:54:12.253-07:00")
public class CheckSentenceJsonResponse {
  @SerializedName("IncorrectCount")
  private Integer incorrectCount = null;

  @SerializedName("Words")
  private List<CorrectWordInSentenceJsonResponse> words = null;

  public CheckSentenceJsonResponse incorrectCount(Integer incorrectCount) {
    this.incorrectCount = incorrectCount;
    return this;
  }

   /**
   * Number of incorrect words
   * @return incorrectCount
  **/
  @ApiModelProperty(value = "Number of incorrect words")
  public Integer getIncorrectCount() {
    return incorrectCount;
  }

  public void setIncorrectCount(Integer incorrectCount) {
    this.incorrectCount = incorrectCount;
  }

  public CheckSentenceJsonResponse words(List<CorrectWordInSentenceJsonResponse> words) {
    this.words = words;
    return this;
  }

  public CheckSentenceJsonResponse addWordsItem(CorrectWordInSentenceJsonResponse wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<CorrectWordInSentenceJsonResponse>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Words in the sentence, both correct and incorrect
   * @return words
  **/
  @ApiModelProperty(value = "Words in the sentence, both correct and incorrect")
  public List<CorrectWordInSentenceJsonResponse> getWords() {
    return words;
  }

  public void setWords(List<CorrectWordInSentenceJsonResponse> words) {
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
    CheckSentenceJsonResponse checkSentenceJsonResponse = (CheckSentenceJsonResponse) o;
    return Objects.equals(this.incorrectCount, checkSentenceJsonResponse.incorrectCount) &&
        Objects.equals(this.words, checkSentenceJsonResponse.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incorrectCount, words);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckSentenceJsonResponse {\n");
    
    sb.append("    incorrectCount: ").append(toIndentedString(incorrectCount)).append("\n");
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

