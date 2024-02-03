package com.job.jmc.api.controller;

import com.job.jmc.api.entity.Maintenance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/maintenances")
public class MaintenancesController extends BaseController<Maintenance, Long> {
}
