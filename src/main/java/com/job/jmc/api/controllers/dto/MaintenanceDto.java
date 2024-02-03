package com.job.jmc.api.controllers.dto;

import com.job.jmc.api.entities.Maintenance;
import com.job.jmc.api.entities.Vehicle;
import com.job.jmc.api.interfaces.ConvertableToEntity;
/**
 * A Data Transfer Object (DTO) representing Maintenance information.
 *
 * @param id      The identifier of the maintenance.
 * @param vehicle The associated vehicle for the maintenance.
 */
public record MaintenanceDto(Long id, Vehicle vehicle) implements ConvertableToEntity<Maintenance> {
  /**
   * Converts a Maintenance DTO model to a Maintenance entity.
   *
   * @return A Maintenance entity.
   */
  @Override
  public Maintenance toEntity() {
    Maintenance maintenance = new Maintenance();
    maintenance.setId(id);
    maintenance.setVehicle(vehicle);
    return maintenance;
  }
}
