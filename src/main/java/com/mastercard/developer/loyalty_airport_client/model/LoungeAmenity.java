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
 * LoungeAmenity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-26T11:53:43.013-06:00[America/Chicago]")
public class LoungeAmenity {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Boolean available;

  public LoungeAmenity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Amenity name
   * @return name
  **/
  @ApiModelProperty(example = "Wi-fi", value = "Amenity name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LoungeAmenity available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Amentity availabiity indicator for this lounge
   * @return available
  **/
  @ApiModelProperty(value = "Amentity availabiity indicator for this lounge")
  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoungeAmenity loungeAmenity = (LoungeAmenity) o;
    return Objects.equals(this.name, loungeAmenity.name) &&
        Objects.equals(this.available, loungeAmenity.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, available);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoungeAmenity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

