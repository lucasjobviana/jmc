package com.job.jmc.api.controllers.dto;

import com.job.jmc.api.entities.Vehicle;
import com.job.jmc.api.interfaces.ConvertableToEntity;

public record VehicleDto(Long id, String name) implements ConvertableToEntity<Vehicle> {
  @Override
  public Vehicle toEntity() {
    Vehicle vehicle = new Vehicle();
    vehicle.setId(id);
    vehicle.setName(name);
    return vehicle;
  }
}
