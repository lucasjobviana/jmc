package com.job.jmc.api.entity;

import jakarta.persistence.Entity;

@Entity
public class ServiceTask extends  BaseDbEntity<Long> {
  private String name;
  private String description;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
