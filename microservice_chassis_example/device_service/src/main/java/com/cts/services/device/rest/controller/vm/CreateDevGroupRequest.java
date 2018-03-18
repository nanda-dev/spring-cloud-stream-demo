package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateDevGroupRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class CreateDevGroupRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("devicesToAdd")
  private List<DeviceId> devicesToAdd = null;

  @JsonProperty("groupDescription")
  private String groupDescription = null;

  @JsonProperty("groupName")
  private String groupName = null;

  public CreateDevGroupRequest accountName(String accountName) {
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

  public CreateDevGroupRequest devicesToAdd(List<DeviceId> devicesToAdd) {
    this.devicesToAdd = devicesToAdd;
    return this;
  }

  public CreateDevGroupRequest addDevicesToAddItem(DeviceId devicesToAddItem) {
    if (this.devicesToAdd == null) {
      this.devicesToAdd = new ArrayList<DeviceId>();
    }
    this.devicesToAdd.add(devicesToAddItem);
    return this;
  }

   /**
   * Get devicesToAdd
   * @return devicesToAdd
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeviceId> getDevicesToAdd() {
    return devicesToAdd;
  }

  public void setDevicesToAdd(List<DeviceId> devicesToAdd) {
    this.devicesToAdd = devicesToAdd;
  }

  public CreateDevGroupRequest groupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
    return this;
  }

   /**
   * Get groupDescription
   * @return groupDescription
  **/
  @ApiModelProperty(value = "")


  public String getGroupDescription() {
    return groupDescription;
  }

  public void setGroupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
  }

  public CreateDevGroupRequest groupName(String groupName) {
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
    CreateDevGroupRequest createDevGroupRequest = (CreateDevGroupRequest) o;
    return Objects.equals(this.accountName, createDevGroupRequest.accountName) &&
        Objects.equals(this.devicesToAdd, createDevGroupRequest.devicesToAdd) &&
        Objects.equals(this.groupDescription, createDevGroupRequest.groupDescription) &&
        Objects.equals(this.groupName, createDevGroupRequest.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, devicesToAdd, groupDescription, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDevGroupRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    devicesToAdd: ").append(toIndentedString(devicesToAdd)).append("\n");
    sb.append("    groupDescription: ").append(toIndentedString(groupDescription)).append("\n");
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

