package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DateFilter;
import com.cts.services.device.domain.DeviceList;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceMismatchListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceMismatchListRequest   {
  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("filter")
  private DateFilter filter = null;

  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("groupName")
  private String groupName = null;

  public DeviceMismatchListRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public DeviceMismatchListRequest addDevicesItem(DeviceList devicesItem) {
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

  public DeviceMismatchListRequest filter(DateFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateFilter getFilter() {
    return filter;
  }

  public void setFilter(DateFilter filter) {
    this.filter = filter;
  }

  public DeviceMismatchListRequest accountName(String accountName) {
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

  public DeviceMismatchListRequest groupName(String groupName) {
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
    DeviceMismatchListRequest deviceMismatchListRequest = (DeviceMismatchListRequest) o;
    return Objects.equals(this.devices, deviceMismatchListRequest.devices) &&
        Objects.equals(this.filter, deviceMismatchListRequest.filter) &&
        Objects.equals(this.accountName, deviceMismatchListRequest.accountName) &&
        Objects.equals(this.groupName, deviceMismatchListRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices, filter, accountName, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMismatchListRequest {\n");
    
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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

