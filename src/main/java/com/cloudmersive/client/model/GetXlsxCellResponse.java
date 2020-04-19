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
import com.cloudmersive.client.model.XlsxSpreadsheetCell;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Result of running a Get-Cell command
 */
@ApiModel(description = "Result of running a Get-Cell command")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-18T23:27:26.293-07:00")
public class GetXlsxCellResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Cell")
  private XlsxSpreadsheetCell cell = null;

  public GetXlsxCellResponse successful(Boolean successful) {
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

  public GetXlsxCellResponse cell(XlsxSpreadsheetCell cell) {
    this.cell = cell;
    return this;
  }

   /**
   * Requested Cell in the Excel XLSX document
   * @return cell
  **/
  @ApiModelProperty(value = "Requested Cell in the Excel XLSX document")
  public XlsxSpreadsheetCell getCell() {
    return cell;
  }

  public void setCell(XlsxSpreadsheetCell cell) {
    this.cell = cell;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxCellResponse getXlsxCellResponse = (GetXlsxCellResponse) o;
    return Objects.equals(this.successful, getXlsxCellResponse.successful) &&
        Objects.equals(this.cell, getXlsxCellResponse.cell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, cell);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxCellResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
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

