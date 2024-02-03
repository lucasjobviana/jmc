package com.job.jmc.api.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseDbEntity<T, DTO> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private T id;
  public T getId() {
    return id;
  }
  public void setId(T id) {
    this.id = id;
  }
  public abstract DTO toDto();
}
