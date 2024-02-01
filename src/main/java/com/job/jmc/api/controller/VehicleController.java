package com.job.jmc.api.controller;

import com.job.jmc.api.entity.Vehicle;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController extends BaseController<Vehicle, Long> {
}
