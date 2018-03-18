package com.cts.services.device.rest.controller.vm;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.cts.services.device.domain.SmsMessage;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * SmsMessagesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-03-07T06:18:11.724Z")

public class SmsMessagesResponse   {
  @JsonProperty("hasMoreData")
  private Boolean hasMoreData = null;

  @JsonProperty("messages")
  private List<SmsMessage> messages = null;

  public SmsMessagesResponse hasMoreData(Boolean hasMoreData) {
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

  public SmsMessagesResponse messages(List<SmsMessage> messages) {
    this.messages = messages;
    return this;
  }

  public SmsMessagesResponse addMessagesItem(SmsMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<SmsMessage>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SmsMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<SmsMessage> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsMessagesResponse smsMessagesResponse = (SmsMessagesResponse) o;
    return Objects.equals(this.hasMoreData, smsMessagesResponse.hasMoreData) &&
        Objects.equals(this.messages, smsMessagesResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMoreData, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsMessagesResponse {\n");
    
    sb.append("    hasMoreData: ").append(toIndentedString(hasMoreData)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

