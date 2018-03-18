package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceSuspensionStatusRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceSuspensionStatusRequest   {
  @JsonProperty("deviceIds")
  private List<DeviceId> deviceIds = null;

  @JsonProperty("filter")
  private DeviceFilterWithoutAccount filter = null;

  @JsonProperty("accountName")
  private String accountName = null;

  public DeviceSuspensionStatusRequest deviceIds(List<DeviceId> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public DeviceSuspensionStatusRequest addDeviceIdsItem(DeviceId deviceIdsItem) {
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

  public DeviceSuspensionStatusRequest filter(DeviceFilterWithoutAccount filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DeviceFilterWithoutAccount getFilter() {
    return filter;
  }

  public void setFilter(DeviceFilterWithoutAccount filter) {
    this.filter = filter;
  }

  public DeviceSuspensionStatusRequest accountName(String accountName) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceSuspensionStatusRequest deviceSuspensionStatusRequest = (DeviceSuspensionStatusRequest) o;
    return Objects.equals(this.deviceIds, deviceSuspensionStatusRequest.deviceIds) &&
        Objects.equals(this.filter, deviceSuspensionStatusRequest.filter) &&
        Objects.equals(this.accountName, deviceSuspensionStatusRequest.accountName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceIds, filter, accountName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceSuspensionStatusRequest {\n");
    
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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

