package com.job.jmc.api.controller;

import com.job.jmc.api.entity.BaseDbEntity;
import com.job.jmc.api.service.BaseService;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseController<T extends BaseDbEntity<ID>, ID> {
  @Autowired
  private BaseService<T, ID> service;
  @GetMapping
  public ResponseEntity<List<T>> getAll() {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.getAll());
  }
  @GetMapping(value = "/{id}")
  public ResponseEntity<T> getById(@PathVariable ID id) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.getById(id));
  }
  @PostMapping
  public ResponseEntity<T> save(@RequestBody T entity) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.save(entity));
  }
  @DeleteMapping(value = "/{id}")
  public ResponseEntity<String> delete(@PathVariable ID id) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(String.format("%s com id %s deletado com sucesso",getEntityClassName(),id));
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<T> save(@PathVariable ID id, @RequestBody T entity) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.update(id, entity));
  }

  // Método para obter o nome da classe genérica
  private String getEntityClassName() {
    ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
    Class<T> type = (Class<T>) superClass.getActualTypeArguments()[0];
    return type.getSimpleName();
  }
}
