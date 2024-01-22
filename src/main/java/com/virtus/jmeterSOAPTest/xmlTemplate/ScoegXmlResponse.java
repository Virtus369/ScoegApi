package com.virtus.jmeterSOAPTest.xmlTemplate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "SCOEG")
public class ScoegXmlResponse {
 
 @JacksonXmlProperty(localName = "SCORE_CARD") 
 private ScoegXmlResponseData scoegXmlResponseData;
 
}
