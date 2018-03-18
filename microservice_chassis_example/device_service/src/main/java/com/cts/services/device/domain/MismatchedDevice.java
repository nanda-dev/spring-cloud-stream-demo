package com.cts.services.device.domain;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * MismatchedDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class MismatchedDevice   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("mdn")
  private String mdn = null;

  @JsonProperty("activationDate")
  private String activationDate = null;

  @JsonProperty("iccid")
  private String iccid = null;

  @JsonProperty("preImei")
  private String preImei = null;

  @JsonProperty("postImei")
  private String postImei = null;

  @JsonProperty("simOtaDate")
  private String simOtaDate = null;

  public MismatchedDevice accountName(String accountName) {
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

  public MismatchedDevice mdn(String mdn) {
    this.mdn = mdn;
    return this;
  }

   /**
   * Get mdn
   * @return mdn
  **/
  @ApiModelProperty(value = "")


  public String getMdn() {
    return mdn;
  }

  public void setMdn(String mdn) {
    this.mdn = mdn;
  }

  public MismatchedDevice activationDate(String activationDate) {
    this.activationDate = activationDate;
    return this;
  }

   /**
   * Get activationDate
   * @return activationDate
  **/
  @ApiModelProperty(value = "")


  public String getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(String activationDate) {
    this.activationDate = activationDate;
  }

  public MismatchedDevice iccid(String iccid) {
    this.iccid = iccid;
    return this;
  }

   /**
   * Get iccid
   * @return iccid
  **/
  @ApiModelProperty(value = "")


  public String getIccid() {
    return iccid;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public MismatchedDevice preImei(String preImei) {
    this.preImei = preImei;
    return this;
  }

   /**
   * Get preImei
   * @return preImei
  **/
  @ApiModelProperty(value = "")


  public String getPreImei() {
    return preImei;
  }

  public void setPreImei(String preImei) {
    this.preImei = preImei;
  }

  public MismatchedDevice postImei(String postImei) {
    this.postImei = postImei;
    return this;
  }

   /**
   * Get postImei
   * @return postImei
  **/
  @ApiModelProperty(value = "")


  public String getPostImei() {
    return postImei;
  }

  public void setPostImei(String postImei) {
    this.postImei = postImei;
  }

  public MismatchedDevice simOtaDate(String simOtaDate) {
    this.simOtaDate = simOtaDate;
    return this;
  }

   /**
   * Get simOtaDate
   * @return simOtaDate
  **/
  @ApiModelProperty(value = "")


  public String getSimOtaDate() {
    return simOtaDate;
  }

  public void setSimOtaDate(String simOtaDate) {
    this.simOtaDate = simOtaDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MismatchedDevice mismatchedDevice = (MismatchedDevice) o;
    return Objects.equals(this.accountName, mismatchedDevice.accountName) &&
        Objects.equals(this.mdn, mismatchedDevice.mdn) &&
        Objects.equals(this.activationDate, mismatchedDevice.activationDate) &&
        Objects.equals(this.iccid, mismatchedDevice.iccid) &&
        Objects.equals(this.preImei, mismatchedDevice.preImei) &&
        Objects.equals(this.postImei, mismatchedDevice.postImei) &&
        Objects.equals(this.simOtaDate, mismatchedDevice.simOtaDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, mdn, activationDate, iccid, preImei, postImei, simOtaDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MismatchedDevice {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    mdn: ").append(toIndentedString(mdn)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    iccid: ").append(toIndentedString(iccid)).append("\n");
    sb.append("    preImei: ").append(toIndentedString(preImei)).append("\n");
    sb.append("    postImei: ").append(toIndentedString(postImei)).append("\n");
    sb.append("    simOtaDate: ").append(toIndentedString(simOtaDate)).append("\n");
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

