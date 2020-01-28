/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.model.RecognitionOutcome;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of recognizing an image
 */
@ApiModel(description = "Result of recognizing an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-27T21:27:43.588-08:00")
public class ImageDescriptionResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Highconfidence")
  private Boolean highconfidence = null;

  @SerializedName("BestOutcome")
  private RecognitionOutcome bestOutcome = null;

  @SerializedName("RunnerUpOutcome")
  private RecognitionOutcome runnerUpOutcome = null;

  public ImageDescriptionResponse successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Was the image processed successfully?
   * @return successful
  **/
  @ApiModelProperty(value = "Was the image processed successfully?")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public ImageDescriptionResponse highconfidence(Boolean highconfidence) {
    this.highconfidence = highconfidence;
    return this;
  }

   /**
   * Is the resulting best outcome recognition a high confidence outcome?
   * @return highconfidence
  **/
  @ApiModelProperty(value = "Is the resulting best outcome recognition a high confidence outcome?")
  public Boolean isHighconfidence() {
    return highconfidence;
  }

  public void setHighconfidence(Boolean highconfidence) {
    this.highconfidence = highconfidence;
  }

  public ImageDescriptionResponse bestOutcome(RecognitionOutcome bestOutcome) {
    this.bestOutcome = bestOutcome;
    return this;
  }

   /**
   * The best Machine Learning outcome
   * @return bestOutcome
  **/
  @ApiModelProperty(value = "The best Machine Learning outcome")
  public RecognitionOutcome getBestOutcome() {
    return bestOutcome;
  }

  public void setBestOutcome(RecognitionOutcome bestOutcome) {
    this.bestOutcome = bestOutcome;
  }

  public ImageDescriptionResponse runnerUpOutcome(RecognitionOutcome runnerUpOutcome) {
    this.runnerUpOutcome = runnerUpOutcome;
    return this;
  }

   /**
   * Best backup (\&quot;runner up\&quot;) Machine Learning outcome
   * @return runnerUpOutcome
  **/
  @ApiModelProperty(value = "Best backup (\"runner up\") Machine Learning outcome")
  public RecognitionOutcome getRunnerUpOutcome() {
    return runnerUpOutcome;
  }

  public void setRunnerUpOutcome(RecognitionOutcome runnerUpOutcome) {
    this.runnerUpOutcome = runnerUpOutcome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDescriptionResponse imageDescriptionResponse = (ImageDescriptionResponse) o;
    return Objects.equals(this.successful, imageDescriptionResponse.successful) &&
        Objects.equals(this.highconfidence, imageDescriptionResponse.highconfidence) &&
        Objects.equals(this.bestOutcome, imageDescriptionResponse.bestOutcome) &&
        Objects.equals(this.runnerUpOutcome, imageDescriptionResponse.runnerUpOutcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, highconfidence, bestOutcome, runnerUpOutcome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDescriptionResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    highconfidence: ").append(toIndentedString(highconfidence)).append("\n");
    sb.append("    bestOutcome: ").append(toIndentedString(bestOutcome)).append("\n");
    sb.append("    runnerUpOutcome: ").append(toIndentedString(runnerUpOutcome)).append("\n");
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

