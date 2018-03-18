package com.cts.services.device.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ConnectionEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class ConnectionEvent   {
  @JsonProperty("connectionEventAttributes")
  private List<KvPair> connectionEventAttributes = null;

  @JsonProperty("extendedAttributes")
  private List<KvPair> extendedAttributes = null;

  @JsonProperty("occurredAt")
  private String occurredAt = null;

  public ConnectionEvent connectionEventAttributes(List<KvPair> connectionEventAttributes) {
    this.connectionEventAttributes = connectionEventAttributes;
    return this;
  }

  public ConnectionEvent addConnectionEventAttributesItem(KvPair connectionEventAttributesItem) {
    if (this.connectionEventAttributes == null) {
      this.connectionEventAttributes = new ArrayList<KvPair>();
    }
    this.connectionEventAttributes.add(connectionEventAttributesItem);
    return this;
  }

   /**
   * Get connectionEventAttributes
   * @return connectionEventAttributes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<KvPair> getConnectionEventAttributes() {
    return connectionEventAttributes;
  }

  public void setConnectionEventAttributes(List<KvPair> connectionEventAttributes) {
    this.connectionEventAttributes = connectionEventAttributes;
  }

  public ConnectionEvent extendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public ConnectionEvent addExtendedAttributesItem(KvPair extendedAttributesItem) {
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

  public ConnectionEvent occurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
    return this;
  }

   /**
   * Get occurredAt
   * @return occurredAt
  **/
  @ApiModelProperty(value = "")


  public String getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(String occurredAt) {
    this.occurredAt = occurredAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionEvent connectionEvent = (ConnectionEvent) o;
    return Objects.equals(this.connectionEventAttributes, connectionEvent.connectionEventAttributes) &&
        Objects.equals(this.extendedAttributes, connectionEvent.extendedAttributes) &&
        Objects.equals(this.occurredAt, connectionEvent.occurredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionEventAttributes, extendedAttributes, occurredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionEvent {\n");
    
    sb.append("    connectionEventAttributes: ").append(toIndentedString(connectionEventAttributes)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    occurredAt: ").append(toIndentedString(occurredAt)).append("\n");
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

