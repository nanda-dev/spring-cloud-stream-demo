package com.cts.services.device.rest.controller.vm;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * LogOutRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class LogOutRequest   {
  @JsonProperty("sessionToken")
  private String sessionToken = null;

  public LogOutRequest sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * Get sessionToken
   * @return sessionToken
  **/
  @ApiModelProperty(value = "")


  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogOutRequest logOutRequest = (LogOutRequest) o;
    return Objects.equals(this.sessionToken, logOutRequest.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogOutRequest {\n");
    
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
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

