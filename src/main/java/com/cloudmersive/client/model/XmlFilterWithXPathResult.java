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
import java.util.ArrayList;
import java.util.List;

/**
 * Result of performing a filter operation on XML input using XPath
 */
@ApiModel(description = "Result of performing a filter operation on XML input using XPath")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-03T20:55:12.048-08:00")
public class XmlFilterWithXPathResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("XmlNodes")
  private List<String> xmlNodes = null;

  @SerializedName("ResultCount")
  private Integer resultCount = null;

  public XmlFilterWithXPathResult successful(Boolean successful) {
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

  public XmlFilterWithXPathResult xmlNodes(List<String> xmlNodes) {
    this.xmlNodes = xmlNodes;
    return this;
  }

  public XmlFilterWithXPathResult addXmlNodesItem(String xmlNodesItem) {
    if (this.xmlNodes == null) {
      this.xmlNodes = new ArrayList<String>();
    }
    this.xmlNodes.add(xmlNodesItem);
    return this;
  }

   /**
   * Matching selected XML nodes as strings
   * @return xmlNodes
  **/
  @ApiModelProperty(value = "Matching selected XML nodes as strings")
  public List<String> getXmlNodes() {
    return xmlNodes;
  }

  public void setXmlNodes(List<String> xmlNodes) {
    this.xmlNodes = xmlNodes;
  }

  public XmlFilterWithXPathResult resultCount(Integer resultCount) {
    this.resultCount = resultCount;
    return this;
  }

   /**
   * Count of the matching results
   * @return resultCount
  **/
  @ApiModelProperty(value = "Count of the matching results")
  public Integer getResultCount() {
    return resultCount;
  }

  public void setResultCount(Integer resultCount) {
    this.resultCount = resultCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlFilterWithXPathResult xmlFilterWithXPathResult = (XmlFilterWithXPathResult) o;
    return Objects.equals(this.successful, xmlFilterWithXPathResult.successful) &&
        Objects.equals(this.xmlNodes, xmlFilterWithXPathResult.xmlNodes) &&
        Objects.equals(this.resultCount, xmlFilterWithXPathResult.resultCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, xmlNodes, resultCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlFilterWithXPathResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    xmlNodes: ").append(toIndentedString(xmlNodes)).append("\n");
    sb.append("    resultCount: ").append(toIndentedString(resultCount)).append("\n");
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

