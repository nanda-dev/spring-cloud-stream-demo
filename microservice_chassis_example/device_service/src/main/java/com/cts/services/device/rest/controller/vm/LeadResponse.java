package com.cts.services.device.rest.controller.vm;

import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.Address;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LeadResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class LeadResponse   {
  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("leadId")
  private String leadId = null;

  @JsonProperty("leadState")
  private String leadState = null;

  public LeadResponse address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public LeadResponse leadId(String leadId) {
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

  public LeadResponse leadState(String leadState) {
    this.leadState = leadState;
    return this;
  }

   /**
   * Get leadState
   * @return leadState
  **/
  @ApiModelProperty(value = "")


  public String getLeadState() {
    return leadState;
  }

  public void setLeadState(String leadState) {
    this.leadState = leadState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadResponse leadResponse = (LeadResponse) o;
    return Objects.equals(this.address, leadResponse.address) &&
        Objects.equals(this.leadId, leadResponse.leadId) &&
        Objects.equals(this.leadState, leadResponse.leadState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, leadId, leadState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadResponse {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    leadId: ").append(toIndentedString(leadId)).append("\n");
    sb.append("    leadState: ").append(toIndentedString(leadState)).append("\n");
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

