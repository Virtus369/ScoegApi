package com.virtus.jmeterSOAPTest.xmlTemplate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "SCOEG")
public class ScoegXmlRequest {
  
    @JacksonXmlProperty(localName = "HEADER")
    private ScoegXmlHeader scoegXmlHeader;
    
    @JacksonXmlProperty(localName = "DATA")
    private ScoegXmlData scoegXmlData;
  
}

