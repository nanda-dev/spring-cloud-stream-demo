package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LeadInformationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class LeadInformationResponse   {
  @JsonProperty("hasMoreData")
  private Boolean hasMoreData = null;

  @JsonProperty("leads")
  private List<LeadResponse> leads = null;

  public LeadInformationResponse hasMoreData(Boolean hasMoreData) {
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

  public LeadInformationResponse leads(List<LeadResponse> leads) {
    this.leads = leads;
    return this;
  }

  public LeadInformationResponse addLeadsItem(LeadResponse leadsItem) {
    if (this.leads == null) {
      this.leads = new ArrayList<LeadResponse>();
    }
    this.leads.add(leadsItem);
    return this;
  }

   /**
   * Get leads
   * @return leads
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<LeadResponse> getLeads() {
    return leads;
  }

  public void setLeads(List<LeadResponse> leads) {
    this.leads = leads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadInformationResponse leadInformationResponse = (LeadInformationResponse) o;
    return Objects.equals(this.hasMoreData, leadInformationResponse.hasMoreData) &&
        Objects.equals(this.leads, leadInformationResponse.leads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMoreData, leads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadInformationResponse {\n");
    
    sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
    sb.append("    leads: ").append(toIndentedString(leads)).append("\n");
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

