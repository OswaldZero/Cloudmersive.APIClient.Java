/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
import com.cloudmersive.client.model.ProfanityAnalysisRequest;
import com.cloudmersive.client.model.ProfanityAnalysisResponse;
import com.cloudmersive.client.model.SentimentAnalysisRequest;
import com.cloudmersive.client.model.SentimentAnalysisResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnalyticsApi
 */
@Ignore
public class AnalyticsApiTest {

    private final AnalyticsApi api = new AnalyticsApi();

    
    /**
     * Perform Profanity and Obscene Language Analysis and Detection on Text
     *
     * Analyze input text using advanced Profanity and Obscene Language Analysis to determine if the input contains profane language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void analyticsProfanityTest() throws ApiException {
        ProfanityAnalysisRequest input = null;
        ProfanityAnalysisResponse response = api.analyticsProfanity(input);

        // TODO: test validations
    }
    
    /**
     * Perform Sentiment Analysis and Classification on Text
     *
     * Analyze input text using advanced Sentiment Analysis to determine if the input is positive, negative, or neutral.  Supports English language input.  Consumes 1-2 API calls per sentence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void analyticsSentimentTest() throws ApiException {
        SentimentAnalysisRequest input = null;
        SentimentAnalysisResponse response = api.analyticsSentiment(input);

        // TODO: test validations
    }
    
}
