/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.OcrLineElement;
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
 * OCR results of a page, including lines of text and their location
 */
@ApiModel(description = "OCR results of a page, including lines of text and their location")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-22T16:22:12.339-08:00")
public class OcrPageResultWithLinesWithLocation {
  @SerializedName("PageNumber")
  private Integer pageNumber = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Lines")
  private List<OcrLineElement> lines = null;

  public OcrPageResultWithLinesWithLocation pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Page number of the page that was OCR-ed, starting with 1 for the first page in the PDF file")
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  public OcrPageResultWithLinesWithLocation successful(Boolean successful) {
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

  public OcrPageResultWithLinesWithLocation lines(List<OcrLineElement> lines) {
    this.lines = lines;
    return this;
  }

  public OcrPageResultWithLinesWithLocation addLinesItem(OcrLineElement linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<OcrLineElement>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Word elements in the image
   * @return lines
  **/
  @ApiModelProperty(value = "Word elements in the image")
  public List<OcrLineElement> getLines() {
    return lines;
  }

  public void setLines(List<OcrLineElement> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrPageResultWithLinesWithLocation ocrPageResultWithLinesWithLocation = (OcrPageResultWithLinesWithLocation) o;
    return Objects.equals(this.pageNumber, ocrPageResultWithLinesWithLocation.pageNumber) &&
        Objects.equals(this.successful, ocrPageResultWithLinesWithLocation.successful) &&
        Objects.equals(this.lines, ocrPageResultWithLinesWithLocation.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, successful, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrPageResultWithLinesWithLocation {\n");
    
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

