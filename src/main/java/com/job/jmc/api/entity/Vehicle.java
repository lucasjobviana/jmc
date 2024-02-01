package com.job.jmc.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Vehicle extends  BaseDbEntity<Long> {
  private String name;
  @Column(name = "license_plate")
  private String licensePlate;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }
}
