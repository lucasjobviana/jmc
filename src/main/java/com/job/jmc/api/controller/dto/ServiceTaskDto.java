package com.job.jmc.api.controller.dto;

import com.job.jmc.api.entity.ServiceTask;
import com.job.jmc.api.interfaces.ConvertableToEntity;

public record ServiceTaskDto(Long id, String name)implements ConvertableToEntity<ServiceTask> {
  @Override
  public ServiceTask toEntity() {
    ServiceTask serviceTask = new ServiceTask();
    serviceTask.setId(id);
    serviceTask.setName(name);
    return serviceTask;
  }
}
