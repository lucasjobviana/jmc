package com.job.jmc.api.controller;

import com.job.jmc.api.service.BaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public abstract class BaseController<T, ID> {
  @Autowired
  private BaseService<T, ID> service;

  @GetMapping
  public List<T> getAll() {
    return this.service.getAll();
  }
}
