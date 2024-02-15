package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.MaintenanceDto;
import com.job.jmc.api.entities.Maintenance;
import org.springframework.stereotype.Service;
/**
 * The service class for handling Maintenance entities. Extends the generic BaseService
 * to leverage common CRUD operations for Maintenance entities.
 *
 * @see BaseService
 */
@Service
public class MaintenanceService extends BaseService<Maintenance, Long, MaintenanceDto> {
}
