package com.job.jmc.api.controllers;

import com.job.jmc.api.interfaces.ConvertableToEntity;
import com.job.jmc.api.entities.BaseDbEntity;
import com.job.jmc.api.services.BaseService;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class BaseController<T extends BaseDbEntity<ID,DTO>, ID, DTO extends
    ConvertableToEntity<T>> {
  @Autowired
  private BaseService<T, ID, DTO> service;
  @GetMapping
  public ResponseEntity<List<DTO>> getAll() {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(
            this.service.getAll().stream().map(BaseDbEntity::toDto).collect(Collectors.toList())
        );
  }
  @GetMapping(value = "/{id}")
  public ResponseEntity<DTO> getById(@PathVariable ID id) {
    return (ResponseEntity<DTO>) ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.getById(id).toDto());
  }
  @PostMapping
  public ResponseEntity<DTO> save(@RequestBody DTO dto) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.save(dto.toEntity()).toDto());
  }
  @DeleteMapping(value = "/{id}")
  public ResponseEntity<String> delete(@PathVariable ID id) {
    this.service.delete(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(String.format("%s com id %s deletado com sucesso", getEntityClassName(),id));
  }
  @PutMapping(value = "/{id}")
  public ResponseEntity<DTO> save(@PathVariable ID id, @RequestBody DTO dto) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.update(id, dto.toEntity()).toDto());
  }
  // Método para obter o nome da classe genérica
  private String getEntityClassName() {
    ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
    Class<T> type = (Class<T>) superClass.getActualTypeArguments()[0];
    return type.getSimpleName();
  }
}
