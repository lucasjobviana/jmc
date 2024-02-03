package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.MaintenanceDto;
import com.job.jmc.api.entities.Maintenance;
import org.springframework.stereotype.Service;
/**
 * The type Maintenance service.
 */
@Service
public class MaintenanceService extends BaseService<Maintenance, Long, MaintenanceDto> {
}
