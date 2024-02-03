package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.ServiceTaskDto;
import com.job.jmc.api.entities.ServiceTask;
import org.springframework.stereotype.Service;

@Service
public class ServiceTaskService extends BaseService<ServiceTask, Long, ServiceTaskDto> {
}
