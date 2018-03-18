package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.KvPair;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GroupResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class GroupResponse   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("extendedAttributes")
  private List<KvPair> extendedAttributes = null;

  @JsonProperty("isDefaultGroup")
  private Boolean isDefaultGroup = null;

  @JsonProperty("name")
  private String name = null;

  public GroupResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GroupResponse extendedAttributes(List<KvPair> extendedAttributes) {
    this.extendedAttributes = extendedAttributes;
    return this;
  }

  public GroupResponse addExtendedAttributesItem(KvPair extendedAttributesItem) {
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

  public GroupResponse isDefaultGroup(Boolean isDefaultGroup) {
    this.isDefaultGroup = isDefaultGroup;
    return this;
  }

   /**
   * Get isDefaultGroup
   * @return isDefaultGroup
  **/
  @ApiModelProperty(value = "")


  public Boolean getIsDefaultGroup() {
    return isDefaultGroup;
  }

  public void setIsDefaultGroup(Boolean isDefaultGroup) {
    this.isDefaultGroup = isDefaultGroup;
  }

  public GroupResponse name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupResponse groupResponse = (GroupResponse) o;
    return Objects.equals(this.description, groupResponse.description) &&
        Objects.equals(this.extendedAttributes, groupResponse.extendedAttributes) &&
        Objects.equals(this.isDefaultGroup, groupResponse.isDefaultGroup) &&
        Objects.equals(this.name, groupResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, extendedAttributes, isDefaultGroup, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupResponse {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extendedAttributes: ").append(toIndentedString(extendedAttributes)).append("\n");
    sb.append("    isDefaultGroup: ").append(toIndentedString(isDefaultGroup)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

