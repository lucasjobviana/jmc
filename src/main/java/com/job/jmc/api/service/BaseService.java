package com.job.jmc.api.service;

import com.job.jmc.api.entity.BaseDbEntity;
import com.job.jmc.api.repository.BaseRepository;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T extends BaseDbEntity<ID>, ID> {

  @Autowired
  protected BaseRepository<T, ID> repository;
  public List<T> getAll() {
    return this.repository.findAll();
  }
  public T getById(ID id) {
    Optional<T> optionalEntity = this.repository.findById(id);
    if(optionalEntity.isEmpty()){
      throw new RuntimeException("generic exception");
    }
    return optionalEntity.get();
  }
  public T save(T entity) {
    return this.repository.save(entity);
  }
  public void delete(ID id) {
    this.repository.deleteById(id);
  }

  public T update(ID id, T entity) {
    entity.setId(id);
    return this.repository.save(entity);
  }
}
