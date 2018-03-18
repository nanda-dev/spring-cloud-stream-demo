package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeleteDevicesResponseMessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeleteDevicesResponseMessage   {
  @JsonProperty("deviceIds")
  private List<DeviceId> deviceIds = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("message")
  private String message = null;

  public DeleteDevicesResponseMessage deviceIds(List<DeviceId> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public DeleteDevicesResponseMessage addDeviceIdsItem(DeviceId deviceIdsItem) {
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

  public DeleteDevicesResponseMessage status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DeleteDevicesResponseMessage message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDevicesResponseMessage deleteDevicesResponseMessage = (DeleteDevicesResponseMessage) o;
    return Objects.equals(this.deviceIds, deleteDevicesResponseMessage.deviceIds) &&
        Objects.equals(this.status, deleteDevicesResponseMessage.status) &&
        Objects.equals(this.message, deleteDevicesResponseMessage.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceIds, status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDevicesResponseMessage {\n");
    
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

