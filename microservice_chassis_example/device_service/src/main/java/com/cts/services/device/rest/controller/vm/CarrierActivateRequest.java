package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.DeviceList;
import com.cts.services.device.domain.KvPair;
import com.cts.services.device.domain.PlaceOfUse;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CarrierActivateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class CarrierActivateRequest   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("carrierIpPoolName")
  private String carrierIpPoolName = null;

  @JsonProperty("carrierName")
  private String carrierName = null;

  @JsonProperty("costCenterCode")
  private String costCenterCode = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  @JsonProperty("devices")
  private List<DeviceList> devices = null;

  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("leadId")
  private String leadId = null;

  @JsonProperty("mdnZipCode")
  private String mdnZipCode = null;

  @JsonProperty("primaryPlaceOfUse")
  private PlaceOfUse primaryPlaceOfUse = null;

  @JsonProperty("publicIpRestriction")
  private String publicIpRestriction = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("skuNumber")
  private String skuNumber = null;

  public CarrierActivateRequest accountName(String accountName) {
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

  public CarrierActivateRequest carrierIpPoolName(String carrierIpPoolName) {
    this.carrierIpPoolName = carrierIpPoolName;
    return this;
  }

   /**
   * Get carrierIpPoolName
   * @return carrierIpPoolName
  **/
  @ApiModelProperty(value = "")


  public String getCarrierIpPoolName() {
    return carrierIpPoolName;
  }

  public void setCarrierIpPoolName(String carrierIpPoolName) {
    this.carrierIpPoolName = carrierIpPoolName;
  }

  public CarrierActivateRequest carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * Get carrierName
   * @return carrierName
  **/
  @ApiModelProperty(value = "")


  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }

  public CarrierActivateRequest costCenterCode(String costCenterCode) {
    this.costCenterCode = costCenterCode;
    return this;
  }

   /**
   * Get costCenterCode
   * @return costCenterCode
  **/
  @ApiModelProperty(value = "")


  public String getCostCenterCode() {
    return costCenterCode;
  }

  public void setCostCenterCode(String costCenterCode) {
    this.costCenterCode = costCenterCode;
  }

  public CarrierActivateRequest customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CarrierActivateRequest addCustomFieldsItem(KvPair customFieldsItem) {
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

  public CarrierActivateRequest devices(List<DeviceList> devices) {
    this.devices = devices;
    return this;
  }

  public CarrierActivateRequest addDevicesItem(DeviceList devicesItem) {
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

  public CarrierActivateRequest groupName(String groupName) {
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

  public CarrierActivateRequest leadId(String leadId) {
    this.leadId = leadId;
    return this;
  }

   /**
   * Get leadId
   * @return leadId
  **/
  @ApiModelProperty(value = "")


  public String getLeadId() {
    return leadId;
  }

  public void setLeadId(String leadId) {
    this.leadId = leadId;
  }

  public CarrierActivateRequest mdnZipCode(String mdnZipCode) {
    this.mdnZipCode = mdnZipCode;
    return this;
  }

   /**
   * Get mdnZipCode
   * @return mdnZipCode
  **/
  @ApiModelProperty(value = "")


  public String getMdnZipCode() {
    return mdnZipCode;
  }

  public void setMdnZipCode(String mdnZipCode) {
    this.mdnZipCode = mdnZipCode;
  }

  public CarrierActivateRequest primaryPlaceOfUse(PlaceOfUse primaryPlaceOfUse) {
    this.primaryPlaceOfUse = primaryPlaceOfUse;
    return this;
  }

   /**
   * Get primaryPlaceOfUse
   * @return primaryPlaceOfUse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PlaceOfUse getPrimaryPlaceOfUse() {
    return primaryPlaceOfUse;
  }

  public void setPrimaryPlaceOfUse(PlaceOfUse primaryPlaceOfUse) {
    this.primaryPlaceOfUse = primaryPlaceOfUse;
  }

  public CarrierActivateRequest publicIpRestriction(String publicIpRestriction) {
    this.publicIpRestriction = publicIpRestriction;
    return this;
  }

   /**
   * Get publicIpRestriction
   * @return publicIpRestriction
  **/
  @ApiModelProperty(value = "")


  public String getPublicIpRestriction() {
    return publicIpRestriction;
  }

  public void setPublicIpRestriction(String publicIpRestriction) {
    this.publicIpRestriction = publicIpRestriction;
  }

  public CarrierActivateRequest servicePlan(String servicePlan) {
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

  public CarrierActivateRequest skuNumber(String skuNumber) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierActivateRequest carrierActivateRequest = (CarrierActivateRequest) o;
    return Objects.equals(this.accountName, carrierActivateRequest.accountName) &&
        Objects.equals(this.carrierIpPoolName, carrierActivateRequest.carrierIpPoolName) &&
        Objects.equals(this.carrierName, carrierActivateRequest.carrierName) &&
        Objects.equals(this.costCenterCode, carrierActivateRequest.costCenterCode) &&
        Objects.equals(this.customFields, carrierActivateRequest.customFields) &&
        Objects.equals(this.devices, carrierActivateRequest.devices) &&
        Objects.equals(this.groupName, carrierActivateRequest.groupName) &&
        Objects.equals(this.leadId, carrierActivateRequest.leadId) &&
        Objects.equals(this.mdnZipCode, carrierActivateRequest.mdnZipCode) &&
        Objects.equals(this.primaryPlaceOfUse, carrierActivateRequest.primaryPlaceOfUse) &&
        Objects.equals(this.publicIpRestriction, carrierActivateRequest.publicIpRestriction) &&
        Objects.equals(this.servicePlan, carrierActivateRequest.servicePlan) &&
        Objects.equals(this.skuNumber, carrierActivateRequest.skuNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, carrierIpPoolName, carrierName, costCenterCode, customFields, devices, groupName, leadId, mdnZipCode, primaryPlaceOfUse, publicIpRestriction, servicePlan, skuNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierActivateRequest {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    carrierIpPoolName: ").append(toIndentedString(carrierIpPoolName)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    costCenterCode: ").append(toIndentedString(costCenterCode)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
    sb.append("    mdnZipCode: ").append(toIndentedString(mdnZipCode)).append("\n");
    sb.append("    primaryPlaceOfUse: ").append(toIndentedString(primaryPlaceOfUse)).append("\n");
    sb.append("    publicIpRestriction: ").append(toIndentedString(publicIpRestriction)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    skuNumber: ").append(toIndentedString(skuNumber)).append("\n");
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

