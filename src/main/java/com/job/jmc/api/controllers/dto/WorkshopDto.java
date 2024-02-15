package com.job.jmc.api.controllers.dto;

import com.job.jmc.api.entities.Workshop;
import com.job.jmc.api.interfaces.ConvertableToEntity;
/**
 * A Data Transfer Object (DTO) representing Workshop information.
 *
 * @param id   The identifier of the workshop.
 * @param name The name of the workshop.
 */
public record WorkshopDto(Long id, String name) implements ConvertableToEntity<Workshop> {
  /**
   * Converts a Workshop DTO model to a Workshop entity.
   *
   * @return A Workshop entity.
   */
  @Override
  public Workshop toEntity() {
    Workshop workshop = new Workshop();
    workshop.setId(id);
    workshop.setName(name);
    return workshop;
  }
}
