package com.virtus.jmeterSOAPTest.xmlTemplate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ScoegXmlHeader{
  
  @JacksonXmlProperty(localName = "SYS_CD")
  private String SYS_CD;
  @JacksonXmlProperty(localName = "PRCS_DSTE")
  private String PRCS_DSTE;
  @JacksonXmlProperty(localName = "PRCS_TIME")
  private String PRCS_TIME;

}

