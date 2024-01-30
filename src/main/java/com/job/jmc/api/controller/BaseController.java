package com.job.jmc.api.controller;

import com.job.jmc.api.service.BaseService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public abstract class BaseController<T> {
  private final BaseService<T> service;
  @Autowired
  public BaseController(BaseService<T> service) {
    this.service = service;
  }

  @GetMapping
  ResponseEntity<List<T>> findAllEntities() {
    return ResponseEntity.status(HttpStatus.OK).body(
        this.service.findAllEntities()
    );
  }
  @GetMapping(value = "/{id}")
  public ResponseEntity<Optional<T>> findEntityById(@PathVariable long id) {
    return ResponseEntity.status(HttpStatus.OK).body(
        this.service.findEntityById(id)
    );
  }
  @PostMapping
  public  ResponseEntity<T> save(T entity) {
    return ResponseEntity.status(HttpStatus.OK).body(
        this.service.save(entity)
    );
  }
  @DeleteMapping
  public ResponseEntity<String> delete(T entity) {
    this.service.delete(entity);
    return ResponseEntity.status(HttpStatus.OK).body(
        "deleted"
    );
  }

}
