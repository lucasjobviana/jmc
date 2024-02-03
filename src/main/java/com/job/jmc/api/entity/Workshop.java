package com.job.jmc.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.job.jmc.api.controller.dto.WorkshopDto;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Workshop extends  BaseDbEntity<Long, WorkshopDto> {
  private String name;
  private String description;
  @OneToMany(mappedBy = "workshop")
  @JsonIgnore
  private List<Maintenance> maintenances;
  public Workshop() {
  }
  @Autowired
  public Workshop(String name, String description, List<Maintenance> maintenances) {
    this.name = name;
    this.description = description;
    this.maintenances = maintenances;
  }
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
  public List<Maintenance> getMaintenances() {
    return maintenances;
  }
  public void setMaintenances(List<Maintenance> maintenances) {
    this.maintenances = maintenances;
  }
  @Override
  public WorkshopDto toDto() {
    return new WorkshopDto(this.getId(), this.getName());
  }
}
