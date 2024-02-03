package com.job.jmc.api.controllers;

import com.job.jmc.api.controllers.dto.MaintenanceDto;
import com.job.jmc.api.entities.Maintenance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * A controller handling HTTP requests related to Maintenance entities.
 * Extends the generic BaseController to leverage common CRUD operations.
 *
 * @see BaseController
 * @param <T>  The entity type (Maintenance) extending BaseDbEntity.
 * @param <ID> The identifier type (Long) for the entity.
 * @param <DTO> The DTO type (MaintenanceDto) implementing ConvertableToEntity.
 */
@RestController
@RequestMapping(value = "/maintenances")
public class MaintenancesController extends BaseController<Maintenance, Long, MaintenanceDto> {
}
