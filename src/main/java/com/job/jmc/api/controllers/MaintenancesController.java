package com.job.jmc.api.controllers;

import com.job.jmc.api.controllers.dto.MaintenanceDto;
import com.job.jmc.api.entities.Maintenance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/maintenances")
public class MaintenancesController extends BaseController<Maintenance, Long, MaintenanceDto> {
}
