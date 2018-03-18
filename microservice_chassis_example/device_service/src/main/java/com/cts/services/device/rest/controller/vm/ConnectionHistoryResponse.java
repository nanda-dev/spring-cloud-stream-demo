package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.ConnectionEvent;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectionHistoryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class ConnectionHistoryResponse   {
  @JsonProperty("connectionHistory")
  private List<ConnectionEvent> connectionHistory = null;

  @JsonProperty("hasMoreData")
  private Boolean hasMoreData = null;

  public ConnectionHistoryResponse connectionHistory(List<ConnectionEvent> connectionHistory) {
    this.connectionHistory = connectionHistory;
    return this;
  }

  public ConnectionHistoryResponse addConnectionHistoryItem(ConnectionEvent connectionHistoryItem) {
    if (this.connectionHistory == null) {
      this.connectionHistory = new ArrayList<ConnectionEvent>();
    }
    this.connectionHistory.add(connectionHistoryItem);
    return this;
  }

   /**
   * Get connectionHistory
   * @return connectionHistory
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ConnectionEvent> getConnectionHistory() {
    return connectionHistory;
  }

  public void setConnectionHistory(List<ConnectionEvent> connectionHistory) {
    this.connectionHistory = connectionHistory;
  }

  public ConnectionHistoryResponse hasMoreData(Boolean hasMoreData) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionHistoryResponse connectionHistoryResponse = (ConnectionHistoryResponse) o;
    return Objects.equals(this.connectionHistory, connectionHistoryResponse.connectionHistory) &&
        Objects.equals(this.hasMoreData, connectionHistoryResponse.hasMoreData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionHistory, hasMoreData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionHistoryResponse {\n");
    
    sb.append("    connectionHistory: ").append(toIndentedString(connectionHistory)).append("\n");
    sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
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

