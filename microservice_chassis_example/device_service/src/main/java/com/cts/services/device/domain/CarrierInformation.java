package com.cts.services.device.domain;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * CarrierInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class CarrierInformation   {
  @JsonProperty("carrierName")
  private String carrierName = null;

  @JsonProperty("servicePlan")
  private String servicePlan = null;

  @JsonProperty("state")
  private String state = null;

  public CarrierInformation carrierName(String carrierName) {
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

  public CarrierInformation servicePlan(String servicePlan) {
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

  public CarrierInformation state(String state) {
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
    CarrierInformation carrierInformation = (CarrierInformation) o;
    return Objects.equals(this.carrierName, carrierInformation.carrierName) &&
        Objects.equals(this.servicePlan, carrierInformation.servicePlan) &&
        Objects.equals(this.state, carrierInformation.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierName, servicePlan, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierInformation {\n");
    
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
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

