package com.fps.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/fps")
public class FpsController {

  @RequestMapping("/upload/image")
  public String getFps() {
    return "Upload image";
  }
}
