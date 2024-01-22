package com.virtus.jmeterSOAPTest.xmlTemplate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ScoegXmlData{
  
  @JacksonXmlProperty(localName = "SNO")
  private String SNO;
 
}
