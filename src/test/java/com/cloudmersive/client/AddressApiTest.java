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


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.model.CountryListResult;
import com.cloudmersive.client.model.GetTimezonesRequest;
import com.cloudmersive.client.model.GetTimezonesResponse;
import com.cloudmersive.client.model.ParseAddressRequest;
import com.cloudmersive.client.model.ParseAddressResponse;
import com.cloudmersive.client.model.ValidateAddressRequest;
import com.cloudmersive.client.model.ValidateAddressResponse;
import com.cloudmersive.client.model.ValidateCityRequest;
import com.cloudmersive.client.model.ValidateCityResponse;
import com.cloudmersive.client.model.ValidateCountryRequest;
import com.cloudmersive.client.model.ValidateCountryResponse;
import com.cloudmersive.client.model.ValidatePostalCodeRequest;
import com.cloudmersive.client.model.ValidatePostalCodeResponse;
import com.cloudmersive.client.model.ValidateStateRequest;
import com.cloudmersive.client.model.ValidateStateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressApi
 */
@Ignore
public class AddressApiTest {

    private final AddressApi api = new AddressApi();

    
    /**
     * Check if a country is a member of the European Union (EU)
     *
     * Checks if the input country is a member of the European Union or not.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCheckEUMembershipTest() throws ApiException {
        ValidateCountryRequest input = null;
        ValidateCountryResponse response = api.addressCheckEUMembership(input);

        // TODO: test validations
    }
    
    /**
     * Validate and normalize country information, return ISO 3166-1 country codes and country name
     *
     * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCountryTest() throws ApiException {
        ValidateCountryRequest input = null;
        ValidateCountryResponse response = api.addressCountry(input);

        // TODO: test validations
    }
    
    /**
     * Get a list of ISO 3166-1 countries
     *
     * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressCountryListTest() throws ApiException {
        CountryListResult response = api.addressCountryList();

        // TODO: test validations
    }
    
    /**
     * Gets IANA/Olsen time zones for a country
     *
     * Gets the IANA/Olsen time zones for a country.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressGetTimezoneTest() throws ApiException {
        GetTimezonesRequest input = null;
        GetTimezonesResponse response = api.addressGetTimezone(input);

        // TODO: test validations
    }
    
    /**
     * Parse an unstructured input text string into an international, formatted address
     *
     * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressParseStringTest() throws ApiException {
        ParseAddressRequest input = null;
        ParseAddressResponse response = api.addressParseString(input);

        // TODO: test validations
    }
    
    /**
     * Validate a street address
     *
     * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidateAddressTest() throws ApiException {
        ValidateAddressRequest input = null;
        ValidateAddressResponse response = api.addressValidateAddress(input);

        // TODO: test validations
    }
    
    /**
     * Validate a City and State/Province combination, get location information about it
     *
     * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidateCityTest() throws ApiException {
        ValidateCityRequest input = null;
        ValidateCityResponse response = api.addressValidateCity(input);

        // TODO: test validations
    }
    
    /**
     * Validate a postal code, get location information about it
     *
     * Checks if the input postal code is valid, and returns information about it such as City, State and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidatePostalCodeTest() throws ApiException {
        ValidatePostalCodeRequest input = null;
        ValidatePostalCodeResponse response = api.addressValidatePostalCode(input);

        // TODO: test validations
    }
    
    /**
     * Validate a state or province, name or abbreviation, get location information about it
     *
     * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addressValidateStateTest() throws ApiException {
        ValidateStateRequest input = null;
        ValidateStateResponse response = api.addressValidateState(input);

        // TODO: test validations
    }
    
}
