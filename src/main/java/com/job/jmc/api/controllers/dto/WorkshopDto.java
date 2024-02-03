package com.job.jmc.api.controllers.dto;

import com.job.jmc.api.entities.Workshop;
import com.job.jmc.api.interfaces.ConvertableToEntity;

public record WorkshopDto(Long id, String name) implements ConvertableToEntity<Workshop> {
  @Override
  public Workshop toEntity() {
    Workshop workshop = new Workshop();
    workshop.setId(id);
    workshop.setName(name);
    return workshop;
  }
}
