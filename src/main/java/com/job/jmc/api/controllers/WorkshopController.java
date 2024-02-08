package com.job.jmc.api.controllers;

import com.job.jmc.api.controllers.dto.WorkshopDto;
import com.job.jmc.api.entities.Workshop;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * The type Workshop controller.
 */
@RestController
@RequestMapping(value = "/workshops")
public class WorkshopController extends BaseController<Workshop, Long, WorkshopDto> {
}
