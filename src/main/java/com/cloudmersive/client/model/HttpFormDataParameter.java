/*
 * configapi
 * Config API lets you easily manage configuration at scale.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.TaskOutputReference;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines a parameter of type FormData (multipart/form-data)
 */
@ApiModel(description = "Defines a parameter of type FormData (multipart/form-data)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-04T21:04:38.115-07:00")
public class HttpFormDataParameter {
  @SerializedName("ParameterName")
  private String parameterName = null;

  @SerializedName("ParameterTextValue")
  private String parameterTextValue = null;

  @SerializedName("ParameterFileContents")
  private byte[] parameterFileContents = null;

  @SerializedName("UseOutputFromPreviousTask")
  private TaskOutputReference useOutputFromPreviousTask = null;

  public HttpFormDataParameter parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Name of the parameter
   * @return parameterName
  **/
  @ApiModelProperty(value = "Name of the parameter")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }

  public HttpFormDataParameter parameterTextValue(String parameterTextValue) {
    this.parameterTextValue = parameterTextValue;
    return this;
  }

   /**
   * Text value of the parameter; if set, do not set ParameterFileContents or UseOutputFromPreviousTask
   * @return parameterTextValue
  **/
  @ApiModelProperty(value = "Text value of the parameter; if set, do not set ParameterFileContents or UseOutputFromPreviousTask")
  public String getParameterTextValue() {
    return parameterTextValue;
  }

  public void setParameterTextValue(String parameterTextValue) {
    this.parameterTextValue = parameterTextValue;
  }

  public HttpFormDataParameter parameterFileContents(byte[] parameterFileContents) {
    this.parameterFileContents = parameterFileContents;
    return this;
  }

   /**
   * Binary contents of the parameter; if set, do not set ParameterTextValue or UseOutputFromPreviousTask
   * @return parameterFileContents
  **/
  @ApiModelProperty(value = "Binary contents of the parameter; if set, do not set ParameterTextValue or UseOutputFromPreviousTask")
  public byte[] getParameterFileContents() {
    return parameterFileContents;
  }

  public void setParameterFileContents(byte[] parameterFileContents) {
    this.parameterFileContents = parameterFileContents;
  }

  public HttpFormDataParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.
   * @return useOutputFromPreviousTask
  **/
  @ApiModelProperty(value = "Optional; use the output from a previous task as the input to this parameter.  Set to null (default) to ignore.")
  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }

  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpFormDataParameter httpFormDataParameter = (HttpFormDataParameter) o;
    return Objects.equals(this.parameterName, httpFormDataParameter.parameterName) &&
        Objects.equals(this.parameterTextValue, httpFormDataParameter.parameterTextValue) &&
        Arrays.equals(this.parameterFileContents, httpFormDataParameter.parameterFileContents) &&
        Objects.equals(this.useOutputFromPreviousTask, httpFormDataParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterTextValue, Arrays.hashCode(parameterFileContents), useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpFormDataParameter {\n");
    
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterTextValue: ").append(toIndentedString(parameterTextValue)).append("\n");
    sb.append("    parameterFileContents: ").append(toIndentedString(parameterFileContents)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

