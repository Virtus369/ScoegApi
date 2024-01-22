package com.virtus.jmeterSOAPTest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.virtus.jmeterSOAPTest.service.TestService;
import com.virtus.jmeterSOAPTest.xmlTemplate.ScoegXmlRequest;
import jakarta.annotation.Resource;

@RestController
public class TestController {
  
  @Resource
  private TestService testService;
  
  @PostMapping(value = "/wsdl", produces = MediaType.APPLICATION_XML_VALUE)
  public String test(@RequestBody ScoegXmlRequest request) {
    
    return testService.sevice(request);
    
  }
  
}
