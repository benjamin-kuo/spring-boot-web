package com.tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class WebController {

  @GetMapping("{id}")
  public ResponseEntity<String> hello(@PathVariable("id") String hi) {
    return ResponseEntity.ok("hello ".concat(hi));
  }
}
