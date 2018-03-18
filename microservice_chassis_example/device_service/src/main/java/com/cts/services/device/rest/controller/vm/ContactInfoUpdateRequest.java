package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceList;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ContactInfoUpdateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class ContactInfoUpdateRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("primaryPlaceOfUse")
  private Object primaryPlaceOfUse = null;

  public ContactInfoUpdateRequest accountName(String accountName) {
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

  public ContactInfoUpdateRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public ContactInfoUpdateRequest addDevicesItem(DeviceList devicesItem) {
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

  public ContactInfoUpdateRequest primaryPlaceOfUse(Object primaryPlaceOfUse) {
    this.primaryPlaceOfUse = primaryPlaceOfUse;
    return this;
  }

   /**
   * Get primaryPlaceOfUse
   * @return primaryPlaceOfUse
  **/
  @ApiModelProperty(value = "")


  public Object getPrimaryPlaceOfUse() {
    return primaryPlaceOfUse;
  }

  public void setPrimaryPlaceOfUse(Object primaryPlaceOfUse) {
    this.primaryPlaceOfUse = primaryPlaceOfUse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInfoUpdateRequest contactInfoUpdateRequest = (ContactInfoUpdateRequest) o;
    return Objects.equals(this.accountName, contactInfoUpdateRequest.accountName) &&
        Objects.equals(this.devices, contactInfoUpdateRequest.devices) &&
        Objects.equals(this.primaryPlaceOfUse, contactInfoUpdateRequest.primaryPlaceOfUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, devices, primaryPlaceOfUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInfoUpdateRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    primaryPlaceOfUse: ").append(toIndentedString(primaryPlaceOfUse)).append("\n");
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

