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
 * Details of one country
 */
@ApiModel(description = "Details of one country")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-12T22:11:48.027-07:00")
public class CountryDetails {
  @SerializedName("CountryName")
  private String countryName = null;

  @SerializedName("ThreeLetterCode")
  private String threeLetterCode = null;

  @SerializedName("ISOTwoLetterCode")
  private String isOTwoLetterCode = null;

  @SerializedName("IsEuropeanUnionMember")
  private Boolean isEuropeanUnionMember = null;

  @SerializedName("ISOCurrencyCode")
  private String isOCurrencyCode = null;

  @SerializedName("CurrencySymbol")
  private String currencySymbol = null;

  @SerializedName("CurrencyEnglishName")
  private String currencyEnglishName = null;

  public CountryDetails countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Name of the country
   * @return countryName
  **/
  @ApiModelProperty(value = "Name of the country")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public CountryDetails threeLetterCode(String threeLetterCode) {
    this.threeLetterCode = threeLetterCode;
    return this;
  }

   /**
   * Three-letter ISO 3166-1 country code
   * @return threeLetterCode
  **/
  @ApiModelProperty(value = "Three-letter ISO 3166-1 country code")
  public String getThreeLetterCode() {
    return threeLetterCode;
  }

  public void setThreeLetterCode(String threeLetterCode) {
    this.threeLetterCode = threeLetterCode;
  }

  public CountryDetails isOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
    return this;
  }

   /**
   * Two-letter ISO 3166-1 country code
   * @return isOTwoLetterCode
  **/
  @ApiModelProperty(value = "Two-letter ISO 3166-1 country code")
  public String getIsOTwoLetterCode() {
    return isOTwoLetterCode;
  }

  public void setIsOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
  }

  public CountryDetails isEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
    return this;
  }

   /**
   * True if this country is currently a member of the European Union (EU), false otherwise
   * @return isEuropeanUnionMember
  **/
  @ApiModelProperty(value = "True if this country is currently a member of the European Union (EU), false otherwise")
  public Boolean isIsEuropeanUnionMember() {
    return isEuropeanUnionMember;
  }

  public void setIsEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
  }

  public CountryDetails isOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
    return this;
  }

   /**
   * ISO 4217 currency three-letter code associated with the country
   * @return isOCurrencyCode
  **/
  @ApiModelProperty(value = "ISO 4217 currency three-letter code associated with the country")
  public String getIsOCurrencyCode() {
    return isOCurrencyCode;
  }

  public void setIsOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
  }

  public CountryDetails currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Symbol associated with the currency
   * @return currencySymbol
  **/
  @ApiModelProperty(value = "Symbol associated with the currency")
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }

  public CountryDetails currencyEnglishName(String currencyEnglishName) {
    this.currencyEnglishName = currencyEnglishName;
    return this;
  }

   /**
   * Full name of the currency
   * @return currencyEnglishName
  **/
  @ApiModelProperty(value = "Full name of the currency")
  public String getCurrencyEnglishName() {
    return currencyEnglishName;
  }

  public void setCurrencyEnglishName(String currencyEnglishName) {
    this.currencyEnglishName = currencyEnglishName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryDetails countryDetails = (CountryDetails) o;
    return Objects.equals(this.countryName, countryDetails.countryName) &&
        Objects.equals(this.threeLetterCode, countryDetails.threeLetterCode) &&
        Objects.equals(this.isOTwoLetterCode, countryDetails.isOTwoLetterCode) &&
        Objects.equals(this.isEuropeanUnionMember, countryDetails.isEuropeanUnionMember) &&
        Objects.equals(this.isOCurrencyCode, countryDetails.isOCurrencyCode) &&
        Objects.equals(this.currencySymbol, countryDetails.currencySymbol) &&
        Objects.equals(this.currencyEnglishName, countryDetails.currencyEnglishName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryName, threeLetterCode, isOTwoLetterCode, isEuropeanUnionMember, isOCurrencyCode, currencySymbol, currencyEnglishName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryDetails {\n");
    
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    threeLetterCode: ").append(toIndentedString(threeLetterCode)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    isEuropeanUnionMember: ").append(toIndentedString(isEuropeanUnionMember)).append("\n");
    sb.append("    isOCurrencyCode: ").append(toIndentedString(isOCurrencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    currencyEnglishName: ").append(toIndentedString(currencyEnglishName)).append("\n");
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

