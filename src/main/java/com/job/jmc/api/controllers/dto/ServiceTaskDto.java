package com.job.jmc.api.controllers.dto;

import com.job.jmc.api.entities.ServiceTask;
import com.job.jmc.api.interfaces.ConvertableToEntity;
/**
 * A Data Transfer Object (DTO) representing ServiceTask information.
 *
 * @param id   The identifier of the service task.
 * @param name The name of the service task.
 */
public record ServiceTaskDto(Long id, String name)implements ConvertableToEntity<ServiceTask> {
  /**
   * Converts a ServiceTask DTO model to a ServiceTask entity.
   *
   * @return A ServiceTask entity.
   */
  @Override
  public ServiceTask toEntity() {
    ServiceTask serviceTask = new ServiceTask();
    serviceTask.setId(id);
    serviceTask.setName(name);
    return serviceTask;
  }
}
