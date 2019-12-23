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


package com.cloudmersive.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.cloudmersive.client.model.PdfFormField;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Result of retrieving PDF form fields
 */
@ApiModel(description = "Result of retrieving PDF form fields")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-22T16:22:39.505-08:00")
public class PdfFormFields {
  @SerializedName("Successful")
  private Boolean successful = null;

  @SerializedName("FormFields")
  private List<PdfFormField> formFields = null;

  public PdfFormFields successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public PdfFormFields formFields(List<PdfFormField> formFields) {
    this.formFields = formFields;
    return this;
  }

  public PdfFormFields addFormFieldsItem(PdfFormField formFieldsItem) {
    if (this.formFields == null) {
      this.formFields = new ArrayList<PdfFormField>();
    }
    this.formFields.add(formFieldsItem);
    return this;
  }

   /**
   * Fields and field values found in the form
   * @return formFields
  **/
  @ApiModelProperty(value = "Fields and field values found in the form")
  public List<PdfFormField> getFormFields() {
    return formFields;
  }

  public void setFormFields(List<PdfFormField> formFields) {
    this.formFields = formFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFormFields pdfFormFields = (PdfFormFields) o;
    return Objects.equals(this.successful, pdfFormFields.successful) &&
        Objects.equals(this.formFields, pdfFormFields.formFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, formFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFormFields {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
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

