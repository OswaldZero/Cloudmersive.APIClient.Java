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
import com.cloudmersive.client.model.TextDocumentLine;
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
 * The result of splitting a Text document into separate lines
 */
@ApiModel(description = "The result of splitting a Text document into separate lines")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:46:36.696-07:00")
public class SplitTextDocumentByLinesResult {
  @SerializedName("ResultLines")
  private List<TextDocumentLine> resultLines = null;

  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("LineCount")
  private Integer lineCount = null;

  public SplitTextDocumentByLinesResult resultLines(List<TextDocumentLine> resultLines) {
    this.resultLines = resultLines;
    return this;
  }

  public SplitTextDocumentByLinesResult addResultLinesItem(TextDocumentLine resultLinesItem) {
    if (this.resultLines == null) {
      this.resultLines = new ArrayList<TextDocumentLine>();
    }
    this.resultLines.add(resultLinesItem);
    return this;
  }

   /**
   * Get resultLines
   * @return resultLines
  **/
  @ApiModelProperty(value = "")
  public List<TextDocumentLine> getResultLines() {
    return resultLines;
  }

  public void setResultLines(List<TextDocumentLine> resultLines) {
    this.resultLines = resultLines;
  }

  public SplitTextDocumentByLinesResult successful(Boolean successful) {
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

  public SplitTextDocumentByLinesResult lineCount(Integer lineCount) {
    this.lineCount = lineCount;
    return this;
  }

   /**
   * The count of lines in the text file
   * @return lineCount
  **/
  @ApiModelProperty(value = "The count of lines in the text file")
  public Integer getLineCount() {
    return lineCount;
  }

  public void setLineCount(Integer lineCount) {
    this.lineCount = lineCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTextDocumentByLinesResult splitTextDocumentByLinesResult = (SplitTextDocumentByLinesResult) o;
    return Objects.equals(this.resultLines, splitTextDocumentByLinesResult.resultLines) &&
        Objects.equals(this.successful, splitTextDocumentByLinesResult.successful) &&
        Objects.equals(this.lineCount, splitTextDocumentByLinesResult.lineCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultLines, successful, lineCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTextDocumentByLinesResult {\n");
    
    sb.append("    resultLines: ").append(toIndentedString(resultLines)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
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

