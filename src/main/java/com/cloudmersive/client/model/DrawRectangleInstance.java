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
 * Rectangle instance to draw on an image
 */
@ApiModel(description = "Rectangle instance to draw on an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-17T20:29:39.140-07:00")
public class DrawRectangleInstance {
  @SerializedName("BorderColor")
  private String borderColor = null;

  @SerializedName("BorderWidth")
  private Double borderWidth = null;

  @SerializedName("FillColor")
  private String fillColor = null;

  @SerializedName("X")
  private Double X = null;

  @SerializedName("Y")
  private Double Y = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("Height")
  private Double height = null;

  public DrawRectangleInstance borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Border Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.
   * @return borderColor
  **/
  @ApiModelProperty(value = "Border Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.")
  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }

  public DrawRectangleInstance borderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

   /**
   * Width in pixels of the border.  Pass in 0 to draw a rectangle with no border
   * @return borderWidth
  **/
  @ApiModelProperty(value = "Width in pixels of the border.  Pass in 0 to draw a rectangle with no border")
  public Double getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
  }

  public DrawRectangleInstance fillColor(String fillColor) {
    this.fillColor = fillColor;
    return this;
  }

   /**
   * Fill Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.  Leave blank to not fill the rectangle.
   * @return fillColor
  **/
  @ApiModelProperty(value = "Fill Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.  Leave blank to not fill the rectangle.")
  public String getFillColor() {
    return fillColor;
  }

  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public DrawRectangleInstance X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * Pixel location of the left edge of the rectangle location
   * @return X
  **/
  @ApiModelProperty(value = "Pixel location of the left edge of the rectangle location")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public DrawRectangleInstance Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Pixel location of the top edge of the rectangle location
   * @return Y
  **/
  @ApiModelProperty(value = "Pixel location of the top edge of the rectangle location")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public DrawRectangleInstance width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the rectangle
   * @return width
  **/
  @ApiModelProperty(value = "Width in pixels of the rectangle")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public DrawRectangleInstance height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the rectangle
   * @return height
  **/
  @ApiModelProperty(value = "Height in pixels of the rectangle")
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
    DrawRectangleInstance drawRectangleInstance = (DrawRectangleInstance) o;
    return Objects.equals(this.borderColor, drawRectangleInstance.borderColor) &&
        Objects.equals(this.borderWidth, drawRectangleInstance.borderWidth) &&
        Objects.equals(this.fillColor, drawRectangleInstance.fillColor) &&
        Objects.equals(this.X, drawRectangleInstance.X) &&
        Objects.equals(this.Y, drawRectangleInstance.Y) &&
        Objects.equals(this.width, drawRectangleInstance.width) &&
        Objects.equals(this.height, drawRectangleInstance.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderColor, borderWidth, fillColor, X, Y, width, height);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawRectangleInstance {\n");
    
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
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

