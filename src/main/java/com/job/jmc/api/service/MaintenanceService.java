package com.job.jmc.api.service;

import com.job.jmc.api.controller.dto.MaintenanceDto;
import com.job.jmc.api.entity.Maintenance;
import org.springframework.stereotype.Service;

@Service
public class MaintenanceService extends BaseService<Maintenance, Long, MaintenanceDto> {
}
