package com.job.jmc.api.controller;

import com.job.jmc.api.controller.dto.WorkshopDto;
import com.job.jmc.api.entity.Workshop;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/workshops")
public class WorkshopController extends BaseController<Workshop, Long, WorkshopDto> {
}
