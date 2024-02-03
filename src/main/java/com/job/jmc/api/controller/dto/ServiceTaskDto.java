package com.job.jmc.api.controller.dto;

import com.job.jmc.api.entity.ServiceTask;
import com.job.jmc.api.entity.Vehicle;
import com.job.jmc.api.entity.Workshop;

public record ServiceTaskDto(Long id, String name) {
  public ServiceTask toServiceTask() {
    ServiceTask serviceTask = new ServiceTask();
    serviceTask.setId(id);
    serviceTask.setName(name);
    return serviceTask;
  }
}
