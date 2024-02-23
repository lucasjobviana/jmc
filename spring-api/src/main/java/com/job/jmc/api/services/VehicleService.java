package com.job.jmc.api.services;

import com.job.jmc.api.controllers.dto.VehicleDto;
import com.job.jmc.api.entities.Vehicle;
import org.springframework.stereotype.Service;
/**
 * The service class for handling Vehicle entities. Extends the generic BaseService
 * to leverage common CRUD operations for Vehicle entities.
 *
 * @see BaseService
 */
@Service
public class VehicleService extends BaseService<Vehicle, Long, VehicleDto> {
}
