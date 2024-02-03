package com.job.jmc.api.service;

import com.job.jmc.api.controller.dto.ServiceTaskDto;
import com.job.jmc.api.entity.ServiceTask;
import org.springframework.stereotype.Service;

@Service
public class ServiceTaskService extends BaseService<ServiceTask, Long, ServiceTaskDto> {
}
