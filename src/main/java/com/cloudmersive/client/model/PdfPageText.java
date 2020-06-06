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
 * Text of a single page of a PDF
 */
@ApiModel(description = "Text of a single page of a PDF")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-06T11:46:46.080-07:00")
public class PdfPageText {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("PageText")
  private String pageText = null;

  public PdfPageText pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the page (1-based)
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of the page (1-based)")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public PdfPageText pageText(String pageText) {
    this.pageText = pageText;
    return this;
  }

   /**
   * Text of the page
   * @return pageText
  **/
  @ApiModelProperty(value = "Text of the page")
  public String getPageText() {
    return pageText;
  }

  public void setPageText(String pageText) {
    this.pageText = pageText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfPageText pdfPageText = (PdfPageText) o;
    return Objects.equals(this.pageNumber, pdfPageText.pageNumber) &&
        Objects.equals(this.pageText, pdfPageText.pageText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfPageText {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageText: ").append(toIndentedString(pageText)).append("\n");
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

