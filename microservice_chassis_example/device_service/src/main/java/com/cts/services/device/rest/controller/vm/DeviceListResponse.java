package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.Device;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceListResponse   {
  @JsonProperty("devices")
  private List<Device> devices = null;

  @JsonProperty("hasMoreData")
  private Boolean hasMoreData = null;

  public DeviceListResponse devices(List<Device> devices) {
    this.devices = devices;
    return this;
  }

  public DeviceListResponse addDevicesItem(Device devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<Device>();
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

  public List<Device> getDevices() {
    return devices;
  }

  public void setDevices(List<Device> devices) {
    this.devices = devices;
  }

  public DeviceListResponse hasMoreData(Boolean hasMoreData) {
    this.hasMoreData = hasMoreData;
    return this;
  }

   /**
   * Get hasMoreData
   * @return hasMoreData
  **/
  @ApiModelProperty(value = "")


  public Boolean getHasMoreData() {
    return hasMoreData;
  }

  public void setHasMoreData(Boolean hasMoreData) {
    this.hasMoreData = hasMoreData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceListResponse deviceListResponse = (DeviceListResponse) o;
    return Objects.equals(this.devices, deviceListResponse.devices) &&
        Objects.equals(this.hasMoreData, deviceListResponse.hasMoreData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices, hasMoreData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceListResponse {\n");
    
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
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

