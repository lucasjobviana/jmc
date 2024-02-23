package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.ServiceTaskDto;
import com.job.jmc.api.entities.ServiceTask;
import org.springframework.stereotype.Service;
/**
 * The service class for handling ServiceTask entities. Extends the generic BaseService
 * to leverage common CRUD operations for ServiceTask entities.
 *
 * @see BaseService
 */
@Service
public class ServiceTaskService extends BaseService<ServiceTask, Long, ServiceTaskDto> {
}
