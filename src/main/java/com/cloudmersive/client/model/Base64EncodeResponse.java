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
 * Result of base 64 encoding
 */
@ApiModel(description = "Result of base 64 encoding")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-30T15:26:08.828-07:00")
public class Base64EncodeResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Base64TextContentResult")
  private String base64TextContentResult = null;

  public Base64EncodeResponse successful(Boolean successful) {
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

  public Base64EncodeResponse base64TextContentResult(String base64TextContentResult) {
    this.base64TextContentResult = base64TextContentResult;
    return this;
  }

   /**
   * Result of performing a base 64 encoding operation, a text string representing the encoded original file content
   * @return base64TextContentResult
  **/
  @ApiModelProperty(value = "Result of performing a base 64 encoding operation, a text string representing the encoded original file content")
  public String getBase64TextContentResult() {
    return base64TextContentResult;
  }

  public void setBase64TextContentResult(String base64TextContentResult) {
    this.base64TextContentResult = base64TextContentResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64EncodeResponse base64EncodeResponse = (Base64EncodeResponse) o;
    return Objects.equals(this.successful, base64EncodeResponse.successful) &&
        Objects.equals(this.base64TextContentResult, base64EncodeResponse.base64TextContentResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, base64TextContentResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64EncodeResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    base64TextContentResult: ").append(toIndentedString(base64TextContentResult)).append("\n");
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

