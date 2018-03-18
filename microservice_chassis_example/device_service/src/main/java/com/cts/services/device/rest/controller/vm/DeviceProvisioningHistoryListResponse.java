package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.ProvisioningHistory;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceProvisioningHistoryListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceProvisioningHistoryListResponse   {
  @JsonProperty("hasMoreData")
  private Boolean hasMoreData = null;

  @JsonProperty("provisioningHistory")
  private List<ProvisioningHistory> provisioningHistory = null;

  public DeviceProvisioningHistoryListResponse hasMoreData(Boolean hasMoreData) {
    this.hasMoreData = hasMoreData;
    return this;
  }

   /**
   * Get hasMoreData
   * @return hasMoreData
  **/
  @ApiModelProperty(value = "")


  public Boolean getHasMoreData() {
    return hasMoreData;
  }

  public void setHasMoreData(Boolean hasMoreData) {
    this.hasMoreData = hasMoreData;
  }

  public DeviceProvisioningHistoryListResponse provisioningHistory(List<ProvisioningHistory> provisioningHistory) {
    this.provisioningHistory = provisioningHistory;
    return this;
  }

  public DeviceProvisioningHistoryListResponse addProvisioningHistoryItem(ProvisioningHistory provisioningHistoryItem) {
    if (this.provisioningHistory == null) {
      this.provisioningHistory = new ArrayList<ProvisioningHistory>();
    }
    this.provisioningHistory.add(provisioningHistoryItem);
    return this;
  }

   /**
   * Get provisioningHistory
   * @return provisioningHistory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProvisioningHistory> getProvisioningHistory() {
    return provisioningHistory;
  }

  public void setProvisioningHistory(List<ProvisioningHistory> provisioningHistory) {
    this.provisioningHistory = provisioningHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceProvisioningHistoryListResponse deviceProvisioningHistoryListResponse = (DeviceProvisioningHistoryListResponse) o;
    return Objects.equals(this.hasMoreData, deviceProvisioningHistoryListResponse.hasMoreData) &&
        Objects.equals(this.provisioningHistory, deviceProvisioningHistoryListResponse.provisioningHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMoreData, provisioningHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceProvisioningHistoryListResponse {\n");
    
    sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
    sb.append("    provisioningHistory: ").append(toIndentedString(provisioningHistory)).append("\n");
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

