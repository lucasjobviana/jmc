package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.WorkshopDto;
import com.job.jmc.api.entities.Workshop;
import org.springframework.stereotype.Service;
/**
 * The service class for handling Workshop entities. Extends the generic BaseService
 * to leverage common CRUD operations for Workshop entities.
 *
 * @see BaseService
 */
@Service
public class WorkshopService extends BaseService<Workshop, Long, WorkshopDto> {
}
