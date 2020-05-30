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
 * Validation error found in document
 */
@ApiModel(description = "Validation error found in document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-30T15:26:08.828-07:00")
public class DocumentValidationError {
  @SerializedName("Description")
  private String description = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Uri")
  private String uri = null;

  @SerializedName("IsError")
  private Boolean isError = null;

  public DocumentValidationError description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the error
   * @return description
  **/
  @ApiModelProperty(value = "Description of the error")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DocumentValidationError path(String path) {
    this.path = path;
    return this;
  }

   /**
   * XPath to the error
   * @return path
  **/
  @ApiModelProperty(value = "XPath to the error")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocumentValidationError uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * URI of the part in question
   * @return uri
  **/
  @ApiModelProperty(value = "URI of the part in question")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public DocumentValidationError isError(Boolean isError) {
    this.isError = isError;
    return this;
  }

   /**
   * True if this is an error, false otherwise
   * @return isError
  **/
  @ApiModelProperty(value = "True if this is an error, false otherwise")
  public Boolean isIsError() {
    return isError;
  }

  public void setIsError(Boolean isError) {
    this.isError = isError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentValidationError documentValidationError = (DocumentValidationError) o;
    return Objects.equals(this.description, documentValidationError.description) &&
        Objects.equals(this.path, documentValidationError.path) &&
        Objects.equals(this.uri, documentValidationError.uri) &&
        Objects.equals(this.isError, documentValidationError.isError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, path, uri, isError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentValidationError {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    isError: ").append(toIndentedString(isError)).append("\n");
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

