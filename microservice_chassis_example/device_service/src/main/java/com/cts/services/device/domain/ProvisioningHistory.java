package com.cts.services.device.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ProvisioningHistory
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class ProvisioningHistory   {
  @JsonProperty("occurredAt")
  private String occurredAt = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("eventBy")
  private String eventBy = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("mdn")
  private String mdn = null;

  @JsonProperty("msisdn")
  private String msisdn = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("extendedAttributes")
  private List<KvPair> extendedAttributes = null;

  public ProvisioningHistory occurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * Get occurredAt
   * @return occurredAt
  **/
  @ApiModelProperty(value = "")


  public String getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
  }

  public ProvisioningHistory status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProvisioningHistory eventBy(String eventBy) {
    this.eventBy = eventBy;
    return this;
  }

   /**
   * Get eventBy
   * @return eventBy
  **/
  @ApiModelProperty(value = "")


  public String getEventBy() {
    return eventBy;
  }

  public void setEventBy(String eventBy) {
    this.eventBy = eventBy;
  }

  public ProvisioningHistory eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")


  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public ProvisioningHistory mdn(String mdn) {
    this.mdn = mdn;
    return this;
  }

   /**
   * Get mdn
   * @return mdn
  **/
  @ApiModelProperty(value = "")


  public String getMdn() {
    return mdn;
  }

  public void setMdn(String mdn) {
    this.mdn = mdn;
  }

  public ProvisioningHistory msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @ApiModelProperty(value = "")


  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public ProvisioningHistory servicePlan(String servicePlan) {
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

  public ProvisioningHistory extendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public ProvisioningHistory addExtendedAttributesItem(KvPair extendedAttributesItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisioningHistory provisioningHistory = (ProvisioningHistory) o;
    return Objects.equals(this.occurredAt, provisioningHistory.occurredAt) &&
        Objects.equals(this.status, provisioningHistory.status) &&
        Objects.equals(this.eventBy, provisioningHistory.eventBy) &&
        Objects.equals(this.eventType, provisioningHistory.eventType) &&
        Objects.equals(this.mdn, provisioningHistory.mdn) &&
        Objects.equals(this.msisdn, provisioningHistory.msisdn) &&
        Objects.equals(this.servicePlan, provisioningHistory.servicePlan) &&
        Objects.equals(this.extendedAttributes, provisioningHistory.extendedAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(occurredAt, status, eventBy, eventType, mdn, msisdn, servicePlan, extendedAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisioningHistory {\n");
    
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    eventBy: ").append(toIndentedString(eventBy)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    mdn: ").append(toIndentedString(mdn)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
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

