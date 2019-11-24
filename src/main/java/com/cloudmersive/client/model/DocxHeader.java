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
import com.cloudmersive.client.model.DocxParagraph;
import com.cloudmersive.client.model.DocxSection;
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
 * Header of a Word Document (DOCX)
 */
@ApiModel(description = "Header of a Word Document (DOCX)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-11-23T16:21:00.283-08:00")
public class DocxHeader {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("Paragraphs")
  private List<DocxParagraph> paragraphs = null;

  @SerializedName("SectionsWithHeader")
  private List<DocxSection> sectionsWithHeader = null;

  public DocxHeader path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public DocxHeader paragraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
    return this;
  }

  public DocxHeader addParagraphsItem(DocxParagraph paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<DocxParagraph>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * Paragraphs in this header
   * @return paragraphs
  **/
  @ApiModelProperty(value = "Paragraphs in this header")
  public List<DocxParagraph> getParagraphs() {
    return paragraphs;
  }

  public void setParagraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }

  public DocxHeader sectionsWithHeader(List<DocxSection> sectionsWithHeader) {
    this.sectionsWithHeader = sectionsWithHeader;
    return this;
  }

  public DocxHeader addSectionsWithHeaderItem(DocxSection sectionsWithHeaderItem) {
    if (this.sectionsWithHeader == null) {
      this.sectionsWithHeader = new ArrayList<DocxSection>();
    }
    this.sectionsWithHeader.add(sectionsWithHeaderItem);
    return this;
  }

   /**
   * Sections that the header is applied to
   * @return sectionsWithHeader
  **/
  @ApiModelProperty(value = "Sections that the header is applied to")
  public List<DocxSection> getSectionsWithHeader() {
    return sectionsWithHeader;
  }

  public void setSectionsWithHeader(List<DocxSection> sectionsWithHeader) {
    this.sectionsWithHeader = sectionsWithHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxHeader docxHeader = (DocxHeader) o;
    return Objects.equals(this.path, docxHeader.path) &&
        Objects.equals(this.paragraphs, docxHeader.paragraphs) &&
        Objects.equals(this.sectionsWithHeader, docxHeader.sectionsWithHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, paragraphs, sectionsWithHeader);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxHeader {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
    sb.append("    sectionsWithHeader: ").append(toIndentedString(sectionsWithHeader)).append("\n");
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

