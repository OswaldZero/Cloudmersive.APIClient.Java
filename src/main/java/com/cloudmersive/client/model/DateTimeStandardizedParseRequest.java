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
 * Input parameter to a date time parsing request
 */
@ApiModel(description = "Input parameter to a date time parsing request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-01T13:41:32.104-08:00")
public class DateTimeStandardizedParseRequest {
  @SerializedName("RawDateTimeInput")
  private String rawDateTimeInput = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  public DateTimeStandardizedParseRequest rawDateTimeInput(String rawDateTimeInput) {
    this.rawDateTimeInput = rawDateTimeInput;
    return this;
  }

   /**
   * Raw string input of a standard-formatted date and time for parsing
   * @return rawDateTimeInput
  **/
  @ApiModelProperty(value = "Raw string input of a standard-formatted date and time for parsing")
  public String getRawDateTimeInput() {
    return rawDateTimeInput;
  }

  public void setRawDateTimeInput(String rawDateTimeInput) {
    this.rawDateTimeInput = rawDateTimeInput;
  }

  public DateTimeStandardizedParseRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Optional: specify the two-letter country code to optimzie date formatting; default is US
   * @return countryCode
  **/
  @ApiModelProperty(value = "Optional: specify the two-letter country code to optimzie date formatting; default is US")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeStandardizedParseRequest dateTimeStandardizedParseRequest = (DateTimeStandardizedParseRequest) o;
    return Objects.equals(this.rawDateTimeInput, dateTimeStandardizedParseRequest.rawDateTimeInput) &&
        Objects.equals(this.countryCode, dateTimeStandardizedParseRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawDateTimeInput, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeStandardizedParseRequest {\n");
    
    sb.append("    rawDateTimeInput: ").append(toIndentedString(rawDateTimeInput)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

