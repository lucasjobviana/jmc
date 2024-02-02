package com.job.jmc.api.service;

import com.job.jmc.api.entity.BaseDbEntity;
import com.job.jmc.api.exception.EntityNotFoundException;
import com.job.jmc.api.repository.BaseRepository;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T extends BaseDbEntity<ID>, ID> {
  @Autowired
  protected BaseRepository<T, ID> repository;
  public List<T> getAll() { return this.repository.findAll(); }
  public T getById(ID id) throws EntityNotFoundException {
    Optional<T> optionalEntity = this.repository.findById(id);
    if(optionalEntity.isEmpty()){
      throw new EntityNotFoundException(getEntityClass(), id);
    }
    return optionalEntity.get();
  }
  public T save(T entity) {
    return this.repository.save(entity);
  }
  public void delete(ID id) throws EntityNotFoundException{
    this.getById(id);
    this.repository.deleteById(id);
  }
  public T update(ID id, T entity) throws EntityNotFoundException {
    this.getById(id);
    entity.setId(id);
    return this.repository.save(entity);
  }
  private Class<T> getEntityClass() {
    return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
  }
}
