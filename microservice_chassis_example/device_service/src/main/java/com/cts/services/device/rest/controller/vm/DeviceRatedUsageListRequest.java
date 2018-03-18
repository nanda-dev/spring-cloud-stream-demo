package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceRatedUsageListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceRatedUsageListRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("deviceIds")
  private List<DeviceId> deviceIds = null;

  @JsonProperty("groupName")
  private String groupName = null;

  public DeviceRatedUsageListRequest accountName(String accountName) {
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

  public DeviceRatedUsageListRequest deviceIds(List<DeviceId> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public DeviceRatedUsageListRequest addDeviceIdsItem(DeviceId deviceIdsItem) {
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

  public DeviceRatedUsageListRequest groupName(String groupName) {
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
    DeviceRatedUsageListRequest deviceRatedUsageListRequest = (DeviceRatedUsageListRequest) o;
    return Objects.equals(this.accountName, deviceRatedUsageListRequest.accountName) &&
        Objects.equals(this.deviceIds, deviceRatedUsageListRequest.deviceIds) &&
        Objects.equals(this.groupName, deviceRatedUsageListRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, deviceIds, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRatedUsageListRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
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

