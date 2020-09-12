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
import com.cloudmersive.client.model.XlsxSpreadsheetRow;
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
 * Input to Create a new Spreadsheet request
 */
@ApiModel(description = "Input to Create a new Spreadsheet request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-11T21:21:17.482-07:00")
public class CreateSpreadsheetFromDataRequest {
  @SerializedName("WorksheetName")
  private String worksheetName = null;

  @SerializedName("Rows")
  private List<XlsxSpreadsheetRow> rows = null;

  public CreateSpreadsheetFromDataRequest worksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
    return this;
  }

   /**
   * Optional; The new Spreadsheet will have a default Worksheet in it; supply a name, or if left empty, will default to Worksheet1
   * @return worksheetName
  **/
  @ApiModelProperty(value = "Optional; The new Spreadsheet will have a default Worksheet in it; supply a name, or if left empty, will default to Worksheet1")
  public String getWorksheetName() {
    return worksheetName;
  }

  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }

  public CreateSpreadsheetFromDataRequest rows(List<XlsxSpreadsheetRow> rows) {
    this.rows = rows;
    return this;
  }

  public CreateSpreadsheetFromDataRequest addRowsItem(XlsxSpreadsheetRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<XlsxSpreadsheetRow>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Required; Rows and cells to populate the spreadsheet with
   * @return rows
  **/
  @ApiModelProperty(value = "Required; Rows and cells to populate the spreadsheet with")
  public List<XlsxSpreadsheetRow> getRows() {
    return rows;
  }

  public void setRows(List<XlsxSpreadsheetRow> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSpreadsheetFromDataRequest createSpreadsheetFromDataRequest = (CreateSpreadsheetFromDataRequest) o;
    return Objects.equals(this.worksheetName, createSpreadsheetFromDataRequest.worksheetName) &&
        Objects.equals(this.rows, createSpreadsheetFromDataRequest.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worksheetName, rows);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSpreadsheetFromDataRequest {\n");
    
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

