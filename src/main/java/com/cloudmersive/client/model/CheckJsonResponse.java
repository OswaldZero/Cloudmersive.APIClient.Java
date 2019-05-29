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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Spell check result
 */
@ApiModel(description = "Spell check result")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-28T21:29:44.851-07:00")
public class CheckJsonResponse {
  @SerializedName("Correct")
  private Boolean correct = null;

  public CheckJsonResponse correct(Boolean correct) {
    this.correct = correct;
    return this;
  }

   /**
   * True if spellected correctly, false otherwise
   * @return correct
  **/
  @ApiModelProperty(value = "True if spellected correctly, false otherwise")
  public Boolean isCorrect() {
    return correct;
  }

  public void setCorrect(Boolean correct) {
    this.correct = correct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckJsonResponse checkJsonResponse = (CheckJsonResponse) o;
    return Objects.equals(this.correct, checkJsonResponse.correct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckJsonResponse {\n");
    
    sb.append("    correct: ").append(toIndentedString(correct)).append("\n");
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

