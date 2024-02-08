package com.job.jmc.api.controllers.dto;

import com.job.jmc.api.entities.Vehicle;
import com.job.jmc.api.interfaces.ConvertableToEntity;
/**
 * A Data Transfer Object (DTO) representing Vehicle information.
 *
 * @param id   The identifier of the vehicle.
 * @param name The name of the vehicle.
 */
public record VehicleDto(Long id, String name) implements ConvertableToEntity<Vehicle> {
  /**
   * Converts a Vehicle DTO model to a Vehicle entity.
   *
   * @return A Vehicle entity.
   */
  @Override
  public Vehicle toEntity() {
    Vehicle vehicle = new Vehicle();
    vehicle.setId(id);
    vehicle.setName(name);
    return vehicle;
  }
}
