package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceList;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeleteDevicesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeleteDevicesRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("devicesToDelete")
  private List<DeviceList> devicesToDelete = null;

  public DeleteDevicesRequest accountName(String accountName) {
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

  public DeleteDevicesRequest devicesToDelete(List<DeviceList> devicesToDelete) {
    this.devicesToDelete = devicesToDelete;
    return this;
  }

  public DeleteDevicesRequest addDevicesToDeleteItem(DeviceList devicesToDeleteItem) {
    if (this.devicesToDelete == null) {
      this.devicesToDelete = new ArrayList<DeviceList>();
    }
    this.devicesToDelete.add(devicesToDeleteItem);
    return this;
  }

   /**
   * Get devicesToDelete
   * @return devicesToDelete
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeviceList> getDevicesToDelete() {
    return devicesToDelete;
  }

  public void setDevicesToDelete(List<DeviceList> devicesToDelete) {
    this.devicesToDelete = devicesToDelete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteDevicesRequest deleteDevicesRequest = (DeleteDevicesRequest) o;
    return Objects.equals(this.accountName, deleteDevicesRequest.accountName) &&
        Objects.equals(this.devicesToDelete, deleteDevicesRequest.devicesToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, devicesToDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteDevicesRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    devicesToDelete: ").append(toIndentedString(devicesToDelete)).append("\n");
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

