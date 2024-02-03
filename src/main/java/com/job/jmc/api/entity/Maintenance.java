package com.job.jmc.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Maintenance extends  BaseDbEntity<Long> {
 private String description;

 @ManyToOne
 @JoinColumn(name = "workshop_id")
 private Workshop workshop;
// private Vehicle vehicle;

  public Maintenance() {
  }

  @Autowired
  public Maintenance(String description, Workshop workshop) {
    this.description = description;
    this.workshop = workshop;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Workshop getWorkshop() {
    return workshop;
  }

  public void setWorkshop(Workshop workshop) {
    this.workshop = workshop;
  }
}
