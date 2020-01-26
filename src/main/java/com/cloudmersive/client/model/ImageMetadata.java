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
import java.util.Arrays;
import com.cloudmersive.client.model.ImageMetadataExifValue;
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
 * Metadata from an image
 */
@ApiModel(description = "Metadata from an image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-25T16:38:30.935-08:00")
public class ImageMetadata {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("IsValidImage")
  private Boolean isValidImage = null;

  @SerializedName("FileFormat")
  private String fileFormat = null;

  @SerializedName("Width")
  private Integer width = null;

  @SerializedName("Height")
  private Integer height = null;

  @SerializedName("BitDepth")
  private Integer bitDepth = null;

  @SerializedName("HasTransparency")
  private Boolean hasTransparency = null;

  @SerializedName("ColorSpace")
  private String colorSpace = null;

  @SerializedName("ExifProfileName")
  private String exifProfileName = null;

  @SerializedName("ExifValues")
  private List<ImageMetadataExifValue> exifValues = null;

  public ImageMetadata successful(Boolean successful) {
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

  public ImageMetadata isValidImage(Boolean isValidImage) {
    this.isValidImage = isValidImage;
    return this;
  }

   /**
   * True if the input image is a valid image file, false otherwise
   * @return isValidImage
  **/
  @ApiModelProperty(value = "True if the input image is a valid image file, false otherwise")
  public Boolean isIsValidImage() {
    return isValidImage;
  }

  public void setIsValidImage(Boolean isValidImage) {
    this.isValidImage = isValidImage;
  }

  public ImageMetadata fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * File format of the image
   * @return fileFormat
  **/
  @ApiModelProperty(value = "File format of the image")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public ImageMetadata width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the image in pixels
   * @return width
  **/
  @ApiModelProperty(value = "Width of the image in pixels")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImageMetadata height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the image in pixels
   * @return height
  **/
  @ApiModelProperty(value = "Height of the image in pixels")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImageMetadata bitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
    return this;
  }

   /**
   * Bits per pixel
   * @return bitDepth
  **/
  @ApiModelProperty(value = "Bits per pixel")
  public Integer getBitDepth() {
    return bitDepth;
  }

  public void setBitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
  }

  public ImageMetadata hasTransparency(Boolean hasTransparency) {
    this.hasTransparency = hasTransparency;
    return this;
  }

   /**
   * True if the image has transaprency in the form of an alpha channel, false otherwise
   * @return hasTransparency
  **/
  @ApiModelProperty(value = "True if the image has transaprency in the form of an alpha channel, false otherwise")
  public Boolean isHasTransparency() {
    return hasTransparency;
  }

  public void setHasTransparency(Boolean hasTransparency) {
    this.hasTransparency = hasTransparency;
  }

  public ImageMetadata colorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
    return this;
  }

   /**
   * Color space of the image
   * @return colorSpace
  **/
  @ApiModelProperty(value = "Color space of the image")
  public String getColorSpace() {
    return colorSpace;
  }

  public void setColorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
  }

  public ImageMetadata exifProfileName(String exifProfileName) {
    this.exifProfileName = exifProfileName;
    return this;
  }

   /**
   * Name of the EXIF profile used
   * @return exifProfileName
  **/
  @ApiModelProperty(value = "Name of the EXIF profile used")
  public String getExifProfileName() {
    return exifProfileName;
  }

  public void setExifProfileName(String exifProfileName) {
    this.exifProfileName = exifProfileName;
  }

  public ImageMetadata exifValues(List<ImageMetadataExifValue> exifValues) {
    this.exifValues = exifValues;
    return this;
  }

  public ImageMetadata addExifValuesItem(ImageMetadataExifValue exifValuesItem) {
    if (this.exifValues == null) {
      this.exifValues = new ArrayList<ImageMetadataExifValue>();
    }
    this.exifValues.add(exifValuesItem);
    return this;
  }

   /**
   * EXIF tags and values embedded in the image
   * @return exifValues
  **/
  @ApiModelProperty(value = "EXIF tags and values embedded in the image")
  public List<ImageMetadataExifValue> getExifValues() {
    return exifValues;
  }

  public void setExifValues(List<ImageMetadataExifValue> exifValues) {
    this.exifValues = exifValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageMetadata imageMetadata = (ImageMetadata) o;
    return Objects.equals(this.successful, imageMetadata.successful) &&
        Objects.equals(this.isValidImage, imageMetadata.isValidImage) &&
        Objects.equals(this.fileFormat, imageMetadata.fileFormat) &&
        Objects.equals(this.width, imageMetadata.width) &&
        Objects.equals(this.height, imageMetadata.height) &&
        Objects.equals(this.bitDepth, imageMetadata.bitDepth) &&
        Objects.equals(this.hasTransparency, imageMetadata.hasTransparency) &&
        Objects.equals(this.colorSpace, imageMetadata.colorSpace) &&
        Objects.equals(this.exifProfileName, imageMetadata.exifProfileName) &&
        Objects.equals(this.exifValues, imageMetadata.exifValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, isValidImage, fileFormat, width, height, bitDepth, hasTransparency, colorSpace, exifProfileName, exifValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadata {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    isValidImage: ").append(toIndentedString(isValidImage)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    bitDepth: ").append(toIndentedString(bitDepth)).append("\n");
    sb.append("    hasTransparency: ").append(toIndentedString(hasTransparency)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    exifProfileName: ").append(toIndentedString(exifProfileName)).append("\n");
    sb.append("    exifValues: ").append(toIndentedString(exifValues)).append("\n");
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

