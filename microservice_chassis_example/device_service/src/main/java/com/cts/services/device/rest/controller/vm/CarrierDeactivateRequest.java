package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceList;
import com.cts.services.device.domain.KvPair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CarrierDeactivateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class CarrierDeactivateRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("etfWaiver")
  private Boolean etfWaiver = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("reasonCode")
  private String reasonCode = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  public CarrierDeactivateRequest accountName(String accountName) {
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

  public CarrierDeactivateRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CarrierDeactivateRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public CarrierDeactivateRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public CarrierDeactivateRequest addDevicesItem(DeviceList devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<DeviceList>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Get devices
   * @return devices
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeviceList> getDevices() {
    return devices;
  }

  public void setDevices(List<DeviceList> devices) {
    this.devices = devices;
  }

  public CarrierDeactivateRequest etfWaiver(Boolean etfWaiver) {
    this.etfWaiver = etfWaiver;
    return this;
  }

   /**
   * Get etfWaiver
   * @return etfWaiver
  **/
  @ApiModelProperty(value = "")


  public Boolean getEtfWaiver() {
    return etfWaiver;
  }

  public void setEtfWaiver(Boolean etfWaiver) {
    this.etfWaiver = etfWaiver;
  }

  public CarrierDeactivateRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "")


  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public CarrierDeactivateRequest reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * Get reasonCode
   * @return reasonCode
  **/
  @ApiModelProperty(value = "")


  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public CarrierDeactivateRequest servicePlan(String servicePlan) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierDeactivateRequest carrierDeactivateRequest = (CarrierDeactivateRequest) o;
    return Objects.equals(this.accountName, carrierDeactivateRequest.accountName) &&
        Objects.equals(this.customFields, carrierDeactivateRequest.customFields) &&
        Objects.equals(this.devices, carrierDeactivateRequest.devices) &&
        Objects.equals(this.etfWaiver, carrierDeactivateRequest.etfWaiver) &&
        Objects.equals(this.groupName, carrierDeactivateRequest.groupName) &&
        Objects.equals(this.reasonCode, carrierDeactivateRequest.reasonCode) &&
        Objects.equals(this.servicePlan, carrierDeactivateRequest.servicePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, customFields, devices, etfWaiver, groupName, reasonCode, servicePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierDeactivateRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    etfWaiver: ").append(toIndentedString(etfWaiver)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
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

