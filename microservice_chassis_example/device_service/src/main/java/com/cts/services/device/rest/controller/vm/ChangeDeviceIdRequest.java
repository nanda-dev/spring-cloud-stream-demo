package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ChangeDeviceIdRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class ChangeDeviceIdRequest   {
  @JsonProperty("assignNonGeoMdn")
  private Boolean assignNonGeoMdn = null;

  @JsonProperty("change4gOption")
  private String change4gOption = null;

  @JsonProperty("deviceIds")
  private List<DeviceId> deviceIds = null;

  @JsonProperty("deviceIdsTo")
  private List<DeviceId> deviceIdsTo = null;

  @JsonProperty("npaNxx")
  private String npaNxx = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("zipCode")
  private String zipCode = null;

  public ChangeDeviceIdRequest assignNonGeoMdn(Boolean assignNonGeoMdn) {
    this.assignNonGeoMdn = assignNonGeoMdn;
    return this;
  }

   /**
   * Get assignNonGeoMdn
   * @return assignNonGeoMdn
  **/
  @ApiModelProperty(value = "")


  public Boolean getAssignNonGeoMdn() {
    return assignNonGeoMdn;
  }

  public void setAssignNonGeoMdn(Boolean assignNonGeoMdn) {
    this.assignNonGeoMdn = assignNonGeoMdn;
  }

  public ChangeDeviceIdRequest change4gOption(String change4gOption) {
    this.change4gOption = change4gOption;
    return this;
  }

   /**
   * Get change4gOption
   * @return change4gOption
  **/
  @ApiModelProperty(value = "")


  public String getChange4gOption() {
    return change4gOption;
  }

  public void setChange4gOption(String change4gOption) {
    this.change4gOption = change4gOption;
  }

  public ChangeDeviceIdRequest deviceIds(List<DeviceId> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public ChangeDeviceIdRequest addDeviceIdsItem(DeviceId deviceIdsItem) {
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

  public ChangeDeviceIdRequest deviceIdsTo(List<DeviceId> deviceIdsTo) {
    this.deviceIdsTo = deviceIdsTo;
    return this;
  }

  public ChangeDeviceIdRequest addDeviceIdsToItem(DeviceId deviceIdsToItem) {
    if (this.deviceIdsTo == null) {
      this.deviceIdsTo = new ArrayList<DeviceId>();
    }
    this.deviceIdsTo.add(deviceIdsToItem);
    return this;
  }

   /**
   * Get deviceIdsTo
   * @return deviceIdsTo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeviceId> getDeviceIdsTo() {
    return deviceIdsTo;
  }

  public void setDeviceIdsTo(List<DeviceId> deviceIdsTo) {
    this.deviceIdsTo = deviceIdsTo;
  }

  public ChangeDeviceIdRequest npaNxx(String npaNxx) {
    this.npaNxx = npaNxx;
    return this;
  }

   /**
   * Get npaNxx
   * @return npaNxx
  **/
  @ApiModelProperty(value = "")


  public String getNpaNxx() {
    return npaNxx;
  }

  public void setNpaNxx(String npaNxx) {
    this.npaNxx = npaNxx;
  }

  public ChangeDeviceIdRequest servicePlan(String servicePlan) {
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

  public ChangeDeviceIdRequest zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @ApiModelProperty(value = "")


  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeDeviceIdRequest changeDeviceIdRequest = (ChangeDeviceIdRequest) o;
    return Objects.equals(this.assignNonGeoMdn, changeDeviceIdRequest.assignNonGeoMdn) &&
        Objects.equals(this.change4gOption, changeDeviceIdRequest.change4gOption) &&
        Objects.equals(this.deviceIds, changeDeviceIdRequest.deviceIds) &&
        Objects.equals(this.deviceIdsTo, changeDeviceIdRequest.deviceIdsTo) &&
        Objects.equals(this.npaNxx, changeDeviceIdRequest.npaNxx) &&
        Objects.equals(this.servicePlan, changeDeviceIdRequest.servicePlan) &&
        Objects.equals(this.zipCode, changeDeviceIdRequest.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignNonGeoMdn, change4gOption, deviceIds, deviceIdsTo, npaNxx, servicePlan, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeDeviceIdRequest {\n");
    
    sb.append("    assignNonGeoMdn: ").append(toIndentedString(assignNonGeoMdn)).append("\n");
    sb.append("    change4gOption: ").append(toIndentedString(change4gOption)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    deviceIdsTo: ").append(toIndentedString(deviceIdsTo)).append("\n");
    sb.append("    npaNxx: ").append(toIndentedString(npaNxx)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

