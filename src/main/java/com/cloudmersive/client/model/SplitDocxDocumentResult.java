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
import com.cloudmersive.client.model.SplitDocumentResult;
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
 * The result of splitting a Word document into individual Word DOCX pages
 */
@ApiModel(description = "The result of splitting a Word document into individual Word DOCX pages")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-12T22:12:10.795-07:00")
public class SplitDocxDocumentResult {
  @SerializedName("ResultDocuments")
  private List<SplitDocumentResult> resultDocuments = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  public SplitDocxDocumentResult resultDocuments(List<SplitDocumentResult> resultDocuments) {
    this.resultDocuments = resultDocuments;
    return this;
  }

  public SplitDocxDocumentResult addResultDocumentsItem(SplitDocumentResult resultDocumentsItem) {
    if (this.resultDocuments == null) {
      this.resultDocuments = new ArrayList<SplitDocumentResult>();
    }
    this.resultDocuments.add(resultDocumentsItem);
    return this;
  }

   /**
   * Get resultDocuments
   * @return resultDocuments
  **/
  @ApiModelProperty(value = "")
  public List<SplitDocumentResult> getResultDocuments() {
    return resultDocuments;
  }

  public void setResultDocuments(List<SplitDocumentResult> resultDocuments) {
    this.resultDocuments = resultDocuments;
  }

  public SplitDocxDocumentResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitDocxDocumentResult splitDocxDocumentResult = (SplitDocxDocumentResult) o;
    return Objects.equals(this.resultDocuments, splitDocxDocumentResult.resultDocuments) &&
        Objects.equals(this.successful, splitDocxDocumentResult.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultDocuments, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitDocxDocumentResult {\n");
    
    sb.append("    resultDocuments: ").append(toIndentedString(resultDocuments)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

