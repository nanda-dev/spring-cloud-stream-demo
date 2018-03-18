package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.KvPair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ServicePlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class ServicePlanResponse   {
  @JsonProperty("carrierServicePlanCode")
  private String carrierServicePlanCode = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("extendedAttributes")
  private List<KvPair> extendedAttributes = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("sizeKb")
  private Long sizeKb = null;

  public ServicePlanResponse carrierServicePlanCode(String carrierServicePlanCode) {
    this.carrierServicePlanCode = carrierServicePlanCode;
    return this;
  }

   /**
   * Get carrierServicePlanCode
   * @return carrierServicePlanCode
  **/
  @ApiModelProperty(value = "")


  public String getCarrierServicePlanCode() {
    return carrierServicePlanCode;
  }

  public void setCarrierServicePlanCode(String carrierServicePlanCode) {
    this.carrierServicePlanCode = carrierServicePlanCode;
  }

  public ServicePlanResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ServicePlanResponse extendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public ServicePlanResponse addExtendedAttributesItem(KvPair extendedAttributesItem) {
    if (this.extendedAttributes == null) {
      this.extendedAttributes = new ArrayList<KvPair>();
    }
    this.extendedAttributes.add(extendedAttributesItem);
    return this;
  }

   /**
   * Get extendedAttributes
   * @return extendedAttributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<KvPair> getExtendedAttributes() {
    return extendedAttributes;
  }

  public void setExtendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
  }

  public ServicePlanResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServicePlanResponse sizeKb(Long sizeKb) {
    this.sizeKb = sizeKb;
    return this;
  }

   /**
   * Get sizeKb
   * @return sizeKb
  **/
  @ApiModelProperty(value = "")


  public Long getSizeKb() {
    return sizeKb;
  }

  public void setSizeKb(Long sizeKb) {
    this.sizeKb = sizeKb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicePlanResponse servicePlanResponse = (ServicePlanResponse) o;
    return Objects.equals(this.carrierServicePlanCode, servicePlanResponse.carrierServicePlanCode) &&
        Objects.equals(this.code, servicePlanResponse.code) &&
        Objects.equals(this.extendedAttributes, servicePlanResponse.extendedAttributes) &&
        Objects.equals(this.name, servicePlanResponse.name) &&
        Objects.equals(this.sizeKb, servicePlanResponse.sizeKb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierServicePlanCode, code, extendedAttributes, name, sizeKb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePlanResponse {\n");
    
    sb.append("    carrierServicePlanCode: ").append(toIndentedString(carrierServicePlanCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sizeKb: ").append(toIndentedString(sizeKb)).append("\n");
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

