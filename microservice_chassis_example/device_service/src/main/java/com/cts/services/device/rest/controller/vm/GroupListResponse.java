package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceList;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GroupListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class GroupListResponse   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("hasMoreData")
  private Boolean hasMoreData = null;

  @JsonProperty("name")
  private String name = null;

  public GroupListResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GroupListResponse devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public GroupListResponse addDevicesItem(DeviceList devicesItem) {
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

  public GroupListResponse hasMoreData(Boolean hasMoreData) {
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

  public GroupListResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupListResponse groupListResponse = (GroupListResponse) o;
    return Objects.equals(this.description, groupListResponse.description) &&
        Objects.equals(this.devices, groupListResponse.devices) &&
        Objects.equals(this.hasMoreData, groupListResponse.hasMoreData) &&
        Objects.equals(this.name, groupListResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, devices, hasMoreData, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupListResponse {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

