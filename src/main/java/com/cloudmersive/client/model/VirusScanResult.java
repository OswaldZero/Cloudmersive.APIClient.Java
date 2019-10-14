/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
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
import com.cloudmersive.client.model.VirusFound;
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
 * Result of running a virus scan
 */
@ApiModel(description = "Result of running a virus scan")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-13T22:52:02.535-07:00")
public class VirusScanResult {
  @SerializedName("CleanResult")
  private Boolean cleanResult = null;

  @SerializedName("FoundViruses")
  private List<VirusFound> foundViruses = null;

  public VirusScanResult cleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * True if the scan contained no viruses, false otherwise
   * @return cleanResult
  **/
  @ApiModelProperty(value = "True if the scan contained no viruses, false otherwise")
  public Boolean isCleanResult() {
    return cleanResult;
  }

  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }

  public VirusScanResult foundViruses(List<VirusFound> foundViruses) {
    this.foundViruses = foundViruses;
    return this;
  }

  public VirusScanResult addFoundVirusesItem(VirusFound foundVirusesItem) {
    if (this.foundViruses == null) {
      this.foundViruses = new ArrayList<VirusFound>();
    }
    this.foundViruses.add(foundVirusesItem);
    return this;
  }

   /**
   * Array of viruses found, if any
   * @return foundViruses
  **/
  @ApiModelProperty(value = "Array of viruses found, if any")
  public List<VirusFound> getFoundViruses() {
    return foundViruses;
  }

  public void setFoundViruses(List<VirusFound> foundViruses) {
    this.foundViruses = foundViruses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirusScanResult virusScanResult = (VirusScanResult) o;
    return Objects.equals(this.cleanResult, virusScanResult.cleanResult) &&
        Objects.equals(this.foundViruses, virusScanResult.foundViruses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanResult, foundViruses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirusScanResult {\n");
    
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    foundViruses: ").append(toIndentedString(foundViruses)).append("\n");
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

