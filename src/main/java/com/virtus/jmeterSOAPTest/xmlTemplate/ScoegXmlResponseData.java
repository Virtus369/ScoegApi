package com.virtus.jmeterSOAPTest.xmlTemplate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
public class ScoegXmlResponseData {
  
  @JacksonXmlProperty(localName = "SNO")
  private String SNO;
  
     
}
