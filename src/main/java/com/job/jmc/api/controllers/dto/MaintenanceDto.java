package com.job.jmc.api.controllers.dto;

import com.job.jmc.api.entities.Maintenance;
import com.job.jmc.api.entities.Vehicle;
import com.job.jmc.api.interfaces.ConvertableToEntity;

public record MaintenanceDto(Long id, Vehicle vehicle) implements ConvertableToEntity<Maintenance> {
  @Override
  public Maintenance toEntity() {
    Maintenance maintenance = new Maintenance();
    maintenance.setId(id);
    maintenance.setVehicle(vehicle);
    return maintenance;
  }
}
