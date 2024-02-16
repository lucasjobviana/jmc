package com.job.jmc.api.entities;

import com.job.jmc.api.controllers.dto.MaintenanceDto;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Maintenance extends  BaseDbEntity<Long, MaintenanceDto> {
 private String description;
 @ManyToOne
 @JoinColumn(name = "workshop_id")
 private Workshop workshop;
 @ManyToOne
 @JoinColumn(name = "vehicle_id")
 private Vehicle vehicle;
  @ManyToMany
  @JoinTable(
      name = "maintenance_service",
      joinColumns = @JoinColumn(name = "maintenance_id"),
      inverseJoinColumns = @JoinColumn(name = "service_id")
  )
  private List<ServiceTask> serviceTasks;
  public Maintenance() {
  }
  @Autowired
  public Maintenance(String description, Workshop workshop, Vehicle vehicle, List<ServiceTask> services) {
    this.description = description;
    this.workshop = workshop;
    this.vehicle = vehicle;
    this.serviceTasks = services;
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
  public List<ServiceTask> getServiceTasks() {
    return serviceTasks;
  }
  public void setServiceTasks(List<ServiceTask> serviceTasks) {
    this.serviceTasks = serviceTasks;
  }
  @Override
  public MaintenanceDto toDto() {
    return new MaintenanceDto(this.getId(), this.getVehicle());
  }
}
