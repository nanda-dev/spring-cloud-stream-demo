package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GroupUpdateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class GroupUpdateRequest   {
  @JsonProperty("devicesToAdd")
  private List<DeviceId> devicesToAdd = null;

  @JsonProperty("devicesToRemove")
  private List<DeviceId> devicesToRemove = null;

  @JsonProperty("newGroupDescription")
  private String newGroupDescription = null;

  @JsonProperty("newGroupName")
  private String newGroupName = null;

  public GroupUpdateRequest devicesToAdd(List<DeviceId> devicesToAdd) {
    this.devicesToAdd = devicesToAdd;
    return this;
  }

  public GroupUpdateRequest addDevicesToAddItem(DeviceId devicesToAddItem) {
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

  public GroupUpdateRequest devicesToRemove(List<DeviceId> devicesToRemove) {
    this.devicesToRemove = devicesToRemove;
    return this;
  }

  public GroupUpdateRequest addDevicesToRemoveItem(DeviceId devicesToRemoveItem) {
    if (this.devicesToRemove == null) {
      this.devicesToRemove = new ArrayList<DeviceId>();
    }
    this.devicesToRemove.add(devicesToRemoveItem);
    return this;
  }

   /**
   * Get devicesToRemove
   * @return devicesToRemove
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeviceId> getDevicesToRemove() {
    return devicesToRemove;
  }

  public void setDevicesToRemove(List<DeviceId> devicesToRemove) {
    this.devicesToRemove = devicesToRemove;
  }

  public GroupUpdateRequest newGroupDescription(String newGroupDescription) {
    this.newGroupDescription = newGroupDescription;
    return this;
  }

   /**
   * Get newGroupDescription
   * @return newGroupDescription
  **/
  @ApiModelProperty(value = "")


  public String getNewGroupDescription() {
    return newGroupDescription;
  }

  public void setNewGroupDescription(String newGroupDescription) {
    this.newGroupDescription = newGroupDescription;
  }

  public GroupUpdateRequest newGroupName(String newGroupName) {
    this.newGroupName = newGroupName;
    return this;
  }

   /**
   * Get newGroupName
   * @return newGroupName
  **/
  @ApiModelProperty(value = "")


  public String getNewGroupName() {
    return newGroupName;
  }

  public void setNewGroupName(String newGroupName) {
    this.newGroupName = newGroupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupUpdateRequest groupUpdateRequest = (GroupUpdateRequest) o;
    return Objects.equals(this.devicesToAdd, groupUpdateRequest.devicesToAdd) &&
        Objects.equals(this.devicesToRemove, groupUpdateRequest.devicesToRemove) &&
        Objects.equals(this.newGroupDescription, groupUpdateRequest.newGroupDescription) &&
        Objects.equals(this.newGroupName, groupUpdateRequest.newGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicesToAdd, devicesToRemove, newGroupDescription, newGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupUpdateRequest {\n");
    
    sb.append("    devicesToAdd: ").append(toIndentedString(devicesToAdd)).append("\n");
    sb.append("    devicesToRemove: ").append(toIndentedString(devicesToRemove)).append("\n");
    sb.append("    newGroupDescription: ").append(toIndentedString(newGroupDescription)).append("\n");
    sb.append("    newGroupName: ").append(toIndentedString(newGroupName)).append("\n");
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

