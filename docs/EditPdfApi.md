# EditPdfApi

All URIs are relative to *https://api.cloudmersive.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**editPdfDecrypt**](EditPdfApi.md#editPdfDecrypt) | **POST** /convert/edit/pdf/decrypt | Decrypt and password-protect a PDF
[**editPdfDeletePages**](EditPdfApi.md#editPdfDeletePages) | **POST** /convert/edit/pdf/pages/delete | Remove / delete pages from a PDF document
[**editPdfEncrypt**](EditPdfApi.md#editPdfEncrypt) | **POST** /convert/edit/pdf/encrypt | Encrypt and password-protect a PDF
[**editPdfGetFormFields**](EditPdfApi.md#editPdfGetFormFields) | **POST** /convert/edit/pdf/form/get-fields | Gets PDF Form fields and values
[**editPdfGetMetadata**](EditPdfApi.md#editPdfGetMetadata) | **POST** /convert/edit/pdf/get-metadata | Get PDF document metadata
[**editPdfInsertPages**](EditPdfApi.md#editPdfInsertPages) | **POST** /convert/edit/pdf/pages/insert | Insert / copy pages from one PDF document into another
[**editPdfRasterize**](EditPdfApi.md#editPdfRasterize) | **POST** /convert/edit/pdf/rasterize | Rasterize a PDF to an image-based PDF
[**editPdfSetFormFields**](EditPdfApi.md#editPdfSetFormFields) | **POST** /convert/edit/pdf/form/set-fields | Sets ands fills PDF Form field values
[**editPdfSetMetadata**](EditPdfApi.md#editPdfSetMetadata) | **POST** /convert/edit/pdf/set-metadata | Sets PDF document metadata
[**editPdfSetPermissions**](EditPdfApi.md#editPdfSetPermissions) | **POST** /convert/edit/pdf/encrypt/set-permissions | Encrypt, password-protect and set restricted permissions on a PDF
[**editPdfWatermarkText**](EditPdfApi.md#editPdfWatermarkText) | **POST** /convert/edit/pdf/watermark/text | Add a text watermark to a PDF


<a name="editPdfDecrypt"></a>
# **editPdfDecrypt**
> byte[] editPdfDecrypt(password, inputFile)

Decrypt and password-protect a PDF

Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
String password = "password_example"; // String | Valid password for the PDF file
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    byte[] result = apiInstance.editPdfDecrypt(password, inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfDecrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **password** | **String**| Valid password for the PDF file |
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editPdfDeletePages"></a>
# **editPdfDeletePages**
> byte[] editPdfDeletePages(inputFile, pageStart, pageEnd)

Remove / delete pages from a PDF document

Remove one or more pages from a PDF document

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
Integer pageStart = 56; // Integer | Page number (1 based) to start deleting pages from (inclusive).
Integer pageEnd = 56; // Integer | Page number (1 based) to stop deleting pages from (inclusive).
try {
    byte[] result = apiInstance.editPdfDeletePages(inputFile, pageStart, pageEnd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfDeletePages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **pageStart** | **Integer**| Page number (1 based) to start deleting pages from (inclusive). |
 **pageEnd** | **Integer**| Page number (1 based) to stop deleting pages from (inclusive). |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editPdfEncrypt"></a>
# **editPdfEncrypt**
> byte[] editPdfEncrypt(inputFile, userPassword, ownerPassword, encryptionKeyLength)

Encrypt and password-protect a PDF

Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String userPassword = "userPassword_example"; // String | Password of a user (reader) of the PDF file
String ownerPassword = "ownerPassword_example"; // String | Password of a owner (creator/editor) of the PDF file
String encryptionKeyLength = "encryptionKeyLength_example"; // String | Possible values are \"128\" (128-bit RC4 encryption) and \"256\" (256-bit AES encryption).  Default is 256.
try {
    byte[] result = apiInstance.editPdfEncrypt(inputFile, userPassword, ownerPassword, encryptionKeyLength);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfEncrypt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |
 **userPassword** | **String**| Password of a user (reader) of the PDF file | [optional]
 **ownerPassword** | **String**| Password of a owner (creator/editor) of the PDF file | [optional]
 **encryptionKeyLength** | **String**| Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editPdfGetFormFields"></a>
# **editPdfGetFormFields**
> PdfFormFields editPdfGetFormFields(inputFile)

Gets PDF Form fields and values

Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    PdfFormFields result = apiInstance.editPdfGetFormFields(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfGetFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**PdfFormFields**](PdfFormFields.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editPdfGetMetadata"></a>
# **editPdfGetMetadata**
> PdfMetadata editPdfGetMetadata(inputFile)

Get PDF document metadata

Returns the metadata from the PDF document, including Title, Author, etc.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    PdfMetadata result = apiInstance.editPdfGetMetadata(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfGetMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

[**PdfMetadata**](PdfMetadata.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/json, application/xml, text/xml

<a name="editPdfInsertPages"></a>
# **editPdfInsertPages**
> byte[] editPdfInsertPages(sourceFile, destinationFile, pageStartSource, pageEndSource, pageInsertBeforeDesitnation)

Insert / copy pages from one PDF document into another

Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
File sourceFile = new File("/path/to/file.txt"); // File | Source PDF file to copy pages from.
File destinationFile = new File("/path/to/file.txt"); // File | Destination PDF file to copy pages into.
Integer pageStartSource = 56; // Integer | Page number (1 based) to start copying pages from (inclusive) in the Source file.
Integer pageEndSource = 56; // Integer | Page number (1 based) to stop copying pages pages from (inclusive) in the Source file.
Integer pageInsertBeforeDesitnation = 56; // Integer | Page number (1 based) to insert the pages before in the Destination file.
try {
    byte[] result = apiInstance.editPdfInsertPages(sourceFile, destinationFile, pageStartSource, pageEndSource, pageInsertBeforeDesitnation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfInsertPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceFile** | **File**| Source PDF file to copy pages from. |
 **destinationFile** | **File**| Destination PDF file to copy pages into. |
 **pageStartSource** | **Integer**| Page number (1 based) to start copying pages from (inclusive) in the Source file. |
 **pageEndSource** | **Integer**| Page number (1 based) to stop copying pages pages from (inclusive) in the Source file. |
 **pageInsertBeforeDesitnation** | **Integer**| Page number (1 based) to insert the pages before in the Destination file. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editPdfRasterize"></a>
# **editPdfRasterize**
> byte[] editPdfRasterize(inputFile)

Rasterize a PDF to an image-based PDF

Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
try {
    byte[] result = apiInstance.editPdfRasterize(inputFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfRasterize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inputFile** | **File**| Input file to perform the operation on. |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editPdfSetFormFields"></a>
# **editPdfSetFormFields**
> byte[] editPdfSetFormFields(fieldValues)

Sets ands fills PDF Form field values

Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
SetPdfFormFieldsRequest fieldValues = new SetPdfFormFieldsRequest(); // SetPdfFormFieldsRequest | 
try {
    byte[] result = apiInstance.editPdfSetFormFields(fieldValues);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfSetFormFields");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fieldValues** | [**SetPdfFormFieldsRequest**](SetPdfFormFieldsRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editPdfSetMetadata"></a>
# **editPdfSetMetadata**
> byte[] editPdfSetMetadata(request)

Sets PDF document metadata

Sets (writes) metadata into the input PDF document, including Title, Author, etc.

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
SetPdfMetadataRequest request = new SetPdfMetadataRequest(); // SetPdfMetadataRequest | 
try {
    byte[] result = apiInstance.editPdfSetMetadata(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfSetMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**SetPdfMetadataRequest**](SetPdfMetadataRequest.md)|  |

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/xml, text/xml, application/x-www-form-urlencoded
 - **Accept**: application/octet-stream

<a name="editPdfSetPermissions"></a>
# **editPdfSetPermissions**
> byte[] editPdfSetPermissions(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting)

Encrypt, password-protect and set restricted permissions on a PDF

Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
String ownerPassword = "ownerPassword_example"; // String | Password of a owner (creator/editor) of the PDF file (required)
String userPassword = "userPassword_example"; // String | Password of a user (reader) of the PDF file (optional)
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String encryptionKeyLength = "encryptionKeyLength_example"; // String | Possible values are \"128\" (128-bit RC4 encryption) and \"256\" (256-bit AES encryption).  Default is 256.
Boolean allowPrinting = true; // Boolean | Set to false to disable printing through DRM.  Default is true.
Boolean allowDocumentAssembly = true; // Boolean | Set to false to disable document assembly through DRM.  Default is true.
Boolean allowContentExtraction = true; // Boolean | Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true.
Boolean allowFormFilling = true; // Boolean | Set to false to disable filling out form fields in the PDF through DRM.  Default is true.
Boolean allowEditing = true; // Boolean | Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true.
Boolean allowAnnotations = true; // Boolean | Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true.
Boolean allowDegradedPrinting = true; // Boolean | Set to false to disable degraded printing of the PDF through DRM.  Default is true.
try {
    byte[] result = apiInstance.editPdfSetPermissions(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfSetPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownerPassword** | **String**| Password of a owner (creator/editor) of the PDF file (required) |
 **userPassword** | **String**| Password of a user (reader) of the PDF file (optional) |
 **inputFile** | **File**| Input file to perform the operation on. |
 **encryptionKeyLength** | **String**| Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256. | [optional]
 **allowPrinting** | **Boolean**| Set to false to disable printing through DRM.  Default is true. | [optional]
 **allowDocumentAssembly** | **Boolean**| Set to false to disable document assembly through DRM.  Default is true. | [optional]
 **allowContentExtraction** | **Boolean**| Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true. | [optional]
 **allowFormFilling** | **Boolean**| Set to false to disable filling out form fields in the PDF through DRM.  Default is true. | [optional]
 **allowEditing** | **Boolean**| Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true. | [optional]
 **allowAnnotations** | **Boolean**| Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true. | [optional]
 **allowDegradedPrinting** | **Boolean**| Set to false to disable degraded printing of the PDF through DRM.  Default is true. | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream

<a name="editPdfWatermarkText"></a>
# **editPdfWatermarkText**
> byte[] editPdfWatermarkText(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency)

Add a text watermark to a PDF

Adds a text watermark to a PDF

### Example
```java
// Import classes:
//import com.cloudmersive.client.invoker.ApiClient;
//import com.cloudmersive.client.invoker.ApiException;
//import com.cloudmersive.client.invoker.Configuration;
//import com.cloudmersive.client.invoker.auth.*;
//import com.cloudmersive.client.EditPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Apikey
ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
Apikey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Apikey.setApiKeyPrefix("Token");

EditPdfApi apiInstance = new EditPdfApi();
String watermarkText = "watermarkText_example"; // String | Watermark text to add to the PDF (required)
File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
String fontName = "fontName_example"; // String | Font Family Name for the watermark text; default is Times New Roman
BigDecimal fontSize = new BigDecimal(); // BigDecimal | Font Size in points of the text; default is 150
String fontColor = "fontColor_example"; // String | Font color in hexadecimal or HTML color name; default is Red
BigDecimal fontTransparency = new BigDecimal(); // BigDecimal | Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5
try {
    byte[] result = apiInstance.editPdfWatermarkText(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EditPdfApi#editPdfWatermarkText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **watermarkText** | **String**| Watermark text to add to the PDF (required) |
 **inputFile** | **File**| Input file to perform the operation on. |
 **fontName** | **String**| Font Family Name for the watermark text; default is Times New Roman | [optional]
 **fontSize** | **BigDecimal**| Font Size in points of the text; default is 150 | [optional]
 **fontColor** | **String**| Font color in hexadecimal or HTML color name; default is Red | [optional]
 **fontTransparency** | **BigDecimal**| Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5 | [optional]

### Return type

**byte[]**

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/octet-stream
