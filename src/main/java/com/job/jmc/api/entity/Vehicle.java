package com.job.jmc.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  @Column(name = "license_plate")
  private String licensePlate;

  public Vehicle() {
  }

  public Vehicle(long id, String name, String licensePlate) {
    this.id = id;
    this.name = name;
    this.licensePlate = licensePlate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

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
