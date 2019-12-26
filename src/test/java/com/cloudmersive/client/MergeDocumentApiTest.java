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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MergeDocumentApi
 */
@Ignore
public class MergeDocumentApiTest {

    private final MergeDocumentApi api = new MergeDocumentApi();

    
    /**
     * Merge Two Word DOCX Together
     *
     * Combine two Office Word Documents (docx) into one single Office Word document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentDocxTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        byte[] response = api.mergeDocumentDocx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple Word DOCX Together
     *
     * Combine multiple Office Word Documents (docx) into one single Office Word document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentDocxMultiTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        File inputFile3 = null;
        File inputFile4 = null;
        File inputFile5 = null;
        File inputFile6 = null;
        File inputFile7 = null;
        File inputFile8 = null;
        File inputFile9 = null;
        File inputFile10 = null;
        byte[] response = api.mergeDocumentDocxMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two PDF Files Together
     *
     * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPdfTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        byte[] response = api.mergeDocumentPdf(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple PDF Files Together
     *
     * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPdfMultiTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        File inputFile3 = null;
        File inputFile4 = null;
        File inputFile5 = null;
        File inputFile6 = null;
        File inputFile7 = null;
        File inputFile8 = null;
        File inputFile9 = null;
        File inputFile10 = null;
        byte[] response = api.mergeDocumentPdfMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Multple PNG Files Together
     *
     * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPngTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        byte[] response = api.mergeDocumentPng(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Two PowerPoint PPTX Together
     *
     * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPptxTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        byte[] response = api.mergeDocumentPptx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple PowerPoint PPTX Together
     *
     * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentPptxMultiTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        File inputFile3 = null;
        File inputFile4 = null;
        File inputFile5 = null;
        File inputFile6 = null;
        File inputFile7 = null;
        File inputFile8 = null;
        File inputFile9 = null;
        File inputFile10 = null;
        byte[] response = api.mergeDocumentPptxMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
    /**
     * Merge Two Excel XLSX Together
     *
     * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentXlsxTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        byte[] response = api.mergeDocumentXlsx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
    /**
     * Merge Multple Excel XLSX Together
     *
     * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeDocumentXlsxMultiTest() throws ApiException {
        File inputFile1 = null;
        File inputFile2 = null;
        File inputFile3 = null;
        File inputFile4 = null;
        File inputFile5 = null;
        File inputFile6 = null;
        File inputFile7 = null;
        File inputFile8 = null;
        File inputFile9 = null;
        File inputFile10 = null;
        byte[] response = api.mergeDocumentXlsxMulti(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);

        // TODO: test validations
    }
    
}