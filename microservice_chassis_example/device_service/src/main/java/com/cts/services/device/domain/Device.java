package com.cts.services.device.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Device
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class Device   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("billingCycleEndDate")
  private String billingCycleEndDate = null;

  @JsonProperty("carrierInformations")
  private List<CarrierInformation> carrierInformations = null;

  @JsonProperty("connected")
  private Boolean connected = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("deviceIds")
  private List<DeviceId> deviceIds = null;

  @JsonProperty("extendedAttributes")
  private List<KvPair> extendedAttributes = null;

  @JsonProperty("groupNames")
  private List<String> groupNames = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("lastActivationBy")
  private String lastActivationBy = null;

  @JsonProperty("lastActivationDate")
  private String lastActivationDate = null;

  @JsonProperty("lastConnectionDate")
  private String lastConnectionDate = null;

  public Device accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @ApiModelProperty(value = "")


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Device billingCycleEndDate(String billingCycleEndDate) {
    this.billingCycleEndDate = billingCycleEndDate;
    return this;
  }

   /**
   * Get billingCycleEndDate
   * @return billingCycleEndDate
  **/
  @ApiModelProperty(value = "")


  public String getBillingCycleEndDate() {
    return billingCycleEndDate;
  }

  public void setBillingCycleEndDate(String billingCycleEndDate) {
    this.billingCycleEndDate = billingCycleEndDate;
  }

  public Device carrierInformations(List<CarrierInformation> carrierInformations) {
    this.carrierInformations = carrierInformations;
    return this;
  }

  public Device addCarrierInformationsItem(CarrierInformation carrierInformationsItem) {
    if (this.carrierInformations == null) {
      this.carrierInformations = new ArrayList<CarrierInformation>();
    }
    this.carrierInformations.add(carrierInformationsItem);
    return this;
  }

   /**
   * Get carrierInformations
   * @return carrierInformations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CarrierInformation> getCarrierInformations() {
    return carrierInformations;
  }

  public void setCarrierInformations(List<CarrierInformation> carrierInformations) {
    this.carrierInformations = carrierInformations;
  }

  public Device connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Get connected
   * @return connected
  **/
  @ApiModelProperty(value = "")


  public Boolean getConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }

  public Device createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Device customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Device addCustomFieldsItem(KvPair customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<KvPair>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<KvPair> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<KvPair> customFields) {
    this.customFields = customFields;
  }

  public Device deviceIds(List<DeviceId> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public Device addDeviceIdsItem(DeviceId deviceIdsItem) {
    if (this.deviceIds == null) {
      this.deviceIds = new ArrayList<DeviceId>();
    }
    this.deviceIds.add(deviceIdsItem);
    return this;
  }

   /**
   * Get deviceIds
   * @return deviceIds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeviceId> getDeviceIds() {
    return deviceIds;
  }

  public void setDeviceIds(List<DeviceId> deviceIds) {
    this.deviceIds = deviceIds;
  }

  public Device extendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public Device addExtendedAttributesItem(KvPair extendedAttributesItem) {
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

  public Device groupNames(List<String> groupNames) {
    this.groupNames = groupNames;
    return this;
  }

  public Device addGroupNamesItem(String groupNamesItem) {
    if (this.groupNames == null) {
      this.groupNames = new ArrayList<String>();
    }
    this.groupNames.add(groupNamesItem);
    return this;
  }

   /**
   * Get groupNames
   * @return groupNames
  **/
  @ApiModelProperty(value = "")


  public List<String> getGroupNames() {
    return groupNames;
  }

  public void setGroupNames(List<String> groupNames) {
    this.groupNames = groupNames;
  }

  public Device ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @ApiModelProperty(value = "")


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public Device lastActivationBy(String lastActivationBy) {
    this.lastActivationBy = lastActivationBy;
    return this;
  }

   /**
   * Get lastActivationBy
   * @return lastActivationBy
  **/
  @ApiModelProperty(value = "")


  public String getLastActivationBy() {
    return lastActivationBy;
  }

  public void setLastActivationBy(String lastActivationBy) {
    this.lastActivationBy = lastActivationBy;
  }

  public Device lastActivationDate(String lastActivationDate) {
    this.lastActivationDate = lastActivationDate;
    return this;
  }

   /**
   * Get lastActivationDate
   * @return lastActivationDate
  **/
  @ApiModelProperty(value = "")


  public String getLastActivationDate() {
    return lastActivationDate;
  }

  public void setLastActivationDate(String lastActivationDate) {
    this.lastActivationDate = lastActivationDate;
  }

  public Device lastConnectionDate(String lastConnectionDate) {
    this.lastConnectionDate = lastConnectionDate;
    return this;
  }

   /**
   * Get lastConnectionDate
   * @return lastConnectionDate
  **/
  @ApiModelProperty(value = "")


  public String getLastConnectionDate() {
    return lastConnectionDate;
  }

  public void setLastConnectionDate(String lastConnectionDate) {
    this.lastConnectionDate = lastConnectionDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Device device = (Device) o;
    return Objects.equals(this.accountName, device.accountName) &&
        Objects.equals(this.billingCycleEndDate, device.billingCycleEndDate) &&
        Objects.equals(this.carrierInformations, device.carrierInformations) &&
        Objects.equals(this.connected, device.connected) &&
        Objects.equals(this.createdAt, device.createdAt) &&
        Objects.equals(this.customFields, device.customFields) &&
        Objects.equals(this.deviceIds, device.deviceIds) &&
        Objects.equals(this.extendedAttributes, device.extendedAttributes) &&
        Objects.equals(this.groupNames, device.groupNames) &&
        Objects.equals(this.ipAddress, device.ipAddress) &&
        Objects.equals(this.lastActivationBy, device.lastActivationBy) &&
        Objects.equals(this.lastActivationDate, device.lastActivationDate) &&
        Objects.equals(this.lastConnectionDate, device.lastConnectionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, billingCycleEndDate, carrierInformations, connected, createdAt, customFields, deviceIds, extendedAttributes, groupNames, ipAddress, lastActivationBy, lastActivationDate, lastConnectionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Device {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    billingCycleEndDate: ").append(toIndentedString(billingCycleEndDate)).append("\n");
    sb.append("    carrierInformations: ").append(toIndentedString(carrierInformations)).append("\n");
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    lastActivationBy: ").append(toIndentedString(lastActivationBy)).append("\n");
    sb.append("    lastActivationDate: ").append(toIndentedString(lastActivationDate)).append("\n");
    sb.append("    lastConnectionDate: ").append(toIndentedString(lastConnectionDate)).append("\n");
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

