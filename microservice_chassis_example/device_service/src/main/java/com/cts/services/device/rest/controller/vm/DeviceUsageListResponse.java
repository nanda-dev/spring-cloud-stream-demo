package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.Usage;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceUsageListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class DeviceUsageListResponse   {
  @JsonProperty("hasMoreData")
  private Boolean hasMoreData = null;

  @JsonProperty("usageHistory")
  private List<Usage> usageHistory = null;

  public DeviceUsageListResponse hasMoreData(Boolean hasMoreData) {
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

  public DeviceUsageListResponse usageHistory(List<Usage> usageHistory) {
    this.usageHistory = usageHistory;
    return this;
  }

  public DeviceUsageListResponse addUsageHistoryItem(Usage usageHistoryItem) {
    if (this.usageHistory == null) {
      this.usageHistory = new ArrayList<Usage>();
    }
    this.usageHistory.add(usageHistoryItem);
    return this;
  }

   /**
   * Get usageHistory
   * @return usageHistory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Usage> getUsageHistory() {
    return usageHistory;
  }

  public void setUsageHistory(List<Usage> usageHistory) {
    this.usageHistory = usageHistory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceUsageListResponse deviceUsageListResponse = (DeviceUsageListResponse) o;
    return Objects.equals(this.hasMoreData, deviceUsageListResponse.hasMoreData) &&
        Objects.equals(this.usageHistory, deviceUsageListResponse.usageHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMoreData, usageHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceUsageListResponse {\n");
    
    sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
    sb.append("    usageHistory: ").append(toIndentedString(usageHistory)).append("\n");
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

