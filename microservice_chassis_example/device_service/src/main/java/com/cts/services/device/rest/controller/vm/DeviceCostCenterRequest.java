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
 * DeviceCostCenterRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceCostCenterRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("costCenter")
  private String costCenter = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("primaryPlaceOfUse")
  private Object primaryPlaceOfUse = null;

  @JsonProperty("removeCostCenter")
  private Boolean removeCostCenter = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  public DeviceCostCenterRequest accountName(String accountName) {
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

  public DeviceCostCenterRequest costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

   /**
   * Get costCenter
   * @return costCenter
  **/
  @ApiModelProperty(value = "")


  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public DeviceCostCenterRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public DeviceCostCenterRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public DeviceCostCenterRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public DeviceCostCenterRequest addDevicesItem(DeviceList devicesItem) {
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

  public DeviceCostCenterRequest groupName(String groupName) {
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

  public DeviceCostCenterRequest primaryPlaceOfUse(Object primaryPlaceOfUse) {
    this.primaryPlaceOfUse = primaryPlaceOfUse;
    return this;
  }

   /**
   * Get primaryPlaceOfUse
   * @return primaryPlaceOfUse
  **/
  @ApiModelProperty(value = "")


  public Object getPrimaryPlaceOfUse() {
    return primaryPlaceOfUse;
  }

  public void setPrimaryPlaceOfUse(Object primaryPlaceOfUse) {
    this.primaryPlaceOfUse = primaryPlaceOfUse;
  }

  public DeviceCostCenterRequest removeCostCenter(Boolean removeCostCenter) {
    this.removeCostCenter = removeCostCenter;
    return this;
  }

   /**
   * Get removeCostCenter
   * @return removeCostCenter
  **/
  @ApiModelProperty(value = "")


  public Boolean getRemoveCostCenter() {
    return removeCostCenter;
  }

  public void setRemoveCostCenter(Boolean removeCostCenter) {
    this.removeCostCenter = removeCostCenter;
  }

  public DeviceCostCenterRequest servicePlan(String servicePlan) {
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
    DeviceCostCenterRequest deviceCostCenterRequest = (DeviceCostCenterRequest) o;
    return Objects.equals(this.accountName, deviceCostCenterRequest.accountName) &&
        Objects.equals(this.costCenter, deviceCostCenterRequest.costCenter) &&
        Objects.equals(this.customFields, deviceCostCenterRequest.customFields) &&
        Objects.equals(this.devices, deviceCostCenterRequest.devices) &&
        Objects.equals(this.groupName, deviceCostCenterRequest.groupName) &&
        Objects.equals(this.primaryPlaceOfUse, deviceCostCenterRequest.primaryPlaceOfUse) &&
        Objects.equals(this.removeCostCenter, deviceCostCenterRequest.removeCostCenter) &&
        Objects.equals(this.servicePlan, deviceCostCenterRequest.servicePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, costCenter, customFields, devices, groupName, primaryPlaceOfUse, removeCostCenter, servicePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCostCenterRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    primaryPlaceOfUse: ").append(toIndentedString(primaryPlaceOfUse)).append("\n");
    sb.append("    removeCostCenter: ").append(toIndentedString(removeCostCenter)).append("\n");
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

