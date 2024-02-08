package com.job.jmc.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.job.jmc.api.controllers.dto.ServiceTaskDto;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
public class ServiceTask extends  BaseDbEntity<Long, ServiceTaskDto> {
  private String name;
  private String description;

  @ManyToMany(mappedBy = "serviceTasks")
  @JsonIgnore
  private List<Maintenance> maintenances;

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

  @Override
  public ServiceTaskDto toDto() {
    return new ServiceTaskDto(this.getId(), this.getName());
  }
}
