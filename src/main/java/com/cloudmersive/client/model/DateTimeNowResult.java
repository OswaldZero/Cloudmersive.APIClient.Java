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
import org.threeten.bp.OffsetDateTime;

/**
 * Current date and time response
 */
@ApiModel(description = "Current date and time response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-07T19:08:41.279-08:00")
public class DateTimeNowResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Now")
  private OffsetDateTime now = null;

  @SerializedName("NowGmt")
  private OffsetDateTime nowGmt = null;

  public DateTimeNowResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public DateTimeNowResult now(OffsetDateTime now) {
    this.now = now;
    return this;
  }

   /**
   * Current date, time, and time zone in standard JSON date format
   * @return now
  **/
  @ApiModelProperty(value = "Current date, time, and time zone in standard JSON date format")
  public OffsetDateTime getNow() {
    return now;
  }

  public void setNow(OffsetDateTime now) {
    this.now = now;
  }

  public DateTimeNowResult nowGmt(OffsetDateTime nowGmt) {
    this.nowGmt = nowGmt;
    return this;
  }

   /**
   * Current GMT-time-zone date, time, and time zone in standard JSON date format
   * @return nowGmt
  **/
  @ApiModelProperty(value = "Current GMT-time-zone date, time, and time zone in standard JSON date format")
  public OffsetDateTime getNowGmt() {
    return nowGmt;
  }

  public void setNowGmt(OffsetDateTime nowGmt) {
    this.nowGmt = nowGmt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeNowResult dateTimeNowResult = (DateTimeNowResult) o;
    return Objects.equals(this.successful, dateTimeNowResult.successful) &&
        Objects.equals(this.now, dateTimeNowResult.now) &&
        Objects.equals(this.nowGmt, dateTimeNowResult.nowGmt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, now, nowGmt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeNowResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
    sb.append("    nowGmt: ").append(toIndentedString(nowGmt)).append("\n");
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
