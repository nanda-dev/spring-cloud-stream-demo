package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.KvPair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceFilterWithoutAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceFilterWithoutAccount   {
  @JsonProperty("groupName")
  private String groupName = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("customFields")
  private List<KvPair> customFields = null;

  public DeviceFilterWithoutAccount groupName(String groupName) {
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

  public DeviceFilterWithoutAccount servicePlan(String servicePlan) {
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

  public DeviceFilterWithoutAccount customFields(List<KvPair> customFields) {
    this.customFields = customFields;
    return this;
  }

  public DeviceFilterWithoutAccount addCustomFieldsItem(KvPair customFieldsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceFilterWithoutAccount deviceFilterWithoutAccount = (DeviceFilterWithoutAccount) o;
    return Objects.equals(this.groupName, deviceFilterWithoutAccount.groupName) &&
        Objects.equals(this.servicePlan, deviceFilterWithoutAccount.servicePlan) &&
        Objects.equals(this.customFields, deviceFilterWithoutAccount.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, servicePlan, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceFilterWithoutAccount {\n");
    
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

