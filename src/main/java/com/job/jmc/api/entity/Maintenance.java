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
 @ManyToOne
 @JoinColumn(name = "vehicle_id")
 private Vehicle vehicle;

  public Maintenance() {
  }

  @Autowired
  public Maintenance(String description, Workshop workshop, Vehicle vehicle) {
    this.description = description;
    this.workshop = workshop;
    this.vehicle = vehicle;
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

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
}
