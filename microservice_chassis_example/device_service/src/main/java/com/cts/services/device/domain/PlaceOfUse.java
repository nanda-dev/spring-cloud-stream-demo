package com.cts.services.device.domain;

import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * PlaceOfUse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class PlaceOfUse   {
  @JsonProperty("address")
  private Address address = null;

  @JsonProperty("customerName")
  private CustomerName customerName = null;

  public PlaceOfUse address(Address address) {
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

  public PlaceOfUse customerName(CustomerName customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CustomerName getCustomerName() {
    return customerName;
  }

  public void setCustomerName(CustomerName customerName) {
    this.customerName = customerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceOfUse placeOfUse = (PlaceOfUse) o;
    return Objects.equals(this.address, placeOfUse.address) &&
        Objects.equals(this.customerName, placeOfUse.customerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, customerName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceOfUse {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
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

