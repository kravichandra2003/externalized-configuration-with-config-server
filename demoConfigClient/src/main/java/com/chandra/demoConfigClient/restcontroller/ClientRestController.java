package com.chandra.demoConfigClient.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {

  private static final Logger log = LoggerFactory.getLogger(ClientRestController.class);
  @Value("${rest:hi how r u}")
  private String value;

  @RequestMapping("hello")
  public String restClient() {

    log.info(value);

    return value;
  }

}
