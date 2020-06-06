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
 * The result of a User-Agent validation request
 */
@ApiModel(description = "The result of a User-Agent validation request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-06T11:46:26.962-07:00")
public class UserAgentValidateResponse {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("IsBot")
  private Boolean isBot = null;

  @SerializedName("BotName")
  private String botName = null;

  @SerializedName("BotURL")
  private String botURL = null;

  @SerializedName("OperatingSystem")
  private String operatingSystem = null;

  @SerializedName("OperatingSystemCPUPlatform")
  private String operatingSystemCPUPlatform = null;

  @SerializedName("OperatingSystemVersion")
  private String operatingSystemVersion = null;

  @SerializedName("DeviceType")
  private String deviceType = null;

  @SerializedName("DeviceBrandName")
  private String deviceBrandName = null;

  @SerializedName("DeviceModel")
  private String deviceModel = null;

  @SerializedName("BrowserName")
  private String browserName = null;

  @SerializedName("BrowserVersion")
  private String browserVersion = null;

  @SerializedName("BrowserEngineName")
  private String browserEngineName = null;

  @SerializedName("BrowserEngineVersion")
  private String browserEngineVersion = null;

  public UserAgentValidateResponse successful(Boolean successful) {
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

  public UserAgentValidateResponse isBot(Boolean isBot) {
    this.isBot = isBot;
    return this;
  }

   /**
   * True if the request is a known robot, false otherwise
   * @return isBot
  **/
  @ApiModelProperty(value = "True if the request is a known robot, false otherwise")
  public Boolean isIsBot() {
    return isBot;
  }

  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }

  public UserAgentValidateResponse botName(String botName) {
    this.botName = botName;
    return this;
  }

   /**
   * Optional; name of the robot if the request was from a known robot, otherwise null
   * @return botName
  **/
  @ApiModelProperty(value = "Optional; name of the robot if the request was from a known robot, otherwise null")
  public String getBotName() {
    return botName;
  }

  public void setBotName(String botName) {
    this.botName = botName;
  }

  public UserAgentValidateResponse botURL(String botURL) {
    this.botURL = botURL;
    return this;
  }

   /**
   * Optional; if available, the URL to the robot
   * @return botURL
  **/
  @ApiModelProperty(value = "Optional; if available, the URL to the robot")
  public String getBotURL() {
    return botURL;
  }

  public void setBotURL(String botURL) {
    this.botURL = botURL;
  }

  public UserAgentValidateResponse operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Operating System of the User-Agent (e.g. Windows)
   * @return operatingSystem
  **/
  @ApiModelProperty(value = "Operating System of the User-Agent (e.g. Windows)")
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public UserAgentValidateResponse operatingSystemCPUPlatform(String operatingSystemCPUPlatform) {
    this.operatingSystemCPUPlatform = operatingSystemCPUPlatform;
    return this;
  }

   /**
   * The CPU platform of the User-Agent (e.g. x64)
   * @return operatingSystemCPUPlatform
  **/
  @ApiModelProperty(value = "The CPU platform of the User-Agent (e.g. x64)")
  public String getOperatingSystemCPUPlatform() {
    return operatingSystemCPUPlatform;
  }

  public void setOperatingSystemCPUPlatform(String operatingSystemCPUPlatform) {
    this.operatingSystemCPUPlatform = operatingSystemCPUPlatform;
  }

  public UserAgentValidateResponse operatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
    return this;
  }

   /**
   * The version of the operating system of the User-Agent (e.g. \&quot;10\&quot; for Windows 10)
   * @return operatingSystemVersion
  **/
  @ApiModelProperty(value = "The version of the operating system of the User-Agent (e.g. \"10\" for Windows 10)")
  public String getOperatingSystemVersion() {
    return operatingSystemVersion;
  }

  public void setOperatingSystemVersion(String operatingSystemVersion) {
    this.operatingSystemVersion = operatingSystemVersion;
  }

  public UserAgentValidateResponse deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Device type of the User-Agent; possible values are \&quot;DESKTOP\&quot;, \&quot;SMARTPHONE\&quot;, \&quot;TABLET\&quot;
   * @return deviceType
  **/
  @ApiModelProperty(value = "Device type of the User-Agent; possible values are \"DESKTOP\", \"SMARTPHONE\", \"TABLET\"")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public UserAgentValidateResponse deviceBrandName(String deviceBrandName) {
    this.deviceBrandName = deviceBrandName;
    return this;
  }

   /**
   * Brand name of the User-Agent
   * @return deviceBrandName
  **/
  @ApiModelProperty(value = "Brand name of the User-Agent")
  public String getDeviceBrandName() {
    return deviceBrandName;
  }

  public void setDeviceBrandName(String deviceBrandName) {
    this.deviceBrandName = deviceBrandName;
  }

  public UserAgentValidateResponse deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Model name or number of the User-Agent
   * @return deviceModel
  **/
  @ApiModelProperty(value = "Model name or number of the User-Agent")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public UserAgentValidateResponse browserName(String browserName) {
    this.browserName = browserName;
    return this;
  }

   /**
   * Name of the Browser
   * @return browserName
  **/
  @ApiModelProperty(value = "Name of the Browser")
  public String getBrowserName() {
    return browserName;
  }

  public void setBrowserName(String browserName) {
    this.browserName = browserName;
  }

  public UserAgentValidateResponse browserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
    return this;
  }

   /**
   * Version of the Browser
   * @return browserVersion
  **/
  @ApiModelProperty(value = "Version of the Browser")
  public String getBrowserVersion() {
    return browserVersion;
  }

  public void setBrowserVersion(String browserVersion) {
    this.browserVersion = browserVersion;
  }

  public UserAgentValidateResponse browserEngineName(String browserEngineName) {
    this.browserEngineName = browserEngineName;
    return this;
  }

   /**
   * Name of the Browser Engine
   * @return browserEngineName
  **/
  @ApiModelProperty(value = "Name of the Browser Engine")
  public String getBrowserEngineName() {
    return browserEngineName;
  }

  public void setBrowserEngineName(String browserEngineName) {
    this.browserEngineName = browserEngineName;
  }

  public UserAgentValidateResponse browserEngineVersion(String browserEngineVersion) {
    this.browserEngineVersion = browserEngineVersion;
    return this;
  }

   /**
   * Version of the Browser Engine
   * @return browserEngineVersion
  **/
  @ApiModelProperty(value = "Version of the Browser Engine")
  public String getBrowserEngineVersion() {
    return browserEngineVersion;
  }

  public void setBrowserEngineVersion(String browserEngineVersion) {
    this.browserEngineVersion = browserEngineVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAgentValidateResponse userAgentValidateResponse = (UserAgentValidateResponse) o;
    return Objects.equals(this.successful, userAgentValidateResponse.successful) &&
        Objects.equals(this.isBot, userAgentValidateResponse.isBot) &&
        Objects.equals(this.botName, userAgentValidateResponse.botName) &&
        Objects.equals(this.botURL, userAgentValidateResponse.botURL) &&
        Objects.equals(this.operatingSystem, userAgentValidateResponse.operatingSystem) &&
        Objects.equals(this.operatingSystemCPUPlatform, userAgentValidateResponse.operatingSystemCPUPlatform) &&
        Objects.equals(this.operatingSystemVersion, userAgentValidateResponse.operatingSystemVersion) &&
        Objects.equals(this.deviceType, userAgentValidateResponse.deviceType) &&
        Objects.equals(this.deviceBrandName, userAgentValidateResponse.deviceBrandName) &&
        Objects.equals(this.deviceModel, userAgentValidateResponse.deviceModel) &&
        Objects.equals(this.browserName, userAgentValidateResponse.browserName) &&
        Objects.equals(this.browserVersion, userAgentValidateResponse.browserVersion) &&
        Objects.equals(this.browserEngineName, userAgentValidateResponse.browserEngineName) &&
        Objects.equals(this.browserEngineVersion, userAgentValidateResponse.browserEngineVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, isBot, botName, botURL, operatingSystem, operatingSystemCPUPlatform, operatingSystemVersion, deviceType, deviceBrandName, deviceModel, browserName, browserVersion, browserEngineName, browserEngineVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgentValidateResponse {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
    sb.append("    botName: ").append(toIndentedString(botName)).append("\n");
    sb.append("    botURL: ").append(toIndentedString(botURL)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    operatingSystemCPUPlatform: ").append(toIndentedString(operatingSystemCPUPlatform)).append("\n");
    sb.append("    operatingSystemVersion: ").append(toIndentedString(operatingSystemVersion)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    deviceBrandName: ").append(toIndentedString(deviceBrandName)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    browserName: ").append(toIndentedString(browserName)).append("\n");
    sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
    sb.append("    browserEngineName: ").append(toIndentedString(browserEngineName)).append("\n");
    sb.append("    browserEngineVersion: ").append(toIndentedString(browserEngineVersion)).append("\n");
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

