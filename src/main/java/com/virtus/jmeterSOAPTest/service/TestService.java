package com.virtus.jmeterSOAPTest.service;

import java.util.Objects;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.virtus.jmeterSOAPTest.xmlTemplate.ScoegXmlRequest;
import com.virtus.jmeterSOAPTest.xmlTemplate.ScoegXmlResponse;
import com.virtus.jmeterSOAPTest.xmlTemplate.ScoegXmlResponseData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TestService {
    
  public String sevice(ScoegXmlRequest request) {
   
    ScoegXmlResponse response = new ScoegXmlResponse();
    ScoegXmlResponseData responseData = new ScoegXmlResponseData();
    responseData.setSNO(request.getScoegXmlData().getSNO());
    response.setScoegXmlResponseData(responseData);
    return JavaBeanToXml(response);  
  }
  
  private static final String XML_HEAD = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";

  public static String JavaBeanToXml(Object obj) {
    
    String xml = "";
    
    if(Objects.isNull(obj)) {
      return xml;
    }
    try {
      XmlMapper xmlMapper = new XmlMapper();
      xml = xmlMapper.writeValueAsString(obj);
    } catch (Exception e) {
      log.error("javaBeanToXml error, obj={}, xml={}",obj, xml, e);
      return "";
    }
    return XML_HEAD + xml;
  }

}
