package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceList;
import com.cts.services.device.domain.KvPair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * AddDevicesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class AddDevicesRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("devicesToAdd")
  private List<DeviceList> devicesToAdd = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("skuNumber")
  private String skuNumber = null;

  @JsonProperty("state")
  private String state = null;

  public AddDevicesRequest accountName(String accountName) {
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

  public AddDevicesRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public AddDevicesRequest addCustomFieldsItem(KvPair customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<KvPair>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<KvPair> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<KvPair> customFields) {
    this.customFields = customFields;
  }

  public AddDevicesRequest devicesToAdd(List<DeviceList> devicesToAdd) {
    this.devicesToAdd = devicesToAdd;
    return this;
  }

  public AddDevicesRequest addDevicesToAddItem(DeviceList devicesToAddItem) {
    if (this.devicesToAdd == null) {
      this.devicesToAdd = new ArrayList<DeviceList>();
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

  public List<DeviceList> getDevicesToAdd() {
    return devicesToAdd;
  }

  public void setDevicesToAdd(List<DeviceList> devicesToAdd) {
    this.devicesToAdd = devicesToAdd;
  }

  public AddDevicesRequest groupName(String groupName) {
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

  public AddDevicesRequest skuNumber(String skuNumber) {
    this.skuNumber = skuNumber;
    return this;
  }

   /**
   * Get skuNumber
   * @return skuNumber
  **/
  @ApiModelProperty(value = "")


  public String getSkuNumber() {
    return skuNumber;
  }

  public void setSkuNumber(String skuNumber) {
    this.skuNumber = skuNumber;
  }

  public AddDevicesRequest state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddDevicesRequest addDevicesRequest = (AddDevicesRequest) o;
    return Objects.equals(this.accountName, addDevicesRequest.accountName) &&
        Objects.equals(this.customFields, addDevicesRequest.customFields) &&
        Objects.equals(this.devicesToAdd, addDevicesRequest.devicesToAdd) &&
        Objects.equals(this.groupName, addDevicesRequest.groupName) &&
        Objects.equals(this.skuNumber, addDevicesRequest.skuNumber) &&
        Objects.equals(this.state, addDevicesRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, customFields, devicesToAdd, groupName, skuNumber, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddDevicesRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    devicesToAdd: ").append(toIndentedString(devicesToAdd)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    skuNumber: ").append(toIndentedString(skuNumber)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

