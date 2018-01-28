/*
 * barcodeapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.barcode;

import com.cloudmersive.client.ApiException;
import com.cloudmersive.client.barcode.model.BarcodeLookupResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BarcodeLookupApi
 */
@Ignore
public class BarcodeLookupApiTest {

    private final BarcodeLookupApi api = new BarcodeLookupApi();

    
    /**
     * Lookup a barcode value and return product data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void barcodeLookupEanLookupTest() throws ApiException {
        String value = null;
        BarcodeLookupResponse response = api.barcodeLookupEanLookup(value);

        // TODO: test validations
    }
    
}
