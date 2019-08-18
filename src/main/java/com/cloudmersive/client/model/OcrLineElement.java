/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.model.OcrWordElement;
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
 * A contiguous line of text in an OCR document
 */
@ApiModel(description = "A contiguous line of text in an OCR document")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-17T20:29:33.151-07:00")
public class OcrLineElement {
  @SerializedName("LineText")
  private String lineText = null;

  @SerializedName("Words")
  private List<OcrWordElement> words = null;

  public OcrLineElement lineText(String lineText) {
    this.lineText = lineText;
    return this;
  }

   /**
   * Text of the line
   * @return lineText
  **/
  @ApiModelProperty(value = "Text of the line")
  public String getLineText() {
    return lineText;
  }

  public void setLineText(String lineText) {
    this.lineText = lineText;
  }

  public OcrLineElement words(List<OcrWordElement> words) {
    this.words = words;
    return this;
  }

  public OcrLineElement addWordsItem(OcrWordElement wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<OcrWordElement>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Word objects in the line
   * @return words
  **/
  @ApiModelProperty(value = "Word objects in the line")
  public List<OcrWordElement> getWords() {
    return words;
  }

  public void setWords(List<OcrWordElement> words) {
    this.words = words;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrLineElement ocrLineElement = (OcrLineElement) o;
    return Objects.equals(this.lineText, ocrLineElement.lineText) &&
        Objects.equals(this.words, ocrLineElement.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineText, words);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrLineElement {\n");
    
    sb.append("    lineText: ").append(toIndentedString(lineText)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

