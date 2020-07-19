/*
 * videoapi
 * The video APIs help you convert, encode, and transcode videos.
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
import org.threeten.bp.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoApi
 */
@Ignore
public class VideoApiTest {

    private final VideoApi api = new VideoApi();

    
    /**
     * Convert Video to Animated GIF format.
     *
     * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoConvertToGifTest() throws ApiException {
        File inputFile = null;
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        Boolean extendProcessingTime = null;
        OffsetDateTime startTime = null;
        OffsetDateTime timeSpan = null;
        byte[] response = api.videoConvertToGif(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, extendProcessingTime, startTime, timeSpan);

        // TODO: test validations
    }
    
    /**
     * Convert Video to MOV format.
     *
     * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoConvertToMovTest() throws ApiException {
        File inputFile = null;
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        Integer quality = null;
        Boolean extendProcessingTime = null;
        byte[] response = api.videoConvertToMov(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime);

        // TODO: test validations
    }
    
    /**
     * Convert Video to MP4 format.
     *
     * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoConvertToMp4Test() throws ApiException {
        File inputFile = null;
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        Integer quality = null;
        Boolean extendProcessingTime = null;
        byte[] response = api.videoConvertToMp4(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime);

        // TODO: test validations
    }
    
    /**
     * Convert Video to WEBM format.
     *
     * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Maximum output file size is 50GB.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoConvertToWebmTest() throws ApiException {
        File inputFile = null;
        String fileUrl = null;
        Integer maxWidth = null;
        Integer maxHeight = null;
        Boolean preserveAspectRatio = null;
        Integer frameRate = null;
        Integer quality = null;
        Boolean extendProcessingTime = null;
        byte[] response = api.videoConvertToWebm(inputFile, fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, extendProcessingTime);

        // TODO: test validations
    }
    
    /**
     * Get detailed information about a video or audio file
     *
     * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoGetInfoTest() throws ApiException {
        File inputFile = null;
        String fileUrl = null;
        byte[] response = api.videoGetInfo(inputFile, fileUrl);

        // TODO: test validations
    }
    
}