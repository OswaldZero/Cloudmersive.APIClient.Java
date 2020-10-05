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
import com.cloudmersive.client.model.DocxTableRow;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Update Table Row request
 */
@ApiModel(description = "Input to a Update Table Row request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-04T21:04:26.588-07:00")
public class UpdateDocxTableRowRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("RowToUpdate")
  private DocxTableRow rowToUpdate = null;

  @SerializedName("TableRowIndex")
  private Integer tableRowIndex = null;

  @SerializedName("ExistingTablePath")
  private String existingTablePath = null;

  public UpdateDocxTableRowRequest inputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }

  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }

  public UpdateDocxTableRowRequest inputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  public String getInputFileUrl() {
    return inputFileUrl;
  }

  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }

  public UpdateDocxTableRowRequest rowToUpdate(DocxTableRow rowToUpdate) {
    this.rowToUpdate = rowToUpdate;
    return this;
  }

   /**
   * Table row contents you would like to update the row with
   * @return rowToUpdate
  **/
  @ApiModelProperty(value = "Table row contents you would like to update the row with")
  public DocxTableRow getRowToUpdate() {
    return rowToUpdate;
  }

  public void setRowToUpdate(DocxTableRow rowToUpdate) {
    this.rowToUpdate = rowToUpdate;
  }

  public UpdateDocxTableRowRequest tableRowIndex(Integer tableRowIndex) {
    this.tableRowIndex = tableRowIndex;
    return this;
  }

   /**
   * 0-based index of the Table Row to update
   * @return tableRowIndex
  **/
  @ApiModelProperty(value = "0-based index of the Table Row to update")
  public Integer getTableRowIndex() {
    return tableRowIndex;
  }

  public void setTableRowIndex(Integer tableRowIndex) {
    this.tableRowIndex = tableRowIndex;
  }

  public UpdateDocxTableRowRequest existingTablePath(String existingTablePath) {
    this.existingTablePath = existingTablePath;
    return this;
  }

   /**
   * Required; the path to the existing table to modify
   * @return existingTablePath
  **/
  @ApiModelProperty(value = "Required; the path to the existing table to modify")
  public String getExistingTablePath() {
    return existingTablePath;
  }

  public void setExistingTablePath(String existingTablePath) {
    this.existingTablePath = existingTablePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDocxTableRowRequest updateDocxTableRowRequest = (UpdateDocxTableRowRequest) o;
    return Arrays.equals(this.inputFileBytes, updateDocxTableRowRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, updateDocxTableRowRequest.inputFileUrl) &&
        Objects.equals(this.rowToUpdate, updateDocxTableRowRequest.rowToUpdate) &&
        Objects.equals(this.tableRowIndex, updateDocxTableRowRequest.tableRowIndex) &&
        Objects.equals(this.existingTablePath, updateDocxTableRowRequest.existingTablePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, rowToUpdate, tableRowIndex, existingTablePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDocxTableRowRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    rowToUpdate: ").append(toIndentedString(rowToUpdate)).append("\n");
    sb.append("    tableRowIndex: ").append(toIndentedString(tableRowIndex)).append("\n");
    sb.append("    existingTablePath: ").append(toIndentedString(existingTablePath)).append("\n");
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

