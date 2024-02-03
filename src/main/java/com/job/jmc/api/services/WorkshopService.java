package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.WorkshopDto;
import com.job.jmc.api.entities.Workshop;
import org.springframework.stereotype.Service;

@Service
public class WorkshopService extends BaseService<Workshop, Long, WorkshopDto> {
}
