package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceId;
import com.cts.services.device.domain.KvPair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SMSSendRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class SMSSendRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("dataEncoding")
  private String dataEncoding = null;

  @JsonProperty("deviceIds")
  private List<DeviceId> deviceIds = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("smsMessage")
  private String smsMessage = null;

  public SMSSendRequest accountName(String accountName) {
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

  public SMSSendRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SMSSendRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public SMSSendRequest dataEncoding(String dataEncoding) {
    this.dataEncoding = dataEncoding;
    return this;
  }

   /**
   * Get dataEncoding
   * @return dataEncoding
  **/
  @ApiModelProperty(value = "")


  public String getDataEncoding() {
    return dataEncoding;
  }

  public void setDataEncoding(String dataEncoding) {
    this.dataEncoding = dataEncoding;
  }

  public SMSSendRequest deviceIds(List<DeviceId> deviceIds) {
    this.deviceIds = deviceIds;
    return this;
  }

  public SMSSendRequest addDeviceIdsItem(DeviceId deviceIdsItem) {
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

  public SMSSendRequest groupName(String groupName) {
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

  public SMSSendRequest servicePlan(String servicePlan) {
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

  public SMSSendRequest smsMessage(String smsMessage) {
    this.smsMessage = smsMessage;
    return this;
  }

   /**
   * Get smsMessage
   * @return smsMessage
  **/
  @ApiModelProperty(value = "")


  public String getSmsMessage() {
    return smsMessage;
  }

  public void setSmsMessage(String smsMessage) {
    this.smsMessage = smsMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SMSSendRequest smSSendRequest = (SMSSendRequest) o;
    return Objects.equals(this.accountName, smSSendRequest.accountName) &&
        Objects.equals(this.customFields, smSSendRequest.customFields) &&
        Objects.equals(this.dataEncoding, smSSendRequest.dataEncoding) &&
        Objects.equals(this.deviceIds, smSSendRequest.deviceIds) &&
        Objects.equals(this.groupName, smSSendRequest.groupName) &&
        Objects.equals(this.servicePlan, smSSendRequest.servicePlan) &&
        Objects.equals(this.smsMessage, smSSendRequest.smsMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, customFields, dataEncoding, deviceIds, groupName, servicePlan, smsMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSSendRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    dataEncoding: ").append(toIndentedString(dataEncoding)).append("\n");
    sb.append("    deviceIds: ").append(toIndentedString(deviceIds)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    smsMessage: ").append(toIndentedString(smsMessage)).append("\n");
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

