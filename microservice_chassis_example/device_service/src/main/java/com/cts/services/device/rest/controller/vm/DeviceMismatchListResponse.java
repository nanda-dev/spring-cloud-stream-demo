package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.MismatchedDevice;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceMismatchListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceMismatchListResponse   {
  @JsonProperty("devices")
  private List<MismatchedDevice> devices = null;

  public DeviceMismatchListResponse devices(List<MismatchedDevice> devices) {
    this.devices = devices;
    return this;
  }

  public DeviceMismatchListResponse addDevicesItem(MismatchedDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<MismatchedDevice>();
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

  public List<MismatchedDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<MismatchedDevice> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMismatchListResponse deviceMismatchListResponse = (DeviceMismatchListResponse) o;
    return Objects.equals(this.devices, deviceMismatchListResponse.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMismatchListResponse {\n");
    
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

