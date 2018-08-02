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

import com.cloudmersive.client.invoker.ApiCallback;
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.ApiResponse;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.Pair;
import com.cloudmersive.client.invoker.ProgressRequestBody;
import com.cloudmersive.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResizeApi {
    private ApiClient apiClient;

    public ResizeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ResizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for resizePost
     * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width (required)
     * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resizePostCall(Integer maxWidth, Integer maxHeight, File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}"
            .replaceAll("\\{" + "maxWidth" + "\\}", apiClient.escapeString(maxWidth.toString()))
            .replaceAll("\\{" + "maxHeight" + "\\}", apiClient.escapeString(maxHeight.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (imageFile != null)
        localVarFormParams.put("imageFile", imageFile);

        final String[] localVarAccepts = {
            "image/png"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call resizePostValidateBeforeCall(Integer maxWidth, Integer maxHeight, File imageFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'maxWidth' is set
        if (maxWidth == null) {
            throw new ApiException("Missing the required parameter 'maxWidth' when calling resizePost(Async)");
        }
        
        // verify the required parameter 'maxHeight' is set
        if (maxHeight == null) {
            throw new ApiException("Missing the required parameter 'maxHeight' when calling resizePost(Async)");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new ApiException("Missing the required parameter 'imageFile' when calling resizePost(Async)");
        }
        

        com.squareup.okhttp.Call call = resizePostCall(maxWidth, maxHeight, imageFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Resize an image with parameters
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
     * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width (required)
     * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object resizePost(Integer maxWidth, Integer maxHeight, File imageFile) throws ApiException {
        ApiResponse<Object> resp = resizePostWithHttpInfo(maxWidth, maxHeight, imageFile);
        return resp.getData();
    }

    /**
     * Resize an image with parameters
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
     * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width (required)
     * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> resizePostWithHttpInfo(Integer maxWidth, Integer maxHeight, File imageFile) throws ApiException {
        com.squareup.okhttp.Call call = resizePostValidateBeforeCall(maxWidth, maxHeight, imageFile, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resize an image with parameters (asynchronously)
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
     * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width (required)
     * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height (required)
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resizePostAsync(Integer maxWidth, Integer maxHeight, File imageFile, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = resizePostValidateBeforeCall(maxWidth, maxHeight, imageFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}