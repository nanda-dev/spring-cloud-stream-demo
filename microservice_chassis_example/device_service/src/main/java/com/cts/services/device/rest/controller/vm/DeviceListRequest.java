package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.cts.services.device.domain.KvPair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceListRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("currentState")
  private String currentState = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("deviceId")
  private DeviceId deviceId = null;

  @JsonProperty("earliest")
  private String earliest = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("latest")
  private String latest = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  public DeviceListRequest accountName(String accountName) {
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

  public DeviceListRequest currentState(String currentState) {
    this.currentState = currentState;
    return this;
  }

   /**
   * Get currentState
   * @return currentState
  **/
  @ApiModelProperty(value = "")


  public String getCurrentState() {
    return currentState;
  }

  public void setCurrentState(String currentState) {
    this.currentState = currentState;
  }

  public DeviceListRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public DeviceListRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public DeviceListRequest deviceId(DeviceId deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DeviceId getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(DeviceId deviceId) {
    this.deviceId = deviceId;
  }

  public DeviceListRequest earliest(String earliest) {
    this.earliest = earliest;
    return this;
  }

   /**
   * Get earliest
   * @return earliest
  **/
  @ApiModelProperty(value = "")


  public String getEarliest() {
    return earliest;
  }

  public void setEarliest(String earliest) {
    this.earliest = earliest;
  }

  public DeviceListRequest groupName(String groupName) {
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

  public DeviceListRequest latest(String latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @ApiModelProperty(value = "")


  public String getLatest() {
    return latest;
  }

  public void setLatest(String latest) {
    this.latest = latest;
  }

  public DeviceListRequest servicePlan(String servicePlan) {
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
    DeviceListRequest deviceListRequest = (DeviceListRequest) o;
    return Objects.equals(this.accountName, deviceListRequest.accountName) &&
        Objects.equals(this.currentState, deviceListRequest.currentState) &&
        Objects.equals(this.customFields, deviceListRequest.customFields) &&
        Objects.equals(this.deviceId, deviceListRequest.deviceId) &&
        Objects.equals(this.earliest, deviceListRequest.earliest) &&
        Objects.equals(this.groupName, deviceListRequest.groupName) &&
        Objects.equals(this.latest, deviceListRequest.latest) &&
        Objects.equals(this.servicePlan, deviceListRequest.servicePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, currentState, customFields, deviceId, earliest, groupName, latest, servicePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    currentState: ").append(toIndentedString(currentState)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    earliest: ").append(toIndentedString(earliest)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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

