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
import com.cloudmersive.client.model.AutodetectDocumentValidationResult;
import com.cloudmersive.client.model.DocumentValidationResult;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidateDocumentApi
 */
@Ignore
public class ValidateDocumentApiTest {

    private final ValidateDocumentApi api = new ValidateDocumentApi();

    
    /**
     * Autodetect content type and validate
     *
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentAutodetectValidationTest() throws ApiException {
        File inputFile = null;
        AutodetectDocumentValidationResult response = api.validateDocumentAutodetectValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Word document (DOCX)
     *
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentDocxValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentDocxValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate if a file is executable
     *
     * Validate if an input file is a binary executable file; if the document is not valid
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentExecutableValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentExecutableValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a GZip Archive file (gzip or gz)
     *
     * Validate a GZip archive file (GZIP or GZ)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentGZipValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentGZipValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a JSON file
     *
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentJsonValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentJsonValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a PDF document file
     *
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentPdfValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentPdfValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a PowerPoint presentation (PPTX)
     *
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentPptxValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentPptxValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a RAR Archive file (RAR)
     *
     * Validate a RAR archive file (RAR)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentRarValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentRarValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a TAR Tarball Archive file (TAR)
     *
     * Validate a TAR tarball archive file (TAR)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentTarValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentTarValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Excel document (XLSX)
     *
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentXlsxValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentXlsxValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate an XML file
     *
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentXmlValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentXmlValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Zip Archive file (zip)
     *
     * Validate a Zip archive file (ZIP)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentZipValidationTest() throws ApiException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentZipValidation(inputFile);

        // TODO: test validations
    }
    
}
