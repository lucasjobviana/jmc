package com.job.jmc.api.controller;

import com.job.jmc.api.controller.dto.ServiceTaskDto;
import com.job.jmc.api.entity.ServiceTask;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class ServiceTaskController extends BaseController<ServiceTask, Long, ServiceTaskDto> {
}
