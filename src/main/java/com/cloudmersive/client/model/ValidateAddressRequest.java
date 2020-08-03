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
 * Request to Validate a Street Address
 */
@ApiModel(description = "Request to Validate a Street Address")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-02T19:46:19.400-07:00")
public class ValidateAddressRequest {
  @SerializedName("StreetAddress")
  private String streetAddress = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("StateOrProvince")
  private String stateOrProvince = null;

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("CountryFullName")
  private String countryFullName = null;

  @SerializedName("CountryCode")
  private String countryCode = null;

  public ValidateAddressRequest streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Required; Street address to validate, such as &#39;2950 Buskirk Ave.&#39;
   * @return streetAddress
  **/
  @ApiModelProperty(value = "Required; Street address to validate, such as '2950 Buskirk Ave.'")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public ValidateAddressRequest city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Required; City part of the addrerss to validate, such as &#39;Walnut Creek&#39;
   * @return city
  **/
  @ApiModelProperty(value = "Required; City part of the addrerss to validate, such as 'Walnut Creek'")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public ValidateAddressRequest stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * Required; State or province of the address to validate, such as &#39;CA&#39; or &#39;California&#39;
   * @return stateOrProvince
  **/
  @ApiModelProperty(value = "Required; State or province of the address to validate, such as 'CA' or 'California'")
  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public ValidateAddressRequest postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Optional (recommended); Zip code or postal code of the address to validate, such as &#39;94597&#39;
   * @return postalCode
  **/
  @ApiModelProperty(value = "Optional (recommended); Zip code or postal code of the address to validate, such as '94597'")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ValidateAddressRequest countryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Optional (recommended); Name of the country, such as &#39;United States&#39;.  If left blank, and CountryCode is also left blank, will default to United States.  Global countries are supported.
   * @return countryFullName
  **/
  @ApiModelProperty(value = "Optional (recommended); Name of the country, such as 'United States'.  If left blank, and CountryCode is also left blank, will default to United States.  Global countries are supported.")
  public String getCountryFullName() {
    return countryFullName;
  }

  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }

  public ValidateAddressRequest countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Optional; two-letter country code (Two-letter ISO 3166-1 country code) of the country.  If left blank, and CountryFullName is also left blank, will default to United States.  Global countries are supported.
   * @return countryCode
  **/
  @ApiModelProperty(value = "Optional; two-letter country code (Two-letter ISO 3166-1 country code) of the country.  If left blank, and CountryFullName is also left blank, will default to United States.  Global countries are supported.")
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
    ValidateAddressRequest validateAddressRequest = (ValidateAddressRequest) o;
    return Objects.equals(this.streetAddress, validateAddressRequest.streetAddress) &&
        Objects.equals(this.city, validateAddressRequest.city) &&
        Objects.equals(this.stateOrProvince, validateAddressRequest.stateOrProvince) &&
        Objects.equals(this.postalCode, validateAddressRequest.postalCode) &&
        Objects.equals(this.countryFullName, validateAddressRequest.countryFullName) &&
        Objects.equals(this.countryCode, validateAddressRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetAddress, city, stateOrProvince, postalCode, countryFullName, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateAddressRequest {\n");
    
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
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

