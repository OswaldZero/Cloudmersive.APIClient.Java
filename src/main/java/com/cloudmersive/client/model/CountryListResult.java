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
import com.cloudmersive.client.model.CountryDetails;
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
 * Result of enumerating available countries
 */
@ApiModel(description = "Result of enumerating available countries")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-12T22:11:48.027-07:00")
public class CountryListResult {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("Countries")
  private List<CountryDetails> countries = null;

  public CountryListResult successful(Boolean successful) {
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

  public CountryListResult countries(List<CountryDetails> countries) {
    this.countries = countries;
    return this;
  }

  public CountryListResult addCountriesItem(CountryDetails countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<CountryDetails>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * List of current ISO 3166-1 countries in the world
   * @return countries
  **/
  @ApiModelProperty(value = "List of current ISO 3166-1 countries in the world")
  public List<CountryDetails> getCountries() {
    return countries;
  }

  public void setCountries(List<CountryDetails> countries) {
    this.countries = countries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryListResult countryListResult = (CountryListResult) o;
    return Objects.equals(this.successful, countryListResult.successful) &&
        Objects.equals(this.countries, countryListResult.countries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, countries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryListResult {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
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

