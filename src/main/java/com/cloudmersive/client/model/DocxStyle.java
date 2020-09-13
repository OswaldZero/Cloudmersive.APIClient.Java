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

/**
 * Style in a DOCX Word Document
 */
@ApiModel(description = "Style in a DOCX Word Document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-12T22:12:10.795-07:00")
public class DocxStyle {
  @SerializedName("StyleID")
  private String styleID = null;

  @SerializedName("Path")
  private String path = null;

  @SerializedName("Bold")
  private Boolean bold = null;

  @SerializedName("Italic")
  private Boolean italic = null;

  @SerializedName("Underline")
  private Boolean underline = null;

  @SerializedName("FontSize")
  private String fontSize = null;

  @SerializedName("FontFamily")
  private String fontFamily = null;

  public DocxStyle styleID(String styleID) {
    this.styleID = styleID;
    return this;
  }

   /**
   * ID of the style
   * @return styleID
  **/
  @ApiModelProperty(value = "ID of the style")
  public String getStyleID() {
    return styleID;
  }

  public void setStyleID(String styleID) {
    this.styleID = styleID;
  }

  public DocxStyle path(String path) {
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

  public DocxStyle bold(Boolean bold) {
    this.bold = bold;
    return this;
  }

   /**
   * Style applies bold formatting
   * @return bold
  **/
  @ApiModelProperty(value = "Style applies bold formatting")
  public Boolean isBold() {
    return bold;
  }

  public void setBold(Boolean bold) {
    this.bold = bold;
  }

  public DocxStyle italic(Boolean italic) {
    this.italic = italic;
    return this;
  }

   /**
   * Style applies italic formatting
   * @return italic
  **/
  @ApiModelProperty(value = "Style applies italic formatting")
  public Boolean isItalic() {
    return italic;
  }

  public void setItalic(Boolean italic) {
    this.italic = italic;
  }

  public DocxStyle underline(Boolean underline) {
    this.underline = underline;
    return this;
  }

   /**
   * Style applies underline formatting
   * @return underline
  **/
  @ApiModelProperty(value = "Style applies underline formatting")
  public Boolean isUnderline() {
    return underline;
  }

  public void setUnderline(Boolean underline) {
    this.underline = underline;
  }

  public DocxStyle fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font size
   * @return fontSize
  **/
  @ApiModelProperty(value = "Font size")
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public DocxStyle fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Font family
   * @return fontFamily
  **/
  @ApiModelProperty(value = "Font family")
  public String getFontFamily() {
    return fontFamily;
  }

  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxStyle docxStyle = (DocxStyle) o;
    return Objects.equals(this.styleID, docxStyle.styleID) &&
        Objects.equals(this.path, docxStyle.path) &&
        Objects.equals(this.bold, docxStyle.bold) &&
        Objects.equals(this.italic, docxStyle.italic) &&
        Objects.equals(this.underline, docxStyle.underline) &&
        Objects.equals(this.fontSize, docxStyle.fontSize) &&
        Objects.equals(this.fontFamily, docxStyle.fontFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(styleID, path, bold, italic, underline, fontSize, fontFamily);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxStyle {\n");
    
    sb.append("    styleID: ").append(toIndentedString(styleID)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
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

