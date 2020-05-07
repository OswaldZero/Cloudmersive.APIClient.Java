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
 * Raw binary parameter that defines the entire body oft he HTTP payload; cannot be used with other parameter types
 */
@ApiModel(description = "Raw binary parameter that defines the entire body oft he HTTP payload; cannot be used with other parameter types")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-06T19:00:33.908-07:00")
public class HttpRawBinaryParameter {
  @SerializedName("ParameterValue")
  private byte[] parameterValue = null;

  @SerializedName("UseOutputFromPreviousTask")
  private TaskOutputReference useOutputFromPreviousTask = null;

  public HttpRawBinaryParameter parameterValue(byte[] parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Binary bytes value of the parameter
   * @return parameterValue
  **/
  @ApiModelProperty(value = "Binary bytes value of the parameter")
  public byte[] getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(byte[] parameterValue) {
    this.parameterValue = parameterValue;
  }

  public HttpRawBinaryParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
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
    HttpRawBinaryParameter httpRawBinaryParameter = (HttpRawBinaryParameter) o;
    return Arrays.equals(this.parameterValue, httpRawBinaryParameter.parameterValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpRawBinaryParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(parameterValue), useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpRawBinaryParameter {\n");
    
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
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

