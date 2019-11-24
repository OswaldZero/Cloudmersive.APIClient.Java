/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * API tests for ResizeApi
 */
@Ignore
public class ResizeApiTest {

    private final ResizeApi api = new ResizeApi();

    
    /**
     * Resize an image while preserving aspect ratio
     *
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resizePostTest() throws ApiException {
        Integer maxWidth = null;
        Integer maxHeight = null;
        File imageFile = null;
        byte[] response = api.resizePost(maxWidth, maxHeight, imageFile);

        // TODO: test validations
    }
    
    /**
     * Resize an image
     *
     * Resize an image to a specific width and specific height
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resizeResizeSimpleTest() throws ApiException {
        Integer width = null;
        Integer height = null;
        File imageFile = null;
        byte[] response = api.resizeResizeSimple(width, height, imageFile);

        // TODO: test validations
    }
    
}
