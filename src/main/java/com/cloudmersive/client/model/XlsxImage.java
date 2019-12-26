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
 * XlsxImage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-25T21:08:04.061-08:00")
public class XlsxImage {
  @SerializedName("Path")
  private String path = null;

  @SerializedName("ImageDataEmbedId")
  private String imageDataEmbedId = null;

  @SerializedName("ImageDataContentType")
  private String imageDataContentType = null;

  @SerializedName("ImageInternalFileName")
  private String imageInternalFileName = null;

  @SerializedName("ImageContentsURL")
  private String imageContentsURL = null;

  public XlsxImage path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new rows
   * @return path
  **/
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new rows")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public XlsxImage imageDataEmbedId(String imageDataEmbedId) {
    this.imageDataEmbedId = imageDataEmbedId;
    return this;
  }

   /**
   * Read-only; internal ID for the image contents
   * @return imageDataEmbedId
  **/
  @ApiModelProperty(value = "Read-only; internal ID for the image contents")
  public String getImageDataEmbedId() {
    return imageDataEmbedId;
  }

  public void setImageDataEmbedId(String imageDataEmbedId) {
    this.imageDataEmbedId = imageDataEmbedId;
  }

  public XlsxImage imageDataContentType(String imageDataContentType) {
    this.imageDataContentType = imageDataContentType;
    return this;
  }

   /**
   * Read-only; image data MIME content-type
   * @return imageDataContentType
  **/
  @ApiModelProperty(value = "Read-only; image data MIME content-type")
  public String getImageDataContentType() {
    return imageDataContentType;
  }

  public void setImageDataContentType(String imageDataContentType) {
    this.imageDataContentType = imageDataContentType;
  }

  public XlsxImage imageInternalFileName(String imageInternalFileName) {
    this.imageInternalFileName = imageInternalFileName;
    return this;
  }

   /**
   * Read-only; internal file name/path for the image
   * @return imageInternalFileName
  **/
  @ApiModelProperty(value = "Read-only; internal file name/path for the image")
  public String getImageInternalFileName() {
    return imageInternalFileName;
  }

  public void setImageInternalFileName(String imageInternalFileName) {
    this.imageInternalFileName = imageInternalFileName;
  }

  public XlsxImage imageContentsURL(String imageContentsURL) {
    this.imageContentsURL = imageContentsURL;
    return this;
  }

   /**
   * URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.
   * @return imageContentsURL
  **/
  @ApiModelProperty(value = "URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.")
  public String getImageContentsURL() {
    return imageContentsURL;
  }

  public void setImageContentsURL(String imageContentsURL) {
    this.imageContentsURL = imageContentsURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxImage xlsxImage = (XlsxImage) o;
    return Objects.equals(this.path, xlsxImage.path) &&
        Objects.equals(this.imageDataEmbedId, xlsxImage.imageDataEmbedId) &&
        Objects.equals(this.imageDataContentType, xlsxImage.imageDataContentType) &&
        Objects.equals(this.imageInternalFileName, xlsxImage.imageInternalFileName) &&
        Objects.equals(this.imageContentsURL, xlsxImage.imageContentsURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, imageDataEmbedId, imageDataContentType, imageInternalFileName, imageContentsURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxImage {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    imageDataEmbedId: ").append(toIndentedString(imageDataEmbedId)).append("\n");
    sb.append("    imageDataContentType: ").append(toIndentedString(imageDataContentType)).append("\n");
    sb.append("    imageInternalFileName: ").append(toIndentedString(imageInternalFileName)).append("\n");
    sb.append("    imageContentsURL: ").append(toIndentedString(imageContentsURL)).append("\n");
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

