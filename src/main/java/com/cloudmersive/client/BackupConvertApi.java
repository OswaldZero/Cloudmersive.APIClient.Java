/*
 * dataintegrationapi
 * Easily and directly query database backup files, convert into other file formats.
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
import com.cloudmersive.client.model.MssqlBakEnumerateTablesResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackupConvertApi {
    private ApiClient apiClient;

    public BackupConvertApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BackupConvertApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for dataintegrationBackupConvertMssqlBakGetTablesPost
     * @param inputFile Input file to perform the operation on (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataintegrationBackupConvertMssqlBakGetTablesPostCall(File inputFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dataintegration/backup/convert/mssql/bak/get/tables";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (inputFile != null)
        localVarFormParams.put("inputFile", inputFile);

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
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
    private com.squareup.okhttp.Call dataintegrationBackupConvertMssqlBakGetTablesPostValidateBeforeCall(File inputFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = dataintegrationBackupConvertMssqlBakGetTablesPostCall(inputFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file
     * 
     * @param inputFile Input file to perform the operation on (optional)
     * @return MssqlBakEnumerateTablesResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MssqlBakEnumerateTablesResult dataintegrationBackupConvertMssqlBakGetTablesPost(File inputFile) throws ApiException {
        ApiResponse<MssqlBakEnumerateTablesResult> resp = dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(inputFile);
        return resp.getData();
    }

    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file
     * 
     * @param inputFile Input file to perform the operation on (optional)
     * @return ApiResponse&lt;MssqlBakEnumerateTablesResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MssqlBakEnumerateTablesResult> dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(File inputFile) throws ApiException {
        com.squareup.okhttp.Call call = dataintegrationBackupConvertMssqlBakGetTablesPostValidateBeforeCall(inputFile, null, null);
        Type localVarReturnType = new TypeToken<MssqlBakEnumerateTablesResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file (asynchronously)
     * 
     * @param inputFile Input file to perform the operation on (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataintegrationBackupConvertMssqlBakGetTablesPostAsync(File inputFile, final ApiCallback<MssqlBakEnumerateTablesResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataintegrationBackupConvertMssqlBakGetTablesPostValidateBeforeCall(inputFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MssqlBakEnumerateTablesResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for dataintegrationBackupConvertMssqlBakToCsvPost
     * @param tableName Name of the table to return (optional)
     * @param inputFile Input file to perform the operation on (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call dataintegrationBackupConvertMssqlBakToCsvPostCall(String tableName, File inputFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/dataintegration/backup/convert/mssql/bak/to/csv";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (tableName != null)
        localVarHeaderParams.put("tableName", apiClient.parameterToString(tableName));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (inputFile != null)
        localVarFormParams.put("inputFile", inputFile);

        final String[] localVarAccepts = {
            "text/csv"
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
    private com.squareup.okhttp.Call dataintegrationBackupConvertMssqlBakToCsvPostValidateBeforeCall(String tableName, File inputFile, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = dataintegrationBackupConvertMssqlBakToCsvPostCall(tableName, inputFile, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     * @param tableName Name of the table to return (optional)
     * @param inputFile Input file to perform the operation on (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] dataintegrationBackupConvertMssqlBakToCsvPost(String tableName, File inputFile) throws ApiException {
        ApiResponse<byte[]> resp = dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(tableName, inputFile);
        return resp.getData();
    }

    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     * @param tableName Name of the table to return (optional)
     * @param inputFile Input file to perform the operation on (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(String tableName, File inputFile) throws ApiException {
        com.squareup.okhttp.Call call = dataintegrationBackupConvertMssqlBakToCsvPostValidateBeforeCall(tableName, inputFile, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table (asynchronously)
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     * @param tableName Name of the table to return (optional)
     * @param inputFile Input file to perform the operation on (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call dataintegrationBackupConvertMssqlBakToCsvPostAsync(String tableName, File inputFile, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = dataintegrationBackupConvertMssqlBakToCsvPostValidateBeforeCall(tableName, inputFile, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}