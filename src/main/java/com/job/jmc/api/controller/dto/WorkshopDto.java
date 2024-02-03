package com.job.jmc.api.controller.dto;

import com.job.jmc.api.entity.Vehicle;
import com.job.jmc.api.entity.Workshop;

public record WorkshopDto(Long id, String name) {
  public Workshop toWorkshop() {
    Workshop workshop = new Workshop();
    workshop.setId(id);
    workshop.setName(name);
    return workshop;
  }
}
