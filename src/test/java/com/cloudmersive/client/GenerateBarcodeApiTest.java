/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GenerateBarcodeApi
 */
@Ignore
public class GenerateBarcodeApiTest {

    private final GenerateBarcodeApi api = new GenerateBarcodeApi();

    
    /**
     * Generate a EAN-13 code barcode as PNG file
     *
     * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeEAN13Test() throws ApiException {
        String value = null;
        File response = api.generateBarcodeEAN13(value);

        // TODO: test validations
    }
    
    /**
     * Generate a EAN-8 code barcode as PNG file
     *
     * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeEAN8Test() throws ApiException {
        String value = null;
        File response = api.generateBarcodeEAN8(value);

        // TODO: test validations
    }
    
    /**
     * Generate a QR code barcode as PNG file
     *
     * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeQRCodeTest() throws ApiException {
        String value = null;
        File response = api.generateBarcodeQRCode(value);

        // TODO: test validations
    }
    
    /**
     * Generate a UPC-A code barcode as PNG file
     *
     * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeUPCATest() throws ApiException {
        String value = null;
        File response = api.generateBarcodeUPCA(value);

        // TODO: test validations
    }
    
    /**
     * Generate a UPC-E code barcode as PNG file
     *
     * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeUPCETest() throws ApiException {
        String value = null;
        File response = api.generateBarcodeUPCE(value);

        // TODO: test validations
    }
    
}
