package com.job.jmc.api.controller;

import com.job.jmc.api.service.BaseService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseController<T, ID extends Serializable> {
  @Autowired
  private BaseService<T, ID> service;
  @GetMapping
  public List<T> getAll() {
    return this.service.getAll();
  }
  @GetMapping(value = "/{id}")
  public T getById(@PathVariable ID id) {
    return this.service.getById(id);
  }
  @PostMapping
  public T save(@RequestBody T entity) {
    return this.service.save(entity);
  }
  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable ID id) {
    this.service.delete(id);
  }
}
