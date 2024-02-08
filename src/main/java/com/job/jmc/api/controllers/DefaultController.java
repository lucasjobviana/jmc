package com.job.jmc.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class DefaultController {
  @GetMapping
  public ResponseEntity<String> defaultRoute() {
    return ResponseEntity.status(HttpStatus.OK).body("Bem-vindo à jmc!");
  }
}
