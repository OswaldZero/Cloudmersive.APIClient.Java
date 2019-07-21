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
import com.cloudmersive.client.model.DocxTable;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Input to a Insert Tables request
 */
@ApiModel(description = "Input to a Insert Tables request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-20T18:44:47.766-07:00")
public class InsertDocxTablesRequest {
  @SerializedName("InputFileBytes")
  private byte[] inputFileBytes = null;

  @SerializedName("InputFileUrl")
  private String inputFileUrl = null;

  @SerializedName("TableToInsert")
  private DocxTable tableToInsert = null;

  @SerializedName("InsertPlacement")
  private String insertPlacement = null;

  @SerializedName("InsertPath")
  private String insertPath = null;

  public InsertDocxTablesRequest inputFileBytes(byte[] inputFileBytes) {
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

  public InsertDocxTablesRequest inputFileUrl(String inputFileUrl) {
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

  public InsertDocxTablesRequest tableToInsert(DocxTable tableToInsert) {
    this.tableToInsert = tableToInsert;
    return this;
  }

   /**
   * Table you would like to insert
   * @return tableToInsert
  **/
  @ApiModelProperty(value = "Table you would like to insert")
  public DocxTable getTableToInsert() {
    return tableToInsert;
  }

  public void setTableToInsert(DocxTable tableToInsert) {
    this.tableToInsert = tableToInsert;
  }

  public InsertDocxTablesRequest insertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
    return this;
  }

   /**
   * Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)
   * @return insertPlacement
  **/
  @ApiModelProperty(value = "Optional; default is DocumentEnd.  Placement Type of the insert; possible values are: DocumentStart (very beginning of the document), DocumentEnd (very end of the document), BeforeExistingObject (right before an existing object - fill in the InsertPath field using the Path value from an existing object), AfterExistingObject (right after an existing object - fill in the InsertPath field using the Path value from an existing object)")
  public String getInsertPlacement() {
    return insertPlacement;
  }

  public void setInsertPlacement(String insertPlacement) {
    this.insertPlacement = insertPlacement;
  }

  public InsertDocxTablesRequest insertPath(String insertPath) {
    this.insertPath = insertPath;
    return this;
  }

   /**
   * Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject
   * @return insertPath
  **/
  @ApiModelProperty(value = "Optional; location within the document to insert the object; fill in the InsertPath field using the Path value from an existing object.  Used with InsertPlacement of BeforeExistingObject or AfterExistingObject")
  public String getInsertPath() {
    return insertPath;
  }

  public void setInsertPath(String insertPath) {
    this.insertPath = insertPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertDocxTablesRequest insertDocxTablesRequest = (InsertDocxTablesRequest) o;
    return Objects.equals(this.inputFileBytes, insertDocxTablesRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, insertDocxTablesRequest.inputFileUrl) &&
        Objects.equals(this.tableToInsert, insertDocxTablesRequest.tableToInsert) &&
        Objects.equals(this.insertPlacement, insertDocxTablesRequest.insertPlacement) &&
        Objects.equals(this.insertPath, insertDocxTablesRequest.insertPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputFileBytes, inputFileUrl, tableToInsert, insertPlacement, insertPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertDocxTablesRequest {\n");
    
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    tableToInsert: ").append(toIndentedString(tableToInsert)).append("\n");
    sb.append("    insertPlacement: ").append(toIndentedString(insertPlacement)).append("\n");
    sb.append("    insertPath: ").append(toIndentedString(insertPath)).append("\n");
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

