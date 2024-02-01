package com.job.jmc.api.service;

import com.job.jmc.api.repository.BaseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T, ID> {
  @Autowired
  private BaseRepository<T, ID> repository;

  public List<T> getAll() {
    return this.repository.findAll();
  }

}
