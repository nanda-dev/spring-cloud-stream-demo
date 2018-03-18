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
 * CustomFieldsUpdateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class CustomFieldsUpdateRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("customFieldsToUpdate")
  private List<KvPair> customFieldsToUpdate = null;

  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  public CustomFieldsUpdateRequest accountName(String accountName) {
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

  public CustomFieldsUpdateRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CustomFieldsUpdateRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public CustomFieldsUpdateRequest customFieldsToUpdate(List<KvPair> customFieldsToUpdate) {
    this.customFieldsToUpdate = customFieldsToUpdate;
    return this;
  }

  public CustomFieldsUpdateRequest addCustomFieldsToUpdateItem(KvPair customFieldsToUpdateItem) {
    if (this.customFieldsToUpdate == null) {
      this.customFieldsToUpdate = new ArrayList<KvPair>();
    }
    this.customFieldsToUpdate.add(customFieldsToUpdateItem);
    return this;
  }

   /**
   * Get customFieldsToUpdate
   * @return customFieldsToUpdate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<KvPair> getCustomFieldsToUpdate() {
    return customFieldsToUpdate;
  }

  public void setCustomFieldsToUpdate(List<KvPair> customFieldsToUpdate) {
    this.customFieldsToUpdate = customFieldsToUpdate;
  }

  public CustomFieldsUpdateRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public CustomFieldsUpdateRequest addDevicesItem(DeviceList devicesItem) {
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

  public CustomFieldsUpdateRequest groupName(String groupName) {
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

  public CustomFieldsUpdateRequest servicePlan(String servicePlan) {
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
    CustomFieldsUpdateRequest customFieldsUpdateRequest = (CustomFieldsUpdateRequest) o;
    return Objects.equals(this.accountName, customFieldsUpdateRequest.accountName) &&
        Objects.equals(this.customFields, customFieldsUpdateRequest.customFields) &&
        Objects.equals(this.customFieldsToUpdate, customFieldsUpdateRequest.customFieldsToUpdate) &&
        Objects.equals(this.devices, customFieldsUpdateRequest.devices) &&
        Objects.equals(this.groupName, customFieldsUpdateRequest.groupName) &&
        Objects.equals(this.servicePlan, customFieldsUpdateRequest.servicePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, customFields, customFieldsToUpdate, devices, groupName, servicePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldsUpdateRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    customFieldsToUpdate: ").append(toIndentedString(customFieldsToUpdate)).append("\n");
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

