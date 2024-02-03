package com.job.jmc.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.job.jmc.api.controller.dto.VehicleDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Vehicle extends  BaseDbEntity<Long, VehicleDto> {
  private String name;
  @Column(name = "license_plate")
  private String licensePlate;
  @OneToMany(mappedBy = "vehicle")
  @JsonIgnore
  private List<Maintenance> maintenances;
  public Vehicle() {
  }
  public Vehicle(String name, String licensePlate, List<Maintenance> maintenances) {
    this.name = name;
    this.licensePlate = licensePlate;
    this.maintenances = maintenances;
  }
  public List<Maintenance> getMaintenances() {
    return maintenances;
  }
  public void setMaintenances(List<Maintenance> maintenances) {
    this.maintenances = maintenances;
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
  @Override
  public VehicleDto toDto(){
    return new VehicleDto(this.getId(), this.getName());
  }
}
