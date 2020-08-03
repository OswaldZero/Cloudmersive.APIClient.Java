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
import com.cloudmersive.client.model.XlsxWorksheet;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Rename-Worksheet request
 */
@ApiModel(description = "Input to a Rename-Worksheet request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:46:36.696-07:00")
public class RenameXlsxWorksheetRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("WorksheetToRename")
  private XlsxWorksheet worksheetToRename = null;

  @SerializedName("NewWorksheetName")
  private String newWorksheetName = null;

  public RenameXlsxWorksheetRequest inputFileBytes(byte[] inputFileBytes) {
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

  public RenameXlsxWorksheetRequest inputFileUrl(String inputFileUrl) {
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

  public RenameXlsxWorksheetRequest worksheetToRename(XlsxWorksheet worksheetToRename) {
    this.worksheetToRename = worksheetToRename;
    return this;
  }

   /**
   * Optional; Worksheet (tab) within the spreadsheet to get the specific row from; leave blank to default to the first worksheet
   * @return worksheetToRename
  **/
  @ApiModelProperty(value = "Optional; Worksheet (tab) within the spreadsheet to get the specific row from; leave blank to default to the first worksheet")
  public XlsxWorksheet getWorksheetToRename() {
    return worksheetToRename;
  }

  public void setWorksheetToRename(XlsxWorksheet worksheetToRename) {
    this.worksheetToRename = worksheetToRename;
  }

  public RenameXlsxWorksheetRequest newWorksheetName(String newWorksheetName) {
    this.newWorksheetName = newWorksheetName;
    return this;
  }

   /**
   * Required; The new name to be used for the worksheet
   * @return newWorksheetName
  **/
  @ApiModelProperty(value = "Required; The new name to be used for the worksheet")
  public String getNewWorksheetName() {
    return newWorksheetName;
  }

  public void setNewWorksheetName(String newWorksheetName) {
    this.newWorksheetName = newWorksheetName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenameXlsxWorksheetRequest renameXlsxWorksheetRequest = (RenameXlsxWorksheetRequest) o;
    return Arrays.equals(this.inputFileBytes, renameXlsxWorksheetRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, renameXlsxWorksheetRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToRename, renameXlsxWorksheetRequest.worksheetToRename) &&
        Objects.equals(this.newWorksheetName, renameXlsxWorksheetRequest.newWorksheetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToRename, newWorksheetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenameXlsxWorksheetRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToRename: ").append(toIndentedString(worksheetToRename)).append("\n");
    sb.append("    newWorksheetName: ").append(toIndentedString(newWorksheetName)).append("\n");
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

