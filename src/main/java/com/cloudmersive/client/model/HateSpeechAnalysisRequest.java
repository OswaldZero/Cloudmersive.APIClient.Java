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

/**
 * Input to a hate speech analysis operation
 */
@ApiModel(description = "Input to a hate speech analysis operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-30T15:25:30.019-07:00")
public class HateSpeechAnalysisRequest {
  @SerializedName("TextToAnalyze")
  private String textToAnalyze = null;

  public HateSpeechAnalysisRequest textToAnalyze(String textToAnalyze) {
    this.textToAnalyze = textToAnalyze;
    return this;
  }

   /**
   * Text to analyze
   * @return textToAnalyze
  **/
  @ApiModelProperty(value = "Text to analyze")
  public String getTextToAnalyze() {
    return textToAnalyze;
  }

  public void setTextToAnalyze(String textToAnalyze) {
    this.textToAnalyze = textToAnalyze;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HateSpeechAnalysisRequest hateSpeechAnalysisRequest = (HateSpeechAnalysisRequest) o;
    return Objects.equals(this.textToAnalyze, hateSpeechAnalysisRequest.textToAnalyze);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToAnalyze);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HateSpeechAnalysisRequest {\n");
    
    sb.append("    textToAnalyze: ").append(toIndentedString(textToAnalyze)).append("\n");
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

