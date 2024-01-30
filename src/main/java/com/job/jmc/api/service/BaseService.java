package com.job.jmc.api.service;

import com.job.jmc.api.entity.Vehicle;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class BaseService<T> {
  private final JpaRepository<T,Long> jpaRepository;
  @Autowired
  public BaseService(JpaRepository<T, Long> jpaRepository){
    this.jpaRepository = jpaRepository;
  }

  public List<T> findAllEntities() {
    return this.jpaRepository.findAll();
  }

  public Optional<T> findEntityById(long id) {
    return this.jpaRepository.findById(id);
  }

  public T save(T object) {
    return this.jpaRepository.save(object);
  }

  public void delete(T object) {
    this.jpaRepository.delete(object);
  }
}
