package com.job.jmc.api.controller.dto;

import com.job.jmc.api.entity.Maintenance;
import com.job.jmc.api.entity.Vehicle;
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
