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
 * GoToStateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class GoToStateRequest   {
  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("filter")
  private DeviceFilter filter = null;

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("stateName")
  private String stateName = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("mdnZipCode")
  private String mdnZipCode = null;

  @JsonProperty("carrierIpPoolName")
  private String carrierIpPoolName = null;

  @JsonProperty("publicIpRestriction")
  private String publicIpRestriction = null;

  @JsonProperty("skuNumber")
  private String skuNumber = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("groupName")
  private String groupName = null;

  public GoToStateRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public GoToStateRequest addDevicesItem(DeviceList devicesItem) {
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

  public GoToStateRequest filter(DeviceFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DeviceFilter getFilter() {
    return filter;
  }

  public void setFilter(DeviceFilter filter) {
    this.filter = filter;
  }

  public GoToStateRequest serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")


  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public GoToStateRequest stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

   /**
   * Get stateName
   * @return stateName
  **/
  @ApiModelProperty(value = "")


  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public GoToStateRequest servicePlan(String servicePlan) {
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

  public GoToStateRequest mdnZipCode(String mdnZipCode) {
    this.mdnZipCode = mdnZipCode;
    return this;
  }

   /**
   * Get mdnZipCode
   * @return mdnZipCode
  **/
  @ApiModelProperty(value = "")


  public String getMdnZipCode() {
    return mdnZipCode;
  }

  public void setMdnZipCode(String mdnZipCode) {
    this.mdnZipCode = mdnZipCode;
  }

  public GoToStateRequest carrierIpPoolName(String carrierIpPoolName) {
    this.carrierIpPoolName = carrierIpPoolName;
    return this;
  }

   /**
   * Get carrierIpPoolName
   * @return carrierIpPoolName
  **/
  @ApiModelProperty(value = "")


  public String getCarrierIpPoolName() {
    return carrierIpPoolName;
  }

  public void setCarrierIpPoolName(String carrierIpPoolName) {
    this.carrierIpPoolName = carrierIpPoolName;
  }

  public GoToStateRequest publicIpRestriction(String publicIpRestriction) {
    this.publicIpRestriction = publicIpRestriction;
    return this;
  }

   /**
   * Get publicIpRestriction
   * @return publicIpRestriction
  **/
  @ApiModelProperty(value = "")


  public String getPublicIpRestriction() {
    return publicIpRestriction;
  }

  public void setPublicIpRestriction(String publicIpRestriction) {
    this.publicIpRestriction = publicIpRestriction;
  }

  public GoToStateRequest skuNumber(String skuNumber) {
    this.skuNumber = skuNumber;
    return this;
  }

   /**
   * Get skuNumber
   * @return skuNumber
  **/
  @ApiModelProperty(value = "")


  public String getSkuNumber() {
    return skuNumber;
  }

  public void setSkuNumber(String skuNumber) {
    this.skuNumber = skuNumber;
  }

  public GoToStateRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public GoToStateRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public GoToStateRequest groupName(String groupName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoToStateRequest goToStateRequest = (GoToStateRequest) o;
    return Objects.equals(this.devices, goToStateRequest.devices) &&
        Objects.equals(this.filter, goToStateRequest.filter) &&
        Objects.equals(this.serviceName, goToStateRequest.serviceName) &&
        Objects.equals(this.stateName, goToStateRequest.stateName) &&
        Objects.equals(this.servicePlan, goToStateRequest.servicePlan) &&
        Objects.equals(this.mdnZipCode, goToStateRequest.mdnZipCode) &&
        Objects.equals(this.carrierIpPoolName, goToStateRequest.carrierIpPoolName) &&
        Objects.equals(this.publicIpRestriction, goToStateRequest.publicIpRestriction) &&
        Objects.equals(this.skuNumber, goToStateRequest.skuNumber) &&
        Objects.equals(this.customFields, goToStateRequest.customFields) &&
        Objects.equals(this.groupName, goToStateRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices, filter, serviceName, stateName, servicePlan, mdnZipCode, carrierIpPoolName, publicIpRestriction, skuNumber, customFields, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoToStateRequest {\n");
    
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    mdnZipCode: ").append(toIndentedString(mdnZipCode)).append("\n");
    sb.append("    carrierIpPoolName: ").append(toIndentedString(carrierIpPoolName)).append("\n");
    sb.append("    publicIpRestriction: ").append(toIndentedString(publicIpRestriction)).append("\n");
    sb.append("    skuNumber: ").append(toIndentedString(skuNumber)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

