package com.cts.services.device.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Usage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class Usage   {
  @JsonProperty("bytesUsed")
  private Long bytesUsed = null;

  @JsonProperty("extendedAttributes")
  private List<KvPair> extendedAttributes = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("smsUsed")
  private Integer smsUsed = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  public Usage bytesUsed(Long bytesUsed) {
    this.bytesUsed = bytesUsed;
    return this;
  }

   /**
   * Get bytesUsed
   * @return bytesUsed
  **/
  @ApiModelProperty(value = "")


  public Long getBytesUsed() {
    return bytesUsed;
  }

  public void setBytesUsed(Long bytesUsed) {
    this.bytesUsed = bytesUsed;
  }

  public Usage extendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public Usage addExtendedAttributesItem(KvPair extendedAttributesItem) {
    if (this.extendedAttributes == null) {
      this.extendedAttributes = new ArrayList<KvPair>();
    }
    this.extendedAttributes.add(extendedAttributesItem);
    return this;
  }

   /**
   * Get extendedAttributes
   * @return extendedAttributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<KvPair> getExtendedAttributes() {
    return extendedAttributes;
  }

  public void setExtendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
  }

  public Usage servicePlan(String servicePlan) {
    this.servicePlan = servicePlan;
    return this;
  }

   /**
   * Get servicePlan
   * @return servicePlan
  **/
  @ApiModelProperty(value = "")


  public String getServicePlan() {
    return servicePlan;
  }

  public void setServicePlan(String servicePlan) {
    this.servicePlan = servicePlan;
  }

  public Usage smsUsed(Integer smsUsed) {
    this.smsUsed = smsUsed;
    return this;
  }

   /**
   * Get smsUsed
   * @return smsUsed
  **/
  @ApiModelProperty(value = "")


  public Integer getSmsUsed() {
    return smsUsed;
  }

  public void setSmsUsed(Integer smsUsed) {
    this.smsUsed = smsUsed;
  }

  public Usage source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Usage timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usage usage = (Usage) o;
    return Objects.equals(this.bytesUsed, usage.bytesUsed) &&
        Objects.equals(this.extendedAttributes, usage.extendedAttributes) &&
        Objects.equals(this.servicePlan, usage.servicePlan) &&
        Objects.equals(this.smsUsed, usage.smsUsed) &&
        Objects.equals(this.source, usage.source) &&
        Objects.equals(this.timestamp, usage.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesUsed, extendedAttributes, servicePlan, smsUsed, source, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usage {\n");
    
    sb.append("    bytesUsed: ").append(toIndentedString(bytesUsed)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    smsUsed: ").append(toIndentedString(smsUsed)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

