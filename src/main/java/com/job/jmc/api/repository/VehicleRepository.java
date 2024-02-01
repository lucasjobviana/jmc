package com.job.jmc.api.repository;

import com.job.jmc.api.entity.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends BaseRepository<Vehicle, Long> {
}
