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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Individual field value to set in a PDF form
 */
@ApiModel(description = "Individual field value to set in a PDF form")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-03T23:52:21.544-08:00")
public class SetFormFieldValue {
  @SerializedName("FieldName")
  private String fieldName = null;

  @SerializedName("TextValue")
  private String textValue = null;

  @SerializedName("CheckboxValue")
  private Boolean checkboxValue = null;

  @SerializedName("ComboBoxSelectedIndex")
  private Integer comboBoxSelectedIndex = null;

  public SetFormFieldValue fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Name of the field to set; you can call /convert/edit/pdf/form/get-fields to enumerate field names in a form
   * @return fieldName
  **/
  @ApiModelProperty(value = "Name of the field to set; you can call /convert/edit/pdf/form/get-fields to enumerate field names in a form")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public SetFormFieldValue textValue(String textValue) {
    this.textValue = textValue;
    return this;
  }

   /**
   * For fields of type Text, the text value to put into the field
   * @return textValue
  **/
  @ApiModelProperty(value = "For fields of type Text, the text value to put into the field")
  public String getTextValue() {
    return textValue;
  }

  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }

  public SetFormFieldValue checkboxValue(Boolean checkboxValue) {
    this.checkboxValue = checkboxValue;
    return this;
  }

   /**
   * For fields of type Checkbox, the value to put into the field
   * @return checkboxValue
  **/
  @ApiModelProperty(value = "For fields of type Checkbox, the value to put into the field")
  public Boolean isCheckboxValue() {
    return checkboxValue;
  }

  public void setCheckboxValue(Boolean checkboxValue) {
    this.checkboxValue = checkboxValue;
  }

  public SetFormFieldValue comboBoxSelectedIndex(Integer comboBoxSelectedIndex) {
    this.comboBoxSelectedIndex = comboBoxSelectedIndex;
    return this;
  }

   /**
   * For fields of type ComboBox; specifies the selected index of the combo box selection
   * @return comboBoxSelectedIndex
  **/
  @ApiModelProperty(value = "For fields of type ComboBox; specifies the selected index of the combo box selection")
  public Integer getComboBoxSelectedIndex() {
    return comboBoxSelectedIndex;
  }

  public void setComboBoxSelectedIndex(Integer comboBoxSelectedIndex) {
    this.comboBoxSelectedIndex = comboBoxSelectedIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetFormFieldValue setFormFieldValue = (SetFormFieldValue) o;
    return Objects.equals(this.fieldName, setFormFieldValue.fieldName) &&
        Objects.equals(this.textValue, setFormFieldValue.textValue) &&
        Objects.equals(this.checkboxValue, setFormFieldValue.checkboxValue) &&
        Objects.equals(this.comboBoxSelectedIndex, setFormFieldValue.comboBoxSelectedIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, textValue, checkboxValue, comboBoxSelectedIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetFormFieldValue {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    checkboxValue: ").append(toIndentedString(checkboxValue)).append("\n");
    sb.append("    comboBoxSelectedIndex: ").append(toIndentedString(comboBoxSelectedIndex)).append("\n");
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

