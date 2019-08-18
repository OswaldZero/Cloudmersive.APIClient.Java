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
 * Single object instance, and associated details, detected in an image
 */
@ApiModel(description = "Single object instance, and associated details, detected in an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-17T20:29:39.140-07:00")
public class DetectedObject {
  @SerializedName("ObjectClassName")
  private String objectClassName = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Score")
  private Double score = null;

  @SerializedName("X")
  private Integer X = null;

  @SerializedName("Y")
  private Integer Y = null;

  public DetectedObject objectClassName(String objectClassName) {
    this.objectClassName = objectClassName;
    return this;
  }

   /**
   * Class of the object.  Example values are \&quot;person\&quot;, \&quot;car\&quot;, \&quot;dining table\&quot;, etc.
   * @return objectClassName
  **/
  @ApiModelProperty(value = "Class of the object.  Example values are \"person\", \"car\", \"dining table\", etc.")
  public String getObjectClassName() {
    return objectClassName;
  }

  public void setObjectClassName(String objectClassName) {
    this.objectClassName = objectClassName;
  }

  public DetectedObject height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height, in pixels, of the object
   * @return height
  **/
  @ApiModelProperty(value = "Height, in pixels, of the object")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public DetectedObject width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width, in pixels, of the object
   * @return width
  **/
  @ApiModelProperty(value = "Width, in pixels, of the object")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public DetectedObject score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Confidence score of detected object; possible values are between 0.0 and 1.0; values closer to 1.0 are higher confidence
   * @return score
  **/
  @ApiModelProperty(value = "Confidence score of detected object; possible values are between 0.0 and 1.0; values closer to 1.0 are higher confidence")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public DetectedObject X(Integer X) {
    this.X = X;
    return this;
  }

   /**
   * X location, in pixels, of the left side location of the object, with the right side being X + Width
   * @return X
  **/
  @ApiModelProperty(value = "X location, in pixels, of the left side location of the object, with the right side being X + Width")
  public Integer getX() {
    return X;
  }

  public void setX(Integer X) {
    this.X = X;
  }

  public DetectedObject Y(Integer Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Y location, in pixels, of the top side location of the object, with the bottom side being Y + Height
   * @return Y
  **/
  @ApiModelProperty(value = "Y location, in pixels, of the top side location of the object, with the bottom side being Y + Height")
  public Integer getY() {
    return Y;
  }

  public void setY(Integer Y) {
    this.Y = Y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedObject detectedObject = (DetectedObject) o;
    return Objects.equals(this.objectClassName, detectedObject.objectClassName) &&
        Objects.equals(this.height, detectedObject.height) &&
        Objects.equals(this.width, detectedObject.width) &&
        Objects.equals(this.score, detectedObject.score) &&
        Objects.equals(this.X, detectedObject.X) &&
        Objects.equals(this.Y, detectedObject.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectClassName, height, width, score, X, Y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedObject {\n");
    
    sb.append("    objectClassName: ").append(toIndentedString(objectClassName)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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

