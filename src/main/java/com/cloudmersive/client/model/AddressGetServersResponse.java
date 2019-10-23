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
import java.util.ArrayList;
import java.util.List;

/**
 * Result of a partial email address validation
 */
@ApiModel(description = "Result of a partial email address validation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-23T15:21:57.116-07:00")
public class AddressGetServersResponse {
  @SerializedName("Success")
  private Boolean success = null;

  @SerializedName("Servers")
  private List<String> servers = null;

  public AddressGetServersResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * True if partial address validation was successufl, false otherwise
   * @return success
  **/
  @ApiModelProperty(value = "True if partial address validation was successufl, false otherwise")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public AddressGetServersResponse servers(List<String> servers) {
    this.servers = servers;
    return this;
  }

  public AddressGetServersResponse addServersItem(String serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<String>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Email servers for this email address
   * @return servers
  **/
  @ApiModelProperty(value = "Email servers for this email address")
  public List<String> getServers() {
    return servers;
  }

  public void setServers(List<String> servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressGetServersResponse addressGetServersResponse = (AddressGetServersResponse) o;
    return Objects.equals(this.success, addressGetServersResponse.success) &&
        Objects.equals(this.servers, addressGetServersResponse.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, servers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressGetServersResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

