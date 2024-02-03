package com.job.jmc.api.controller.dto;

import com.job.jmc.api.entity.Maintenance;
import com.job.jmc.api.entity.Workshop;

public record MaintenanceDto(Long id) {
  public Maintenance toMaintenance() {
    Maintenance maintenance = new Maintenance();
    maintenance.setId(id);
    //maintenance.setName(name);
    return maintenance;
  }
}
