package com.job.jmc.api.services;

import com.job.jmc.api.entities.BaseDbEntity;
import com.job.jmc.api.exceptions.EntityNotFoundException;
import com.job.jmc.api.repositories.BaseRepository;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * A generic base service providing common methods for concrete service
 * classes within the service layer. Intended to be extended by services
 * handling specific entities to leverage shared functionality.
 *
 * @param <T>  The entity type extending BaseDbEntity.
 * @param <ID> The identifier type for the entity.
 * @param <DTO> The DTO type that can be used for the entity.
 *
 * @implNote This class is designed to be extended by concrete service classes
 * within the service layer for handling specific entities. It provides common
 * methods to facilitate the implementation of shared functionality.
 */
public abstract class BaseService<T extends BaseDbEntity<ID,DTO>, ID, DTO> {
  @Autowired
  protected BaseRepository<T, ID> repository;
  /**
   * Retrieves a list of all entities.
   *
   * @return List of all entities.
   */
  public List<T> getAll() { return this.repository.findAll(); }
  /**
   * Retrieves an entity by its identifier.
   *
   * @param id The identifier of the entity.
   * @return The found entity.
   * @throws EntityNotFoundException If the entity is not found.
   */
  public T getById(ID id) throws EntityNotFoundException {
    Optional<T> optionalEntity = this.repository.findById(id);
    if(optionalEntity.isEmpty()){
      throw new EntityNotFoundException(getEntityClass(), id);
    }
    return optionalEntity.get();
  }
  /**
   * Saves a new entity.
   *
   * @param entity The entity to be saved.
   * @return The saved entity.
   */
  public T save(T entity) {
    return this.repository.save(entity);
  }
  /**
   * Deletes an entity by its identifier.
   *
   * @param id The identifier of the entity to be deleted.
   * @throws EntityNotFoundException If the entity is not found.
   */
  public void delete(ID id) throws EntityNotFoundException{
    this.getById(id);
    this.repository.deleteById(id);
  }
  /**
   * Updates an existing entity by its identifier.
   *
   * @param id     The identifier of the entity to be updated.
   * @param entity The updated entity.
   * @return The updated entity.
   * @throws EntityNotFoundException If the entity is not found.
   */
  public T update(ID id, T entity) throws EntityNotFoundException {
    this.getById(id);
    entity.setId(id);
    return this.repository.save(entity);
  }
  /**
   * Retrieves the class of the concrete entity managed by the extending service.
   * This method is intended for internal use within the abstract BaseService class.
   *
   * @return The class of the concrete entity managed by the service.
   */
  private Class<T> getEntityClass() {
    return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }
}
