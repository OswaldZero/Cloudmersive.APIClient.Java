/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Text instance to draw on an image
 */
@ApiModel(description = "Text instance to draw on an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-20T18:44:44.267-07:00")
public class DrawTextInstance {
  @SerializedName("Text")
  private String text = null;

  @SerializedName("FontFamilyName")
  private String fontFamilyName = null;

  @SerializedName("FontSize")
  private Double fontSize = null;

  @SerializedName("Color")
  private String color = null;

  @SerializedName("X")
  private Double X = null;

  @SerializedName("Y")
  private Double Y = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("Height")
  private Double height = null;

  public DrawTextInstance text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text string to draw
   * @return text
  **/
  @ApiModelProperty(value = "Text string to draw")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public DrawTextInstance fontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
    return this;
  }

   /**
   * Font Family to use.  Leave blank to default to \&quot;Arial\&quot;.
   * @return fontFamilyName
  **/
  @ApiModelProperty(value = "Font Family to use.  Leave blank to default to \"Arial\".")
  public String getFontFamilyName() {
    return fontFamilyName;
  }

  public void setFontFamilyName(String fontFamilyName) {
    this.fontFamilyName = fontFamilyName;
  }

  public DrawTextInstance fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font size to use.
   * @return fontSize
  **/
  @ApiModelProperty(value = "Font size to use.")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public DrawTextInstance color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Color to use - can be a hex value (with #) or HTML common color name
   * @return color
  **/
  @ApiModelProperty(value = "Color to use - can be a hex value (with #) or HTML common color name")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public DrawTextInstance X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * Pixel location of the left edge of the text location
   * @return X
  **/
  @ApiModelProperty(value = "Pixel location of the left edge of the text location")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public DrawTextInstance Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Pixel location of the top edge of the text location
   * @return Y
  **/
  @ApiModelProperty(value = "Pixel location of the top edge of the text location")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public DrawTextInstance width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the text box to draw the text in; text will wrap inside this box
   * @return width
  **/
  @ApiModelProperty(value = "Width in pixels of the text box to draw the text in; text will wrap inside this box")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public DrawTextInstance height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the text box to draw the text in; text will wrap inside this box
   * @return height
  **/
  @ApiModelProperty(value = "Height in pixels of the text box to draw the text in; text will wrap inside this box")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawTextInstance drawTextInstance = (DrawTextInstance) o;
    return Objects.equals(this.text, drawTextInstance.text) &&
        Objects.equals(this.fontFamilyName, drawTextInstance.fontFamilyName) &&
        Objects.equals(this.fontSize, drawTextInstance.fontSize) &&
        Objects.equals(this.color, drawTextInstance.color) &&
        Objects.equals(this.X, drawTextInstance.X) &&
        Objects.equals(this.Y, drawTextInstance.Y) &&
        Objects.equals(this.width, drawTextInstance.width) &&
        Objects.equals(this.height, drawTextInstance.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, fontFamilyName, fontSize, color, X, Y, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawTextInstance {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    fontFamilyName: ").append(toIndentedString(fontFamilyName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

