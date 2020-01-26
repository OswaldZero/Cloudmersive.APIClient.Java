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
 * Column in an Excel spreadsheet worksheet
 */
@ApiModel(description = "Column in an Excel spreadsheet worksheet")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-25T16:38:36.461-08:00")
public class XlsxSpreadsheetColumn {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("HeadingCell")
  private XlsxSpreadsheetCell headingCell = null;

  public XlsxSpreadsheetColumn path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new rows
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new rows")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public XlsxSpreadsheetColumn headingCell(XlsxSpreadsheetCell headingCell) {
    this.headingCell = headingCell;
    return this;
  }

   /**
   * Heading cell for this column
   * @return headingCell
  **/
  @ApiModelProperty(value = "Heading cell for this column")
  public XlsxSpreadsheetCell getHeadingCell() {
    return headingCell;
  }

  public void setHeadingCell(XlsxSpreadsheetCell headingCell) {
    this.headingCell = headingCell;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxSpreadsheetColumn xlsxSpreadsheetColumn = (XlsxSpreadsheetColumn) o;
    return Objects.equals(this.path, xlsxSpreadsheetColumn.path) &&
        Objects.equals(this.headingCell, xlsxSpreadsheetColumn.headingCell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, headingCell);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxSpreadsheetColumn {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    headingCell: ").append(toIndentedString(headingCell)).append("\n");
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

