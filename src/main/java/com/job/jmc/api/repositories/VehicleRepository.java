package com.job.jmc.api.repositories;

import com.job.jmc.api.entities.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends BaseRepository<Vehicle, Long> {
}
