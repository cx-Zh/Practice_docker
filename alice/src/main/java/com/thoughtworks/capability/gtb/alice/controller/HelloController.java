package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpMethod;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;

@RestController
public class HelloController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/hello")
  public String hello() {
    final String url = "http://bob:8081/hello";
    String result = restTemplate.getForObject(url, String.class);

//    ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
//    String result = response.getBody();

    return result;
  }
}
