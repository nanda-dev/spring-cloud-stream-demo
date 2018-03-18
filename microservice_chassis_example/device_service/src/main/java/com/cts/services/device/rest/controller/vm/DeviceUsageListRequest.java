package com.cts.services.device.rest.controller.vm;

import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceUsageListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceUsageListRequest   {
  @JsonProperty("deviceId")
  private DeviceId deviceId = null;

  @JsonProperty("earliest")
  private String earliest = null;

  @JsonProperty("latest")
  private String latest = null;

  public DeviceUsageListRequest deviceId(DeviceId deviceId) {
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

  public DeviceUsageListRequest earliest(String earliest) {
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

  public DeviceUsageListRequest latest(String latest) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceUsageListRequest deviceUsageListRequest = (DeviceUsageListRequest) o;
    return Objects.equals(this.deviceId, deviceUsageListRequest.deviceId) &&
        Objects.equals(this.earliest, deviceUsageListRequest.earliest) &&
        Objects.equals(this.latest, deviceUsageListRequest.latest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, earliest, latest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceUsageListRequest {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    earliest: ").append(toIndentedString(earliest)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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

