package com.job.jmc.api.controllers;

import com.job.jmc.api.controllers.dto.WorkshopDto;
import com.job.jmc.api.entities.Workshop;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * A controller handling HTTP requests related to Workshop entities.
 * Extends the generic BaseController to leverage common CRUD operations.
 *
 * @see BaseController
 */
@RestController
@RequestMapping(value = "/workshops")
public class WorkshopController extends BaseController<Workshop, Long, WorkshopDto> {
}
