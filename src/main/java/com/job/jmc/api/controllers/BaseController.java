package com.job.jmc.api.controllers;

import com.job.jmc.api.exceptions.EntityNotFoundException;
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
/**
 * A generic base controller providing common methods for concrete controller
 * classes within the controller layer. Intended to be extended by controllers
 * handling specific entities to leverage shared functionality.
 *
 * @param <T>  The entity type extending BaseDbEntity.
 * @param <ID> The identifier type for the entity.
 * @param <DTO> The DTO type implementing ConvertableToEntity.
 *
 * @implNote This class is designed to be extended by concrete controller classes
 * within the controller layer for handling specific entities. It provides common
 * methods to facilitate the implementation of shared functionality.
 */
public abstract class BaseController<T extends BaseDbEntity<ID,DTO>, ID, DTO extends
    ConvertableToEntity<T>> {
  @Autowired
  private BaseService<T, ID, DTO> service;
  /**
   * Retrieves a list of all entities.
   *
   * @return ResponseEntity containing a list of DTOs representing all entities.
   */
  @GetMapping
  public ResponseEntity<List<DTO>> getAll() {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(
            this.service.getAll().stream().map(BaseDbEntity::toDto).collect(Collectors.toList())
        );
  }
  /**
   * Retrieves an entity by its identifier.
   *
   * @param id The identifier of the entity.
   * @return ResponseEntity containing the DTO representing the entity.
   */
  @GetMapping(value = "/{id}")
  public ResponseEntity<DTO> getById(@PathVariable ID id) {
    return (ResponseEntity<DTO>) ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.getById(id).toDto());
  }
  /**
   * Saves a new entity.
   *
   * @param dto The DTO representing the entity to be saved.
   * @return ResponseEntity containing the DTO representing the saved entity.
   */
  @PostMapping
  public ResponseEntity<DTO> save(@RequestBody DTO dto) {
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.save(dto.toEntity()).toDto());
  }
  /**
   * Deletes an entity by its identifier.
   *
   * @param id The identifier of the entity to be deleted.
   * @return ResponseEntity containing a success message.
   * @throws EntityNotFoundException If the entity is not found.
   */
  @DeleteMapping(value = "/{id}")
  public ResponseEntity<String> delete(@PathVariable ID id) throws EntityNotFoundException{
    this.service.delete(id);
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(String.format("%s com id %s deletado com sucesso", getEntityClassName(),id));
  }
  /**
   * Updates an existing entity by its identifier.
   *
   * @param id  The identifier of the entity to be updated.
   * @param dto The DTO representing the updated entity.
   * @return ResponseEntity containing the DTO representing the updated entity.
   * @throws EntityNotFoundException If the entity is not found.
   */
  @PutMapping(value = "/{id}")
  public ResponseEntity<DTO> save(@PathVariable ID id, @RequestBody DTO dto) throws EntityNotFoundException{
    return ResponseEntity
        .status(HttpStatus.OK)
        .body(this.service.update(id, dto.toEntity()).toDto());
  }
  /**
   * Retrieves the name of the generic class.
   *
   * @return The name of the generic class.
   */
  private String getEntityClassName() {
    ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
    Class<T> type = (Class<T>) superClass.getActualTypeArguments()[0];
    return type.getSimpleName();
  }
}
