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
import com.cloudmersive.client.model.PdfMetadata;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to set PDF metadata
 */
@ApiModel(description = "Request to set PDF metadata")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T19:00:20.932-07:00")
public class SetPdfMetadataRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("MetadataToSet")
  private PdfMetadata metadataToSet = null;

  public SetPdfMetadataRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Input file contents bytes for the file to modify
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Input file contents bytes for the file to modify")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public SetPdfMetadataRequest metadataToSet(PdfMetadata metadataToSet) {
    this.metadataToSet = metadataToSet;
    return this;
  }

   /**
   * PDF metadata to set on the file
   * @return metadataToSet
  **/
  @ApiModelProperty(value = "PDF metadata to set on the file")
  public PdfMetadata getMetadataToSet() {
    return metadataToSet;
  }

  public void setMetadataToSet(PdfMetadata metadataToSet) {
    this.metadataToSet = metadataToSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPdfMetadataRequest setPdfMetadataRequest = (SetPdfMetadataRequest) o;
    return Arrays.equals(this.inputFileBytes, setPdfMetadataRequest.inputFileBytes) &&
        Objects.equals(this.metadataToSet, setPdfMetadataRequest.metadataToSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), metadataToSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPdfMetadataRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    metadataToSet: ").append(toIndentedString(metadataToSet)).append("\n");
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

