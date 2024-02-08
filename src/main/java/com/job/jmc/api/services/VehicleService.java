package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.VehicleDto;
import com.job.jmc.api.entities.Vehicle;
import org.springframework.stereotype.Service;
/**
 * The type Vehicle service.
 */
@Service
public class VehicleService extends BaseService<Vehicle, Long, VehicleDto> {
}
