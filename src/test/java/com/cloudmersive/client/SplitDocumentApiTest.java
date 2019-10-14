/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
import com.cloudmersive.client.model.SplitXlsxWorksheetResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SplitDocumentApi
 */
@Ignore
public class SplitDocumentApiTest {

    private final SplitDocumentApi api = new SplitDocumentApi();

    
    /**
     * Split a single Excel XLSX into Separate Worksheets
     *
     * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void splitDocumentXlsxTest() throws ApiException {
        File inputFile = null;
        SplitXlsxWorksheetResult response = api.splitDocumentXlsx(inputFile);

        // TODO: test validations
    }
    
}
