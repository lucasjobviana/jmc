package com.job.jmc.api.controller.dto;

import com.job.jmc.api.entity.Vehicle;

public record VehicleDto(Long id, String name) {
  public Vehicle toVehicle() {
    Vehicle vehicle = new Vehicle();
    vehicle.setId(id);
    vehicle.setName(name);
    return vehicle;
  }
}
