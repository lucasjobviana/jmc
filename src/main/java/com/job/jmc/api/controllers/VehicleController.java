package com.job.jmc.api.controllers;

import com.job.jmc.api.controllers.dto.VehicleDto;
import com.job.jmc.api.entities.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController extends BaseController<Vehicle, Long, VehicleDto> {
}
