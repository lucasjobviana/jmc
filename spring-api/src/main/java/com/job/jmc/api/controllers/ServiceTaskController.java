package com.job.jmc.api.controllers;

import com.job.jmc.api.controllers.dto.ServiceTaskDto;
import com.job.jmc.api.entities.ServiceTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * A controller handling HTTP requests related to ServiceTask entities.
 * Extends the generic BaseController to leverage common CRUD operations.
 *
 * @see BaseController
 */
@RestController
@RequestMapping(value = "/services")
public class ServiceTaskController extends BaseController<ServiceTask, Long, ServiceTaskDto> {
}
