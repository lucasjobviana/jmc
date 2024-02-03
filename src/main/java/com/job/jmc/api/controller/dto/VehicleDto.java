package com.job.jmc.api.controller.dto;

import com.job.jmc.api.entity.Vehicle;
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
