/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Result of performing an XSS protection operation
 */
@ApiModel(description = "Result of performing an XSS protection operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-25T00:32:19.497-07:00")
public class XssProtectionResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("ContainedXss")
  private Boolean containedXss = null;

  @SerializedName("OriginalInput")
  private String originalInput = null;

  @SerializedName("NormalizedResult")
  private String normalizedResult = null;

  public XssProtectionResult successful(Boolean successful) {
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

  public XssProtectionResult containedXss(Boolean containedXss) {
    this.containedXss = containedXss;
    return this;
  }

   /**
   * True if the input contained XSS scripting, false otherwise
   * @return containedXss
  **/
  @ApiModelProperty(value = "True if the input contained XSS scripting, false otherwise")
  public Boolean isContainedXss() {
    return containedXss;
  }

  public void setContainedXss(Boolean containedXss) {
    this.containedXss = containedXss;
  }

  public XssProtectionResult originalInput(String originalInput) {
    this.originalInput = originalInput;
    return this;
  }

   /**
   * Original input string
   * @return originalInput
  **/
  @ApiModelProperty(value = "Original input string")
  public String getOriginalInput() {
    return originalInput;
  }

  public void setOriginalInput(String originalInput) {
    this.originalInput = originalInput;
  }

  public XssProtectionResult normalizedResult(String normalizedResult) {
    this.normalizedResult = normalizedResult;
    return this;
  }

   /**
   * Normalized string result, with XSS removed
   * @return normalizedResult
  **/
  @ApiModelProperty(value = "Normalized string result, with XSS removed")
  public String getNormalizedResult() {
    return normalizedResult;
  }

  public void setNormalizedResult(String normalizedResult) {
    this.normalizedResult = normalizedResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XssProtectionResult xssProtectionResult = (XssProtectionResult) o;
    return Objects.equals(this.successful, xssProtectionResult.successful) &&
        Objects.equals(this.containedXss, xssProtectionResult.containedXss) &&
        Objects.equals(this.originalInput, xssProtectionResult.originalInput) &&
        Objects.equals(this.normalizedResult, xssProtectionResult.normalizedResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containedXss, originalInput, normalizedResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XssProtectionResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containedXss: ").append(toIndentedString(containedXss)).append("\n");
    sb.append("    originalInput: ").append(toIndentedString(originalInput)).append("\n");
    sb.append("    normalizedResult: ").append(toIndentedString(normalizedResult)).append("\n");
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
