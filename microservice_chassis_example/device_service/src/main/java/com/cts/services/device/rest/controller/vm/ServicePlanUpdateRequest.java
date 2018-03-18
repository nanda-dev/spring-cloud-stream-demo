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
 * ServicePlanUpdateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class ServicePlanUpdateRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("currentServicePlan")
  private String currentServicePlan = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  public ServicePlanUpdateRequest accountName(String accountName) {
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

  public ServicePlanUpdateRequest currentServicePlan(String currentServicePlan) {
    this.currentServicePlan = currentServicePlan;
    return this;
  }

   /**
   * Get currentServicePlan
   * @return currentServicePlan
  **/
  @ApiModelProperty(value = "")


  public String getCurrentServicePlan() {
    return currentServicePlan;
  }

  public void setCurrentServicePlan(String currentServicePlan) {
    this.currentServicePlan = currentServicePlan;
  }

  public ServicePlanUpdateRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ServicePlanUpdateRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public ServicePlanUpdateRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public ServicePlanUpdateRequest addDevicesItem(DeviceList devicesItem) {
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

  public ServicePlanUpdateRequest groupName(String groupName) {
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

  public ServicePlanUpdateRequest servicePlan(String servicePlan) {
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
    ServicePlanUpdateRequest servicePlanUpdateRequest = (ServicePlanUpdateRequest) o;
    return Objects.equals(this.accountName, servicePlanUpdateRequest.accountName) &&
        Objects.equals(this.currentServicePlan, servicePlanUpdateRequest.currentServicePlan) &&
        Objects.equals(this.customFields, servicePlanUpdateRequest.customFields) &&
        Objects.equals(this.devices, servicePlanUpdateRequest.devices) &&
        Objects.equals(this.groupName, servicePlanUpdateRequest.groupName) &&
        Objects.equals(this.servicePlan, servicePlanUpdateRequest.servicePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, currentServicePlan, customFields, devices, groupName, servicePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePlanUpdateRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    currentServicePlan: ").append(toIndentedString(currentServicePlan)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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

