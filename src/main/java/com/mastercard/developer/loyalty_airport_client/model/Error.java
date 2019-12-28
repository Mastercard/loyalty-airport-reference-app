/*
 * Loyalty Airport Experience API
 * The Loyalty Airport Lounge APIs offers cardholders, via their issuers, the ability to  access the Mastercard Airport Lounge service through this digital channel.  Cardholders can search for airport lounges, get airport lounge details,  access airport lounges via their personalized Digital Membership Card,  and access their lounge history. These APIs can be used to build a rich,  interactive airport experience within the issuer's existing mobile application.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: project-ole@mastercard.flowdock.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.loyalty_airport_client.model;

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
 * Error
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class Error {
  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_REASON_CODE = "ReasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  private String reasonCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RECOVERABLE = "Recoverable";
  @SerializedName(SERIALIZED_NAME_RECOVERABLE)
  private Boolean recoverable;

  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "profile", value = "")
  public String getSource() {
    return source;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(example = "INVALID_JSON", value = "")
  public String getReasonCode() {
    return reasonCode;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Invalid JSON in request", value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get recoverable
   * @return recoverable
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean getRecoverable() {
    return recoverable;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "Invalid JSON in request", value = "")
  public String getDetails() {
    return details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.source, error.source) &&
        Objects.equals(this.reasonCode, error.reasonCode) &&
        Objects.equals(this.description, error.description) &&
        Objects.equals(this.recoverable, error.recoverable) &&
        Objects.equals(this.details, error.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, reasonCode, description, recoverable, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    recoverable: ").append(toIndentedString(recoverable)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

